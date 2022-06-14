package hashmod.lightmeals;

import hashmod.lightmeals.config.ConfigHelper;
import hashmod.lightmeals.config.ConfigHolder;
import hashmod.lightmeals.crafting.conditions.ConfigEnabledCondition;
import hashmod.lightmeals.registry.ModItems;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.passive.SquidEntity;
import net.minecraft.entity.passive.horse.HorseEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.util.HashMap;
import java.util.Map;

@Mod(LightMealsUtils.MODID)
public class LightMeals {
    public static final ItemGroup ITEM_GROUP = new LightMealsItemGroup();
    public static final Map<Class<?>, Drop> DROP_LIST = new HashMap<>();

    public static LightMeals instance;

    public LightMeals() {
        instance = this;

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ConfigHolder.COMMON_SPEC);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onCommonSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onClientSetup);

        ModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void onCommonSetup(final FMLCommonSetupEvent event) {
        addDrop(LightMealsConfig.disableSquidDrop, SquidEntity.class, ModItems.RAW_SQUID.get(), ModItems.COOKED_SQUID.get(), 2);
        addDrop(LightMealsConfig.disableHorseMeatDrop, HorseEntity.class, ModItems.HORSE_MEAT.get(), ModItems.COOKED_HORSE_MEAT.get(), 3, true);
        //addDrop(BatEntity.class, ModItems.BAT_WING.get(), ModItems.COOKED_BAT_WING.get(), 1);
        //addDrop(WolfEntity.class, ModItems.WOLF_MEAT.get(), ModItems.COOKED_WOLF_MEAT.get(), 2, true);
        //addDrop(OcelotEntity.class, ModItems.OCELOT_MEAT.get(), ModItems.COOKED_OCELOT_MEAT.get(), 1, true);
        //addDrop(ParrotEntity.class, ModItems.PARROT_MEAT.get(), ModItems.COOKED_PARROT_MEAT.get(), 1, true);
        //addDrop(LlamaEntity.class, ModItems.LLAMA_MEAT.get(), ModItems.COOKED_LLAMA_MEAT.get(), 2, true);
        //addDrop(PolarBearEntity.class, ModItems.POLAR_BEAR_MEAT.get(), ModItems.COOKED_POLAR_BEAR_MEAT.get(), 3, true);
    }

    private void onClientSetup(final FMLClientSetupEvent event) {

    }

    private void addDrop(boolean cfgDisable, Class<?> entityClass, Item uncooked, Item cooked, int maxDropAmount) {
        addDrop(cfgDisable, entityClass, uncooked, cooked, maxDropAmount, false);
    }

    private void addDrop(boolean cfgDisable, Class<?> entityClass, Item uncooked, Item cooked, int maxDropAmount, boolean alwaysDrop) {
        DROP_LIST.put(entityClass, new Drop(cfgDisable, uncooked, cooked, maxDropAmount, alwaysDrop));
    }


    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class LightMealsRegistry {

        @SubscribeEvent
        public static void onModConfig(final ModConfig.ModConfigEvent event) {
            final ModConfig config = event.getConfig();
            if (config.getSpec() == ConfigHolder.COMMON_SPEC) {
                ConfigHelper.configCommon(config);
            }
        }

        @SubscribeEvent
        public static void registerRecipeSerializers(final RegistryEvent.Register<IRecipeSerializer<?>> event) {
            CraftingHelper.register(ConfigEnabledCondition.Serializer.INSTANCE);
        }
    }

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
    public static class ForgeRegistry {

        @SubscribeEvent
        public static void onLivingDrops(final LivingDropsEvent event) {
            if (!event.getEntityLiving().isChild()) {
                for (Class<?> entityClass : DROP_LIST.keySet()) {
                    if (entityClass.isInstance(event.getEntityLiving())) {
                        ItemEntity item = DROP_LIST.get(entityClass).getDrop(event.getEntityLiving());
                        if (item != null) {
                            event.getDrops().add(item);
                        }
                        break;
                    }
                }
            }
        }
    }

    public static class Drop {
        public boolean cfgDisable, alwaysDrop;
        public Item uncooked, cooked;
        public int maxDropAmount;

        public Drop(boolean cfgDisable, Item uncooked, Item cooked, int maxDropAmount, boolean alwaysDrop) {
            this.cfgDisable = cfgDisable;
            this.uncooked = uncooked;
            this.cooked = cooked;
            this.maxDropAmount = maxDropAmount;
            this.alwaysDrop = alwaysDrop;
        }

        public ItemEntity getDrop(LivingEntity entity) {
            if (!cfgDisable) {
                int count = alwaysDrop ? entity.world.rand.nextInt(maxDropAmount) + 1 : entity.world.rand.nextInt(maxDropAmount + 1);
                if (count > 0) {
                    return new ItemEntity(entity.world, entity.getPosX(), entity.getPosY() + 0.5D, entity.getPosZ(), new ItemStack(entity.isBurning() ? cooked : uncooked, count));
                }
            }
            return null;
        }
    }
}

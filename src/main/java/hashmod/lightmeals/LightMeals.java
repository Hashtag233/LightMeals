package hashmod.lightmeals;

import hashmod.lightmeals.config.ConfigHelper;
import hashmod.lightmeals.config.ConfigHolder;
import hashmod.lightmeals.crafting.conditions.ConfigEnabledCondition;
import hashmod.lightmeals.registry.ModBlocks;
import hashmod.lightmeals.registry.ModCompostChances;
import hashmod.lightmeals.registry.ModItems;
import net.minecraft.world.entity.GlowSquid;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ambient.Bat;
import net.minecraft.world.entity.animal.*;
import net.minecraft.world.entity.animal.horse.Horse;
import net.minecraft.world.entity.animal.horse.Llama;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.config.ModConfigEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.util.HashMap;
import java.util.Map;

@Mod(LightMealsUtils.MODID)
public class LightMeals {
    public static final CreativeModeTab ITEM_GROUP = new LightMealsItemGroup();
    public static final Map<Class<?>, Drop> DROP_LIST = new HashMap<>();

    public static LightMeals instance;

    public LightMeals() {
        instance = this;

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ConfigHolder.COMMON_SPEC);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onCommonSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onClientSetup);

        ModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void onCommonSetup(final FMLCommonSetupEvent event) {
        addDrop(LightMealsConfig.disableGlowSquidDrop, GlowSquid.class, ModItems.RAW_GLOW_SQUID.get(), ModItems.COOKED_SQUID.get(), 2);
        addDrop(LightMealsConfig.disableSquidDrop, Squid.class, ModItems.RAW_SQUID.get(), ModItems.COOKED_SQUID.get(), 2);
        addDrop(LightMealsConfig.disableLlamaMeatDrop, Llama.class, ModItems.LLAMA_MEAT.get(), ModItems.LLAMA_STEAK.get(), 2, true);
        addDrop(LightMealsConfig.disableHorseMeatDrop, Horse.class, ModItems.HORSE_MEAT.get(), ModItems.COOKED_HORSE_MEAT.get(), 3, true);
        addDrop(LightMealsConfig.disableBatWingsDrop, Bat.class, ModItems.BAT_WINGS.get(), ModItems.COOKED_BAT_WINGS.get(), 1);
        addDrop(LightMealsConfig.disableWolfMeatDrop, Wolf.class, ModItems.WOLF_MEAT.get(), ModItems.COOKED_WOLF_MEAT.get(), 2, true);
        addDrop(LightMealsConfig.disableOcelotMeatDrop, Ocelot.class, ModItems.OCELOT_MEAT.get(), ModItems.COOKED_OCELOT_MEAT.get(), 1, true);
        addDrop(LightMealsConfig.disablePolarBearMeatDrop, PolarBear.class, ModItems.POLAR_BEAR_MEAT.get(), ModItems.POLAR_BEAR_STEAK.get(), 3, true);
        addDrop(LightMealsConfig.disableParrotDrop, Parrot.class, ModItems.RAW_PARROT.get(), ModItems.COOKED_PARROT.get(), 2, true);

        ModCompostChances.register();
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
        public static void onModConfig(final ModConfigEvent event) {
            final ModConfig config = event.getConfig();
            if (config.getSpec() == ConfigHolder.COMMON_SPEC) {
                ConfigHelper.configCommon(config);
            }
        }

        @SubscribeEvent
        public static void registerRecipeSerializers(final RegistryEvent.Register<RecipeSerializer<?>> event) {
            CraftingHelper.register(ConfigEnabledCondition.Serializer.INSTANCE);
        }
    }

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
    public static class ForgeRegistry {

        @SubscribeEvent
        public static void onLivingDrops(final LivingDropsEvent event) {
            if (!event.getEntityLiving().isBaby()) {
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
                int count = alwaysDrop ? entity.level.random.nextInt(maxDropAmount) + 1 : entity.level.random.nextInt(maxDropAmount + 1);
                if (count > 0) {
                    return new ItemEntity(entity.level, entity.getX(), entity.getY() + 0.5D, entity.getZ(), new ItemStack(entity.isBlocking() ? cooked : uncooked, count));
                }
            }
            return null;
        }
    }
}

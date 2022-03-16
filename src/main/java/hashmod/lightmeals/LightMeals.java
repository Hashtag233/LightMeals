package hashmod.lightmeals;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.passive.*;
import net.minecraft.entity.passive.horse.HorseEntity;
import net.minecraft.entity.passive.horse.LlamaEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.util.HashMap;
import java.util.Map;

@Mod(Utils.MODID)
public class LightMeals {
    public static final ItemGroup ITEM_GROUP = new LightMealsItemGroup();
    public static final Map<Class<?>, Drop> DROP_LIST = new HashMap<>();

    public static LightMeals instance;

    public LightMeals() {
        instance = this;

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onCommonSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onClientSetup);

        FoodItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void onCommonSetup(final FMLCommonSetupEvent event) {

        addDrop(SquidEntity.class, FoodItems.RAW_SQUID.get(), FoodItems.COOKED_SQUID.get(), 2);
        addDrop(HorseEntity.class, FoodItems.HORSE_MEAT.get(), FoodItems.COOKED_HORSE_MEAT.get(), 3, true);
        //addDrop(BatEntity.class, FoodItems.BAT_WING.get(), FoodItems.COOKED_BAT_WING.get(), 1);
        //addDrop(WolfEntity.class, FoodItems.WOLF_MEAT.get(), FoodItems.COOKED_WOLF_MEAT.get(), 2, true);
        //addDrop(OcelotEntity.class, FoodItems.OCELOT_MEAT.get(), FoodItems.COOKED_OCELOT_MEAT.get(), 1, true);
        //addDrop(ParrotEntity.class, FoodItems.PARROT_MEAT.get(), FoodItems.COOKED_PARROT_MEAT.get(), 1, true);
        //addDrop(LlamaEntity.class, FoodItems.LLAMA_MEAT.get(), FoodItems.COOKED_LLAMA_MEAT.get(), 2, true);
        //addDrop(PolarBearEntity.class, FoodItems.POLAR_BEAR_MEAT.get(), FoodItems.COOKED_POLAR_BEAR_MEAT.get(), 3, true);
    }

    private void onClientSetup(final FMLClientSetupEvent event) {

    }

    private void addDrop(Class<?> entityClass, Item uncooked, Item cooked, int maxDropAmount) {
        addDrop(entityClass, uncooked, cooked, maxDropAmount, false);
    }

    private void addDrop(Class<?> entityClass, Item uncooked, Item cooked, int maxDropAmount, boolean alwaysDrop) {
        DROP_LIST.put(entityClass, new Drop(uncooked, cooked, maxDropAmount, alwaysDrop));
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
        public boolean alwaysDrop;
        public Item uncooked, cooked;
        public int maxDropAmount;

        public Drop(Item uncooked, Item cooked, int maxDropAmount, boolean alwaysDrop) {
            this.uncooked = uncooked;
            this.cooked = cooked;
            this.maxDropAmount = maxDropAmount;
            this.alwaysDrop = alwaysDrop;
        }

        public ItemEntity getDrop(LivingEntity entity) {
            int count = alwaysDrop ? entity.world.rand.nextInt(maxDropAmount) + 1 : entity.world.rand.nextInt(maxDropAmount + 1);
            if (count > 0) {
                return new ItemEntity(entity.world, entity.getPosX(), entity.getPosY() + 0.5D, entity.getPosZ(), new ItemStack(entity.isBurning() ? cooked : uncooked, count));
            }
            return null;
        }
    }
}

package hashmod.lightmeals;

import hashmod.lightmeals.items.BasicFoodItem;
import hashmod.lightmeals.items.BasicItem;
import hashmod.lightmeals.items.ChorusFruitJuiceItem;
import hashmod.lightmeals.items.HoneyDipperItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FoodItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MODID);

    public static final RegistryObject<Item> CACTUS_FRUIT = ITEMS.register("cactus_fruit", () -> new BasicFoodItem(FoodTypes.CACTUS_FRUIT));
    public static final RegistryObject<Item> HONEY_DIPPER = ITEMS.register("honey_dipper", HoneyDipperItem::new);
    public static final RegistryObject<Item> CHOCOLATE_BAR = ITEMS.register("chocolate_bar", () -> new BasicFoodItem(FoodTypes.CHOCOLATE_BAR));
    public static final RegistryObject<Item> SMALL_CAKE = ITEMS.register("small_cake", () -> new BasicFoodItem(FoodTypes.SMALL_CAKE));
    public static final RegistryObject<Item> MASHED_POTATO = ITEMS.register("mashed_potato", () -> new BasicFoodItem(FoodTypes.MASHED_POTATO));

    public static final RegistryObject<Item> COOKED_MUSHROOM = ITEMS.register("cooked_mushroom", () -> new BasicFoodItem(FoodTypes.COOKED_MUSHROOM));

    public static final RegistryObject<Item> CACTUS_SLICE = ITEMS.register("cactus_slice", () -> new BasicFoodItem(FoodTypes.CACTUS_SLICE));
    public static final RegistryObject<Item> COOKED_CACTUS_SLICE = ITEMS.register("cooked_cactus_slice", () -> new BasicFoodItem(FoodTypes.COOKED_CACTUS_SLICE));
    public static final RegistryObject<Item> RAW_EGG = ITEMS.register("raw_egg", () -> new BasicFoodItem(FoodTypes.RAW_EGG));
    public static final RegistryObject<Item> FRIED_EGG = ITEMS.register("fried_egg", () -> new BasicFoodItem(FoodTypes.FRIED_EGG));
    public static final RegistryObject<Item> RAW_SQUID = ITEMS.register("raw_squid", () -> new BasicFoodItem(FoodTypes.RAW_SQUID));
    public static final RegistryObject<Item> RAW_GLOW_SQUID = ITEMS.register("raw_glow_squid", () -> new BasicFoodItem(FoodTypes.RAW_GLOW_SQUID));
    public static final RegistryObject<Item> COOKED_SQUID = ITEMS.register("cooked_squid", () -> new BasicFoodItem(FoodTypes.COOKED_SQUID));
    public static final RegistryObject<Item> BACON = ITEMS.register("bacon", () -> new BasicFoodItem(FoodTypes.BACON));
    public static final RegistryObject<Item> CRISPY_BACON = ITEMS.register("crispy_bacon", () -> new BasicFoodItem(FoodTypes.CRISPY_BACON));
    public static final RegistryObject<Item> HORSE_MEAT = ITEMS.register("horse_meat", () -> new BasicFoodItem(FoodTypes.HORSE_MEAT));
    public static final RegistryObject<Item> COOKED_HORSE_MEAT = ITEMS.register("cooked_horse_meat", () -> new BasicFoodItem(FoodTypes.COOKED_HORSE_MEAT));

    public static final RegistryObject<Item> VEGGIE_SALAD = ITEMS.register("veggie_salad", () -> new BasicFoodItem(FoodTypes.VEGGIE_SALAD, true, false));

    public static final RegistryObject<Item> CARROT_SOUP = ITEMS.register("carrot_soup", () -> new BasicFoodItem(FoodTypes.CARROT_SOUP, true, false));
    public static final RegistryObject<Item> POTATO_SOUP = ITEMS.register("potato_soup", () -> new BasicFoodItem(FoodTypes.POTATO_SOUP, true, false));
    public static final RegistryObject<Item> PUMPKIN_SOUP = ITEMS.register("pumpkin_soup", () -> new BasicFoodItem(FoodTypes.PUMPKIN_SOUP, true, false));
    public static final RegistryObject<Item> KELP_SOUP = ITEMS.register("kelp_soup", () -> new BasicFoodItem(FoodTypes.KELP_SOUP, true,false));
    public static final RegistryObject<Item> BONE_BROTH = ITEMS.register("bone_broth", () -> new BasicFoodItem(FoodTypes.BONE_BROTH, true, false));

    public static final RegistryObject<Item> RAW_CHOCOLATE = ITEMS.register("raw_chocolate", () -> new BasicItem());
    public static final RegistryObject<Item> HOT_CHOCOLATE = ITEMS.register("hot_chocolate", () -> new BasicFoodItem(FoodTypes.HOT_CHOCOLATE, false, true));
    public static final RegistryObject<Item> SWEET_BERRY_JUICE = ITEMS.register("sweet_berry_juice", () -> new BasicFoodItem(FoodTypes.SWEET_BERRY_JUICE, false, true));
    public static final RegistryObject<Item> MELON_JUICE = ITEMS.register("melon_juice", () -> new BasicFoodItem(FoodTypes.MELON_JUICE, false, true));
    public static final RegistryObject<Item> APPLE_JUICE = ITEMS.register("apple_juice", () -> new BasicFoodItem(FoodTypes.APPLE_JUICE, false, true));
    public static final RegistryObject<Item> SEA_PICKLE_JUICE = ITEMS.register("sea_pickle_juice", () -> new BasicFoodItem(FoodTypes.SEA_PICKLE_JUICE, false, true));
    public static final RegistryObject<Item> SUGAR_CANE_JUICE = ITEMS.register("sugar_cane_juice", () -> new BasicFoodItem(FoodTypes.SUGAR_CANE_JUICE, false, true));
    public static final RegistryObject<Item> CHORUS_FRUIT_JUICE = ITEMS.register("chorus_fruit_juice", ChorusFruitJuiceItem::new);
}
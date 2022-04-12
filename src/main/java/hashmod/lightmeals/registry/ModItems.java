package hashmod.lightmeals.registry;

import hashmod.lightmeals.LightMealsUtils;
import hashmod.lightmeals.items.*;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, LightMealsUtils.MODID);

    //原料
    public static final RegistryObject<Item> CARAMEL = ITEMS.register("caramel", BasicItem::new);

    //零食
    public static final RegistryObject<Item> CACTUS_FRUIT = ITEMS.register("cactus_fruit", () -> new BasicFoodItem(Foods.CACTUS_FRUIT));
    public static final RegistryObject<Item> BABY_CARROT = ITEMS.register("baby_carrot", () -> new BasicFoodItem(Foods.BABY_CARROT));
    public static final RegistryObject<Item> HONEY_DIPPER = ITEMS.register("honey_dipper", HoneyDipperItem::new);
    public static final RegistryObject<Item> CHOCOLATE_BAR = ITEMS.register("chocolate_bar", () -> new BasicFoodItem(Foods.CHOCOLATE_BAR));
    public static final RegistryObject<Item> SMALL_CAKE = ITEMS.register("small_cake", () -> new BasicFoodItem(Foods.SMALL_CAKE));
    public static final RegistryObject<Item> APPLE_PIE = ITEMS.register("apple_pie", () -> new BasicFoodItem(Foods.APPLE_PIE));
    public static final RegistryObject<Item> CHORUS_FRUIT_PIE = ITEMS.register("chorus_fruit_pie", ChorusFruitPieItem::new);
    public static final RegistryObject<Item> FLOWER_PIE = ITEMS.register("flower_pie", () -> new BasicFoodItem(Foods.FLOWER_PIE));
    public static final RegistryObject<Item> MASHED_POTATO = ITEMS.register("mashed_potato", () -> new BasicFoodItem(Foods.MASHED_POTATO));
    public static final RegistryObject<Item> CANDIED_APPLE = ITEMS.register("candied_apple", () -> new BasicFoodItem(Foods.CANDIED_APPLE));

    //不成对的烧烤食物
    public static final RegistryObject<Item> COOKED_MUSHROOM = ITEMS.register("cooked_mushroom", () -> new BasicFoodItem(Foods.COOKED_MUSHROOM));

    //成对的烧烤食物
    public static final RegistryObject<Item> CACTUS_SLICE = ITEMS.register("cactus_slice", () -> new BasicFoodItem(Foods.CACTUS_SLICE));
    public static final RegistryObject<Item> COOKED_CACTUS_SLICE = ITEMS.register("cooked_cactus_slice", () -> new BasicFoodItem(Foods.COOKED_CACTUS_SLICE));
    public static final RegistryObject<Item> RAW_EGG = ITEMS.register("raw_egg", () -> new BasicFoodItem(Foods.RAW_EGG));
    public static final RegistryObject<Item> FRIED_EGG = ITEMS.register("fried_egg", () -> new BasicFoodItem(Foods.FRIED_EGG));
    public static final RegistryObject<Item> RAW_SQUID = ITEMS.register("raw_squid", () -> new BasicFoodItem(Foods.RAW_SQUID));
    public static final RegistryObject<Item> RAW_GLOW_SQUID = ITEMS.register("raw_glow_squid", () -> new BasicFoodItem(Foods.RAW_GLOW_SQUID));
    public static final RegistryObject<Item> COOKED_SQUID = ITEMS.register("cooked_squid", () -> new BasicFoodItem(Foods.COOKED_SQUID));
    public static final RegistryObject<Item> BACON = ITEMS.register("bacon", () -> new BasicFoodItem(Foods.BACON));
    public static final RegistryObject<Item> CRISPY_BACON = ITEMS.register("crispy_bacon", () -> new BasicFoodItem(Foods.CRISPY_BACON));
    public static final RegistryObject<Item> HORSE_MEAT = ITEMS.register("horse_meat", () -> new BasicFoodItem(Foods.HORSE_MEAT));
    public static final RegistryObject<Item> COOKED_HORSE_MEAT = ITEMS.register("cooked_horse_meat", () -> new BasicFoodItem(Foods.COOKED_HORSE_MEAT));
    public static final RegistryObject<Item> FISH_SLICE = ITEMS.register("fish_slice", () -> new BasicFoodItem(Foods.FISH_SLICE));
    public static final RegistryObject<Item> RAW_FISH_FILLET = ITEMS.register("raw_fish_fillet", () -> new BasicFoodItem(Foods.RAW_FISH_FILLET));
    public static final RegistryObject<Item> FISH_FILLET = ITEMS.register("fish_fillet", () -> new BasicFoodItem(Foods.FISH_FILLET));

    //汤
    public static final RegistryObject<Item> CARROT_SOUP = ITEMS.register("carrot_soup", () -> new BasicSoupItem(Foods.CARROT_SOUP));
    public static final RegistryObject<Item> POTATO_SOUP = ITEMS.register("potato_soup", () -> new BasicSoupItem(Foods.POTATO_SOUP));
    public static final RegistryObject<Item> PUMPKIN_SOUP = ITEMS.register("pumpkin_soup", () -> new BasicSoupItem(Foods.PUMPKIN_SOUP));
    public static final RegistryObject<Item> KELP_SOUP = ITEMS.register("kelp_soup", () -> new BasicSoupItem(Foods.KELP_SOUP));
    public static final RegistryObject<Item> CHORUS_SOUP = ITEMS.register("chorus_soup", ChorusSoupItem::new);
    public static final RegistryObject<Item> NETHER_FUNGUS_STEW = ITEMS.register("nether_fungus_stew", () -> new BasicSoupItem(Foods.NETHER_FUNGUS_STEW));
    public static final RegistryObject<Item> FISH_SOUP = ITEMS.register("fish_soup", () -> new BasicSoupItem(Foods.FISH_SOUP));
    public static final RegistryObject<Item> BONE_BROTH = ITEMS.register("bone_broth", () -> new BasicSoupItem(Foods.BONE_BROTH));

    //主食
    public static final RegistryObject<Item> PLATE = ITEMS.register("plate", BasicItem::new);
    public static final RegistryObject<Item> VEGGIE_SALAD = ITEMS.register("veggie_salad", () -> new BasicDishItem(Foods.VEGGIE_SALAD));
    public static final RegistryObject<Item> CHICKEN_DINNER = ITEMS.register("chicken_dinner", () -> new BasicDishItem(Foods.CHICKEN_DINNER));
    public static final RegistryObject<Item> SURF_AND_TURF = ITEMS.register("surf_and_turf", () -> new BasicDishItem(Foods.SURF_AND_TURF));

    //饮品
    public static final RegistryObject<Item> RAW_CHOCOLATE = ITEMS.register("raw_chocolate", BasicItem::new);
    public static final RegistryObject<Item> HOT_CHOCOLATE = ITEMS.register("hot_chocolate", () -> new BasicDrinkItem(Foods.HOT_CHOCOLATE));
    public static final RegistryObject<Item> SWEET_BERRY_JUICE = ITEMS.register("sweet_berry_juice", () -> new BasicDrinkItem(Foods.SWEET_BERRY_JUICE));
    public static final RegistryObject<Item> MELON_JUICE = ITEMS.register("melon_juice", () -> new BasicDrinkItem(Foods.MELON_JUICE));
    public static final RegistryObject<Item> APPLE_JUICE = ITEMS.register("apple_juice", () -> new BasicDrinkItem(Foods.APPLE_JUICE));
    public static final RegistryObject<Item> SEA_PICKLE_JUICE = ITEMS.register("sea_pickle_juice", () -> new BasicDrinkItem(Foods.SEA_PICKLE_JUICE));
    public static final RegistryObject<Item> SUGAR_CANE_JUICE = ITEMS.register("sugar_cane_juice", () -> new BasicDrinkItem(Foods.SUGAR_CANE_JUICE));
    public static final RegistryObject<Item> CHORUS_FRUIT_JUICE = ITEMS.register("chorus_fruit_juice", ChorusFruitJuiceItem::new);
}
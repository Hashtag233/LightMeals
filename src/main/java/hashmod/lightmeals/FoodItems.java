package hashmod.lightmeals;

import hashmod.lightmeals.items.BasicFoodItem;
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

    public static final RegistryObject<Item> COOKED_MUSHROOM = ITEMS.register("cooked_mushroom", () -> new BasicFoodItem(FoodTypes.COOKED_MUSHROOM));

    public static final RegistryObject<Item> CACTUS_SLICE = ITEMS.register("cactus_slice", () -> new BasicFoodItem(FoodTypes.CACTUS_SLICE));
    public static final RegistryObject<Item> COOKED_CACTUS_SLICE = ITEMS.register("cooked_cactus_slice", () -> new BasicFoodItem(FoodTypes.COOKED_CACTUS_SLICE));
    public static final RegistryObject<Item> RAW_EGG = ITEMS.register("raw_egg", () -> new BasicFoodItem(FoodTypes.RAW_EGG));
    public static final RegistryObject<Item> FRIED_EGG = ITEMS.register("fried_egg", () -> new BasicFoodItem(FoodTypes.FRIED_EGG));
    public static final RegistryObject<Item> RAW_SQUID = ITEMS.register("raw_squid", () -> new BasicFoodItem(FoodTypes.RAW_SQUID));
    public static final RegistryObject<Item> COOKED_SQUID = ITEMS.register("cooked_squid", () -> new BasicFoodItem(FoodTypes.COOKED_SQUID));
    public static final RegistryObject<Item> HORSE_MEAT = ITEMS.register("horse_meat", () -> new BasicFoodItem(FoodTypes.HORSE_MEAT));
    public static final RegistryObject<Item> COOKED_HORSE_MEAT = ITEMS.register("cooked_horse_meat", () -> new BasicFoodItem(FoodTypes.COOKED_HORSE_MEAT));

    public static final RegistryObject<Item> CARROT_SOUP = ITEMS.register("carrot_soup", () -> new BasicFoodItem(FoodTypes.CARROT_SOUP, true));
}

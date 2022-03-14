package hashmod.lightmeals;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class FoodTypes {
    public static final Food CACTUS_FRUIT = (new Food.Builder()).hunger(2).saturation(0.2F).build();
    public static final Food HONEY_DIPPER = (new Food.Builder()).hunger(4).saturation(0.4F).build();
    public static final Food CHOCOLATE_BAR = (new Food.Builder()).hunger(8).saturation(1.0F).build();

    public static final Food COOKED_MUSHROOM = (new Food.Builder()).hunger(3).saturation(0.3F).build();

    public static final Food CACTUS_SLICE = (new Food.Builder()).hunger(1).saturation(0.1F).build();
    public static final Food COOKED_CACTUS_SLICE = (new Food.Builder()).hunger(3).saturation(0.3F).build();
    public static final Food RAW_EGG = (new Food.Builder()).hunger(1).saturation(0.2F).build();
    public static final Food FRIED_EGG = (new Food.Builder()).hunger(3).saturation(0.4F).build();
    public static final Food RAW_SQUID = (new Food.Builder()).hunger(1).saturation(0.2F).build();
    public static final Food COOKED_SQUID = (new Food.Builder()).hunger(4).saturation(0.5F).build();
    public static final Food HORSE_MEAT = (new Food.Builder()).hunger(3).saturation(0.3F).meat().build();
    public static final Food COOKED_HORSE_MEAT = (new Food.Builder()).hunger(8).saturation(0.8F).meat().build();

    public static final Food CARROT_SOUP = (new Food.Builder()).hunger(8).saturation(0.8F).build();
}
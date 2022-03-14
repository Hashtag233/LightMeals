package hashmod.lightmeals;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class FoodTypes {
    public static final Food RAW_EGG = (new Food.Builder()).hunger(1).saturation(0.2F).build();
    public static final Food FRIED_EGG = (new Food.Builder()).hunger(3).saturation(0.4F).build();
    public static final Food CACTUS_SLICE = (new Food.Builder()).hunger(1).saturation(0.1F).build();
    public static final Food COOKED_CACTUS_SLICE = (new Food.Builder()).hunger(3).saturation(0.3F).build();
    public static final Food CACTUS_FRUIT = (new Food.Builder()).hunger(2).saturation(0.2F).build();
    public static final Food HONEY_DIPPER = (new Food.Builder()).hunger(4).saturation(0.4F).build();

    public static final Food JELLY = (new Food.Builder()).hunger(4).saturation(0.6F).effect(new EffectInstance(Effects.NAUSEA, 200, 0), 1F).setAlwaysEdible().build();
    public static final Food BACON = (new Food.Builder()).hunger(1).saturation(0.2F).meat().fastToEat().build();
    public static final Food COOKED_BACON = (new Food.Builder()).hunger(4).saturation(0.4F).meat().fastToEat().build();
    public static final Food BACON_AND_EGG = (new Food.Builder()).hunger(7).saturation(0.8F).build();
    public static final Food CARROT_SEED_SOUP = (new Food.Builder()).hunger(8).saturation(0.8F).build();
    public static final Food SQUID = (new Food.Builder()).hunger(1).saturation(0.2F).build();
    public static final Food COOKED_SQUID = (new Food.Builder()).hunger(3).saturation(0.5F).build();
    public static final Food COMPRESSED_FLESH = (new Food.Builder()).hunger(6).saturation(0.2F).meat().build();
    public static final Food CHOCOLATE_BAR = (new Food.Builder()).hunger(8).saturation(1.0F).build();
    public static final Food SPIDER_SOUP = (new Food.Builder()).hunger(3).saturation(0.4F).effect(new EffectInstance(Effects.NIGHT_VISION, 200, 0), 1F).setAlwaysEdible().build();
    public static final Food HORSE_MEAT = (new Food.Builder()).hunger(3).saturation(0.3F).meat().build();
    public static final Food COOKED_HORSE_MEAT = (new Food.Builder()).hunger(8).saturation(0.8F).meat().build();
    public static final Food COOKED_MUSHROOM = (new Food.Builder()).hunger(2).saturation(0.2F).build();
    public static final Food CARROT_PIE = (new Food.Builder()).hunger(8).saturation(0.8F).build();
    public static final Food BAT_WING = (new Food.Builder()).hunger(1).saturation(0.1F).effect(new EffectInstance(Effects.HUNGER, 200, 0), 0.5F).build();
    public static final Food COOKED_BAT_WING = (new Food.Builder()).hunger(3).saturation(0.2F).effect(new EffectInstance(Effects.HUNGER, 200, 0), 0.14F).build();
    public static final Food BLAZE_CREAM = (new Food.Builder()).hunger(4).saturation(0.4F).effect(new EffectInstance(Effects.FIRE_RESISTANCE, 300, 0), 1F).setAlwaysEdible().build();
    public static final Food MELON_SALAD = (new Food.Builder()).hunger(6).saturation(0.6F).build();
    public static final Food ROASTED_SEED = (new Food.Builder()).hunger(1).saturation(0.1F).build();
    public static final Food WOLF_MEAT = (new Food.Builder()).hunger(2).saturation(0.3F).meat().build();
    public static final Food COOKED_WOLF_MEAT = (new Food.Builder()).hunger(6).saturation(0.7F).meat().build();
    public static final Food OCELOT_MEAT = (new Food.Builder()).hunger(2).saturation(0.3F).meat().build();
    public static final Food COOKED_OCELOT_MEAT = (new Food.Builder()).hunger(6).saturation(0.7F).meat().build();
    public static final Food BEETROOT_NOODLES = (new Food.Builder()).hunger(6).saturation(0.6F).build();
    public static final Food PARROT_MEAT = (new Food.Builder()).hunger(2).saturation(0.3F).meat().build();
    public static final Food COOKED_PARROT_MEAT = (new Food.Builder()).hunger(6).saturation(0.7F).meat().build();
    public static final Food LLAMA_MEAT = (new Food.Builder()).hunger(2).saturation(0.3F).meat().build();
    public static final Food COOKED_LLAMA_MEAT = (new Food.Builder()).hunger(7).saturation(0.8F).meat().build();
    public static final Food POLAR_BEAR_MEAT = (new Food.Builder()).hunger(3).saturation(0.3F).meat().build();
    public static final Food COOKED_POLAR_BEAR_MEAT = (new Food.Builder()).hunger(8).saturation(0.8F).meat().build();

    public static final Food VEGGIE_STEW = (new Food.Builder()).hunger(10).saturation(1F).build();
    public static final Food BAT_SOUP = (new Food.Builder()).hunger(6).saturation(0.6F).effect(new EffectInstance(Effects.NIGHT_VISION, 300, 0), 1F).setAlwaysEdible().build();
    public static final Food GOLDEN_FEAST = (new Food.Builder()).hunger(14).saturation(1F).effect(new EffectInstance(Effects.SATURATION, 2400, 0), 1F).setAlwaysEdible().build();

}

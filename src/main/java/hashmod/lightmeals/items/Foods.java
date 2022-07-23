package hashmod.lightmeals.items;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Foods {
    public static final Food CACTUS_FRUIT = (new Food.Builder()).hunger(2).saturation(0.2F).build();
    public static final Food BABY_CARROT = (new Food.Builder()).hunger(2).saturation(0.2F).fastToEat().build();
    public static final Food HONEY_DIPPER = (new Food.Builder()).hunger(4).saturation(0.4F).build();
    public static final Food CHOCOLATE_BAR = (new Food.Builder()).hunger(8).saturation(1F).build();
    public static final Food SMALL_CAKE = (new Food.Builder()).hunger(2).saturation(0.1F).build();
    public static final Food PUDDING = (new Food.Builder()).hunger(6).saturation(0.6F).build();
    public static final Food APPLE_PIE = (new Food.Builder()).hunger(10).saturation(1F).build();
    public static final Food SWEET_BERRY_PIE = (new Food.Builder()).hunger(8).saturation(0.8F).build();
    public static final Food FLOWER_PIE = (new Food.Builder()).hunger(5).saturation(0.5F).fastToEat().build();
    public static final Food CHORUS_FRUIT_PIE = (new Food.Builder()).hunger(8).saturation(0.8F).setAlwaysEdible().build();
    public static final Food MASHED_POTATO = (new Food.Builder()).hunger(3).saturation(0.3F).build();
    public static final Food CANDIED_APPLE = (new Food.Builder()).hunger(6).saturation(0.6F).build();

    public static final Food COOKED_MUSHROOM = (new Food.Builder()).hunger(3).saturation(0.3F).build();
    public static final Food COOKED_RABBIT_FOOT = (new Food.Builder()).hunger(4).saturation(0.5F).meat().build();
    public static final Food COOKED_TROPICAL_FISH = (new Food.Builder()).hunger(5).saturation(0.6F).build();
    public static final Food COOKED_TURTLE_EGG = (new Food.Builder()).hunger(5).saturation(0.6F).build();
    public static final Food COOKED_SCUTE = (new Food.Builder()).hunger(1).saturation(0.1F).build();

    public static final Food CACTUS_SLICE = (new Food.Builder()).hunger(1).saturation(0.1F).build();
    public static final Food COOKED_CACTUS_SLICE = (new Food.Builder()).hunger(3).saturation(0.3F).build();
    public static final Food RAW_EGG = (new Food.Builder()).hunger(1).saturation(0.2F).build();
    public static final Food FRIED_EGG = (new Food.Builder()).hunger(3).saturation(0.4F).build();
    public static final Food BACON = (new Food.Builder()).hunger(1).saturation(0.2F).meat().fastToEat().build();
    public static final Food CRISPY_BACON = (new Food.Builder()).hunger(5).saturation(0.5F).meat().fastToEat().build();
    public static final Food FISH_SLICE = (new Food.Builder()).hunger(1).saturation(0.1F).build();
    public static final Food RAW_FISH_FILLET = (new Food.Builder()).hunger(2).saturation(0.2F).build();
    public static final Food FISH_FILLET = (new Food.Builder()).hunger(5).saturation(0.6F).build();
    public static final Food RAW_SQUID = (new Food.Builder()).hunger(1).saturation(0.2F).build();
    public static final Food RAW_GLOW_SQUID = (new Food.Builder()).hunger(1).saturation(0.2F).setAlwaysEdible().effect(new EffectInstance(Effects.GLOWING, 400, 0), 1F).build();
    public static final Food COOKED_SQUID = (new Food.Builder()).hunger(4).saturation(0.5F).build();
    public static final Food HORSE_MEAT = (new Food.Builder()).hunger(3).saturation(0.3F).meat().build();
    public static final Food COOKED_HORSE_MEAT = (new Food.Builder()).hunger(8).saturation(0.8F).meat().build();
    public static final Food LLAMA_MEAT = (new Food.Builder()).hunger(3).saturation(0.3F).meat().build();
    public static final Food LLAMA_STEAK = (new Food.Builder()).hunger(8).saturation(0.8F).meat().build();
    public static final Food POLAR_BEAR_MEAT = (new Food.Builder()).hunger(3).saturation(0.3F).meat().build();
    public static final Food POLAR_BEAR_STEAK = (new Food.Builder()).hunger(8).saturation(0.8F).meat().build();
    public static final Food OCELOT_MEAT = (new Food.Builder()).hunger(2).saturation(0.3F).meat().build();
    public static final Food COOKED_OCELOT_MEAT = (new Food.Builder()).hunger(6).saturation(0.6F).meat().build();
    public static final Food WOLF_MEAT = (new Food.Builder()).hunger(2).saturation(0.3F).meat().build();
    public static final Food COOKED_WOLF_MEAT = (new Food.Builder()).hunger(6).saturation(0.6F).meat().build();
    public static final Food RAW_PARROT = (new Food.Builder()).hunger(2).saturation(0.3F).meat().build();
    public static final Food COOKED_PARROT = (new Food.Builder()).hunger(6).saturation(0.6F).meat().build();
    public static final Food BAT_WINGS = (new Food.Builder()).hunger(2).saturation(0.1F).meat().setAlwaysEdible().effect(new EffectInstance(Effects.NAUSEA, 600, 0), 1F).effect(new EffectInstance(Effects.POISON, 1200, 0), 1F).effect(new EffectInstance(Effects.HUNGER, 1200, 1), 0.6F).build();
    public static final Food COOKED_BAT_WINGS = (new Food.Builder()).hunger(4).saturation(0.2F).meat().setAlwaysEdible().effect(new EffectInstance(Effects.HUNGER, 600, 1), 0.6F).build();

    public static final Food CARROT_SOUP = (new Food.Builder()).hunger(8).saturation(0.8F).build();
    public static final Food POTATO_STEW = (new Food.Builder()).hunger(3).saturation(0.4F).build();
    public static final Food PUMPKIN_SOUP = (new Food.Builder()).hunger(6).saturation(0.6F).build();
    public static final Food KELP_SOUP = (new Food.Builder()).hunger(3).saturation(0.3F).build();
    public static final Food CHORUS_SOUP = (new Food.Builder()).hunger(10).saturation(0.8F).setAlwaysEdible().build();
    public static final Food NETHER_FUNGUS_STEW = (new Food.Builder()).hunger(8).saturation(0.8F).build();
    public static final Food FISH_SOUP = (new Food.Builder()).hunger(8).saturation(1F).build();
    public static final Food INK_SOUP = (new Food.Builder()).hunger(6).saturation(0.6F).setAlwaysEdible().effect(new EffectInstance(Effects.BLINDNESS, 300, 0), 0.2F).build();
    public static final Food GLOW_INK_SOUP = (new Food.Builder()).hunger(6).saturation(0.6F).setAlwaysEdible().effect(new EffectInstance(Effects.GLOWING, 600, 0), 1F).build();
    public static final Food BONE_BROTH = (new Food.Builder()).hunger(1).saturation(0.2F).setAlwaysEdible().effect(new EffectInstance(Effects.WEAKNESS, 600, 0), 1F).build();
    public static final Food BLAZE_SOUP = (new Food.Builder()).hunger(6).saturation(0.6F).setAlwaysEdible().effect(new EffectInstance(Effects.FIRE_RESISTANCE, 1800, 0), 1F).build();

    public static final Food VEGGIE_SALAD = (new Food.Builder()).hunger(13).saturation(1F).build();
    public static final Food FRUIT_SALAD = (new Food.Builder()).hunger(12).saturation(1F).build();
    public static final Food NETHER_ROOTS_SALAD = (new Food.Builder()).hunger(4).saturation(0.4F).build();
    public static final Food CHICKEN_DINNER = (new Food.Builder()).hunger(13).saturation(1F).build();
    public static final Food SURF_AND_TURF = (new Food.Builder()).hunger(15).saturation(1.2F).build();

    public static final Food HOT_CHOCOLATE = (new Food.Builder()).hunger(5).saturation(0.4F).build();
    public static final Food SWEET_BERRY_JUICE = (new Food.Builder()).hunger(5).saturation(0.4F).build();
    public static final Food MELON_JUICE = (new Food.Builder()).hunger(5).saturation(0.6F).build();
    public static final Food APPLE_JUICE = (new Food.Builder()).hunger(9).saturation(0.8F).build();
    public static final Food SEA_PICKLE_JUICE = (new Food.Builder()).hunger(5).saturation(0.6F).build();
    public static final Food SUGAR_CANE_JUICE = (new Food.Builder()).hunger(2).saturation(0.2F).build();
    public static final Food CHORUS_FRUIT_JUICE = (new Food.Builder()).hunger(8).saturation(0.8F).setAlwaysEdible().build();
}
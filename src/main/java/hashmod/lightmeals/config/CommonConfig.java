package hashmod.lightmeals.config;

import net.minecraftforge.common.ForgeConfigSpec;

final class CommonConfig {
    final ForgeConfigSpec.BooleanValue disableHorseMeatDrop;
    final ForgeConfigSpec.BooleanValue disableOcelotMeatDrop;
    final ForgeConfigSpec.BooleanValue disableSquidDrop;
    final ForgeConfigSpec.BooleanValue disableWolfMeatDrop;

    final ForgeConfigSpec.BooleanValue disableRecipeBabyCarrot;
    final ForgeConfigSpec.BooleanValue disableRecipeBacon;
    final ForgeConfigSpec.BooleanValue disableRecipeCactusSlice;
    final ForgeConfigSpec.BooleanValue disableRecipeCaramel;
    final ForgeConfigSpec.BooleanValue disableRecipeCookedMushroom;
    final ForgeConfigSpec.BooleanValue disableRecipeMashedPotato;
    final ForgeConfigSpec.BooleanValue disableRecipeRawEgg;
    final ForgeConfigSpec.BooleanValue disableRecipeRawFishFillet;

    private static final String DISABLEDROP_HorseMeatDrop = "If set to true, horses are not allowed to drop Horse Meat";
    private static final String DISABLEDROP_OcelotMeatDrop = "If set to true, ocelots are not allowed to drop Ocelot Meat";
    private static final String DISABLEDROP_SquidDrop = "If set to true, squids are not allowed to drop Squid";
    private static final String DISABLEDROP_WolfMeatDrop = "If set to true, wolves are not allowed to drop Wolf Meat";

    private static final String DISABLERECIPE_BabyCarrot = "Disable Baby Carrot Recipe";
    private static final String DISABLERECIPE_Bacon = "Disable Bacon Recipe";
    private static final String DISABLERECIPE_CactusSlice = "Disable Cactus Slice Recipe";
    private static final String DISABLERECIPE_Caramel = "Disable Caramel Recipe";
    private static final String DISABLERECIPE_CookedMushroom = "Disable Cooked Mushroom Recipe";
    private static final String DISABLERECIPE_MashedPotato = "Disable Mashed Potato Recipe";
    private static final String DISABLERECIPE_RawEgg = "Disable Raw Egg Recipe";
    private static final String DISABLERECIPE_RawFishFillet = "Disable Raw Fish Fillet Recipe";

    CommonConfig(final ForgeConfigSpec.Builder builder) {
        builder.comment("Set to true, to disable the Mobdrops").push("general.disable_mobdrops");
        disableHorseMeatDrop = builder
                .comment(DISABLEDROP_HorseMeatDrop)
                .define("disableHorseMeatDrop", false);
        disableOcelotMeatDrop = builder
                .comment(DISABLEDROP_OcelotMeatDrop)
                .define("disableOcelotMeatDrop", false);
        disableSquidDrop = builder
                .comment(DISABLEDROP_SquidDrop)
                .define("disableSquidDrop", false);
        disableWolfMeatDrop = builder
                .comment(DISABLEDROP_WolfMeatDrop)
                .define("disableWolfMeatDrop", false);
        builder.pop();

        builder.comment("Set to true, to disable the Recipes").push("disable_recipes");
        disableRecipeBabyCarrot = builder
                .comment(DISABLERECIPE_BabyCarrot)
                .define("disableRecipeBabyCarrot", false);
        disableRecipeBacon = builder
                .comment(DISABLERECIPE_Bacon)
                .define("disableRecipeBacon", false);
        disableRecipeCactusSlice = builder
                .comment(DISABLERECIPE_CactusSlice)
                .define("disableRecipeCactusSlice", false);
        disableRecipeCaramel = builder
                .comment(DISABLERECIPE_Caramel)
                .define("disableRecipeCaramel", false);
        disableRecipeCookedMushroom = builder
                .comment(DISABLERECIPE_CookedMushroom)
                .define("disableRecipeCookedMushroom", false);
        disableRecipeMashedPotato = builder
                .comment(DISABLERECIPE_MashedPotato)
                .define("disableRecipeMashedPotato", false);
        disableRecipeRawEgg = builder
                .comment(DISABLERECIPE_RawEgg)
                .define("disableRecipeRawEgg", false);
        disableRecipeRawFishFillet = builder
                .comment(DISABLERECIPE_RawFishFillet)
                .define("disableRecipeRawFishFillet", false);
        builder.pop();
    }
}
package hashmod.lightmeals.config;

import hashmod.lightmeals.LightMealsConfig;
import net.minecraftforge.fml.config.ModConfig;

public final class ConfigHelper {

    public static void bakeCommon(final ModConfig config) {
        LightMealsConfig.disableRecipeBabyCarrot = ConfigHolder.COMMON.disableRecipeBabyCarrot.get();
        LightMealsConfig.disableRecipeBacon = ConfigHolder.COMMON.disableRecipeBacon.get();
        LightMealsConfig.disableRecipeCactusSlice = ConfigHolder.COMMON.disableRecipeCactusSlice.get();
        LightMealsConfig.disableRecipeCaramel = ConfigHolder.COMMON.disableRecipeCaramel.get();
        LightMealsConfig.disableRecipeCookedMushroom = ConfigHolder.COMMON.disableRecipeCookedMushroom.get();
        LightMealsConfig.disableRecipeMashedPotato = ConfigHolder.COMMON.disableRecipeMashedPotato.get();
        LightMealsConfig.disableRecipeRawEgg = ConfigHolder.COMMON.disableRecipeRawEgg.get();
        LightMealsConfig.disableRecipeRawFishFillet = ConfigHolder.COMMON.disableRecipeRawFishFillet.get();
    }

    private static void setValueAndSave(final ModConfig modConfig, final String path, final Object newValue) {
        modConfig.getConfigData().set(path, newValue);
        modConfig.save();
    }
}
package hashmod.lightmeals.crafting.conditions;

import com.google.gson.JsonObject;

import hashmod.lightmeals.LightMealsConfig;
import hashmod.lightmeals.LightMealsUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraftforge.common.crafting.conditions.ICondition;
import net.minecraftforge.common.crafting.conditions.IConditionSerializer;
import org.apache.logging.log4j.LogManager;

public class ConfigEnabledCondition implements ICondition {
    private static final ResourceLocation NAME = new ResourceLocation(LightMealsUtils.MODID, "config_enabled");
    private final String config_key;

    public ConfigEnabledCondition(String config_key) {
        this.config_key = config_key;
    }

    @Override
    public ResourceLocation getID() {
        return NAME;
    }

    @Override
    public boolean test() {
        try {
            return !LightMealsConfig.class.getField(config_key).getBoolean(null);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            LogManager.getLogger(LightMealsUtils.MODID).warn("No " + config_key + " configuration found! Details: " + e.getMessage());
            return false;
        }
    }

    @Override
    public String toString() {
        return "config_enabled(\"" + config_key + "\")";
    }

    public static class Serializer implements IConditionSerializer<ConfigEnabledCondition> {
        public static final ConfigEnabledCondition.Serializer INSTANCE = new ConfigEnabledCondition.Serializer();

        @Override
        public void write(JsonObject json, ConfigEnabledCondition value) {
            json.addProperty("config_key", value.config_key);
        }

        @Override
        public ConfigEnabledCondition read(JsonObject json) {
            return new ConfigEnabledCondition(GsonHelper.getAsString(json, "config_key"));
        }

        @Override
        public ResourceLocation getID() {
            return ConfigEnabledCondition.NAME;
        }
    }
}
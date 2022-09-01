package hashmod.lightmeals.fluids;

import hashmod.lightmeals.LightMealsUtils;
import hashmod.lightmeals.registry.ModFluids;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.RegistryObject;

import static hashmod.lightmeals.registry.ModBlocks.CARAMEL_BLOCK;
import static hashmod.lightmeals.registry.ModItems.CARAMEL_BUCKET;

public class CaramelFluid {

    private static final String id = "caramel";
    public static RegistryObject<FlowingFluid> STILL = ModFluids.FLUIDS.register(id, () -> new ForgeFlowingFluid.Source(makeProperties()));
    public static RegistryObject<FlowingFluid> FLOWING = ModFluids.FLUIDS.register(id + "_flowing", () -> new ForgeFlowingFluid.Flowing(makeProperties()));

    private static ForgeFlowingFluid.Properties makeProperties() {
        return new ForgeFlowingFluid.Properties(
                STILL,
                FLOWING,
                FluidAttributes.builder(
                        new ResourceLocation(LightMealsUtils.MODID + ":fluid/" + id + "_still"),
                        new ResourceLocation(LightMealsUtils.MODID + ":fluid/" + id + "_flow")))
                .bucket(CARAMEL_BUCKET)
                .block(CARAMEL_BLOCK);
    }
}

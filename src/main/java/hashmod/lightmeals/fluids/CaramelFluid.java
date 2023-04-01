package hashmod.lightmeals.fluids;

import hashmod.lightmeals.LightMealsUtils;
import hashmod.lightmeals.registry.ModFluids;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraftforge.client.extensions.common.IClientFluidTypeExtensions;
import net.minecraftforge.common.SoundActions;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Consumer;

import static hashmod.lightmeals.registry.ModBlocks.*;
import static hashmod.lightmeals.registry.ModItems.*;

public class CaramelFluid {

    private static final String id = "caramel";
    public static RegistryObject<FlowingFluid> STILL = ModFluids.FLUIDS.register(id, () -> new ForgeFlowingFluid.Source(makeProperties()));
    public static RegistryObject<FlowingFluid> FLOWING = ModFluids.FLUIDS.register(id + "_flowing", () -> new ForgeFlowingFluid.Flowing(makeProperties()));
    public static RegistryObject<FluidType> TYPE = ModFluids.FLUID_TYPES.register(id, () -> new FluidType(FluidType.Properties.create()
        .fallDistanceModifier(0.0F).canExtinguish(true).supportsBoating(true)
        .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL).sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_FILL)
        .sound(SoundActions.FLUID_VAPORIZE, SoundEvents.FIRE_EXTINGUISH)) {
        public void initializeClient(Consumer<IClientFluidTypeExtensions> consumer) {
            consumer.accept(new IClientFluidTypeExtensions() {
                private static final ResourceLocation STILL = new ResourceLocation(LightMealsUtils.MODID, "fluid/caramel_still");
                private static final ResourceLocation FLOW = new ResourceLocation(LightMealsUtils.MODID, "fluid/caramel_flow");

                public ResourceLocation getStillTexture() {
                    return STILL;
                }

                public ResourceLocation getFlowingTexture() {
                    return FLOW;
                }
            });
        }
    });

    private static ForgeFlowingFluid.Properties makeProperties() {
        return new ForgeFlowingFluid.Properties(TYPE, STILL, FLOWING)
            .bucket(CARAMEL_BUCKET)
            .block(CARAMEL_BLOCK);
    }
}
package hashmod.lightmeals.fluids.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.material.FlowingFluid;

public class CaramelFluidBlock extends LiquidBlock {

    public CaramelFluidBlock(java.util.function.Supplier<? extends FlowingFluid> supplier, Block.Properties props) {
        super(supplier, props);
    }
}

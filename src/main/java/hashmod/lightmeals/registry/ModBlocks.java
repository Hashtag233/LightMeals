package hashmod.lightmeals.registry;

import hashmod.lightmeals.LightMealsUtils;
import hashmod.lightmeals.blocks.HoneyCakeBlock;
import hashmod.lightmeals.blocks.PumpkinCakeBlock;
import hashmod.lightmeals.fluids.block.CaramelFluidBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static hashmod.lightmeals.fluids.CaramelFluid.STILL;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, LightMealsUtils.MODID);

    public static final RegistryObject<Block> HONEY_CAKE = BLOCKS.register("honey_cake", () -> new HoneyCakeBlock(BlockBehaviour.Properties.of(Material.CAKE).strength(0.5F).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> PUMPKIN_CAKE = BLOCKS.register("pumpkin_cake", () -> new PumpkinCakeBlock(BlockBehaviour.Properties.of(Material.CAKE).strength(0.5F).sound(SoundType.WOOL)));

    public static final RegistryObject<LiquidBlock> CARAMEL_BLOCK = BLOCKS.register("caramel_block", () -> new CaramelFluidBlock(STILL, Block.Properties.of(Material.LAVA).noCollission().strength(100.0F).noLootTable()));
}
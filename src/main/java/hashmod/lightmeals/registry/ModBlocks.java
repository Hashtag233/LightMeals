package hashmod.lightmeals.registry;

import hashmod.lightmeals.LightMealsUtils;
import hashmod.lightmeals.blocks.HoneyCakeBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, LightMealsUtils.MODID);

    public static final RegistryObject<Block> HONEY_CAKE = BLOCKS.register("honey_cake", () -> new HoneyCakeBlock(Block.Properties.create(Material.CAKE).hardnessAndResistance(0.5F).sound(SoundType.CLOTH)));

}
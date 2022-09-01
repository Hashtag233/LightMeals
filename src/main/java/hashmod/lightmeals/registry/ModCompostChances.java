package hashmod.lightmeals.registry;

import net.minecraft.world.level.block.ComposterBlock;

public class ModCompostChances {
    public static void register() {
        ComposterBlock.COMPOSTABLES.put(ModItems.CACTUS_FRUIT.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(ModItems.BABY_CARROT.get(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(ModItems.CHOCOLATE_BAR.get(), 1F);
        ComposterBlock.COMPOSTABLES.put(ModItems.SMALL_CAKE.get(), 0.85F);
        ComposterBlock.COMPOSTABLES.put(ModItems.APPLE_PIE.get(), 1F);
        ComposterBlock.COMPOSTABLES.put(ModItems.SWEET_BERRY_PIE.get(), 1F);
        ComposterBlock.COMPOSTABLES.put(ModItems.GLOW_BERRY_PIE.get(), 1F);
        ComposterBlock.COMPOSTABLES.put(ModItems.FLOWER_PIE.get(), 1F);
        ComposterBlock.COMPOSTABLES.put(ModItems.CHORUS_FRUIT_PIE.get(), 1F);
        ComposterBlock.COMPOSTABLES.put(ModItems.MASHED_POTATO.get(), 0.85F);
        ComposterBlock.COMPOSTABLES.put(ModItems.CANDIED_APPLE.get(), 0.85F);
        ComposterBlock.COMPOSTABLES.put(ModItems.COOKED_MUSHROOM.get(), 0.85F);
        ComposterBlock.COMPOSTABLES.put(ModItems.CACTUS_SLICE.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(ModItems.COOKED_CACTUS_SLICE.get(), 0.85F);
        ComposterBlock.COMPOSTABLES.put(ModItems.HONEY_CAKE.get(), 1F);
    }
}

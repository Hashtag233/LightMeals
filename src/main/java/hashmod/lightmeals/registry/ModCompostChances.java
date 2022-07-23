package hashmod.lightmeals.registry;

import net.minecraft.block.ComposterBlock;

public class ModCompostChances {
    public static void register() {
        ComposterBlock.CHANCES.put(ModItems.CACTUS_FRUIT.get(), 0.65F);
        ComposterBlock.CHANCES.put(ModItems.BABY_CARROT.get(), 0.3F);
        ComposterBlock.CHANCES.put(ModItems.CHOCOLATE_BAR.get(), 1F);
        ComposterBlock.CHANCES.put(ModItems.SMALL_CAKE.get(), 0.85F);
        ComposterBlock.CHANCES.put(ModItems.APPLE_PIE.get(), 1F);
        ComposterBlock.CHANCES.put(ModItems.SWEET_BERRY_PIE.get(), 1F);
        ComposterBlock.CHANCES.put(ModItems.FLOWER_PIE.get(), 1F);
        ComposterBlock.CHANCES.put(ModItems.CHORUS_FRUIT_PIE.get(), 1F);
        ComposterBlock.CHANCES.put(ModItems.MASHED_POTATO.get(), 0.85F);
        ComposterBlock.CHANCES.put(ModItems.CANDIED_APPLE.get(), 0.85F);
        ComposterBlock.CHANCES.put(ModItems.COOKED_MUSHROOM.get(), 0.85F);
        ComposterBlock.CHANCES.put(ModItems.CACTUS_SLICE.get(), 0.65F);
        ComposterBlock.CHANCES.put(ModItems.COOKED_CACTUS_SLICE.get(), 0.85F);
        ComposterBlock.CHANCES.put(ModItems.HONEY_CAKE.get(), 1F);
    }
}

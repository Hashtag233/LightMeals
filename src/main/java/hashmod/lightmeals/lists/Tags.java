package hashmod.lightmeals.lists;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class Tags {
    public static final TagKey<Block> MINEABLE_WITH_KNIFE = modBlockTag("mineable/knife");

    public Tags() {
    }

    private static TagKey<Block> modBlockTag(String path) {
        return TagKey.create(Registry.BLOCK_REGISTRY, new ResourceLocation("farmersdelight:" + path));
    }
}

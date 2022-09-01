package hashmod.lightmeals.lists;

import hashmod.lightmeals.registry.ModItems;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class MaterialTiers {
    public static final Tier CARAMEL = new ForgeTier(1, 59, 6F, 4F, 15,
            BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ModItems.CARAMEL_INGOT.get()));
}

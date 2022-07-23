package hashmod.lightmeals;

import hashmod.lightmeals.registry.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;

public class LightMealsItemGroup extends ItemGroup {

    public LightMealsItemGroup() {
        super(LightMealsUtils.MODID);
    }

    @Nonnull
    @Override
    public ItemStack createIcon() {
        return new ItemStack(ModItems.SWEET_BERRY_PIE.get());
    }
}

package hashmod.lightmeals;

import hashmod.lightmeals.registry.ModItems;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

import javax.annotation.Nonnull;

public class LightMealsItemGroup extends CreativeModeTab {

    public LightMealsItemGroup() {
        super(LightMealsUtils.MODID);
    }

    @Nonnull
    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ModItems.SWEET_BERRY_PIE.get());
    }
}

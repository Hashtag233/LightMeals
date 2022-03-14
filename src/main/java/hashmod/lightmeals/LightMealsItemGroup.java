package hashmod.lightmeals;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;

public class LightMealsItemGroup extends ItemGroup {

    public LightMealsItemGroup() {
        super("light_meal");
    }

    @Nonnull
    @Override
    public ItemStack createIcon() {
        return new ItemStack(FoodItems.FRIED_EGG.get());
    }
}

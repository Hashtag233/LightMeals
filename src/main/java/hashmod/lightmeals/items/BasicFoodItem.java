package hashmod.lightmeals.items;

import hashmod.lightmeals.LightMeals;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.UseAction;

public class BasicFoodItem extends Item {

    public BasicFoodItem(Food foodType) {
        super(new Item.Properties().food(foodType).group(LightMeals.ITEM_GROUP).maxStackSize(64));
    }

    @Override
    public int getUseDuration(ItemStack stack) {
        return super.getUseDuration(stack);
    }

    @Override
    public UseAction getUseAction(ItemStack itemstack) {
        return UseAction.EAT;
    }
}

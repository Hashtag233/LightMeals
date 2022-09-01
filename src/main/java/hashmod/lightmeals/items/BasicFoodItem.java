package hashmod.lightmeals.items;

import hashmod.lightmeals.LightMeals;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;

public class BasicFoodItem extends Item {

    public BasicFoodItem(FoodProperties foodType) {
        super(new Item.Properties().food(foodType).tab(LightMeals.ITEM_GROUP).stacksTo(64));
    }

    @Override
    public int getUseDuration(ItemStack stack) {
        return super.getUseDuration(stack);
    }

    @Override
    public UseAnim getUseAnimation(ItemStack itemstack) {
        return UseAnim.EAT;
    }
}

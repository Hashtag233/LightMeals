package hashmod.lightmeals.items;

import hashmod.lightmeals.registry.ModItems;
import hashmod.lightmeals.LightMeals;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BasicDishItem extends Item {
    public BasicDishItem(Food foodType) {
        super(new Properties().food(foodType).group(LightMeals.ITEM_GROUP).maxStackSize(1));
    }
    @Override
    public int getUseDuration(ItemStack stack) {
        return super.getUseDuration(stack);
    }

    @Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {
        ItemStack item = super.onItemUseFinish(stack, worldIn, entityLiving);
        if (!(entityLiving instanceof PlayerEntity) || !((PlayerEntity) entityLiving).abilities.isCreativeMode) {
            if (stack.isEmpty()) {
                return new ItemStack(ModItems.PLATE.get());
            } else {
                ItemStack itemstack = new ItemStack(ModItems.PLATE.get());
                PlayerEntity playerentity = (PlayerEntity) entityLiving;
                if (!playerentity.inventory.addItemStackToInventory(itemstack)) {
                    playerentity.dropItem(itemstack, false);
                }
            }
        }
        return item;
    }
}

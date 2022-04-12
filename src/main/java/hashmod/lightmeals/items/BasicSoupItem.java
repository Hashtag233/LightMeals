package hashmod.lightmeals.items;

import hashmod.lightmeals.LightMeals;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.world.World;

public class BasicSoupItem extends Item {
    public BasicSoupItem(Food foodType) {
        super(new Item.Properties().food(foodType).group(LightMeals.ITEM_GROUP).maxStackSize(1));
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
                return new ItemStack(Items.BOWL);
            } else {
                ItemStack itemstack = new ItemStack(Items.BOWL);
                PlayerEntity playerentity = (PlayerEntity) entityLiving;
                if (!playerentity.inventory.addItemStackToInventory(itemstack)) {
                    playerentity.dropItem(itemstack, false);
                }
            }
        }
        return item;
    }
}

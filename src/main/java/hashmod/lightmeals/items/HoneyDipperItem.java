package hashmod.lightmeals.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;

public class HoneyDipperItem extends BasicFoodItem {

    public HoneyDipperItem() {
        super(Foods.HONEY_DIPPER);
    }

    @Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {
        ItemStack item = super.onItemUseFinish(stack, worldIn, entityLiving);
        if (!(entityLiving instanceof PlayerEntity) || !((PlayerEntity) entityLiving).abilities.isCreativeMode) {
            if (stack.isEmpty()) {
                return new ItemStack(Items.STICK);
            } else {
                ItemStack itemstack = new ItemStack(Items.STICK);
                PlayerEntity playerentity = (PlayerEntity) entityLiving;
                if (!playerentity.inventory.addItemStackToInventory(itemstack)) {
                    playerentity.dropItem(itemstack, false);
                }
            }
        }
        return item;
    }
}

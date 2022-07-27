package hashmod.lightmeals.items;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

public class HoneyDipperItem extends BasicFoodItem {

    public HoneyDipperItem() {
        super(Foods.HONEY_DIPPER);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level worldIn, LivingEntity entityLiving) {
        super.finishUsingItem(stack, worldIn, entityLiving);

        if (stack.isEmpty()) {
            return new ItemStack(Items.STICK);
        } else {
            if (entityLiving instanceof Player player && !((Player)entityLiving).getAbilities().instabuild) {
                ItemStack itemstack = new ItemStack(Items.STICK);
                if (!player.getInventory().add(itemstack)) {
                    player.drop(itemstack, false);
                }
            }

            return stack;
        }
    }
}

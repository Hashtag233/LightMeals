package hashmod.lightmeals.items;

import hashmod.lightmeals.FoodTypes;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;

public class HoneyDipperItem extends BasicFoodItem {

    public HoneyDipperItem() {
        super(FoodTypes.HONEY_DIPPER);
    }

    @Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {
        if (!(entityLiving instanceof PlayerEntity) || !((PlayerEntity) entityLiving).abilities.isCreativeMode) {
            return new ItemStack(Items.STICK);
        }
        return super.onItemUseFinish(stack, worldIn, entityLiving);
    }
}

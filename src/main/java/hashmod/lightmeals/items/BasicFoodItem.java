package hashmod.lightmeals.items;

import hashmod.lightmeals.LightMeals;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.UseAction;
import net.minecraft.world.World;

public class BasicFoodItem extends Item {
    private final boolean isSoup;
    private final boolean isDrink;

    public BasicFoodItem(Food foodType, boolean isSoup, boolean isDrink) {
        super(new Item.Properties().food(foodType).group(LightMeals.ITEM_GROUP).maxStackSize(isSoup ? 1 : 64));
        this.isSoup = isSoup;
        this.isDrink = isDrink;
    }

    public BasicFoodItem(Food foodType) {
        this(foodType, false, false);
    }

    @Override
    public int getUseDuration(ItemStack stack) {
        return super.getUseDuration(stack);
    }

    @Override
    public UseAction getUseAction(ItemStack itemstack) {
        if (isDrink) {
            return UseAction.DRINK;
        }
        return UseAction.EAT;
    }

    @Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {
        ItemStack item = super.onItemUseFinish(stack, worldIn, entityLiving);
        if (!(entityLiving instanceof PlayerEntity) || !((PlayerEntity) entityLiving).abilities.isCreativeMode) {
            if (isSoup) {
                if (stack.isEmpty()) {
                    return new ItemStack(Items.BOWL);
                } else {
                    ItemStack itemstack = new ItemStack(Items.BOWL);
                    PlayerEntity playerentity = (PlayerEntity)entityLiving;
                    if (!playerentity.inventory.addItemStackToInventory(itemstack)) {
                        playerentity.dropItem(itemstack, false);
                    }
                }
            }
            if (isDrink) {
                if (stack.isEmpty()) {
                    return new ItemStack(Items.GLASS_BOTTLE);
                } else {
                    ItemStack itemstack = new ItemStack(Items.GLASS_BOTTLE);
                    PlayerEntity playerentity = (PlayerEntity)entityLiving;
                    if (!playerentity.inventory.addItemStackToInventory(itemstack)) {
                        playerentity.dropItem(itemstack, false);
                    }
                }
            }
        }
        return item;
    }
}

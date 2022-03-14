package hashmod.lightmeals.items;

import hashmod.lightmeals.LightMeals;
import hashmod.lightmeals.FoodItems;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;

import java.util.Objects;

public class BasicFoodItem extends Item {
    private final boolean isSoup;

    public BasicFoodItem(Food foodType, boolean isSoup) {
        super(new Item.Properties().food(foodType).group(LightMeals.ITEM_GROUP).maxStackSize(isSoup ? 1 : 64));
        this.isSoup = isSoup;
    }

    public BasicFoodItem(Food foodType) {
        this(foodType, false);
    }

    @Override
    public int getUseDuration(ItemStack stack) {
        if (Objects.requireNonNull(stack.getItem()).equals(FoodItems.JELLY.get())) {
            return 64;
        } else {
            return super.getUseDuration(stack);
        }
    }

    @Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {
        ItemStack item = super.onItemUseFinish(stack, worldIn, entityLiving);
        if (isSoup) {
            if (!(entityLiving instanceof PlayerEntity) || !((PlayerEntity) entityLiving).abilities.isCreativeMode) {
                return new ItemStack(Items.BOWL);
            }
        }
        return item;
    }
}

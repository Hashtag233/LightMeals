package hashmod.lightmeals.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.FoxEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.UseAction;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class ChorusFruitJuiceItem extends BasicFoodItem {
    public ChorusFruitJuiceItem() {
        super(Foods.CHORUS_FRUIT_JUICE);
    }

    @Override
    public UseAction getUseAction(ItemStack itemstack) {
        return UseAction.DRINK;
    }

    @Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {
        ItemStack item = super.onItemUseFinish(stack, worldIn, entityLiving);
        if (!worldIn.isRemote) {
            double d0 = entityLiving.getPosX();
            double d1 = entityLiving.getPosY();
            double d2 = entityLiving.getPosZ();

            for (int i = 0; i < 16; ++i) {
                double d3 = entityLiving.getPosX() + (entityLiving.getRNG().nextDouble() - 0.5D) * 16.0D;
                double d4 = MathHelper.clamp(entityLiving.getPosY() + (double) (entityLiving.getRNG().nextInt(16) - 8), 0.0D, (double) (worldIn.func_234938_ad_() - 1));
                double d5 = entityLiving.getPosZ() + (entityLiving.getRNG().nextDouble() - 0.5D) * 16.0D;
                if (entityLiving.isPassenger()) {
                    entityLiving.stopRiding();
                }

                if (entityLiving.attemptTeleport(d3, d4, d5, true)) {
                    SoundEvent soundevent = entityLiving instanceof FoxEntity ? SoundEvents.field_232710_ez_ : SoundEvents.ITEM_CHORUS_FRUIT_TELEPORT;
                    worldIn.playSound((PlayerEntity) null, d0, d1, d2, soundevent, SoundCategory.PLAYERS, 1.0F, 1.0F);
                    entityLiving.playSound(soundevent, 1.0F, 1.0F);
                    break;
                }
            }

            if (entityLiving instanceof PlayerEntity) {
                ((PlayerEntity) entityLiving).getCooldownTracker().setCooldown(this, 20);
            }
        }
        if (!(entityLiving instanceof PlayerEntity) || !((PlayerEntity) entityLiving).abilities.isCreativeMode) {
            if (stack.isEmpty()) {
                return new ItemStack(Items.GLASS_BOTTLE);
            } else {
                ItemStack itemstack = new ItemStack(Items.GLASS_BOTTLE);
                PlayerEntity playerentity = (PlayerEntity) entityLiving;
                if (!playerentity.inventory.addItemStackToInventory(itemstack)) {
                    playerentity.dropItem(itemstack, false);
                }
            }
        }
        return item;
    }
}

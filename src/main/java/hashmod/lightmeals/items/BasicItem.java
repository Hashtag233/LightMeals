package hashmod.lightmeals.items;

import hashmod.lightmeals.LightMeals;
import net.minecraft.world.item.Item;

public class BasicItem extends Item {
    public BasicItem() {
        super(new Item.Properties().tab(LightMeals.ITEM_GROUP).stacksTo(64));
    }
}

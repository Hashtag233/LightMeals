package hashmod.lightmeals.items;

import hashmod.lightmeals.LightMeals;
import net.minecraft.item.Item;

public class BasicItem extends Item {
    public BasicItem() {
        super(new Item.Properties().group(LightMeals.ITEM_GROUP).maxStackSize(64));
    }
}


package net.tomacma.items.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GreenDustItem extends Item {
	public GreenDustItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}

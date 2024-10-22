
package net.tomacma.items.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MagnetiteDustItem extends Item {
	public MagnetiteDustItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}

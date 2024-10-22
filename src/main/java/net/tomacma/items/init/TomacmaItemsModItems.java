
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.tomacma.items.init;

import net.tomacma.items.item.SteelCoinItem;
import net.tomacma.items.item.MagnetiteDustItem;
import net.tomacma.items.item.GreenDustItem;
import net.tomacma.items.TomacmaItemsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

public class TomacmaItemsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TomacmaItemsMod.MODID);
	public static final RegistryObject<Item> MAGNETITE_DUST = REGISTRY.register("magnetite_dust", () -> new MagnetiteDustItem());
	public static final RegistryObject<Item> GREEN_DUST = REGISTRY.register("green_dust", () -> new GreenDustItem());
	public static final RegistryObject<Item> STEEL_COIN = REGISTRY.register("steel_coin", () -> new SteelCoinItem());
	// Start of user code block custom items
	// End of user code block custom items
}

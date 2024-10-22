
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.tomacma.items.init;

import net.tomacma.items.TomacmaItemsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class TomacmaItemsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TomacmaItemsMod.MODID);
	public static final RegistryObject<CreativeModeTab> CREATIVE_TAB_1 = REGISTRY.register("creative_tab_1",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.tomacma_items.creative_tab_1")).icon(() -> new ItemStack(TomacmaItemsModItems.MAGNETITE_DUST.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TomacmaItemsModItems.MAGNETITE_DUST.get());
				tabData.accept(TomacmaItemsModItems.GREEN_DUST.get());
				tabData.accept(TomacmaItemsModItems.STEEL_COIN.get());
			}).withSearchBar().build());
}

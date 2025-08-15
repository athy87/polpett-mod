/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.myriath.polpett.init;

import net.myriath.polpett.PolpettModMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class PolpettModModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PolpettModMod.MODID);
	public static final RegistryObject<CreativeModeTab> POLPETT_MOD_TAB = REGISTRY.register("polpett_mod_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.polpett_mod.polpett_mod_tab")).icon(() -> new ItemStack(PolpettModModBlocks.POLPETT_EGG.get())).displayItems((parameters, tabData) -> {
				tabData.accept(PolpettModModBlocks.CRACKLED_BLEACHED_YIVRI_SLATE.get().asItem());
				tabData.accept(PolpettModModBlocks.BLEACHED_YIVRI_SLATE_BRICKS.get().asItem());
				tabData.accept(PolpettModModBlocks.BLEACHED_COVERED_YIVRI_SLATE_BRICKS.get().asItem());
				tabData.accept(PolpettModModBlocks.BLEACHED_YIVRI_SLATE_TILES.get().asItem());
				tabData.accept(PolpettModModBlocks.BLEACHED_YIVRI_SLATE_STAIRS.get().asItem());
				tabData.accept(PolpettModModBlocks.BLEACHED_YIVRI_SLATE_SLAB.get().asItem());
				tabData.accept(PolpettModModBlocks.BLEACHED_YIVRI_SLATE_WALL.get().asItem());
				tabData.accept(PolpettModModBlocks.POLPETT_EGG_INCUBATOR.get().asItem());
				tabData.accept(PolpettModModItems.POLPETT_WOOL_HAT_GREY.get());
				tabData.accept(PolpettModModItems.POLPETT_WOOL_HAT_BLUE.get());
				tabData.accept(PolpettModModItems.POLPETT_WOOL_HAT_RED.get());
				tabData.accept(PolpettModModItems.POLPETT_WOOL_HAT_GREEN.get());
				tabData.accept(PolpettModModItems.POLPETT_WOOL_HAT_PINK.get());
				tabData.accept(PolpettModModBlocks.POLPETT_EGG.get().asItem());
				tabData.accept(PolpettModModBlocks.POLPETT_EGG_SOL.get().asItem());
				tabData.accept(PolpettModModBlocks.POLPETT_EGG_JANE.get().asItem());
				tabData.accept(PolpettModModItems.POLPETT_SPAWN_EGG.get());
			}).build());
}
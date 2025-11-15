/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.myriath.polpett.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class PolpettModModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == PolpettModModVillagerProfessions.POLPETT_RESEARCHER.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(PolpettModModBlocks.POLPETT_EGG.get()),

					new ItemStack(Items.EMERALD, 6), 16, 10, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD),

					new ItemStack(Items.CARROT, 6), 15, 2, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD),

					new ItemStack(Items.APPLE, 4), 15, 2, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD),

					new ItemStack(Items.SWEET_BERRIES, 5), 15, 2, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD),

					new ItemStack(Items.BEETROOT, 6), 15, 2, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD),

					new ItemStack(Items.GLOW_BERRIES, 4), 15, 2, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 4), new ItemStack(Blocks.RED_WOOL, 5), new ItemStack(PolpettModModItems.POLPETT_WOOL_HAT_RED.get()), 5, 3, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 4), new ItemStack(Blocks.BLUE_WOOL, 5), new ItemStack(PolpettModModItems.POLPETT_WOOL_HAT_BLUE.get()), 5, 3, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 4), new ItemStack(Blocks.LIME_WOOL, 5), new ItemStack(PolpettModModItems.POLPETT_WOOL_HAT_GREEN.get()), 5, 3, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(PolpettModModBlocks.POLPETT_EGG.get()), new ItemStack(Blocks.BLACK_GLAZED_TERRACOTTA, 32), new ItemStack(PolpettModModBlocks.POLPETT_EGG_SOL.get()), 3, 10, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(PolpettModModBlocks.POLPETT_EGG.get()), new ItemStack(Blocks.PINK_GLAZED_TERRACOTTA, 32), new ItemStack(PolpettModModBlocks.POLPETT_EGG_JANE.get()), 3, 10, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 4), new ItemStack(Blocks.LIGHT_GRAY_WOOL, 5), new ItemStack(PolpettModModItems.POLPETT_WOOL_HAT_GREY.get()), 5, 3, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 8),

					new ItemStack(PolpettModModBlocks.POLPETT_EGG.get()), 8, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 4), new ItemStack(Blocks.PINK_WOOL, 5), new ItemStack(PolpettModModItems.POLPETT_WOOL_HAT_PINK.get()), 5, 3, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2),

					new ItemStack(Blocks.MELON, 2), 16, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(PolpettModModBlocks.CRACKLED_BLEACHED_YIVRI_SLATE.get(), 8),

					new ItemStack(Items.EMERALD), 18, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(PolpettModModItems.FINGLE_FRUIT.get()),

					new ItemStack(Items.EMERALD, 5), 14, 8, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 7),

					new ItemStack(PolpettModModItems.FINGLE_FRUIT.get()), 10, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(PolpettModModBlocks.POLPETT_EGG.get()), new ItemStack(Blocks.LIME_GLAZED_TERRACOTTA, 32), new ItemStack(PolpettModModBlocks.POLPETT_EGG_JOHN.get()), 3, 10, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(PolpettModModBlocks.POLPETT_EGG.get()), new ItemStack(Items.QUARTZ, 28), new ItemStack(PolpettModModBlocks.POLPETT_EGG_VANILLA.get()), 3, 15, 0.05f));
		}
	}
}
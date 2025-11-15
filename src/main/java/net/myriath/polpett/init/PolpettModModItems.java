/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.myriath.polpett.init;

import net.myriath.polpett.item.PolpettWoolHatRedItem;
import net.myriath.polpett.item.PolpettWoolHatPinkItem;
import net.myriath.polpett.item.PolpettWoolHatGreyItem;
import net.myriath.polpett.item.PolpettWoolHatGreenItem;
import net.myriath.polpett.item.PolpettWoolHatBlueItem;
import net.myriath.polpett.item.PolpettDebugForceEvolveItem;
import net.myriath.polpett.item.PolpettBucketItem;
import net.myriath.polpett.item.FingleFruitSeedsItem;
import net.myriath.polpett.item.FingleFruitItem;
import net.myriath.polpett.PolpettModMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

public class PolpettModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PolpettModMod.MODID);
	public static final RegistryObject<Item> POLPETT_SPAWN_EGG = REGISTRY.register("polpett_spawn_egg", () -> new ForgeSpawnEggItem(PolpettModModEntities.POLPETT, -1184787, -14451787, new Item.Properties()));
	public static final RegistryObject<Item> POLPETT_EGG = block(PolpettModModBlocks.POLPETT_EGG);
	public static final RegistryObject<Item> BLEACHED_YIVRI_SLATE_BRICKS = block(PolpettModModBlocks.BLEACHED_YIVRI_SLATE_BRICKS);
	public static final RegistryObject<Item> BLEACHED_YIVRI_SLATE_TILES = block(PolpettModModBlocks.BLEACHED_YIVRI_SLATE_TILES);
	public static final RegistryObject<Item> BLEACHED_COVERED_YIVRI_SLATE_BRICKS = block(PolpettModModBlocks.BLEACHED_COVERED_YIVRI_SLATE_BRICKS);
	public static final RegistryObject<Item> CRACKLED_BLEACHED_YIVRI_SLATE = block(PolpettModModBlocks.CRACKLED_BLEACHED_YIVRI_SLATE);
	public static final RegistryObject<Item> BLEACHED_YIVRI_SLATE_STAIRS = block(PolpettModModBlocks.BLEACHED_YIVRI_SLATE_STAIRS);
	public static final RegistryObject<Item> BLEACHED_YIVRI_SLATE_SLAB = block(PolpettModModBlocks.BLEACHED_YIVRI_SLATE_SLAB);
	public static final RegistryObject<Item> BLEACHED_YIVRI_SLATE_WALL = block(PolpettModModBlocks.BLEACHED_YIVRI_SLATE_WALL);
	public static final RegistryObject<Item> POLPETT_DEBUG_FORCE_EVOLVE = REGISTRY.register("polpett_debug_force_evolve", () -> new PolpettDebugForceEvolveItem());
	public static final RegistryObject<Item> POLPETT_EGG_INCUBATOR = block(PolpettModModBlocks.POLPETT_EGG_INCUBATOR);
	public static final RegistryObject<Item> POLPETT_WOOL_HAT_GREY = REGISTRY.register("polpett_wool_hat_grey", () -> new PolpettWoolHatGreyItem());
	public static final RegistryObject<Item> POLPETT_WOOL_HAT_BLUE = REGISTRY.register("polpett_wool_hat_blue", () -> new PolpettWoolHatBlueItem());
	public static final RegistryObject<Item> POLPETT_WOOL_HAT_RED = REGISTRY.register("polpett_wool_hat_red", () -> new PolpettWoolHatRedItem());
	public static final RegistryObject<Item> POLPETT_WOOL_HAT_GREEN = REGISTRY.register("polpett_wool_hat_green", () -> new PolpettWoolHatGreenItem());
	public static final RegistryObject<Item> POLPETT_WOOL_HAT_PINK = REGISTRY.register("polpett_wool_hat_pink", () -> new PolpettWoolHatPinkItem());
	public static final RegistryObject<Item> POLPETT_EGG_SOL = block(PolpettModModBlocks.POLPETT_EGG_SOL);
	public static final RegistryObject<Item> POLPETT_EGG_JANE = block(PolpettModModBlocks.POLPETT_EGG_JANE);
	public static final RegistryObject<Item> FINGLE_FRUIT_STAGE_4 = block(PolpettModModBlocks.FINGLE_FRUIT_STAGE_4);
	public static final RegistryObject<Item> FINGLE_FRUIT_STAGE_3 = block(PolpettModModBlocks.FINGLE_FRUIT_STAGE_3);
	public static final RegistryObject<Item> FINGLE_FRUIT_STAGE_2 = block(PolpettModModBlocks.FINGLE_FRUIT_STAGE_2);
	public static final RegistryObject<Item> FINGLE_FRUIT_STAGE_1 = block(PolpettModModBlocks.FINGLE_FRUIT_STAGE_1);
	public static final RegistryObject<Item> FINGLE_FRUIT_STAGE_0 = block(PolpettModModBlocks.FINGLE_FRUIT_STAGE_0);
	public static final RegistryObject<Item> FINGLE_FRUIT_SEEDS = REGISTRY.register("fingle_fruit_seeds", () -> new FingleFruitSeedsItem());
	public static final RegistryObject<Item> FINGLE_FRUIT = REGISTRY.register("fingle_fruit", () -> new FingleFruitItem());
	public static final RegistryObject<Item> POLPETT_BUCKET = REGISTRY.register("polpett_bucket", () -> new PolpettBucketItem());
	public static final RegistryObject<Item> POLPETT_EGG_JOHN = block(PolpettModModBlocks.POLPETT_EGG_JOHN);
	public static final RegistryObject<Item> POLPETT_EGG_VANILLA = block(PolpettModModBlocks.POLPETT_EGG_VANILLA);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return block(block, new Item.Properties());
	}

	private static RegistryObject<Item> block(RegistryObject<Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}
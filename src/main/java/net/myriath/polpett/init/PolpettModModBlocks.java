/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.myriath.polpett.init;

import net.myriath.polpett.block.PolpettEggSolBlock;
import net.myriath.polpett.block.PolpettEggJaneBlock;
import net.myriath.polpett.block.PolpettEggIncubatorBlock;
import net.myriath.polpett.block.PolpettEggBlock;
import net.myriath.polpett.block.CrackledBleachedYivriSlateBlock;
import net.myriath.polpett.block.BleachedYivriSlateWallBlock;
import net.myriath.polpett.block.BleachedYivriSlateTilesBlock;
import net.myriath.polpett.block.BleachedYivriSlateStairsBlock;
import net.myriath.polpett.block.BleachedYivriSlateSlabBlock;
import net.myriath.polpett.block.BleachedYivriSlateBricksBlock;
import net.myriath.polpett.block.BleachedCoveredYivriSlateBricksBlock;
import net.myriath.polpett.PolpettModMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class PolpettModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, PolpettModMod.MODID);
	public static final RegistryObject<Block> POLPETT_EGG = REGISTRY.register("polpett_egg", () -> new PolpettEggBlock());
	public static final RegistryObject<Block> BLEACHED_YIVRI_SLATE_BRICKS = REGISTRY.register("bleached_yivri_slate_bricks", () -> new BleachedYivriSlateBricksBlock());
	public static final RegistryObject<Block> BLEACHED_YIVRI_SLATE_TILES = REGISTRY.register("bleached_yivri_slate_tiles", () -> new BleachedYivriSlateTilesBlock());
	public static final RegistryObject<Block> BLEACHED_COVERED_YIVRI_SLATE_BRICKS = REGISTRY.register("bleached_covered_yivri_slate_bricks", () -> new BleachedCoveredYivriSlateBricksBlock());
	public static final RegistryObject<Block> CRACKLED_BLEACHED_YIVRI_SLATE = REGISTRY.register("crackled_bleached_yivri_slate", () -> new CrackledBleachedYivriSlateBlock());
	public static final RegistryObject<Block> BLEACHED_YIVRI_SLATE_STAIRS = REGISTRY.register("bleached_yivri_slate_stairs", () -> new BleachedYivriSlateStairsBlock());
	public static final RegistryObject<Block> BLEACHED_YIVRI_SLATE_SLAB = REGISTRY.register("bleached_yivri_slate_slab", () -> new BleachedYivriSlateSlabBlock());
	public static final RegistryObject<Block> BLEACHED_YIVRI_SLATE_WALL = REGISTRY.register("bleached_yivri_slate_wall", () -> new BleachedYivriSlateWallBlock());
	public static final RegistryObject<Block> POLPETT_EGG_INCUBATOR = REGISTRY.register("polpett_egg_incubator", () -> new PolpettEggIncubatorBlock());
	public static final RegistryObject<Block> POLPETT_EGG_SOL = REGISTRY.register("polpett_egg_sol", () -> new PolpettEggSolBlock());
	public static final RegistryObject<Block> POLPETT_EGG_JANE = REGISTRY.register("polpett_egg_jane", () -> new PolpettEggJaneBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
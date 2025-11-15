/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.myriath.polpett.init;

import net.myriath.polpett.block.entity.PolpettEggVanillaBlockEntity;
import net.myriath.polpett.block.entity.PolpettEggSolBlockEntity;
import net.myriath.polpett.block.entity.PolpettEggJohnBlockEntity;
import net.myriath.polpett.block.entity.PolpettEggJaneBlockEntity;
import net.myriath.polpett.block.entity.PolpettEggBlockEntity;
import net.myriath.polpett.block.entity.FingleFruitStage4BlockEntity;
import net.myriath.polpett.block.entity.FingleFruitStage3BlockEntity;
import net.myriath.polpett.block.entity.FingleFruitStage2BlockEntity;
import net.myriath.polpett.block.entity.FingleFruitStage1BlockEntity;
import net.myriath.polpett.block.entity.FingleFruitStage0BlockEntity;
import net.myriath.polpett.PolpettModMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Block;

public class PolpettModModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, PolpettModMod.MODID);
	public static final RegistryObject<BlockEntityType<PolpettEggBlockEntity>> POLPETT_EGG = register("polpett_egg", PolpettModModBlocks.POLPETT_EGG, PolpettEggBlockEntity::new);
	public static final RegistryObject<BlockEntityType<PolpettEggSolBlockEntity>> POLPETT_EGG_SOL = register("polpett_egg_sol", PolpettModModBlocks.POLPETT_EGG_SOL, PolpettEggSolBlockEntity::new);
	public static final RegistryObject<BlockEntityType<PolpettEggJaneBlockEntity>> POLPETT_EGG_JANE = register("polpett_egg_jane", PolpettModModBlocks.POLPETT_EGG_JANE, PolpettEggJaneBlockEntity::new);
	public static final RegistryObject<BlockEntityType<FingleFruitStage4BlockEntity>> FINGLE_FRUIT_STAGE_4 = register("fingle_fruit_stage_4", PolpettModModBlocks.FINGLE_FRUIT_STAGE_4, FingleFruitStage4BlockEntity::new);
	public static final RegistryObject<BlockEntityType<FingleFruitStage3BlockEntity>> FINGLE_FRUIT_STAGE_3 = register("fingle_fruit_stage_3", PolpettModModBlocks.FINGLE_FRUIT_STAGE_3, FingleFruitStage3BlockEntity::new);
	public static final RegistryObject<BlockEntityType<FingleFruitStage2BlockEntity>> FINGLE_FRUIT_STAGE_2 = register("fingle_fruit_stage_2", PolpettModModBlocks.FINGLE_FRUIT_STAGE_2, FingleFruitStage2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<FingleFruitStage1BlockEntity>> FINGLE_FRUIT_STAGE_1 = register("fingle_fruit_stage_1", PolpettModModBlocks.FINGLE_FRUIT_STAGE_1, FingleFruitStage1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<FingleFruitStage0BlockEntity>> FINGLE_FRUIT_STAGE_0 = register("fingle_fruit_stage_0", PolpettModModBlocks.FINGLE_FRUIT_STAGE_0, FingleFruitStage0BlockEntity::new);
	public static final RegistryObject<BlockEntityType<PolpettEggJohnBlockEntity>> POLPETT_EGG_JOHN = register("polpett_egg_john", PolpettModModBlocks.POLPETT_EGG_JOHN, PolpettEggJohnBlockEntity::new);
	public static final RegistryObject<BlockEntityType<PolpettEggVanillaBlockEntity>> POLPETT_EGG_VANILLA = register("polpett_egg_vanilla", PolpettModModBlocks.POLPETT_EGG_VANILLA, PolpettEggVanillaBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static <T extends BlockEntity> RegistryObject<BlockEntityType<T>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<T> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
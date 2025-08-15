/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.myriath.polpett.init;

import net.myriath.polpett.block.entity.PolpettEggSolBlockEntity;
import net.myriath.polpett.block.entity.PolpettEggJaneBlockEntity;
import net.myriath.polpett.block.entity.PolpettEggBlockEntity;
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

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static <T extends BlockEntity> RegistryObject<BlockEntityType<T>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<T> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
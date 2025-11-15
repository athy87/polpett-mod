package net.myriath.polpett.procedures;

import net.myriath.polpett.init.PolpettModModBlocks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class FingleFruitBlockDestroyedByPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), PolpettModModBlocks.FINGLE_FRUIT_STAGE_0.get().defaultBlockState(), 3);
	}
}
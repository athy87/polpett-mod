package net.myriath.polpett.procedures;

import net.myriath.polpett.init.PolpettModModBlocks;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class FingleFruitBonemealProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == PolpettModModBlocks.FINGLE_FRUIT_STAGE_3.get()) {
			world.setBlock(BlockPos.containing(x, y, z), PolpettModModBlocks.FINGLE_FRUIT_STAGE_4.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == PolpettModModBlocks.FINGLE_FRUIT_STAGE_2.get()) {
			world.setBlock(BlockPos.containing(x, y, z), PolpettModModBlocks.FINGLE_FRUIT_STAGE_3.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == PolpettModModBlocks.FINGLE_FRUIT_STAGE_1.get()) {
			world.setBlock(BlockPos.containing(x, y, z), PolpettModModBlocks.FINGLE_FRUIT_STAGE_2.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == PolpettModModBlocks.FINGLE_FRUIT_STAGE_0.get()) {
			world.setBlock(BlockPos.containing(x, y, z), PolpettModModBlocks.FINGLE_FRUIT_STAGE_1.get().defaultBlockState(), 3);
		}
		{
			int _value = 0;
			BlockPos _pos = BlockPos.containing(x, y, z);
			BlockState _bs = world.getBlockState(_pos);
			if (_bs.getBlock().getStateDefinition().getProperty("growth") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
				world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
		}
		for (int index0 = 0; index0 < (int) Mth.nextDouble(RandomSource.create(), 3, 6); index0++) {
			world.addParticle(ParticleTypes.HAPPY_VILLAGER, (x + Math.random()), y, (z + Math.random()), 0, 1, 0);
		}
	}
}
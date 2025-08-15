package net.myriath.polpett.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class BleachedYivriSlateWallBlock extends WallBlock {
	public BleachedYivriSlateWallBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(1.5f, 10f).forceSolidOn());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}
}
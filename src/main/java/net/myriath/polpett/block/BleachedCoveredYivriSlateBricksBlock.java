package net.myriath.polpett.block;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.common.IPlantable;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class BleachedCoveredYivriSlateBricksBlock extends Block {
	public BleachedCoveredYivriSlateBricksBlock() {
		super(BlockBehaviour.Properties.of()
				.sound(new ForgeSoundType(1.0f, 1.0f, () -> ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("block.stone.break")), () -> ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("block.grass.step")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("block.stone.place")), () -> ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("block.stone.break")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("block.stone.fall"))))
				.strength(1.5f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public boolean canSustainPlant(BlockState state, BlockGetter world, BlockPos pos, Direction direction, IPlantable plantable) {
		return true;
	}
}
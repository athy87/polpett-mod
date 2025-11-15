package net.myriath.polpett.procedures;

import net.myriath.polpett.init.PolpettModModBlocks;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class FingleFruitSeedsRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Direction direction, ItemStack itemstack) {
		if (direction == null)
			return;
		if (Blocks.OAK_SAPLING.defaultBlockState().canSurvive(world, BlockPos.containing(x, y + 1, z)) && direction == Direction.UP && !!((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR)) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("block.wet_grass.place")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("block.wet_grass.place")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			world.setBlock(BlockPos.containing(x, y + 1, z), PolpettModModBlocks.FINGLE_FRUIT_STAGE_0.get().defaultBlockState(), 3);
			itemstack.shrink(1);
		}
	}
}
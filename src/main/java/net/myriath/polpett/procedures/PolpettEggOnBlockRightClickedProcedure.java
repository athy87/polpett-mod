package net.myriath.polpett.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class PolpettEggOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(ResourceLocation.parse("polpett_mod:polpett_egg_instant_hatch")))) {
			{
				int _value = 99;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("hatchprogress") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
			for (int index0 = 0; index0 < Mth.nextInt(RandomSource.create(), 3, 5); index0++) {
				world.addParticle(ParticleTypes.ENCHANTED_HIT, (x + Math.random()), y, (z + Math.random()), 0, 1, 0);
			}
		} else {
			if (Math.random() < (2) / ((float) 7)) {
				{
					int _value = (blockstate.getBlock().getStateDefinition().getProperty("hatchprogress") instanceof IntegerProperty _getip7 ? blockstate.getValue(_getip7) : -1) + 1;
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("hatchprogress") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
				for (int index1 = 0; index1 < Mth.nextInt(RandomSource.create(), 3, 7); index1++) {
					world.addParticle(ParticleTypes.HAPPY_VILLAGER, (x + Math.random()), y, (z + Math.random()), 0, 1, 0);
				}
			}
		}
	}
}
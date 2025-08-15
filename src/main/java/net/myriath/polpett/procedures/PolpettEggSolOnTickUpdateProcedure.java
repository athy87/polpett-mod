package net.myriath.polpett.procedures;

import net.myriath.polpett.network.PolpettModModVariables;
import net.myriath.polpett.init.PolpettModModEntities;
import net.myriath.polpett.init.PolpettModModBlocks;
import net.myriath.polpett.entity.PolpettEntity;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import java.util.Comparator;

public class PolpettEggSolOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		if (world.getMaxLocalRawBrightness(BlockPos.containing(x, y, z)) >= 8) {
			if ((blockstate.getBlock().getStateDefinition().getProperty("hatchprogress") instanceof IntegerProperty _getip2 ? blockstate.getValue(_getip2) : -1) >= PolpettModModVariables.WorldVariables.get(world).polpett_egg_hatch_threshhold) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(PolpettModModBlocks.POLPETT_EGG.get().defaultBlockState()));
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("block.sniffer_egg.hatch")), SoundSource.AMBIENT, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("block.sniffer_egg.hatch")), SoundSource.AMBIENT, 1, 1, false);
					}
				}
				for (int index0 = 0; index0 < Mth.nextInt(RandomSource.create(), 4, 7); index0++) {
					world.addParticle(ParticleTypes.HAPPY_VILLAGER, (z + Math.random() - 0.5), y, (x + Math.random() - 0.5), 0, 1, 0);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = PolpettModModEntities.POLPETT.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
					}
				}
				if (((Entity) world.getEntitiesOfClass(PolpettEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof PolpettEntity _datEntSetS)
					_datEntSetS.getEntityData().set(PolpettEntity.DATA_ColorType, "Sol");
			} else {
				if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(ResourceLocation.parse("mod_id:polpett_encourage_egg_hatch")))) {
					{
						int _value = (blockstate.getBlock().getStateDefinition().getProperty("hatchprogress") instanceof IntegerProperty _getip14 ? blockstate.getValue(_getip14) : -1) + 3;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("hatchprogress") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
				} else {
					{
						int _value = (blockstate.getBlock().getStateDefinition().getProperty("hatchprogress") instanceof IntegerProperty _getip17 ? blockstate.getValue(_getip17) : -1) + 1;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("hatchprogress") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
				}
			}
		}
	}
}
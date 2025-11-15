package net.myriath.polpett.procedures;

import net.myriath.polpett.network.PolpettModModVariables;
import net.myriath.polpett.init.PolpettModModBlocks;
import net.myriath.polpett.entity.PolpettEntity;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class PolpettOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double blockTargetX = 0;
		double blockTargetY = 0;
		double blockTargetZ = 0;
		boolean foundFruit = false;
		if (entity instanceof PolpettEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PolpettEntity.DATA_Happiness, (int) (Math.min(200, Math.max(1, entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_Happiness) : 0))));
		if (entity instanceof PolpettEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PolpettEntity.DATA_Hunger, (int) (Math.min(30, Math.max(1, entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_Hunger) : 0))));
		if (Math.random() < (1) / ((float) 800)) {
			PolpettChangeStatValueProcedure.execute(entity, entity, -1, "Hunger");
		}
		if (Math.random() < (1) / ((float) 1000)) {
			PolpettChangeStatValueProcedure.execute(entity, entity, -1, "Happiness");
		}
		if ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_Hunger) : 0) < 6) {
			if (Math.random() < (1) / ((float) 1000)) {
				PolpettChangeStatValueProcedure.execute(entity, entity, -2, "Happiness");
			}
		}
		if (Math.random() < (1) / ((float) 1500)) {
			if ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_Hunger) : 0) < 6) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("polpett_mod:polpett.sound.hungry")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("polpett_mod:polpett.sound.hungry")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
		}
		if ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_Happiness) : 0) < 15) {
			if (Math.random() < (1) / ((float) 1000)) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("polpett_mod:polpett.sound.verysad")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("polpett_mod:polpett.sound.verysad")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
		} else {
			if ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_Happiness) : 0) < 40) {
				if (Math.random() < (1) / ((float) 1500)) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("polpett_mod:polpett.sound.sad")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("polpett_mod:polpett.sound.sad")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
			}
		}
		if ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_Happiness) : 0) > 85) {
			if (Math.random() < (1) / ((float) 1500)) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("polpett_mod:polpett.sound.happy")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("polpett_mod:polpett.sound.happy")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
		}
		if (Math.random() < (1) / ((float) 2000)) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("polpett_mod:polpett.sound.idle")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("polpett_mod:polpett.sound.idle")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		}
		if (Math.random() < (1) / ((float) 900)) {
			if ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_evolveProgress) : 0) >= PolpettModModVariables.WorldVariables.get(world).natural_feature_evolve_threshhold) {
				PolpettEvolveFeatureCheckProcedure.execute(world, x, y, z, entity);
				if (entity instanceof PolpettEntity _datEntSetI)
					_datEntSetI.getEntityData().set(PolpettEntity.DATA_evolveProgress, 0);
			} else {
				if (entity instanceof PolpettEntity _datEntSetI)
					_datEntSetI.getEntityData().set(PolpettEntity.DATA_evolveProgress,
							(int) ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_evolveProgress) : 0) + Mth.nextInt(RandomSource.create(), 1, 3)));
			}
		}
		if ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_Hunger) : 0) <= 11) {
			foundFruit = false;
			if ((world.getBlockState(BlockPos.containing(x + (entity.getDirection()).getStepX(), y + (entity.getDirection()).getStepY(), z + (entity.getDirection()).getStepZ()))).getBlock() == PolpettModModBlocks.FINGLE_FRUIT_STAGE_4.get()) {
				blockTargetX = x + (entity.getDirection()).getStepX();
				blockTargetY = y + (entity.getDirection()).getStepY();
				blockTargetZ = z + (entity.getDirection()).getStepZ();
				foundFruit = true;
			}
			if (foundFruit == true) {
				if ((world.getBlockState(BlockPos.containing(blockTargetX, blockTargetY, blockTargetZ))).getBlock() == PolpettModModBlocks.FINGLE_FRUIT_STAGE_4.get()) {
					world.setBlock(BlockPos.containing(blockTargetX, blockTargetY, blockTargetZ), PolpettModModBlocks.FINGLE_FRUIT_STAGE_0.get().defaultBlockState(), 3);
					world.levelEvent(2001, BlockPos.containing(blockTargetX, blockTargetY, blockTargetZ), Block.getId(PolpettModModBlocks.FINGLE_FRUIT_STAGE_4.get().defaultBlockState()));
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("block.crop.break")), SoundSource.AMBIENT, 1, (float) 1.4);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("block.crop.break")), SoundSource.AMBIENT, 1, (float) 1.4, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("entity.generic.eat")), SoundSource.AMBIENT, 1, (float) 1.4);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("entity.generic.eat")), SoundSource.AMBIENT, 1, (float) 1.4, false);
						}
					}
					PolpettChangeStatValueProcedure.execute(entity, entity, 20, "Happiness");
					for (int index0 = 0; index0 < Mth.nextInt(RandomSource.create(), 1, 2); index0++) {
						world.addParticle(ParticleTypes.HEART, (entity.getX() + Math.random() - 0.5), (entity.getY() + 1), (entity.getZ() + Math.random() - 0.5), 0, 1, 0);
					}
					PolpettChangeStatValueProcedure.execute(entity, entity, 15, "Hunger");
					for (int index1 = 0; index1 < Mth.nextInt(RandomSource.create(), 1, 4); index1++) {
						world.addParticle(ParticleTypes.HAPPY_VILLAGER, (entity.getX() + Math.random() - 0.5), (entity.getY() + 1), (entity.getZ() + Math.random() - 0.5), 0, 1, 0);
					}
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1);
				}
			}
		}
	}
}
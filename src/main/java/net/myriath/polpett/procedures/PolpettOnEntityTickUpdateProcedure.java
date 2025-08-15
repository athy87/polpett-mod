package net.myriath.polpett.procedures;

import net.myriath.polpett.network.PolpettModModVariables;
import net.myriath.polpett.entity.PolpettEntity;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class PolpettOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
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
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("polpett_mod:polpett.sound.hungry")), SoundSource.AMBIENT, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("polpett_mod:polpett.sound.hungry")), SoundSource.AMBIENT, 1, 1, false);
					}
				}
			}
		}
		if ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_Happiness) : 0) < 15) {
			if (Math.random() < (1) / ((float) 1000)) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("polpett_mod:polpett.sound.verysad")), SoundSource.AMBIENT, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("polpett_mod:polpett.sound.verysad")), SoundSource.AMBIENT, 1, 1, false);
					}
				}
			}
		} else {
			if ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_Happiness) : 0) < 40) {
				if (Math.random() < (1) / ((float) 1500)) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("polpett_mod:polpett.sound.sad")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("polpett_mod:polpett.sound.sad")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
				}
			}
		}
		if ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_Happiness) : 0) > 85) {
			if (Math.random() < (1) / ((float) 1500)) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("polpett_mod:polpett.sound.happy")), SoundSource.AMBIENT, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("polpett_mod:polpett.sound.happy")), SoundSource.AMBIENT, 1, 1, false);
					}
				}
			}
		}
		if (Math.random() < (1) / ((float) 2000)) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("polpett_mod:polpett.sound.idle")), SoundSource.AMBIENT, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("polpett_mod:polpett.sound.idle")), SoundSource.AMBIENT, 1, 1, false);
				}
			}
		}
		if (Math.random() < (1) / ((float) 1000)) {
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
	}
}
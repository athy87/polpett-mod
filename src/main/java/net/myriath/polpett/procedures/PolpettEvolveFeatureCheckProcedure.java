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
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class PolpettEvolveFeatureCheckProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_TailChance) : 0) >= PolpettModModVariables.WorldVariables.get(world).feature_influence_amount) {
			if (entity instanceof PolpettEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PolpettEntity.DATA_TailLevel, (int) ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_TailLevel) : 0) + 1));
			if (entity instanceof PolpettEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PolpettEntity.DATA_TailChance,
						(int) ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_TailChance) : 0) - PolpettModModVariables.WorldVariables.get(world).feature_influence_amount));
		} else {
			if ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_WingChance) : 0) >= PolpettModModVariables.WorldVariables.get(world).feature_influence_amount) {
				if (entity instanceof PolpettEntity _datEntSetI)
					_datEntSetI.getEntityData().set(PolpettEntity.DATA_WingLevel, (int) ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_WingLevel) : 0) + 1));
				if (entity instanceof PolpettEntity _datEntSetI)
					_datEntSetI.getEntityData().set(PolpettEntity.DATA_WingChance,
							(int) ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_WingChance) : 0) - PolpettModModVariables.WorldVariables.get(world).feature_influence_amount));
			} else {
				if ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_GillChance) : 0) >= PolpettModModVariables.WorldVariables.get(world).feature_influence_amount) {
					if (entity instanceof PolpettEntity _datEntSetI)
						_datEntSetI.getEntityData().set(PolpettEntity.DATA_GillLevel, (int) ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_GillLevel) : 0) + 1));
					if (entity instanceof PolpettEntity _datEntSetI)
						_datEntSetI.getEntityData().set(PolpettEntity.DATA_GillChance,
								(int) ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_GillChance) : 0) - PolpettModModVariables.WorldVariables.get(world).feature_influence_amount));
				} else {
					if ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_EarChance) : 0) >= PolpettModModVariables.WorldVariables.get(world).feature_influence_amount) {
						if (entity instanceof PolpettEntity _datEntSetI)
							_datEntSetI.getEntityData().set(PolpettEntity.DATA_EarLevel, (int) ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_EarLevel) : 0) + 1));
						if (entity instanceof PolpettEntity _datEntSetI)
							_datEntSetI.getEntityData().set(PolpettEntity.DATA_EarChance,
									(int) ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_EarChance) : 0) - PolpettModModVariables.WorldVariables.get(world).feature_influence_amount));
					} else {
						if ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_MandibleChance) : 0) >= PolpettModModVariables.WorldVariables.get(world).feature_influence_amount) {
							if (entity instanceof PolpettEntity _datEntSetI)
								_datEntSetI.getEntityData().set(PolpettEntity.DATA_MandibleLevel, (int) ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_MandibleLevel) : 0) + 1));
							if (entity instanceof PolpettEntity _datEntSetI)
								_datEntSetI.getEntityData().set(PolpettEntity.DATA_MandibleChance,
										(int) ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_MandibleChance) : 0) - PolpettModModVariables.WorldVariables.get(world).feature_influence_amount));
						} else {
							if ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_AntlerChance) : 0) >= PolpettModModVariables.WorldVariables.get(world).feature_influence_amount) {
								if (entity instanceof PolpettEntity _datEntSetI)
									_datEntSetI.getEntityData().set(PolpettEntity.DATA_AntlerLevel, (int) ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_AntlerLevel) : 0) + 1));
								if (entity instanceof PolpettEntity _datEntSetI)
									_datEntSetI.getEntityData().set(PolpettEntity.DATA_AntlerChance,
											(int) ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_AntlerChance) : 0) - PolpettModModVariables.WorldVariables.get(world).feature_influence_amount));
							} else {
								if (entity instanceof PolpettEntity _datEntSetI)
									_datEntSetI.getEntityData().set(PolpettEntity.DATA_FeatureRandomlyPicked, Mth.nextInt(RandomSource.create(), 1, 6));
								if (Math.random() < (1) / ((float) 2)) {
									if ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_FeatureRandomlyPicked) : 0) == 1) {
										if (entity instanceof PolpettEntity _datEntSetI)
											_datEntSetI.getEntityData().set(PolpettEntity.DATA_TailLevel, (int) ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_TailLevel) : 0) + 1));
									} else {
										if ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_FeatureRandomlyPicked) : 0) == 2) {
											if (entity instanceof PolpettEntity _datEntSetI)
												_datEntSetI.getEntityData().set(PolpettEntity.DATA_WingLevel, (int) ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_WingLevel) : 0) + 1));
										} else {
											if ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_FeatureRandomlyPicked) : 0) == 3) {
												if (entity instanceof PolpettEntity _datEntSetI)
													_datEntSetI.getEntityData().set(PolpettEntity.DATA_GillLevel, (int) ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_GillLevel) : 0) + 1));
											} else {
												if ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_FeatureRandomlyPicked) : 0) == 4) {
													if (entity instanceof PolpettEntity _datEntSetI)
														_datEntSetI.getEntityData().set(PolpettEntity.DATA_EarLevel, (int) ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_EarLevel) : 0) + 1));
												} else {
													if ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_FeatureRandomlyPicked) : 0) == 5) {
														if (entity instanceof PolpettEntity _datEntSetI)
															_datEntSetI.getEntityData().set(PolpettEntity.DATA_MandibleLevel,
																	(int) ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_MandibleLevel) : 0) + 1));
													} else {
														if ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_FeatureRandomlyPicked) : 0) == 6) {
															if (entity instanceof PolpettEntity _datEntSetI)
																_datEntSetI.getEntityData().set(PolpettEntity.DATA_AntlerLevel,
																		(int) ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_AntlerLevel) : 0) + 1));
														}
													}
												}
											}
										}
									}
								} else {
									if (Math.random() < (1) / ((float) 8)) {
										if ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_FeatureRandomlyPicked) : 0) == 1) {
											if (entity instanceof PolpettEntity _datEntSetI)
												_datEntSetI.getEntityData().set(PolpettEntity.DATA_TailLevel, (int) ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_TailLevel) : 0) - 2));
										} else {
											if ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_FeatureRandomlyPicked) : 0) == 2) {
												if (entity instanceof PolpettEntity _datEntSetI)
													_datEntSetI.getEntityData().set(PolpettEntity.DATA_WingLevel, (int) ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_WingLevel) : 0) - 2));
											} else {
												if ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_FeatureRandomlyPicked) : 0) == 3) {
													if (entity instanceof PolpettEntity _datEntSetI)
														_datEntSetI.getEntityData().set(PolpettEntity.DATA_GillLevel, (int) ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_GillLevel) : 0) - 2));
												} else {
													if ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_FeatureRandomlyPicked) : 0) == 4) {
														if (entity instanceof PolpettEntity _datEntSetI)
															_datEntSetI.getEntityData().set(PolpettEntity.DATA_EarLevel, (int) ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_EarLevel) : 0) - 2));
													} else {
														if ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_FeatureRandomlyPicked) : 0) == 5) {
															if (entity instanceof PolpettEntity _datEntSetI)
																_datEntSetI.getEntityData().set(PolpettEntity.DATA_MandibleLevel,
																		(int) ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_MandibleLevel) : 0) - 2));
														} else {
															if ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_FeatureRandomlyPicked) : 0) == 6) {
																if (entity instanceof PolpettEntity _datEntSetI)
																	_datEntSetI.getEntityData().set(PolpettEntity.DATA_AntlerLevel,
																			(int) ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_AntlerLevel) : 0) - 2));
															}
														}
													}
												}
											}
										}
									} else {
										if ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_FeatureRandomlyPicked) : 0) == 1) {
											if (entity instanceof PolpettEntity _datEntSetI)
												_datEntSetI.getEntityData().set(PolpettEntity.DATA_TailLevel, (int) ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_TailLevel) : 0) - 1));
										} else {
											if ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_FeatureRandomlyPicked) : 0) == 2) {
												if (entity instanceof PolpettEntity _datEntSetI)
													_datEntSetI.getEntityData().set(PolpettEntity.DATA_WingLevel, (int) ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_WingLevel) : 0) - 1));
											} else {
												if ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_FeatureRandomlyPicked) : 0) == 3) {
													if (entity instanceof PolpettEntity _datEntSetI)
														_datEntSetI.getEntityData().set(PolpettEntity.DATA_GillLevel, (int) ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_GillLevel) : 0) - 1));
												} else {
													if ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_FeatureRandomlyPicked) : 0) == 4) {
														if (entity instanceof PolpettEntity _datEntSetI)
															_datEntSetI.getEntityData().set(PolpettEntity.DATA_EarLevel, (int) ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_EarLevel) : 0) - 1));
													} else {
														if ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_FeatureRandomlyPicked) : 0) == 5) {
															if (entity instanceof PolpettEntity _datEntSetI)
																_datEntSetI.getEntityData().set(PolpettEntity.DATA_MandibleLevel,
																		(int) ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_MandibleLevel) : 0) - 1));
														} else {
															if ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_FeatureRandomlyPicked) : 0) == 6) {
																if (entity instanceof PolpettEntity _datEntSetI)
																	_datEntSetI.getEntityData().set(PolpettEntity.DATA_AntlerLevel,
																			(int) ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_AntlerLevel) : 0) - 1));
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if (entity instanceof PolpettEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PolpettEntity.DATA_TailLevel, (int) (Math.min(6, Math.max(entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_TailLevel) : 0, 0))));
		if (entity instanceof PolpettEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PolpettEntity.DATA_WingLevel, (int) (Math.min(6, Math.max(entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_WingLevel) : 0, 0))));
		if (entity instanceof PolpettEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PolpettEntity.DATA_GillLevel, (int) (Math.min(6, Math.max(entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_GillLevel) : 0, 0))));
		if (entity instanceof PolpettEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PolpettEntity.DATA_EarLevel, (int) (Math.min(6, Math.max(entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_EarLevel) : 0, 0))));
		if (entity instanceof PolpettEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PolpettEntity.DATA_MandibleLevel, (int) (Math.min(6, Math.max(entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_MandibleLevel) : 0, 0))));
		if (entity instanceof PolpettEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PolpettEntity.DATA_AntlerLevel, (int) (Math.min(6, Math.max(entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_AntlerLevel) : 0, 0))));
		for (int index0 = 0; index0 < (int) Mth.nextDouble(RandomSource.create(), 3, 6); index0++) {
			world.addParticle(ParticleTypes.HAPPY_VILLAGER, (x + Math.random() - 0.5), y, (z + Math.random() - 0.5), 0, 1, 0);
		}
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("block.sniffer_egg.hatch")), SoundSource.AMBIENT, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("block.sniffer_egg.hatch")), SoundSource.AMBIENT, 1, 1, false);
			}
		}
	}
}
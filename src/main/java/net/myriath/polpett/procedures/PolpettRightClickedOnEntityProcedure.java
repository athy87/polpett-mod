package net.myriath.polpett.procedures;

import net.myriath.polpett.entity.PolpettEntity;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.ItemTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

public class PolpettRightClickedOnEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity, ItemStack itemstack) {
		if (entity == null || sourceentity == null)
			return;
		if (!sourceentity.isShiftKeyDown()) {
			if (itemstack.getItem().isEdible()) {
				PolpettChangeStatValueProcedure.execute(entity, entity, itemstack.getItem().isEdible() ? itemstack.getItem().getFoodProperties().getNutrition() : 0, "Hunger");
				if ((entity instanceof PolpettEntity _datEntS ? _datEntS.getEntityData().get(PolpettEntity.DATA_FavFood) : "").equals("Carrots")) {
					if (itemstack.getItem() == Items.CARROT) {
						if (!(sourceentity instanceof ServerPlayer _plr8 && _plr8.level() instanceof ServerLevel
								&& _plr8.getAdvancements().getOrStartProgress(_plr8.server.getAdvancements().getAdvancement(ResourceLocation.parse("polpett_mod:polpett_favorite_food_discover"))).isDone())) {
							if (sourceentity instanceof ServerPlayer _player) {
								Advancement _adv = _player.server.getAdvancements().getAdvancement(ResourceLocation.parse("polpett_mod:polpett_favorite_food_discover"));
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									for (String criteria : _ap.getRemainingCriteria())
										_player.getAdvancements().award(_adv, criteria);
								}
							}
						}
						PolpettChangeStatValueProcedure.execute(entity, entity, 5, "Happiness");
						for (int index0 = 0; index0 < Mth.nextInt(RandomSource.create(), 1, 2); index0++) {
							world.addParticle(ParticleTypes.HEART, (x + Math.random() - 0.5), (y + 1), (z + Math.random() - 0.5), 0, 1, 0);
						}
					}
				}
				if ((entity instanceof PolpettEntity _datEntS ? _datEntS.getEntityData().get(PolpettEntity.DATA_FavFood) : "").equals("Glowberries")) {
					if (itemstack.getItem() == Items.GLOW_BERRIES) {
						if (!(sourceentity instanceof ServerPlayer _plr15 && _plr15.level() instanceof ServerLevel
								&& _plr15.getAdvancements().getOrStartProgress(_plr15.server.getAdvancements().getAdvancement(ResourceLocation.parse("polpett_mod:polpett_favorite_food_discover"))).isDone())) {
							if (sourceentity instanceof ServerPlayer _player) {
								Advancement _adv = _player.server.getAdvancements().getAdvancement(ResourceLocation.parse("polpett_mod:polpett_favorite_food_discover"));
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									for (String criteria : _ap.getRemainingCriteria())
										_player.getAdvancements().award(_adv, criteria);
								}
							}
						}
						PolpettChangeStatValueProcedure.execute(entity, entity, 5, "Happiness");
						for (int index1 = 0; index1 < Mth.nextInt(RandomSource.create(), 1, 2); index1++) {
							world.addParticle(ParticleTypes.HEART, (x + Math.random() - 0.5), (y + 1), (z + Math.random() - 0.5), 0, 1, 0);
						}
					}
				}
				if ((entity instanceof PolpettEntity _datEntS ? _datEntS.getEntityData().get(PolpettEntity.DATA_FavFood) : "").equals("Berries")) {
					if (itemstack.getItem() == Items.SWEET_BERRIES) {
						if (!(sourceentity instanceof ServerPlayer _plr22 && _plr22.level() instanceof ServerLevel
								&& _plr22.getAdvancements().getOrStartProgress(_plr22.server.getAdvancements().getAdvancement(ResourceLocation.parse("polpett_mod:polpett_favorite_food_discover"))).isDone())) {
							if (sourceentity instanceof ServerPlayer _player) {
								Advancement _adv = _player.server.getAdvancements().getAdvancement(ResourceLocation.parse("polpett_mod:polpett_favorite_food_discover"));
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									for (String criteria : _ap.getRemainingCriteria())
										_player.getAdvancements().award(_adv, criteria);
								}
							}
						}
						PolpettChangeStatValueProcedure.execute(entity, entity, 5, "Happiness");
						for (int index2 = 0; index2 < Mth.nextInt(RandomSource.create(), 1, 2); index2++) {
							world.addParticle(ParticleTypes.HEART, (x + Math.random() - 0.5), (y + 1), (z + Math.random() - 0.5), 0, 1, 0);
						}
					}
				}
				if ((entity instanceof PolpettEntity _datEntS ? _datEntS.getEntityData().get(PolpettEntity.DATA_FavFood) : "").equals("Apples")) {
					if (itemstack.getItem() == Items.APPLE) {
						if (!(sourceentity instanceof ServerPlayer _plr29 && _plr29.level() instanceof ServerLevel
								&& _plr29.getAdvancements().getOrStartProgress(_plr29.server.getAdvancements().getAdvancement(ResourceLocation.parse("polpett_mod:polpett_favorite_food_discover"))).isDone())) {
							if (sourceentity instanceof ServerPlayer _player) {
								Advancement _adv = _player.server.getAdvancements().getAdvancement(ResourceLocation.parse("polpett_mod:polpett_favorite_food_discover"));
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									for (String criteria : _ap.getRemainingCriteria())
										_player.getAdvancements().award(_adv, criteria);
								}
							}
						}
						PolpettChangeStatValueProcedure.execute(entity, entity, 5, "Happiness");
						for (int index3 = 0; index3 < Mth.nextInt(RandomSource.create(), 1, 2); index3++) {
							world.addParticle(ParticleTypes.HEART, (x + Math.random() - 0.5), (y + 1), (z + Math.random() - 0.5), 0, 1, 0);
						}
					}
				}
				if ((entity instanceof PolpettEntity _datEntS ? _datEntS.getEntityData().get(PolpettEntity.DATA_FavFood) : "").equals("Beetroots")) {
					if (itemstack.getItem() == Items.BEETROOT) {
						if (!(sourceentity instanceof ServerPlayer _plr36 && _plr36.level() instanceof ServerLevel
								&& _plr36.getAdvancements().getOrStartProgress(_plr36.server.getAdvancements().getAdvancement(ResourceLocation.parse("polpett_mod:polpett_favorite_food_discover"))).isDone())) {
							if (sourceentity instanceof ServerPlayer _player) {
								Advancement _adv = _player.server.getAdvancements().getAdvancement(ResourceLocation.parse("polpett_mod:polpett_favorite_food_discover"));
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									for (String criteria : _ap.getRemainingCriteria())
										_player.getAdvancements().award(_adv, criteria);
								}
							}
						}
						PolpettChangeStatValueProcedure.execute(entity, entity, 5, "Happiness");
						for (int index4 = 0; index4 < Mth.nextInt(RandomSource.create(), 1, 2); index4++) {
							world.addParticle(ParticleTypes.HEART, (x + Math.random() - 0.5), (y + 1), (z + Math.random() - 0.5), 0, 1, 0);
						}
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("entity.generic.eat")), SoundSource.AMBIENT, 1, (float) 1.4);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("entity.generic.eat")), SoundSource.AMBIENT, 1, (float) 1.4, false);
					}
				}
				for (int index5 = 0; index5 < Mth.nextInt(RandomSource.create(), 2, 4); index5++) {
					world.addParticle(ParticleTypes.HAPPY_VILLAGER, (x + Math.random() - 0.5), (y + 1), (z + Math.random() - 0.5), 0, 1, 0);
				}
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1);
				itemstack.shrink(1);
			} else {
				if (itemstack.getItem() == ItemStack.EMPTY.getItem()) {
					PolpettChangeStatValueProcedure.execute(entity, entity, 1, "Happiness");
					world.addParticle(ParticleTypes.HEART, (x + Math.random() - 0.5), (y + 1), (z + Math.random() - 0.5), 0, 1, 0);
				} else {
					if (itemstack.is(ItemTags.create(ResourceLocation.parse("polpett_mod:polpett_can_eat")))) {
						if (!(sourceentity instanceof ServerPlayer _plr53 && _plr53.level() instanceof ServerLevel
								&& _plr53.getAdvancements().getOrStartProgress(_plr53.server.getAdvancements().getAdvancement(ResourceLocation.parse("polpett_mod:polpett_eat_rocks"))).isDone())) {
							if (sourceentity instanceof ServerPlayer _player) {
								Advancement _adv = _player.server.getAdvancements().getAdvancement(ResourceLocation.parse("polpett_mod:polpett_eat_rocks"));
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									for (String criteria : _ap.getRemainingCriteria())
										_player.getAdvancements().award(_adv, criteria);
								}
							}
						}
						if (!(sourceentity instanceof ServerPlayer _plr55 && _plr55.level() instanceof ServerLevel
								&& _plr55.getAdvancements().getOrStartProgress(_plr55.server.getAdvancements().getAdvancement(ResourceLocation.parse("polpett_mod:polpett_eat_valuable"))).isDone()) && itemstack.getItem() == Items.DIAMOND) {
							if (sourceentity instanceof ServerPlayer _player) {
								Advancement _adv = _player.server.getAdvancements().getAdvancement(ResourceLocation.parse("polpett_mod:polpett_eat_valuable"));
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									for (String criteria : _ap.getRemainingCriteria())
										_player.getAdvancements().award(_adv, criteria);
								}
							}
						}
						if (itemstack.is(ItemTags.create(ResourceLocation.parse("polpett_mod:polpett_gain_new_feature")))) {
							PolpettEvolveFeatureCheckProcedure.execute(world, x, y, z, entity);
						}
						if (itemstack.is(ItemTags.create(ResourceLocation.parse("polpett_mod:polpett_feature_give_random")))) {
							if (Math.random() < (1) / ((float) 6)) {
								if (entity instanceof PolpettEntity _datEntSetI)
									_datEntSetI.getEntityData().set(PolpettEntity.DATA_TailChance, (int) ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_TailChance) : 0) + 1));
							} else {
								if (Math.random() < (1) / ((float) 5)) {
									if (entity instanceof PolpettEntity _datEntSetI)
										_datEntSetI.getEntityData().set(PolpettEntity.DATA_WingChance, (int) ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_MandibleChance) : 0) + 1));
								} else {
									if (Math.random() < (1) / ((float) 4)) {
										if (entity instanceof PolpettEntity _datEntSetI)
											_datEntSetI.getEntityData().set(PolpettEntity.DATA_GillChance, (int) ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_GillChance) : 0) + 1));
									} else {
										if (Math.random() < (1) / ((float) 3)) {
											if (entity instanceof PolpettEntity _datEntSetI)
												_datEntSetI.getEntityData().set(PolpettEntity.DATA_EarChance, (int) ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_EarChance) : 0) + 1));
										} else {
											if (Math.random() < (1) / ((float) 2)) {
												if (entity instanceof PolpettEntity _datEntSetI)
													_datEntSetI.getEntityData().set(PolpettEntity.DATA_MandibleChance, (int) ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_MandibleChance) : 0) + 1));
											} else {
												if (entity instanceof PolpettEntity _datEntSetI)
													_datEntSetI.getEntityData().set(PolpettEntity.DATA_AntlerChance, (int) ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_AntlerChance) : 0) + 1));
											}
										}
									}
								}
							}
						}
						if (itemstack.is(ItemTags.create(ResourceLocation.parse("polpett_mod:polpett_feature_give_mandibles")))) {
							if (entity instanceof PolpettEntity _datEntSetI)
								_datEntSetI.getEntityData().set(PolpettEntity.DATA_MandibleChance, (int) ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_MandibleChance) : 0) + 1));
						}
						if (itemstack.is(ItemTags.create(ResourceLocation.parse("polpett_mod:polpett_feature_remove_mandibles")))) {
							if (entity instanceof PolpettEntity _datEntSetI)
								_datEntSetI.getEntityData().set(PolpettEntity.DATA_MandibleChance, (int) ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_MandibleChance) : 0) - 1));
						}
						if (itemstack.is(ItemTags.create(ResourceLocation.parse("polpett_mod:polpett_feature_give_ears")))) {
							if (entity instanceof PolpettEntity _datEntSetI)
								_datEntSetI.getEntityData().set(PolpettEntity.DATA_EarChance, (int) ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_EarChance) : 0) + 1));
						}
						if (itemstack.is(ItemTags.create(ResourceLocation.parse("polpett_mod:polpett_feature_remove_ears")))) {
							if (entity instanceof PolpettEntity _datEntSetI)
								_datEntSetI.getEntityData().set(PolpettEntity.DATA_EarChance, (int) ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_EarChance) : 0) - 1));
						}
						if (itemstack.is(ItemTags.create(ResourceLocation.parse("polpett_mod:polpett_feature_give_gills")))) {
							if (entity instanceof PolpettEntity _datEntSetI)
								_datEntSetI.getEntityData().set(PolpettEntity.DATA_GillChance, (int) ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_GillChance) : 0) + 1));
						}
						if (itemstack.is(ItemTags.create(ResourceLocation.parse("polpett_mod:polpett_feature_remove_gills")))) {
							if (entity instanceof PolpettEntity _datEntSetI)
								_datEntSetI.getEntityData().set(PolpettEntity.DATA_GillChance, (int) ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_GillChance) : 0) - 1));
						}
						if (itemstack.is(ItemTags.create(ResourceLocation.parse("polpett_mod:polpett_feature_give_wings")))) {
							if (entity instanceof PolpettEntity _datEntSetI)
								_datEntSetI.getEntityData().set(PolpettEntity.DATA_WingChance, (int) ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_WingChance) : 0) + 1));
						}
						if (itemstack.is(ItemTags.create(ResourceLocation.parse("polpett_mod:polpett_feature_remove_wings")))) {
							if (entity instanceof PolpettEntity _datEntSetI)
								_datEntSetI.getEntityData().set(PolpettEntity.DATA_WingChance, (int) ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_WingChance) : 0) - 1));
						}
						if (itemstack.is(ItemTags.create(ResourceLocation.parse("polpett_mod:polpett_feature_give_tail")))) {
							if (entity instanceof PolpettEntity _datEntSetI)
								_datEntSetI.getEntityData().set(PolpettEntity.DATA_TailChance, (int) ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_TailChance) : 0) + 1));
						}
						if (itemstack.is(ItemTags.create(ResourceLocation.parse("polpett_mod:polpett_feature_remove_tail")))) {
							if (entity instanceof PolpettEntity _datEntSetI)
								_datEntSetI.getEntityData().set(PolpettEntity.DATA_TailChance, (int) ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_TailChance) : 0) - 1));
						}
						if (itemstack.is(ItemTags.create(ResourceLocation.parse("polpett_mod:polpett_feature_give_antlers")))) {
							if (entity instanceof PolpettEntity _datEntSetI)
								_datEntSetI.getEntityData().set(PolpettEntity.DATA_AntlerChance, (int) ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_AntlerChance) : 0) + 1));
						}
						if (itemstack.is(ItemTags.create(ResourceLocation.parse("polpett_mod:polpett_feature_remove_antlers")))) {
							if (entity instanceof PolpettEntity _datEntSetI)
								_datEntSetI.getEntityData().set(PolpettEntity.DATA_AntlerChance, (int) ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_AntlerChance) : 0) - 1));
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("entity.generic.eat")), SoundSource.AMBIENT, 1, (float) 1.4);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("entity.generic.eat")), SoundSource.AMBIENT, 1, (float) 1.4, false);
							}
						}
						for (int index6 = 0; index6 < Mth.nextInt(RandomSource.create(), 4, 8); index6++) {
							world.addParticle(ParticleTypes.CRIT, (x + Math.random() - 0.5), (y + 1), (z + Math.random() - 0.5), 0, 1, 0);
						}
						itemstack.shrink(1);
					}
				}
			}
		} else {
			if (!(itemstack.getItem() == ItemStack.EMPTY.getItem())) {
				if (itemstack.getItem().isEdible()) {
					if (sourceentity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal(("You should feed this to " + (entity.getDisplayName().getString() + "!"))), true);
				} else {
					if (itemstack.is(ItemTags.create(ResourceLocation.parse("polpett_mod:polpett_can_eat")))) {
						if (sourceentity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal(("This oddly seems like something " + (entity.getDisplayName().getString() + " can eat."))), true);
					} else {
						if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
							if (itemstack.is(ItemTags.create(ResourceLocation.parse("polpett_mod:polpett_can_wear_as_hat")))) {
								if (!(sourceentity instanceof ServerPlayer _plr148 && _plr148.level() instanceof ServerLevel
										&& _plr148.getAdvancements().getOrStartProgress(_plr148.server.getAdvancements().getAdvancement(ResourceLocation.parse("polpett_mod:polpett_hat_equip"))).isDone())) {
									if (sourceentity instanceof ServerPlayer _player) {
										Advancement _adv = _player.server.getAdvancements().getAdvancement(ResourceLocation.parse("polpett_mod:polpett_hat_equip"));
										AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
										if (!_ap.isDone()) {
											for (String criteria : _ap.getRemainingCriteria())
												_player.getAdvancements().award(_adv, criteria);
										}
									}
								}
								{
									Entity _entity = entity;
									if (_entity instanceof Player _player) {
										_player.getInventory().armor.set(3, itemstack);
										_player.getInventory().setChanged();
									} else if (_entity instanceof LivingEntity _living) {
										_living.setItemSlot(EquipmentSlot.HEAD, itemstack);
									}
								}
								itemstack.shrink(1);
							} else {
								PolpettCheckStatusProcedure.execute(entity, sourceentity);
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
							{
								Entity _entity = entity;
								if (_entity instanceof Player _player) {
									_player.getInventory().armor.set(3, new ItemStack(Blocks.AIR));
									_player.getInventory().setChanged();
								} else if (_entity instanceof LivingEntity _living) {
									_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(Blocks.AIR));
								}
							}
						}
					}
				}
			} else {
				PolpettCheckStatusProcedure.execute(entity, sourceentity);
			}
		}
	}
}
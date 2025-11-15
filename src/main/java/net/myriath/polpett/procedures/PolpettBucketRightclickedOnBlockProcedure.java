package net.myriath.polpett.procedures;

import net.myriath.polpett.init.PolpettModModEntities;
import net.myriath.polpett.entity.PolpettEntity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

public class PolpettBucketRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Direction direction, Entity entity, ItemStack itemstack) {
		if (direction == null || entity == null)
			return;
		double spawn_offset_x = 0;
		double spawn_offset_y = 0;
		double spawn_offset_z = 0;
		Entity spawned_polpett = null;
		spawn_offset_x = 0;
		spawn_offset_y = 0;
		spawn_offset_z = 0;
		if (direction == Direction.DOWN) {
			spawn_offset_y = -1;
		}
		if (direction == Direction.UP) {
			spawn_offset_y = 1;
		}
		if (direction == Direction.NORTH) {
			spawn_offset_z = -1;
		}
		if (direction == Direction.SOUTH) {
			spawn_offset_z = 1;
		}
		if (direction == Direction.EAST) {
			spawn_offset_x = 1;
		}
		if (direction == Direction.WEST) {
			spawn_offset_x = -1;
		}
		world.setBlock(BlockPos.containing(x + spawn_offset_x, y + spawn_offset_y, z + spawn_offset_z), Blocks.WATER.defaultBlockState(), 3);
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x + spawn_offset_x, y + spawn_offset_y, z + spawn_offset_z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("item.bucket.empty_axolotl")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound((x + spawn_offset_x), (y + spawn_offset_y), (z + spawn_offset_z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("item.bucket.empty_axolotl")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
		spawned_polpett = world instanceof ServerLevel _level8 ? PolpettModModEntities.POLPETT.get().spawn(_level8, BlockPos.containing(x + spawn_offset_x, y + spawn_offset_y, z + spawn_offset_z), MobSpawnType.MOB_SUMMONED) : null;
		if (!(spawned_polpett == null)) {
			if (itemstack.getOrCreateTag().getBoolean("ExistingPolpett") == true && !((itemstack.getOrCreateTag().getString("Name")).isEmpty() || (itemstack.getOrCreateTag().getString("Name")).equals("Polpett"))) {
				spawned_polpett.setCustomName(Component.literal((itemstack.getOrCreateTag().getString("Name"))));
			}
			{
				Entity _entity = spawned_polpett;
				if (_entity instanceof Player _player) {
					_player.getInventory().armor.set(3, new ItemStack(ForgeRegistries.ITEMS.getValue(ResourceLocation.parse(((itemstack.getOrCreateTag().getString("Hat"))).toLowerCase(java.util.Locale.ENGLISH)))));
					_player.getInventory().setChanged();
				} else if (_entity instanceof LivingEntity _living) {
					_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ForgeRegistries.ITEMS.getValue(ResourceLocation.parse(((itemstack.getOrCreateTag().getString("Hat"))).toLowerCase(java.util.Locale.ENGLISH)))));
				}
			}
			if (spawned_polpett instanceof AgeableMob _ageable)
				_ageable.setAge((int) itemstack.getOrCreateTag().getDouble("Age"));
			if (itemstack.getOrCreateTag().getBoolean("ExistingPolpett") == true) {
				if (spawned_polpett instanceof PolpettEntity _datEntSetS)
					_datEntSetS.getEntityData().set(PolpettEntity.DATA_ColorType, (itemstack.getOrCreateTag().getString("ColorType")));
				if (spawned_polpett instanceof LivingEntity _entity)
					_entity.setHealth((float) itemstack.getOrCreateTag().getDouble("Health"));
				if (spawned_polpett instanceof PolpettEntity _datEntSetI)
					_datEntSetI.getEntityData().set(PolpettEntity.DATA_Happiness, (int) itemstack.getOrCreateTag().getDouble("Happiness"));
				if (spawned_polpett instanceof PolpettEntity _datEntSetI)
					_datEntSetI.getEntityData().set(PolpettEntity.DATA_Hunger, (int) itemstack.getOrCreateTag().getDouble("Hunger"));
			} else {
				if (spawned_polpett instanceof PolpettEntity _datEntSetS)
					_datEntSetS.getEntityData().set(PolpettEntity.DATA_ColorType, "Ky");
				if (spawned_polpett instanceof LivingEntity _entity)
					_entity.setHealth(spawned_polpett instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1);
				if (spawned_polpett instanceof PolpettEntity _datEntSetI)
					_datEntSetI.getEntityData().set(PolpettEntity.DATA_Happiness, 50);
				if (spawned_polpett instanceof PolpettEntity _datEntSetI)
					_datEntSetI.getEntityData().set(PolpettEntity.DATA_Hunger, 20);
			}
			if (itemstack.getOrCreateTag().getBoolean("ExistingPolpett") == true) {
				if (spawned_polpett instanceof PolpettEntity _datEntSetS)
					_datEntSetS.getEntityData().set(PolpettEntity.DATA_FavFood, (itemstack.getOrCreateTag().getString("FavFood")));
				if (spawned_polpett instanceof PolpettEntity _datEntSetI)
					_datEntSetI.getEntityData().set(PolpettEntity.DATA_FavFoodGenerator, (int) itemstack.getOrCreateTag().getDouble("FavFoodGenerator"));
			} else {
				if (spawned_polpett instanceof PolpettEntity _datEntSetI)
					_datEntSetI.getEntityData().set(PolpettEntity.DATA_FavFoodGenerator, Mth.nextInt(RandomSource.create(), 1, 100));
				if ((spawned_polpett instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_FavFoodGenerator) : 0) > 80) {
					if (spawned_polpett instanceof PolpettEntity _datEntSetS)
						_datEntSetS.getEntityData().set(PolpettEntity.DATA_FavFood, "Carrots");
				} else {
					if ((spawned_polpett instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_FavFoodGenerator) : 0) > 60) {
						if (spawned_polpett instanceof PolpettEntity _datEntSetS)
							_datEntSetS.getEntityData().set(PolpettEntity.DATA_FavFood, "Glowberries");
					} else {
						if ((spawned_polpett instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_FavFoodGenerator) : 0) > 50) {
							if (spawned_polpett instanceof PolpettEntity _datEntSetS)
								_datEntSetS.getEntityData().set(PolpettEntity.DATA_FavFood, "Berries");
						} else {
							if ((spawned_polpett instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_FavFoodGenerator) : 0) > 20) {
								if (spawned_polpett instanceof PolpettEntity _datEntSetS)
									_datEntSetS.getEntityData().set(PolpettEntity.DATA_FavFood, "Apples");
							} else {
								if (spawned_polpett instanceof PolpettEntity _datEntSetS)
									_datEntSetS.getEntityData().set(PolpettEntity.DATA_FavFood, "Beetroots");
							}
						}
					}
				}
			}
			if (itemstack.getOrCreateTag().getBoolean("ExistingPolpett") == false) {
				if (spawned_polpett instanceof PolpettEntity _datEntSetI)
					_datEntSetI.getEntityData().set(PolpettEntity.DATA_TailLevel, 3);
			} else {
				if (spawned_polpett instanceof PolpettEntity _datEntSetI)
					_datEntSetI.getEntityData().set(PolpettEntity.DATA_TailLevel, (int) itemstack.getOrCreateTag().getDouble("TailLevel"));
			}
			if (spawned_polpett instanceof PolpettEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PolpettEntity.DATA_TailChance, (int) itemstack.getOrCreateTag().getDouble("TailChance"));
			if (spawned_polpett instanceof PolpettEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PolpettEntity.DATA_WingLevel, (int) itemstack.getOrCreateTag().getDouble("WingLevel"));
			if (spawned_polpett instanceof PolpettEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PolpettEntity.DATA_WingChance, (int) itemstack.getOrCreateTag().getDouble("WingChance"));
			if (spawned_polpett instanceof PolpettEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PolpettEntity.DATA_GillLevel, (int) itemstack.getOrCreateTag().getDouble("GillLevel"));
			if (spawned_polpett instanceof PolpettEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PolpettEntity.DATA_GillChance, (int) itemstack.getOrCreateTag().getDouble("GillChance"));
			if (spawned_polpett instanceof PolpettEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PolpettEntity.DATA_EarLevel, (int) itemstack.getOrCreateTag().getDouble("EarLevel"));
			if (spawned_polpett instanceof PolpettEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PolpettEntity.DATA_EarChance, (int) itemstack.getOrCreateTag().getDouble("EarChance"));
			if (spawned_polpett instanceof PolpettEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PolpettEntity.DATA_MandibleLevel, (int) itemstack.getOrCreateTag().getDouble("MandibleLevel"));
			if (spawned_polpett instanceof PolpettEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PolpettEntity.DATA_MandibleChance, (int) itemstack.getOrCreateTag().getDouble("MandibleChance"));
			if (spawned_polpett instanceof PolpettEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PolpettEntity.DATA_AntlerLevel, (int) itemstack.getOrCreateTag().getDouble("AntlerLevel"));
			if (spawned_polpett instanceof PolpettEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PolpettEntity.DATA_AntlerChance, (int) itemstack.getOrCreateTag().getDouble("AntlerChance"));
			if (spawned_polpett instanceof PolpettEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PolpettEntity.DATA_FeatureRandomlyPicked, (int) itemstack.getOrCreateTag().getDouble("FeatureRandomlyPicked"));
			if (spawned_polpett instanceof PolpettEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PolpettEntity.DATA_evolveProgress, (int) itemstack.getOrCreateTag().getDouble("evolveProgress"));
			if (!(new Object() {
				public boolean checkGamemode(Entity _ent) {
					if (_ent instanceof ServerPlayer _serverPlayer) {
						return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
					} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
						return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
								&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
					}
					return false;
				}
			}.checkGamemode(entity))) {
				itemstack.shrink(1);
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(Items.BUCKET).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
		} else {
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("UHHHHHHH"), false);
		}
	}
}
package net.myriath.polpett.entity;

import net.myriath.polpett.procedures.PolpettRightClickedOnEntityProcedure;
import net.myriath.polpett.procedures.PolpettOnInitialEntitySpawnProcedure;
import net.myriath.polpett.procedures.PolpettOnEntityTickUpdateProcedure;
import net.myriath.polpett.procedures.PolpettFavoriteFoodGlowberriesProcedure;
import net.myriath.polpett.procedures.PolpettFavoriteFoodCarrotsProcedure;
import net.myriath.polpett.procedures.PolpettFavoriteFoodBerriesProcedure;
import net.myriath.polpett.procedures.PolpettFavoriteFoodBeetrootsProcedure;
import net.myriath.polpett.procedures.PolpettFavoriteFoodApplesProcedure;
import net.myriath.polpett.procedures.PolpettEntityIsHurtProcedure;
import net.myriath.polpett.init.PolpettModModEntities;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.goal.TemptGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.PanicGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;
import net.minecraft.nbt.CompoundTag;

import javax.annotation.Nullable;

public class PolpettEntity extends PathfinderMob {
	public static final EntityDataAccessor<Integer> DATA_Happiness = SynchedEntityData.defineId(PolpettEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_Hunger = SynchedEntityData.defineId(PolpettEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_Color = SynchedEntityData.defineId(PolpettEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<String> DATA_ColorType = SynchedEntityData.defineId(PolpettEntity.class, EntityDataSerializers.STRING);
	public static final EntityDataAccessor<String> DATA_FavFood = SynchedEntityData.defineId(PolpettEntity.class, EntityDataSerializers.STRING);
	public static final EntityDataAccessor<Integer> DATA_FavFoodGenerator = SynchedEntityData.defineId(PolpettEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_Age = SynchedEntityData.defineId(PolpettEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_TailLevel = SynchedEntityData.defineId(PolpettEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_TailChance = SynchedEntityData.defineId(PolpettEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_WingLevel = SynchedEntityData.defineId(PolpettEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_WingChance = SynchedEntityData.defineId(PolpettEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_GillLevel = SynchedEntityData.defineId(PolpettEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_GillChance = SynchedEntityData.defineId(PolpettEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_EarLevel = SynchedEntityData.defineId(PolpettEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_EarChance = SynchedEntityData.defineId(PolpettEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_MandibleLevel = SynchedEntityData.defineId(PolpettEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_MandibleChance = SynchedEntityData.defineId(PolpettEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_AntlerLevel = SynchedEntityData.defineId(PolpettEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_AntlerChance = SynchedEntityData.defineId(PolpettEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_FeatureRandomlyPicked = SynchedEntityData.defineId(PolpettEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_evolveProgress = SynchedEntityData.defineId(PolpettEntity.class, EntityDataSerializers.INT);

	public PolpettEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(PolpettModModEntities.POLPETT.get(), world);
	}

	public PolpettEntity(EntityType<PolpettEntity> type, Level world) {
		super(type, world);
		setMaxUpStep(0.6f);
		xpReward = 0;
		setNoAi(false);
		setPersistenceRequired();
		refreshDimensions();
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void defineSynchedData() {
		super.defineSynchedData();
		this.entityData.define(DATA_Happiness, 50);
		this.entityData.define(DATA_Hunger, 20);
		this.entityData.define(DATA_Color, 0);
		this.entityData.define(DATA_ColorType, "Ky");
		this.entityData.define(DATA_FavFood, "");
		this.entityData.define(DATA_FavFoodGenerator, 0);
		this.entityData.define(DATA_Age, 0);
		this.entityData.define(DATA_TailLevel, 3);
		this.entityData.define(DATA_TailChance, 0);
		this.entityData.define(DATA_WingLevel, 0);
		this.entityData.define(DATA_WingChance, 0);
		this.entityData.define(DATA_GillLevel, 0);
		this.entityData.define(DATA_GillChance, 0);
		this.entityData.define(DATA_EarLevel, 0);
		this.entityData.define(DATA_EarChance, 0);
		this.entityData.define(DATA_MandibleLevel, 0);
		this.entityData.define(DATA_MandibleChance, 0);
		this.entityData.define(DATA_AntlerLevel, 0);
		this.entityData.define(DATA_AntlerChance, 0);
		this.entityData.define(DATA_FeatureRandomlyPicked, 0);
		this.entityData.define(DATA_evolveProgress, 0);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new TemptGoal(this, 1, Ingredient.of(Items.BEETROOT), false) {
			@Override
			public boolean canUse() {
				double x = PolpettEntity.this.getX();
				double y = PolpettEntity.this.getY();
				double z = PolpettEntity.this.getZ();
				Entity entity = PolpettEntity.this;
				Level world = PolpettEntity.this.level();
				return super.canUse() && PolpettFavoriteFoodBeetrootsProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = PolpettEntity.this.getX();
				double y = PolpettEntity.this.getY();
				double z = PolpettEntity.this.getZ();
				Entity entity = PolpettEntity.this;
				Level world = PolpettEntity.this.level();
				return super.canContinueToUse() && PolpettFavoriteFoodBeetrootsProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(2, new TemptGoal(this, 1, Ingredient.of(Items.GLOW_BERRIES), false) {
			@Override
			public boolean canUse() {
				double x = PolpettEntity.this.getX();
				double y = PolpettEntity.this.getY();
				double z = PolpettEntity.this.getZ();
				Entity entity = PolpettEntity.this;
				Level world = PolpettEntity.this.level();
				return super.canUse() && PolpettFavoriteFoodGlowberriesProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = PolpettEntity.this.getX();
				double y = PolpettEntity.this.getY();
				double z = PolpettEntity.this.getZ();
				Entity entity = PolpettEntity.this;
				Level world = PolpettEntity.this.level();
				return super.canContinueToUse() && PolpettFavoriteFoodGlowberriesProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(3, new TemptGoal(this, 1, Ingredient.of(Items.SWEET_BERRIES), false) {
			@Override
			public boolean canUse() {
				double x = PolpettEntity.this.getX();
				double y = PolpettEntity.this.getY();
				double z = PolpettEntity.this.getZ();
				Entity entity = PolpettEntity.this;
				Level world = PolpettEntity.this.level();
				return super.canUse() && PolpettFavoriteFoodBerriesProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = PolpettEntity.this.getX();
				double y = PolpettEntity.this.getY();
				double z = PolpettEntity.this.getZ();
				Entity entity = PolpettEntity.this;
				Level world = PolpettEntity.this.level();
				return super.canContinueToUse() && PolpettFavoriteFoodBerriesProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(4, new TemptGoal(this, 1, Ingredient.of(Items.APPLE), false) {
			@Override
			public boolean canUse() {
				double x = PolpettEntity.this.getX();
				double y = PolpettEntity.this.getY();
				double z = PolpettEntity.this.getZ();
				Entity entity = PolpettEntity.this;
				Level world = PolpettEntity.this.level();
				return super.canUse() && PolpettFavoriteFoodApplesProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = PolpettEntity.this.getX();
				double y = PolpettEntity.this.getY();
				double z = PolpettEntity.this.getZ();
				Entity entity = PolpettEntity.this;
				Level world = PolpettEntity.this.level();
				return super.canContinueToUse() && PolpettFavoriteFoodApplesProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(5, new TemptGoal(this, 1, Ingredient.of(Items.CARROT), false) {
			@Override
			public boolean canUse() {
				double x = PolpettEntity.this.getX();
				double y = PolpettEntity.this.getY();
				double z = PolpettEntity.this.getZ();
				Entity entity = PolpettEntity.this;
				Level world = PolpettEntity.this.level();
				return super.canUse() && PolpettFavoriteFoodCarrotsProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = PolpettEntity.this.getX();
				double y = PolpettEntity.this.getY();
				double z = PolpettEntity.this.getZ();
				Entity entity = PolpettEntity.this;
				Level world = PolpettEntity.this.level();
				return super.canContinueToUse() && PolpettFavoriteFoodCarrotsProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(6, new PanicGoal(this, 1.2));
		this.goalSelector.addGoal(7, new RandomStrollGoal(this, 1));
		this.goalSelector.addGoal(8, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(9, new FloatGoal(this));
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("polpett_mod:polpett.sound.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("polpett_mod:polpett.sound.verysad"));
	}

	@Override
	public boolean hurt(DamageSource damagesource, float amount) {
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Level world = this.level();
		Entity entity = this;
		Entity sourceentity = damagesource.getEntity();
		Entity immediatesourceentity = damagesource.getDirectEntity();

		PolpettEntityIsHurtProcedure.execute(entity, sourceentity);
		if (damagesource.is(DamageTypes.IN_FIRE))
			return false;
		if (damagesource.is(DamageTypes.FALL))
			return false;
		if (damagesource.is(DamageTypes.DROWN))
			return false;
		if (damagesource.is(DamageTypes.LIGHTNING_BOLT))
			return false;
		if (damagesource.is(DamageTypes.FALLING_ANVIL))
			return false;
		if (damagesource.is(DamageTypes.DRAGON_BREATH))
			return false;
		return super.hurt(damagesource, amount);
	}

	@Override
	public boolean fireImmune() {
		return true;
	}

	@Override
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
		SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
		PolpettOnInitialEntitySpawnProcedure.execute(this);
		return retval;
	}

	@Override
	public void addAdditionalSaveData(CompoundTag compound) {
		super.addAdditionalSaveData(compound);
		compound.putInt("DataHappiness", this.entityData.get(DATA_Happiness));
		compound.putInt("DataHunger", this.entityData.get(DATA_Hunger));
		compound.putInt("DataColor", this.entityData.get(DATA_Color));
		compound.putString("DataColorType", this.entityData.get(DATA_ColorType));
		compound.putString("DataFavFood", this.entityData.get(DATA_FavFood));
		compound.putInt("DataFavFoodGenerator", this.entityData.get(DATA_FavFoodGenerator));
		compound.putInt("DataAge", this.entityData.get(DATA_Age));
		compound.putInt("DataTailLevel", this.entityData.get(DATA_TailLevel));
		compound.putInt("DataTailChance", this.entityData.get(DATA_TailChance));
		compound.putInt("DataWingLevel", this.entityData.get(DATA_WingLevel));
		compound.putInt("DataWingChance", this.entityData.get(DATA_WingChance));
		compound.putInt("DataGillLevel", this.entityData.get(DATA_GillLevel));
		compound.putInt("DataGillChance", this.entityData.get(DATA_GillChance));
		compound.putInt("DataEarLevel", this.entityData.get(DATA_EarLevel));
		compound.putInt("DataEarChance", this.entityData.get(DATA_EarChance));
		compound.putInt("DataMandibleLevel", this.entityData.get(DATA_MandibleLevel));
		compound.putInt("DataMandibleChance", this.entityData.get(DATA_MandibleChance));
		compound.putInt("DataAntlerLevel", this.entityData.get(DATA_AntlerLevel));
		compound.putInt("DataAntlerChance", this.entityData.get(DATA_AntlerChance));
		compound.putInt("DataFeatureRandomlyPicked", this.entityData.get(DATA_FeatureRandomlyPicked));
		compound.putInt("DataevolveProgress", this.entityData.get(DATA_evolveProgress));
	}

	@Override
	public void readAdditionalSaveData(CompoundTag compound) {
		super.readAdditionalSaveData(compound);
		if (compound.contains("DataHappiness"))
			this.entityData.set(DATA_Happiness, compound.getInt("DataHappiness"));
		if (compound.contains("DataHunger"))
			this.entityData.set(DATA_Hunger, compound.getInt("DataHunger"));
		if (compound.contains("DataColor"))
			this.entityData.set(DATA_Color, compound.getInt("DataColor"));
		if (compound.contains("DataColorType"))
			this.entityData.set(DATA_ColorType, compound.getString("DataColorType"));
		if (compound.contains("DataFavFood"))
			this.entityData.set(DATA_FavFood, compound.getString("DataFavFood"));
		if (compound.contains("DataFavFoodGenerator"))
			this.entityData.set(DATA_FavFoodGenerator, compound.getInt("DataFavFoodGenerator"));
		if (compound.contains("DataAge"))
			this.entityData.set(DATA_Age, compound.getInt("DataAge"));
		if (compound.contains("DataTailLevel"))
			this.entityData.set(DATA_TailLevel, compound.getInt("DataTailLevel"));
		if (compound.contains("DataTailChance"))
			this.entityData.set(DATA_TailChance, compound.getInt("DataTailChance"));
		if (compound.contains("DataWingLevel"))
			this.entityData.set(DATA_WingLevel, compound.getInt("DataWingLevel"));
		if (compound.contains("DataWingChance"))
			this.entityData.set(DATA_WingChance, compound.getInt("DataWingChance"));
		if (compound.contains("DataGillLevel"))
			this.entityData.set(DATA_GillLevel, compound.getInt("DataGillLevel"));
		if (compound.contains("DataGillChance"))
			this.entityData.set(DATA_GillChance, compound.getInt("DataGillChance"));
		if (compound.contains("DataEarLevel"))
			this.entityData.set(DATA_EarLevel, compound.getInt("DataEarLevel"));
		if (compound.contains("DataEarChance"))
			this.entityData.set(DATA_EarChance, compound.getInt("DataEarChance"));
		if (compound.contains("DataMandibleLevel"))
			this.entityData.set(DATA_MandibleLevel, compound.getInt("DataMandibleLevel"));
		if (compound.contains("DataMandibleChance"))
			this.entityData.set(DATA_MandibleChance, compound.getInt("DataMandibleChance"));
		if (compound.contains("DataAntlerLevel"))
			this.entityData.set(DATA_AntlerLevel, compound.getInt("DataAntlerLevel"));
		if (compound.contains("DataAntlerChance"))
			this.entityData.set(DATA_AntlerChance, compound.getInt("DataAntlerChance"));
		if (compound.contains("DataFeatureRandomlyPicked"))
			this.entityData.set(DATA_FeatureRandomlyPicked, compound.getInt("DataFeatureRandomlyPicked"));
		if (compound.contains("DataevolveProgress"))
			this.entityData.set(DATA_evolveProgress, compound.getInt("DataevolveProgress"));
	}

	@Override
	public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
		ItemStack itemstack = sourceentity.getItemInHand(hand);
		InteractionResult retval = InteractionResult.sidedSuccess(this.level().isClientSide());
		super.mobInteract(sourceentity, hand);
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Entity entity = this;
		Level world = this.level();

		PolpettRightClickedOnEntityProcedure.execute(world, x, y, z, entity, sourceentity, itemstack);
		return retval;
	}

	@Override
	public void baseTick() {
		super.baseTick();
		PolpettOnEntityTickUpdateProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ(), this);
	}

	@Override
	public boolean canBreatheUnderwater() {
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Level world = this.level();
		Entity entity = this;
		return true;
	}

	@Override
	public EntityDimensions getDimensions(Pose pose) {
		return super.getDimensions(pose).scale(0.8f);
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.2);
		builder = builder.add(Attributes.MAX_HEALTH, 10);
		builder = builder.add(Attributes.ARMOR, 25);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 2);
		return builder;
	}
}
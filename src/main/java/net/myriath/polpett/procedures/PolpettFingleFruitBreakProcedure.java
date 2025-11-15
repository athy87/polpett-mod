package net.myriath.polpett.procedures;

import net.myriath.polpett.init.PolpettModModBlocks;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.TagKey;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class PolpettFingleFruitBreakProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == PolpettModModBlocks.FINGLE_FRUIT_STAGE_4.get()) {
			if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("polpett_mod:polpett")))) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("entity.generic.eat")), SoundSource.AMBIENT, 1, (float) 1.4);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("entity.generic.eat")), SoundSource.AMBIENT, 1, (float) 1.4, false);
					}
				}
				PolpettChangeStatValueProcedure.execute(entity, entity, 50, "Happiness");
				for (int index0 = 0; index0 < Mth.nextInt(RandomSource.create(), 1, 2); index0++) {
					world.addParticle(ParticleTypes.HEART, (entity.getX() + Math.random() - 0.5), (entity.getY() + 1), (entity.getZ() + Math.random() - 0.5), 0, 1, 0);
				}
				PolpettChangeStatValueProcedure.execute(entity, entity, 10, "Hunger");
				for (int index1 = 0; index1 < Mth.nextInt(RandomSource.create(), 1, 4); index1++) {
					world.addParticle(ParticleTypes.HAPPY_VILLAGER, (entity.getX() + Math.random() - 0.5), (entity.getY() + 1), (entity.getZ() + Math.random() - 0.5), 0, 1, 0);
				}
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1);
			}
		}
	}
}
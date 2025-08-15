package net.myriath.polpett.procedures;

import net.myriath.polpett.entity.PolpettEntity;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class PolpettOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof PolpettEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PolpettEntity.DATA_FavFoodGenerator, Mth.nextInt(RandomSource.create(), 1, 100));
		if ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_FavFoodGenerator) : 0) > 80) {
			if (entity instanceof PolpettEntity _datEntSetS)
				_datEntSetS.getEntityData().set(PolpettEntity.DATA_FavFood, "Carrots");
		} else {
			if ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_FavFoodGenerator) : 0) > 60) {
				if (entity instanceof PolpettEntity _datEntSetS)
					_datEntSetS.getEntityData().set(PolpettEntity.DATA_FavFood, "Glowberries");
			} else {
				if ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_FavFoodGenerator) : 0) > 50) {
					if (entity instanceof PolpettEntity _datEntSetS)
						_datEntSetS.getEntityData().set(PolpettEntity.DATA_FavFood, "Berries");
				} else {
					if ((entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_FavFoodGenerator) : 0) > 20) {
						if (entity instanceof PolpettEntity _datEntSetS)
							_datEntSetS.getEntityData().set(PolpettEntity.DATA_FavFood, "Apples");
					} else {
						if (entity instanceof PolpettEntity _datEntSetS)
							_datEntSetS.getEntityData().set(PolpettEntity.DATA_FavFood, "Beetroots");
					}
				}
			}
		}
	}
}
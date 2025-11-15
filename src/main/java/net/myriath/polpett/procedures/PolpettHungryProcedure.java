package net.myriath.polpett.procedures;

import net.myriath.polpett.entity.PolpettEntity;

import net.minecraft.world.entity.Entity;

public class PolpettHungryProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_Hunger) : 0) <= 11;
	}
}
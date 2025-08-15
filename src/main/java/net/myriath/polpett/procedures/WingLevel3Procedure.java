package net.myriath.polpett.procedures;

import net.myriath.polpett.entity.PolpettEntity;

import net.minecraft.world.entity.Entity;

public class WingLevel3Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_WingLevel) : 0) > 2;
	}
}
package net.myriath.polpett.procedures;

import net.myriath.polpett.entity.PolpettEntity;

import net.minecraft.world.entity.Entity;

public class JohnTail1Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof PolpettEntity _datEntS ? _datEntS.getEntityData().get(PolpettEntity.DATA_ColorType) : "").equals("John")
				&& (entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_TailLevel) : 0) == 1;
	}
}
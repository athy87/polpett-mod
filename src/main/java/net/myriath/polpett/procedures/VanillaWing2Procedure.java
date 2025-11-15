package net.myriath.polpett.procedures;

import net.myriath.polpett.entity.PolpettEntity;

import net.minecraft.world.entity.Entity;

public class VanillaWing2Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof PolpettEntity _datEntS ? _datEntS.getEntityData().get(PolpettEntity.DATA_ColorType) : "").equals("Vanilla")
				&& (entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_WingLevel) : 0) == 2;
	}
}
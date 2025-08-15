package net.myriath.polpett.procedures;

import net.myriath.polpett.entity.PolpettEntity;

import net.minecraft.world.entity.Entity;

public class SolAntler3Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof PolpettEntity _datEntS ? _datEntS.getEntityData().get(PolpettEntity.DATA_ColorType) : "").equals("Sol")
				&& (entity instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_AntlerLevel) : 0) > 2;
	}
}
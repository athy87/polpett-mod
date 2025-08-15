package net.myriath.polpett.procedures;

import net.myriath.polpett.entity.PolpettEntity;

import net.minecraft.world.entity.Entity;

public class PolpettChangeStatValueProcedure {
	public static void execute(Entity entity, Entity target, double amount, String stat) {
		if (entity == null || target == null || stat == null)
			return;
		if (entity instanceof PolpettEntity) {
			if ((stat).equals("Happiness")) {
				if (target instanceof PolpettEntity _datEntSetI)
					_datEntSetI.getEntityData().set(PolpettEntity.DATA_Happiness, (int) ((target instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_Happiness) : 0) + amount));
			}
			if ((stat).equals("Hunger")) {
				if (target instanceof PolpettEntity _datEntSetI)
					_datEntSetI.getEntityData().set(PolpettEntity.DATA_Hunger, (int) ((target instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_Hunger) : 0) + amount));
			}
			if ((stat).equals("TailLevel")) {
				if (target instanceof PolpettEntity _datEntSetI)
					_datEntSetI.getEntityData().set(PolpettEntity.DATA_TailLevel, (int) ((target instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_TailLevel) : 0) + amount));
			} else if ((stat).equals("TailChance")) {
				if (target instanceof PolpettEntity _datEntSetI)
					_datEntSetI.getEntityData().set(PolpettEntity.DATA_TailChance, (int) ((target instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_TailChance) : 0) + amount));
			}
			if ((stat).equals("WingLevel")) {
				if (target instanceof PolpettEntity _datEntSetI)
					_datEntSetI.getEntityData().set(PolpettEntity.DATA_WingLevel, (int) ((target instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_WingLevel) : 0) + amount));
			} else if ((stat).equals("WingChance")) {
				if (target instanceof PolpettEntity _datEntSetI)
					_datEntSetI.getEntityData().set(PolpettEntity.DATA_WingChance, (int) ((target instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_WingChance) : 0) + amount));
			}
			if ((stat).equals("GillLevel")) {
				if (target instanceof PolpettEntity _datEntSetI)
					_datEntSetI.getEntityData().set(PolpettEntity.DATA_GillLevel, (int) ((target instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_GillLevel) : 0) + amount));
			} else if ((stat).equals("GillChance")) {
				if (target instanceof PolpettEntity _datEntSetI)
					_datEntSetI.getEntityData().set(PolpettEntity.DATA_GillChance, (int) ((target instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_GillChance) : 0) + amount));
			}
			if ((stat).equals("EarLevel")) {
				if (target instanceof PolpettEntity _datEntSetI)
					_datEntSetI.getEntityData().set(PolpettEntity.DATA_EarLevel, (int) ((target instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_EarLevel) : 0) + amount));
			} else if ((stat).equals("EarChance")) {
				if (target instanceof PolpettEntity _datEntSetI)
					_datEntSetI.getEntityData().set(PolpettEntity.DATA_EarChance, (int) ((target instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_EarChance) : 0) + amount));
			}
			if ((stat).equals("MandibleLevel")) {
				if (target instanceof PolpettEntity _datEntSetI)
					_datEntSetI.getEntityData().set(PolpettEntity.DATA_MandibleLevel, (int) ((target instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_MandibleLevel) : 0) + amount));
			} else if ((stat).equals("MandibleChance")) {
				if (target instanceof PolpettEntity _datEntSetI)
					_datEntSetI.getEntityData().set(PolpettEntity.DATA_MandibleChance, (int) ((target instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_MandibleChance) : 0) + amount));
			}
			if ((stat).equals("AntlerLevel")) {
				if (target instanceof PolpettEntity _datEntSetI)
					_datEntSetI.getEntityData().set(PolpettEntity.DATA_AntlerLevel, (int) ((target instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_AntlerLevel) : 0) + amount));
			} else if ((stat).equals("AntlerChance")) {
				if (target instanceof PolpettEntity _datEntSetI)
					_datEntSetI.getEntityData().set(PolpettEntity.DATA_AntlerChance, (int) ((target instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_AntlerChance) : 0) + amount));
			}
			if ((stat).equals("EvolveProgress")) {
				if (target instanceof PolpettEntity _datEntSetI)
					_datEntSetI.getEntityData().set(PolpettEntity.DATA_evolveProgress, (int) ((target instanceof PolpettEntity _datEntI ? _datEntI.getEntityData().get(PolpettEntity.DATA_evolveProgress) : 0) + amount));
			}
		}
	}
}
package net.myriath.polpett.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class PolpettEntityIsHurtProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		PolpettChangeStatValueProcedure.execute(entity, entity, -2, "Happiness");
		if (sourceentity instanceof Player) {
			PolpettChangeStatValueProcedure.execute(entity, entity, -3, "Happiness");
		}
	}
}
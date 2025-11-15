package net.myriath.polpett.procedures;

import net.minecraft.world.item.ItemStack;

public class PolpettBucketHasItemGlowingEffectProcedure {
	public static boolean execute(ItemStack itemstack) {
		return itemstack.getOrCreateTag().getBoolean("ExistingPolpett");
	}
}
package net.myriath.polpett.procedures;

import net.minecraft.world.item.ItemStack;

public class PolpettBucketPropertyValueProviderNameProcedure {
	public static String execute(ItemStack itemstack) {
		String full_info = "";
		if (itemstack.getOrCreateTag().getBoolean("ExistingPolpett")) {
			if ((itemstack.getOrCreateTag().getString("Name")).isEmpty()) {
				full_info = ("\u00A77Happiness: " + new java.text.DecimalFormat("##").format(itemstack.getOrCreateTag().getDouble("Happiness"))) + "\n"
						+ ("\u00A77Hunger: " + new java.text.DecimalFormat("##").format(itemstack.getOrCreateTag().getDouble("Hunger: ")));
			} else {
				full_info = ("\u00A7a" + itemstack.getOrCreateTag().getString("Name")) + "\n" + ("\u00A77Happiness: " + new java.text.DecimalFormat("##").format(itemstack.getOrCreateTag().getDouble("Happiness"))) + "\n"
						+ ("\u00A77Hunger: " + new java.text.DecimalFormat("##").format(itemstack.getOrCreateTag().getDouble("Hunger")));
			}
		} else {
			full_info = "\u00A77(No Preexisting Polpett)";
		}
		return full_info;
	}
}
package net.myriath.polpett.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PolpettWoolHatBlueItem extends Item {
	public PolpettWoolHatBlueItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.COMMON));
	}
}
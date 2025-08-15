package net.myriath.polpett.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PolpettWoolHatGreenItem extends Item {
	public PolpettWoolHatGreenItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.COMMON));
	}
}
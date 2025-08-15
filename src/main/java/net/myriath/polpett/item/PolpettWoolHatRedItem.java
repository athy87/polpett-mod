package net.myriath.polpett.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PolpettWoolHatRedItem extends Item {
	public PolpettWoolHatRedItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.COMMON));
	}
}
package net.myriath.polpett.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PolpettWoolHatGreyItem extends Item {
	public PolpettWoolHatGreyItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.COMMON));
	}
}
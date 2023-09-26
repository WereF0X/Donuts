
package net.mcreator.wardenmodother.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.wardenmodother.init.WardenModotherModFluids;

public class Wc2Item extends BucketItem {
	public Wc2Item() {
		super(WardenModotherModFluids.WC_2, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.UNCOMMON));
	}
}


package net.mcreator.wardenmodother.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;
import net.minecraft.network.chat.Component;

import net.mcreator.wardenmodother.init.WardenModotherModFluids;

import java.util.List;

public class ChocolateItem extends BucketItem {
	public ChocolateItem() {
		super(WardenModotherModFluids.CHOCOLATE, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.UNCOMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Really Hot"));
	}
}

package net.mcreator.wardenmodother.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;

public class DonutnuggetPickaxeItemIsCraftedsmeltedProcedure {
	public static void execute(ItemStack itemstack) {
		itemstack.enchant(Enchantments.BLOCK_FORTUNE, 5);
	}
}

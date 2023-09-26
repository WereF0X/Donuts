package net.mcreator.wardenmodother.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;

import java.util.Map;

public class DonutnuggetPickaxeBlockDestroyedWithToolProcedure {
	public static void execute(ItemStack itemstack) {
		{
			Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
			if (_enchantments.containsKey(Enchantments.BLOCK_FORTUNE)) {
				_enchantments.remove(Enchantments.BLOCK_FORTUNE);
				EnchantmentHelper.setEnchantments(_enchantments, itemstack);
			}
		}
	}
}

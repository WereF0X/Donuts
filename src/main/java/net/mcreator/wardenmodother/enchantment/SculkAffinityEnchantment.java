
package net.mcreator.wardenmodother.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.wardenmodother.init.WardenModotherModItems;

public class SculkAffinityEnchantment extends Enchantment {
	public SculkAffinityEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.RARE, EnchantmentCategory.ARMOR, slots);
	}

	@Override
	public int getMaxLevel() {
		return 3;
	}

	@Override
	public int getDamageProtection(int level, DamageSource source) {
		return level * 2;
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack itemstack) {
		return Ingredient.of(new ItemStack(WardenModotherModItems.WARDEN_ARMOR_HELMET.get()), new ItemStack(WardenModotherModItems.WARDEN_ARMOR_CHESTPLATE.get()), new ItemStack(WardenModotherModItems.WARDEN_ARMOR_LEGGINGS.get()),
				new ItemStack(WardenModotherModItems.WARDEN_ARMOR_BOOTS.get()), new ItemStack(Items.NETHERITE_HELMET), new ItemStack(Items.NETHERITE_CHESTPLATE), new ItemStack(Items.NETHERITE_LEGGINGS), new ItemStack(Items.NETHERITE_BOOTS),
				new ItemStack(Items.DIAMOND_HELMET), new ItemStack(Items.DIAMOND_CHESTPLATE), new ItemStack(Items.DIAMOND_LEGGINGS), new ItemStack(Items.DIAMOND_BOOTS)).test(itemstack);
	}

	@Override
	public boolean isTreasureOnly() {
		return true;
	}

	@Override
	public boolean isCurse() {
		return true;
	}
}

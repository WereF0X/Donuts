
package net.mcreator.wardenmodother.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.wardenmodother.init.WardenModotherModItems;

public class Donut_nuggetAxeItem extends AxeItem {
	public Donut_nuggetAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 167;
			}

			public float getSpeed() {
				return 5f;
			}

			public float getAttackDamageBonus() {
				return 6f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 11;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(WardenModotherModItems.DONUTS.get()));
			}
		}, 1, -3f, new Item.Properties());
	}
}

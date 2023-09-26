
package net.mcreator.wardenmodother.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.wardenmodother.procedures.DonutnuggetSwordRightclickedProcedure;
import net.mcreator.wardenmodother.init.WardenModotherModItems;

public class Donut_nuggetSwordItem extends SwordItem {
	public Donut_nuggetSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 167;
			}

			public float getSpeed() {
				return 5f;
			}

			public float getAttackDamageBonus() {
				return 2.4f;
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
		}, 3, -2.4f, new Item.Properties());
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		DonutnuggetSwordRightclickedProcedure.execute(entity, ar.getObject());
		return ar;
	}
}

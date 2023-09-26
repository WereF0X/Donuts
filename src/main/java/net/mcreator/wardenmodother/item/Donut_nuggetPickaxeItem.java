
package net.mcreator.wardenmodother.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.core.BlockPos;

import net.mcreator.wardenmodother.procedures.DonutnuggetPickaxeItemIsCraftedsmeltedProcedure;
import net.mcreator.wardenmodother.procedures.DonutnuggetPickaxeBlockDestroyedWithToolProcedure;
import net.mcreator.wardenmodother.init.WardenModotherModItems;

public class Donut_nuggetPickaxeItem extends PickaxeItem {
	public Donut_nuggetPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 167;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 1f;
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
		}, 1, -2.8f, new Item.Properties());
	}

	@Override
	public boolean mineBlock(ItemStack itemstack, Level world, BlockState blockstate, BlockPos pos, LivingEntity entity) {
		boolean retval = super.mineBlock(itemstack, world, blockstate, pos, entity);
		DonutnuggetPickaxeBlockDestroyedWithToolProcedure.execute(itemstack);
		return retval;
	}

	@Override
	public void onCraftedBy(ItemStack itemstack, Level world, Player entity) {
		super.onCraftedBy(itemstack, world, entity);
		DonutnuggetPickaxeItemIsCraftedsmeltedProcedure.execute(itemstack);
	}
}

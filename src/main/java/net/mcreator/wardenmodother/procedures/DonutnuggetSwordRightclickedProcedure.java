package net.mcreator.wardenmodother.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;

public class DonutnuggetSwordRightclickedProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity instanceof Player _player)
			_player.getFoodData().setFoodLevel(50);
		if (entity instanceof Player _player)
			_player.getFoodData().setSaturation(50);
		{
			ItemStack _ist = itemstack;
			if (_ist.hurt(10, RandomSource.create(), null)) {
				_ist.shrink(1);
				_ist.setDamageValue(0);
			}
		}
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(itemstack.getItem(), 40);
	}
}

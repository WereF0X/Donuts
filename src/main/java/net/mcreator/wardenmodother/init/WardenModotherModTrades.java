
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.wardenmodother.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class WardenModotherModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.BUTCHER) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 5),

					new ItemStack(WardenModotherModItems.CHOCOLATEINGOT.get()), 8, 4, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(WardenModotherModItems.CHOCOLATEINGOT.get()),

					new ItemStack(Items.EMERALD, 4), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.CLERIC) {
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 48), new ItemStack(Items.BLAZE_POWDER, 4), new ItemStack(WardenModotherModItems.FIRE_WAND.get()), 1, 20, 0.11f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 64), new ItemStack(Items.BLAZE_ROD, 5), new ItemStack(WardenModotherModItems.ADVANCED_FIRE_HAND.get()), 1, 16, 0.2f));
		}
	}
}

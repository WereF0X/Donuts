
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wardenmodother.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.wardenmodother.client.gui.RecipesScreen;
import net.mcreator.wardenmodother.client.gui.Recipes7Screen;
import net.mcreator.wardenmodother.client.gui.Recipes6Screen;
import net.mcreator.wardenmodother.client.gui.Recipes5Screen;
import net.mcreator.wardenmodother.client.gui.Recipes4Screen;
import net.mcreator.wardenmodother.client.gui.Recipes3Screen;
import net.mcreator.wardenmodother.client.gui.Recipes2Screen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class WardenModotherModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(WardenModotherModMenus.RECIPES.get(), RecipesScreen::new);
			MenuScreens.register(WardenModotherModMenus.RECIPES_2.get(), Recipes2Screen::new);
			MenuScreens.register(WardenModotherModMenus.RECIPES_3.get(), Recipes3Screen::new);
			MenuScreens.register(WardenModotherModMenus.RECIPES_4.get(), Recipes4Screen::new);
			MenuScreens.register(WardenModotherModMenus.RECIPES_5.get(), Recipes5Screen::new);
			MenuScreens.register(WardenModotherModMenus.RECIPES_6.get(), Recipes6Screen::new);
			MenuScreens.register(WardenModotherModMenus.RECIPES_7.get(), Recipes7Screen::new);
		});
	}
}

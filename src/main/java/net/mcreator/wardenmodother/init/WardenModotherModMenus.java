
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wardenmodother.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.wardenmodother.world.inventory.RecipesMenu;
import net.mcreator.wardenmodother.world.inventory.Recipes7Menu;
import net.mcreator.wardenmodother.world.inventory.Recipes6Menu;
import net.mcreator.wardenmodother.world.inventory.Recipes5Menu;
import net.mcreator.wardenmodother.world.inventory.Recipes4Menu;
import net.mcreator.wardenmodother.world.inventory.Recipes3Menu;
import net.mcreator.wardenmodother.world.inventory.Recipes2Menu;
import net.mcreator.wardenmodother.WardenModotherMod;

public class WardenModotherModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, WardenModotherMod.MODID);
	public static final RegistryObject<MenuType<RecipesMenu>> RECIPES = REGISTRY.register("recipes", () -> IForgeMenuType.create(RecipesMenu::new));
	public static final RegistryObject<MenuType<Recipes2Menu>> RECIPES_2 = REGISTRY.register("recipes_2", () -> IForgeMenuType.create(Recipes2Menu::new));
	public static final RegistryObject<MenuType<Recipes3Menu>> RECIPES_3 = REGISTRY.register("recipes_3", () -> IForgeMenuType.create(Recipes3Menu::new));
	public static final RegistryObject<MenuType<Recipes4Menu>> RECIPES_4 = REGISTRY.register("recipes_4", () -> IForgeMenuType.create(Recipes4Menu::new));
	public static final RegistryObject<MenuType<Recipes5Menu>> RECIPES_5 = REGISTRY.register("recipes_5", () -> IForgeMenuType.create(Recipes5Menu::new));
	public static final RegistryObject<MenuType<Recipes6Menu>> RECIPES_6 = REGISTRY.register("recipes_6", () -> IForgeMenuType.create(Recipes6Menu::new));
	public static final RegistryObject<MenuType<Recipes7Menu>> RECIPES_7 = REGISTRY.register("recipes_7", () -> IForgeMenuType.create(Recipes7Menu::new));
}

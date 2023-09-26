
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wardenmodother.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.wardenmodother.item.WhitechocolateItem;
import net.mcreator.wardenmodother.item.Wc2Item;
import net.mcreator.wardenmodother.item.WardenArmorItem;
import net.mcreator.wardenmodother.item.SculkSwordItem;
import net.mcreator.wardenmodother.item.GoldenDonutArmorItem;
import net.mcreator.wardenmodother.item.GoldDonutDiggerItem;
import net.mcreator.wardenmodother.item.FireWandItem;
import net.mcreator.wardenmodother.item.EnchantedDonutItem;
import net.mcreator.wardenmodother.item.DonutsItem;
import net.mcreator.wardenmodother.item.Donut_nuggetSwordItem;
import net.mcreator.wardenmodother.item.Donut_nuggetShovelItem;
import net.mcreator.wardenmodother.item.Donut_nuggetPickaxeItem;
import net.mcreator.wardenmodother.item.Donut_nuggetHoeItem;
import net.mcreator.wardenmodother.item.Donut_nuggetAxeItem;
import net.mcreator.wardenmodother.item.Donut2Item;
import net.mcreator.wardenmodother.item.Dd2Item;
import net.mcreator.wardenmodother.item.ChocolateingotItem;
import net.mcreator.wardenmodother.item.ChocolateItem;
import net.mcreator.wardenmodother.item.C2Item;
import net.mcreator.wardenmodother.item.AdvancedFireHandItem;
import net.mcreator.wardenmodother.WardenModotherMod;

public class WardenModotherModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, WardenModotherMod.MODID);
	public static final RegistryObject<Item> WARDEN_ARMOR_HELMET = REGISTRY.register("warden_armor_helmet", () -> new WardenArmorItem.Helmet());
	public static final RegistryObject<Item> WARDEN_ARMOR_CHESTPLATE = REGISTRY.register("warden_armor_chestplate", () -> new WardenArmorItem.Chestplate());
	public static final RegistryObject<Item> WARDEN_ARMOR_LEGGINGS = REGISTRY.register("warden_armor_leggings", () -> new WardenArmorItem.Leggings());
	public static final RegistryObject<Item> WARDEN_ARMOR_BOOTS = REGISTRY.register("warden_armor_boots", () -> new WardenArmorItem.Boots());
	public static final RegistryObject<Item> SCULK_SWORD = REGISTRY.register("sculk_sword", () -> new SculkSwordItem());
	public static final RegistryObject<Item> DONUT_2 = REGISTRY.register("donut_2", () -> new Donut2Item());
	public static final RegistryObject<Item> DONUT = block(WardenModotherModBlocks.DONUT);
	public static final RegistryObject<Item> CHOCOLATE_BUCKET = REGISTRY.register("chocolate_bucket", () -> new ChocolateItem());
	public static final RegistryObject<Item> CHOCOLATEINGOT = REGISTRY.register("chocolateingot", () -> new ChocolateingotItem());
	public static final RegistryObject<Item> FIRE_WAND = REGISTRY.register("fire_wand", () -> new FireWandItem());
	public static final RegistryObject<Item> ADVANCED_FIRE_HAND = REGISTRY.register("advanced_fire_hand", () -> new AdvancedFireHandItem());
	public static final RegistryObject<Item> ENCHANTED_DONUT = REGISTRY.register("enchanted_donut", () -> new EnchantedDonutItem());
	public static final RegistryObject<Item> DONUTBOSS_SPAWN_EGG = REGISTRY.register("donutboss_spawn_egg", () -> new ForgeSpawnEggItem(WardenModotherModEntities.DONUTBOSS, -36372, -10079488, new Item.Properties()));
	public static final RegistryObject<Item> GOLDDONUTBLOCK = block(WardenModotherModBlocks.GOLDDONUTBLOCK);
	public static final RegistryObject<Item> WHITECHOCOLATE_BUCKET = REGISTRY.register("whitechocolate_bucket", () -> new WhitechocolateItem());
	public static final RegistryObject<Item> GOLD_DONUT_DIGGER = REGISTRY.register("gold_donut_digger", () -> new GoldDonutDiggerItem());
	public static final RegistryObject<Item> DONUTS = REGISTRY.register("donuts", () -> new DonutsItem());
	public static final RegistryObject<Item> DONUTS_ORE = block(WardenModotherModBlocks.DONUTS_ORE);
	public static final RegistryObject<Item> DONUT_NUGGET_PICKAXE = REGISTRY.register("donut_nugget_pickaxe", () -> new Donut_nuggetPickaxeItem());
	public static final RegistryObject<Item> DONUT_NUGGET_AXE = REGISTRY.register("donut_nugget_axe", () -> new Donut_nuggetAxeItem());
	public static final RegistryObject<Item> DONUT_NUGGET_SWORD = REGISTRY.register("donut_nugget_sword", () -> new Donut_nuggetSwordItem());
	public static final RegistryObject<Item> DONUT_NUGGET_SHOVEL = REGISTRY.register("donut_nugget_shovel", () -> new Donut_nuggetShovelItem());
	public static final RegistryObject<Item> DONUT_NUGGET_HOE = REGISTRY.register("donut_nugget_hoe", () -> new Donut_nuggetHoeItem());
	public static final RegistryObject<Item> GOLDEN_DONUT_ARMOR_HELMET = REGISTRY.register("golden_donut_armor_helmet", () -> new GoldenDonutArmorItem.Helmet());
	public static final RegistryObject<Item> GOLDEN_DONUT_ARMOR_CHESTPLATE = REGISTRY.register("golden_donut_armor_chestplate", () -> new GoldenDonutArmorItem.Chestplate());
	public static final RegistryObject<Item> GOLDEN_DONUT_ARMOR_LEGGINGS = REGISTRY.register("golden_donut_armor_leggings", () -> new GoldenDonutArmorItem.Leggings());
	public static final RegistryObject<Item> GOLDEN_DONUT_ARMOR_BOOTS = REGISTRY.register("golden_donut_armor_boots", () -> new GoldenDonutArmorItem.Boots());
	public static final RegistryObject<Item> C_2_BUCKET = REGISTRY.register("c_2_bucket", () -> new C2Item());
	public static final RegistryObject<Item> DD_2 = REGISTRY.register("dd_2", () -> new Dd2Item());
	public static final RegistryObject<Item> WC_2_BUCKET = REGISTRY.register("wc_2_bucket", () -> new Wc2Item());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}

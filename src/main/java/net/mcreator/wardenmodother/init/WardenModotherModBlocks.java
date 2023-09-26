
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wardenmodother.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.wardenmodother.block.WhitechocolateBlock;
import net.mcreator.wardenmodother.block.Wc2Block;
import net.mcreator.wardenmodother.block.GolddonutblockBlock;
import net.mcreator.wardenmodother.block.DonutsOreBlock;
import net.mcreator.wardenmodother.block.DonutBlock;
import net.mcreator.wardenmodother.block.Dd2PortalBlock;
import net.mcreator.wardenmodother.block.ChocolateBlock;
import net.mcreator.wardenmodother.block.C2Block;
import net.mcreator.wardenmodother.WardenModotherMod;

public class WardenModotherModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, WardenModotherMod.MODID);
	public static final RegistryObject<Block> DONUT = REGISTRY.register("donut", () -> new DonutBlock());
	public static final RegistryObject<Block> CHOCOLATE = REGISTRY.register("chocolate", () -> new ChocolateBlock());
	public static final RegistryObject<Block> GOLDDONUTBLOCK = REGISTRY.register("golddonutblock", () -> new GolddonutblockBlock());
	public static final RegistryObject<Block> WHITECHOCOLATE = REGISTRY.register("whitechocolate", () -> new WhitechocolateBlock());
	public static final RegistryObject<Block> DONUTS_ORE = REGISTRY.register("donuts_ore", () -> new DonutsOreBlock());
	public static final RegistryObject<Block> C_2 = REGISTRY.register("c_2", () -> new C2Block());
	public static final RegistryObject<Block> DD_2_PORTAL = REGISTRY.register("dd_2_portal", () -> new Dd2PortalBlock());
	public static final RegistryObject<Block> WC_2 = REGISTRY.register("wc_2", () -> new Wc2Block());
}

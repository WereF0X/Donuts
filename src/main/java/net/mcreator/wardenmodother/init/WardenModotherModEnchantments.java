
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wardenmodother.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.wardenmodother.enchantment.SculkAffinityEnchantment;
import net.mcreator.wardenmodother.WardenModotherMod;

public class WardenModotherModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, WardenModotherMod.MODID);
	public static final RegistryObject<Enchantment> SCULK_AFFINITY = REGISTRY.register("sculk_affinity", () -> new SculkAffinityEnchantment());
}

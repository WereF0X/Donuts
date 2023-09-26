
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wardenmodother.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.wardenmodother.WardenModotherMod;

public class WardenModotherModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, WardenModotherMod.MODID);
	public static final RegistryObject<Potion> SUGAR_O_VERDOSE_POTION = REGISTRY.register("sugar_o_verdose_potion", () -> new Potion(new MobEffectInstance(WardenModotherModMobEffects.SUGAR_OVERDOSE.get(), 3600, 0, false, true)));
}

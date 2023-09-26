
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wardenmodother.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.wardenmodother.potion.SugarOverdoseMobEffect;
import net.mcreator.wardenmodother.WardenModotherMod;

public class WardenModotherModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, WardenModotherMod.MODID);
	public static final RegistryObject<MobEffect> SUGAR_OVERDOSE = REGISTRY.register("sugar_overdose", () -> new SugarOverdoseMobEffect());
}

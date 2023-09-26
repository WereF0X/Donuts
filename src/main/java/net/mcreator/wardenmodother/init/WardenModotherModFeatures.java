
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wardenmodother.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.wardenmodother.world.features.ores.GolddonutblockFeature;
import net.mcreator.wardenmodother.world.features.ores.DonutsOreFeature;
import net.mcreator.wardenmodother.world.features.ores.DonutFeature;
import net.mcreator.wardenmodother.world.features.WhitechocolateFeatureFeature;
import net.mcreator.wardenmodother.world.features.Wc2FeatureFeature;
import net.mcreator.wardenmodother.world.features.ChocolateFeatureFeature;
import net.mcreator.wardenmodother.world.features.C2FeatureFeature;
import net.mcreator.wardenmodother.WardenModotherMod;

@Mod.EventBusSubscriber
public class WardenModotherModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, WardenModotherMod.MODID);
	public static final RegistryObject<Feature<?>> DONUT = REGISTRY.register("donut", DonutFeature::new);
	public static final RegistryObject<Feature<?>> GOLDDONUTBLOCK = REGISTRY.register("golddonutblock", GolddonutblockFeature::new);
	public static final RegistryObject<Feature<?>> DONUTS_ORE = REGISTRY.register("donuts_ore", DonutsOreFeature::new);
	public static final RegistryObject<Feature<?>> CHOCOLATE_FEATURE = REGISTRY.register("chocolate_feature", ChocolateFeatureFeature::new);
	public static final RegistryObject<Feature<?>> WHITECHOCOLATE_FEATURE = REGISTRY.register("whitechocolate_feature", WhitechocolateFeatureFeature::new);
	public static final RegistryObject<Feature<?>> C_2_FEATURE = REGISTRY.register("c_2_feature", C2FeatureFeature::new);
	public static final RegistryObject<Feature<?>> WC_2_FEATURE = REGISTRY.register("wc_2_feature", Wc2FeatureFeature::new);
}

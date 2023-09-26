
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wardenmodother.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.wardenmodother.fluid.types.WhitechocolateFluidType;
import net.mcreator.wardenmodother.fluid.types.Wc2FluidType;
import net.mcreator.wardenmodother.fluid.types.ChocolateFluidType;
import net.mcreator.wardenmodother.fluid.types.C2FluidType;
import net.mcreator.wardenmodother.WardenModotherMod;

public class WardenModotherModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, WardenModotherMod.MODID);
	public static final RegistryObject<FluidType> CHOCOLATE_TYPE = REGISTRY.register("chocolate", () -> new ChocolateFluidType());
	public static final RegistryObject<FluidType> WHITECHOCOLATE_TYPE = REGISTRY.register("whitechocolate", () -> new WhitechocolateFluidType());
	public static final RegistryObject<FluidType> C_2_TYPE = REGISTRY.register("c_2", () -> new C2FluidType());
	public static final RegistryObject<FluidType> WC_2_TYPE = REGISTRY.register("wc_2", () -> new Wc2FluidType());
}

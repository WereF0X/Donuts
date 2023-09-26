
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wardenmodother.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.wardenmodother.fluid.WhitechocolateFluid;
import net.mcreator.wardenmodother.fluid.Wc2Fluid;
import net.mcreator.wardenmodother.fluid.ChocolateFluid;
import net.mcreator.wardenmodother.fluid.C2Fluid;
import net.mcreator.wardenmodother.WardenModotherMod;

public class WardenModotherModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, WardenModotherMod.MODID);
	public static final RegistryObject<FlowingFluid> CHOCOLATE = REGISTRY.register("chocolate", () -> new ChocolateFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_CHOCOLATE = REGISTRY.register("flowing_chocolate", () -> new ChocolateFluid.Flowing());
	public static final RegistryObject<FlowingFluid> WHITECHOCOLATE = REGISTRY.register("whitechocolate", () -> new WhitechocolateFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_WHITECHOCOLATE = REGISTRY.register("flowing_whitechocolate", () -> new WhitechocolateFluid.Flowing());
	public static final RegistryObject<FlowingFluid> C_2 = REGISTRY.register("c_2", () -> new C2Fluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_C_2 = REGISTRY.register("flowing_c_2", () -> new C2Fluid.Flowing());
	public static final RegistryObject<FlowingFluid> WC_2 = REGISTRY.register("wc_2", () -> new Wc2Fluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_WC_2 = REGISTRY.register("flowing_wc_2", () -> new Wc2Fluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(CHOCOLATE.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_CHOCOLATE.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(WHITECHOCOLATE.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_WHITECHOCOLATE.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(C_2.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_C_2.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(WC_2.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_WC_2.get(), RenderType.translucent());
		}
	}
}

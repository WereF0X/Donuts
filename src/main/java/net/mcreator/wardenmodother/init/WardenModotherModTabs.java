
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wardenmodother.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.wardenmodother.WardenModotherMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class WardenModotherModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WardenModotherMod.MODID);
	public static final RegistryObject<CreativeModeTab> TESTING = REGISTRY.register("testing",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.warden_modother.testing")).icon(() -> new ItemStack(Blocks.BARRIER)).displayItems((parameters, tabData) -> {
				tabData.accept(WardenModotherModItems.WARDEN_ARMOR_HELMET.get());
				tabData.accept(WardenModotherModItems.WARDEN_ARMOR_CHESTPLATE.get());
				tabData.accept(WardenModotherModItems.WARDEN_ARMOR_LEGGINGS.get());
				tabData.accept(WardenModotherModItems.WARDEN_ARMOR_BOOTS.get());
				tabData.accept(WardenModotherModItems.SCULK_SWORD.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> DONUT_MOD_ADDONS = REGISTRY.register("donut_mod_addons",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.warden_modother.donut_mod_addons")).icon(() -> new ItemStack(WardenModotherModItems.DONUT_2.get())).displayItems((parameters, tabData) -> {
				tabData.accept(WardenModotherModItems.DONUT_2.get());
				tabData.accept(WardenModotherModBlocks.DONUT.get().asItem());
				tabData.accept(WardenModotherModItems.CHOCOLATEINGOT.get());
				tabData.accept(WardenModotherModItems.FIRE_WAND.get());
				tabData.accept(WardenModotherModItems.ADVANCED_FIRE_HAND.get());
				tabData.accept(WardenModotherModItems.ENCHANTED_DONUT.get());
				tabData.accept(WardenModotherModItems.DONUTBOSS_SPAWN_EGG.get());
				tabData.accept(WardenModotherModBlocks.GOLDDONUTBLOCK.get().asItem());
				tabData.accept(WardenModotherModItems.GOLD_DONUT_DIGGER.get());
				tabData.accept(WardenModotherModItems.DONUTS.get());
				tabData.accept(WardenModotherModBlocks.DONUTS_ORE.get().asItem());
				tabData.accept(WardenModotherModItems.DONUT_NUGGET_PICKAXE.get());
				tabData.accept(WardenModotherModItems.DONUT_NUGGET_AXE.get());
				tabData.accept(WardenModotherModItems.DONUT_NUGGET_SWORD.get());
				tabData.accept(WardenModotherModItems.DONUT_NUGGET_SHOVEL.get());
				tabData.accept(WardenModotherModItems.DONUT_NUGGET_HOE.get());
				tabData.accept(WardenModotherModItems.GOLDEN_DONUT_ARMOR_HELMET.get());
				tabData.accept(WardenModotherModItems.GOLDEN_DONUT_ARMOR_CHESTPLATE.get());
				tabData.accept(WardenModotherModItems.GOLDEN_DONUT_ARMOR_LEGGINGS.get());
				tabData.accept(WardenModotherModItems.GOLDEN_DONUT_ARMOR_BOOTS.get());
				tabData.accept(WardenModotherModItems.C_2_BUCKET.get());
				tabData.accept(WardenModotherModItems.DD_2.get());
				tabData.accept(WardenModotherModItems.WC_2_BUCKET.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(WardenModotherModItems.CHOCOLATE_BUCKET.get());
			tabData.accept(WardenModotherModItems.WHITECHOCOLATE_BUCKET.get());
		}
	}
}

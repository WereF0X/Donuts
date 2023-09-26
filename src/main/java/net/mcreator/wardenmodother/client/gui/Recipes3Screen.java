package net.mcreator.wardenmodother.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.wardenmodother.world.inventory.Recipes3Menu;
import net.mcreator.wardenmodother.network.Recipes3ButtonMessage;
import net.mcreator.wardenmodother.WardenModotherMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class Recipes3Screen extends AbstractContainerScreen<Recipes3Menu> {
	private final static HashMap<String, Object> guistate = Recipes3Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_next;

	public Recipes3Screen(Recipes3Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("warden_modother:textures/screens/recipes_3.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("warden_modother:textures/screens/wand1.png"), this.leftPos + 8, this.topPos + 10, 0, 0, 150, 70, 150, 70);

		guiGraphics.blit(new ResourceLocation("warden_modother:textures/screens/wand2.png"), this.leftPos + 10, this.topPos + 77, 0, 0, 150, 70, 150, 70);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.warden_modother.recipes_3.label_recipes"), 64, 2, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_next = Button.builder(Component.translatable("gui.warden_modother.recipes_3.button_next"), e -> {
			if (true) {
				WardenModotherMod.PACKET_HANDLER.sendToServer(new Recipes3ButtonMessage(0, x, y, z));
				Recipes3ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 126, this.topPos + 2, 46, 20).build();
		guistate.put("button:button_next", button_next);
		this.addRenderableWidget(button_next);
	}
}

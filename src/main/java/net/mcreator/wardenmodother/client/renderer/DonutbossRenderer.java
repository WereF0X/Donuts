
package net.mcreator.wardenmodother.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.WitchModel;

import net.mcreator.wardenmodother.entity.DonutbossEntity;

public class DonutbossRenderer extends MobRenderer<DonutbossEntity, WitchModel<DonutbossEntity>> {
	public DonutbossRenderer(EntityRendererProvider.Context context) {
		super(context, new WitchModel(context.bakeLayer(ModelLayers.WITCH)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DonutbossEntity entity) {
		return new ResourceLocation("warden_modother:textures/entities/satan_incognito.png");
	}
}


package net.mcreator.wardenmodother.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.wardenmodother.procedures.SugarOverdoseEffectStartedappliedProcedure;
import net.mcreator.wardenmodother.procedures.SugarOverdoseEffectExpiresProcedure;

public class SugarOverdoseMobEffect extends MobEffect {
	public SugarOverdoseMobEffect() {
		super(MobEffectCategory.HARMFUL, -3342388);
	}

	@Override
	public String getDescriptionId() {
		return "effect.warden_modother.sugar_overdose";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		SugarOverdoseEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		SugarOverdoseEffectExpiresProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}

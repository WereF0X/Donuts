
package net.mcreator.wardenmodother.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.wardenmodother.init.WardenModotherModItems;
import net.mcreator.wardenmodother.init.WardenModotherModFluids;
import net.mcreator.wardenmodother.init.WardenModotherModFluidTypes;
import net.mcreator.wardenmodother.init.WardenModotherModBlocks;

public abstract class Wc2Fluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> WardenModotherModFluidTypes.WC_2_TYPE.get(), () -> WardenModotherModFluids.WC_2.get(), () -> WardenModotherModFluids.FLOWING_WC_2.get())
			.explosionResistance(100f).bucket(() -> WardenModotherModItems.WC_2_BUCKET.get()).block(() -> (LiquidBlock) WardenModotherModBlocks.WC_2.get());

	private Wc2Fluid() {
		super(PROPERTIES);
	}

	public static class Source extends Wc2Fluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends Wc2Fluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}

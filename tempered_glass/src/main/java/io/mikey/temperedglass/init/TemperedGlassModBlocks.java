
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.mikey.temperedglass.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import io.mikey.temperedglass.block.TemperedGlassTrapdoorBlock;
import io.mikey.temperedglass.block.TemperedGlassSlabBlock;
import io.mikey.temperedglass.block.TemperedGlassRodBlock;
import io.mikey.temperedglass.block.TemperedGlassPaneBlock;
import io.mikey.temperedglass.block.TemperedGlassFenceGateBlock;
import io.mikey.temperedglass.block.TemperedGlassFenceBlock;
import io.mikey.temperedglass.block.TemperedGlassBlock;
import io.mikey.temperedglass.TemperedGlassMod;

public class TemperedGlassModBlocks {
	public static Block TEMPERED_GLASS;
	public static Block TEMPERED_GLASS_SLAB;
	public static Block TEMPERED_GLASS_TRAPDOOR;
	public static Block TEMPERED_GLASS_PANE;
	public static Block TEMPERED_GLASS_FENCE;
	public static Block TEMPERED_GLASS_FENCE_GATE;
	public static Block TEMPERED_GLASS_ROD;

	public static void load() {
		TEMPERED_GLASS = Registry.register(Registry.BLOCK, new ResourceLocation(TemperedGlassMod.MODID, "tempered_glass"), new TemperedGlassBlock());
		TEMPERED_GLASS_SLAB = Registry.register(Registry.BLOCK, new ResourceLocation(TemperedGlassMod.MODID, "tempered_glass_slab"),
				new TemperedGlassSlabBlock());
		TEMPERED_GLASS_TRAPDOOR = Registry.register(Registry.BLOCK, new ResourceLocation(TemperedGlassMod.MODID, "tempered_glass_trapdoor"),
				new TemperedGlassTrapdoorBlock());
		TEMPERED_GLASS_PANE = Registry.register(Registry.BLOCK, new ResourceLocation(TemperedGlassMod.MODID, "tempered_glass_pane"),
				new TemperedGlassPaneBlock());
		TEMPERED_GLASS_FENCE = Registry.register(Registry.BLOCK, new ResourceLocation(TemperedGlassMod.MODID, "tempered_glass_fence"),
				new TemperedGlassFenceBlock());
		TEMPERED_GLASS_FENCE_GATE = Registry.register(Registry.BLOCK, new ResourceLocation(TemperedGlassMod.MODID, "tempered_glass_fence_gate"),
				new TemperedGlassFenceGateBlock());
		TEMPERED_GLASS_ROD = Registry.register(Registry.BLOCK, new ResourceLocation(TemperedGlassMod.MODID, "tempered_glass_rod"),
				new TemperedGlassRodBlock());
	}

	public static void clientLoad() {
		TemperedGlassBlock.clientInit();
		TemperedGlassSlabBlock.clientInit();
		TemperedGlassTrapdoorBlock.clientInit();
		TemperedGlassPaneBlock.clientInit();
		TemperedGlassFenceBlock.clientInit();
		TemperedGlassFenceGateBlock.clientInit();
		TemperedGlassRodBlock.clientInit();
	}
}

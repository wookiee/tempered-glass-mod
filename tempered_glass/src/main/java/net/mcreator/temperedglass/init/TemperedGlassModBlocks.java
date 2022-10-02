
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.temperedglass.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.temperedglass.block.TemperedGlassTrapdoorBlock;
import net.mcreator.temperedglass.block.TemperedGlassSlabBlock;
import net.mcreator.temperedglass.block.TemperedGlassRodBlock;
import net.mcreator.temperedglass.block.TemperedGlassPaneBlock;
import net.mcreator.temperedglass.block.TemperedGlassFenceGateBlock;
import net.mcreator.temperedglass.block.TemperedGlassFenceBlock;
import net.mcreator.temperedglass.block.TemperedGlassBlock;
import net.mcreator.temperedglass.TemperedGlassMod;

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

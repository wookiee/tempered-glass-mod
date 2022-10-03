
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.mikey.temperedglass.init;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import io.mikey.temperedglass.item.TemperedGlassDowelItem;
import io.mikey.temperedglass.TemperedGlassMod;

public class TemperedGlassModItems {
	public static Item TEMPERED_GLASS;
	public static Item TEMPERED_GLASS_SLAB;
	public static Item TEMPERED_GLASS_TRAPDOOR;
	public static Item TEMPERED_GLASS_PANE;
	public static Item TEMPERED_GLASS_FENCE;
	public static Item TEMPERED_GLASS_FENCE_GATE;
	public static Item TEMPERED_GLASS_ROD;
	public static Item TEMPERED_GLASS_DOWEL;

	public static void load() {
		TEMPERED_GLASS = Registry.register(Registry.ITEM, new ResourceLocation(TemperedGlassMod.MODID, "tempered_glass"),
				new BlockItem(TemperedGlassModBlocks.TEMPERED_GLASS, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
		TEMPERED_GLASS_SLAB = Registry.register(Registry.ITEM, new ResourceLocation(TemperedGlassMod.MODID, "tempered_glass_slab"),
				new BlockItem(TemperedGlassModBlocks.TEMPERED_GLASS_SLAB, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
		TEMPERED_GLASS_TRAPDOOR = Registry.register(Registry.ITEM, new ResourceLocation(TemperedGlassMod.MODID, "tempered_glass_trapdoor"),
				new BlockItem(TemperedGlassModBlocks.TEMPERED_GLASS_TRAPDOOR, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
		TEMPERED_GLASS_PANE = Registry.register(Registry.ITEM, new ResourceLocation(TemperedGlassMod.MODID, "tempered_glass_pane"),
				new BlockItem(TemperedGlassModBlocks.TEMPERED_GLASS_PANE, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
		TEMPERED_GLASS_FENCE = Registry.register(Registry.ITEM, new ResourceLocation(TemperedGlassMod.MODID, "tempered_glass_fence"),
				new BlockItem(TemperedGlassModBlocks.TEMPERED_GLASS_FENCE, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
		TEMPERED_GLASS_FENCE_GATE = Registry.register(Registry.ITEM, new ResourceLocation(TemperedGlassMod.MODID, "tempered_glass_fence_gate"),
				new BlockItem(TemperedGlassModBlocks.TEMPERED_GLASS_FENCE_GATE, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
		TEMPERED_GLASS_ROD = Registry.register(Registry.ITEM, new ResourceLocation(TemperedGlassMod.MODID, "tempered_glass_rod"),
				new BlockItem(TemperedGlassModBlocks.TEMPERED_GLASS_ROD, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
		TEMPERED_GLASS_DOWEL = Registry.register(Registry.ITEM, new ResourceLocation(TemperedGlassMod.MODID, "tempered_glass_dowel"),
				new TemperedGlassDowelItem());
	}
}

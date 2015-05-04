package com.kreezxil.prismatics.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks {
	
	public static Block quartz_glass;
	public static Block prism;
	public static Block refraction_mirror;
	public static Block mirror_panel;
	public static Block mirror_frame;
	public static Block sticky_mirror_frame;
	public static Block sticky_refraction_mirror;

	public static void createBlocks() {
		//GameRegistry.registerBlock(block_quartz_glass = new PrismBlock("block_quartz_glass",Material.glass, 1.0f, 2.0f),"block_quartz_glass");
		GameRegistry.registerBlock(quartz_glass = new GlassBlock("quartz_glass"), "quartz_glass");
		GameRegistry.registerBlock(prism = new PrismBlock("prism"), "prism");
		
		GameRegistry.registerBlock(mirror_panel = new UnplaceableGlassBlock("mirror_panel"),"mirror_panel");
		
		GameRegistry.registerBlock(mirror_frame = new UnplaceableGlassBlock("mirror_frame"),"mirror_frame");
		GameRegistry.registerBlock(refraction_mirror = new RefractionMirror("refraction_mirror"), "refraction_mirror");

		GameRegistry.registerBlock(sticky_mirror_frame = new UnplaceableGlassBlock("sticky_mirror_frame"), "sticky_mirror_frame");
		GameRegistry.registerBlock(sticky_refraction_mirror = new StickyRefractionMirror("sticky_refraction_mirror"),"sticky_refraction_mirror");
	}
}
//fuh
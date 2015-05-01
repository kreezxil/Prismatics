package com.kreezxil.prismatics.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks {
	
	public static Block block_quartz_glass;
	public static Block block_prism;
	public static Block refraction_mirror;
	public static Block mirror_panel;
	public static Block mirror_frame;

	public static void createBlocks() {
		//GameRegistry.registerBlock(block_quartz_glass = new PrismBlock("block_quartz_glass",Material.glass, 1.0f, 2.0f),"block_quartz_glass");
		GameRegistry.registerBlock(block_quartz_glass = new GlassBlock("block_quartz_glass"), "block_quartz_glass");
		GameRegistry.registerBlock(block_prism = new PrismBlock("block_prism"), "block_prism");
		GameRegistry.registerBlock(refraction_mirror = new RefractionMirror("refraction_mirror"), "refraction_mirror");
		GameRegistry.registerBlock(mirror_panel = new UnplaceableGlassBlock("mirror_panel"),"mirror_panel");
		GameRegistry.registerBlock(mirror_frame = new UnplaceableGlassBlock("mirror_frame"),"mirror_frame");
	}
}
//fuh
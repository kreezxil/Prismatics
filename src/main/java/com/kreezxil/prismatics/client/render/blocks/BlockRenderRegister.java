package com.kreezxil.prismatics.client.render.blocks;

import com.kreezxil.prismatics.Prismatics;
import com.kreezxil.prismatics.blocks.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class BlockRenderRegister {
	
	public static String modid = Prismatics.MODID;
	
	public static void reg(Block block) {
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(modid + ":" + block.getUnlocalizedName().substring(5), "inventory"));
	}
	
	public static void registerBlockRenderer() {
		reg(ModBlocks.block_prism);
		reg(ModBlocks.block_quartz_glass);
		reg(ModBlocks.refraction_mirror);
		reg(ModBlocks.mirror_frame);
		reg(ModBlocks.mirror_panel);
	}
}
//fuh
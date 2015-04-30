package com.kreezxil.prismatics;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.kreezxil.prismatics.blocks.ModBlocks;
import com.kreezxil.prismatics.crafting.ModCrafting;
import com.kreezxil.prismatics.crafting.OreDict;
import com.kreezxil.prismatics.items.ModItems;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent event) {
		ModItems.createItems();
		ModBlocks.createBlocks();
	}
	
	public void init(FMLInitializationEvent event) {
		ModCrafting.initCrafting();
	}
	
	public void postInit(FMLPostInitializationEvent event) {
		OreDict.registerOre("block_quartz_glass", ModBlocks.block_quartz_glass);
		OreDict.registerOre("block_prism", ModBlocks.block_prism);
	}
}
//fuh
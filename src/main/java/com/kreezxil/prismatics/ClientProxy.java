package com.kreezxil.prismatics;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import com.kreezxil.prismatics.blocks.ModBlocks;
import com.kreezxil.prismatics.client.render.blocks.BlockRenderRegister;
import com.kreezxil.prismatics.client.render.items.ItemRenderRegister;

public class ClientProxy extends CommonProxy {

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		// TODO Auto-generated method stub
		super.init(event);
		
		ItemRenderRegister.registerItemRenderer();
		BlockRenderRegister.registerBlockRenderer();
	}

	@Override
	public void postInit(FMLPostInitializationEvent event) {
		// TODO Auto-generated method stub
		super.postInit(event);
	}

	//Didn't need the following at all
	/*
	@SubscribeEvent
	public void glassDrop(BreakEvent event) {
		if (event.equals(ModBlocks.block_prism)) {
			EntityItem item = new EntityItem(event.world, 0, 0, 0, new ItemStack(Item.getItemFromBlock(ModBlocks.block_prism)));
		}
		if ( event.equals(ModBlocks.block_quartz_glass)) {
			EntityItem item = new EntityItem(event.world, 0, 0, 0, new ItemStack(Item.getItemFromBlock(ModBlocks.block_quartz_glass)));
		}
	}
	*/
}

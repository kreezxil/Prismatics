package com.kreezxil.prismatics.items;

import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems {
	
	public static Item item_diamond_file;
	public static Item item_diamond_file_tooth;
	public static Item item_diamond_file_head;
	
	public static void createItems() {
		GameRegistry.registerItem(item_diamond_file = new durableCraftingTool("item_diamond_file"),"item_diamond_file");
		GameRegistry.registerItem(item_diamond_file_tooth = new BasicItem("item_diamond_file_tooth"),"item_diamond_file_tooth");
		GameRegistry.registerItem(item_diamond_file_head = new BasicItem("item_diamond_file_head"), "item_diamond_file_head");
	}
}
//fuh
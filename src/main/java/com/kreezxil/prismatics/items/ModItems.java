package com.kreezxil.prismatics.items;

import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems {
	
	public static Item diamond_file;
	public static Item diamond_file_tooth;
	public static Item diamond_file_head;
	public static Item slime_stick;
	
	public static void createItems() {
		GameRegistry.registerItem(diamond_file = new durableCraftingTool("diamond_file"),"diamond_file");
		GameRegistry.registerItem(diamond_file_tooth = new BasicItem("diamond_file_tooth"),"diamond_file_tooth");
		GameRegistry.registerItem(diamond_file_head = new BasicItem("diamond_file_head"), "diamond_file_head");
		GameRegistry.registerItem(slime_stick = new BasicItem("slime_stick"), "slime_stick");
	}
}
//fuh
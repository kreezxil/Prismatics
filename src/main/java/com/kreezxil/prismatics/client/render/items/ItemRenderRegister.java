package com.kreezxil.prismatics.client.render.items;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

import com.kreezxil.prismatics.Prismatics;
import com.kreezxil.prismatics.items.ModItems;

public class ItemRenderRegister {
	
	public static String modid = Prismatics.MODID;
	
	public static void reg(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
	public static void registerItemRenderer() {
		//reg(ModItems.item_prism);
		//reg(ModItems.item_quartz_glass);
		reg(ModItems.item_diamond_file);
		reg(ModItems.item_diamond_file_tooth);
		reg(ModItems.item_diamond_file_head);
	}

}
//fuh
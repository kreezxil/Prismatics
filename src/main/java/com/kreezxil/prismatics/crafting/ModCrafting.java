package com.kreezxil.prismatics.crafting;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import com.kreezxil.prismatics.blocks.ModBlocks;
import com.kreezxil.prismatics.items.ModItems;

public class ModCrafting {

	public static ShapedOreRecipe shapedRecipe;
	
	public static void initCrafting() {
		shapedRecipe = new ShapedOreRecipe(new ItemStack(ModItems.diamond_file), "#", "s", '#', ModItems.diamond_file_head, 's', Items.stick);
		GameRegistry.addRecipe(shapedRecipe);
		
		shapedRecipe = new ShapedOreRecipe(new ItemStack(ModItems.diamond_file), "#", "s", '#', ModItems.diamond_file_head, 's', Items.stick);
		GameRegistry.addRecipe(shapedRecipe);
		
		shapedRecipe = new ShapedOreRecipe(new ItemStack(ModItems.diamond_file_head),"#","#","#",'#',ModItems.diamond_file_tooth);
		GameRegistry.addRecipe(shapedRecipe);
		
		shapedRecipe = new ShapedOreRecipe(new ItemStack(ModItems.diamond_file_tooth),"#","F",'#',Items.diamond,'F',Items.flint);
		GameRegistry.addRecipe(shapedRecipe);
		
		
		//recipe = new ShapedOreRecipe(new ItemStack(ModBlocks.block_prism),"FQ",'F',ModItems.item_diamond_file.setContainerItem(ModItems.item_diamond_file),'Q',ModBlocks.block_quartz_glass);
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.prism),"FQ",'F',new ItemStack(ModItems.diamond_file, 1, OreDictionary.WILDCARD_VALUE),'Q',ModBlocks.quartz_glass);
		
		GameRegistry.addSmelting(Blocks.quartz_block, new ItemStack(ModBlocks.quartz_glass), 1.0F);
		
		shapedRecipe = new ShapedOreRecipe(new ItemStack(ModBlocks.mirror_frame),
				"# #",
				" # ",
				"# #",
				'#',Items.stick);
		GameRegistry.addRecipe(shapedRecipe);
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.mirror_panel),
				Items.clay_ball, Blocks.glass_pane);
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.refraction_mirror), ModBlocks.mirror_frame, ModBlocks.mirror_panel);
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.slime_stick), Items.slime_ball, Items.stick);
		
		shapedRecipe = new ShapedOreRecipe(new ItemStack(ModBlocks.sticky_mirror_frame),
				"S S",
				" # ",
				"# #",
				'S',ModItems.slime_stick,
				'#',Items.stick);
		GameRegistry.addRecipe(shapedRecipe);
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.sticky_refraction_mirror), ModBlocks.sticky_mirror_frame, ModBlocks.mirror_panel);
	}

}
//fuh
package com.kreezxil.prismatics.items;

import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraftforge.common.util.EnumHelper;

import com.google.common.collect.Sets;

public class durableCraftingTool extends ItemTool {

  //public static ToolMaterial DIAMONDFILE = EnumHelper.addToolMaterial("DIAMONDFILE", harvestLevel, maxUses, efficiency, damage, enchantability)//addToolMaterial("PRISMATICS", harvestLevel, durability, miningSpeed, damageVsEntities, enchantability);
	public static ToolMaterial DIAMONDFILE = EnumHelper.addToolMaterial("DIAMONDFILE", 0, 3000, 2.0f, 0.5f, 22);
    private static final Set EFFECTIVE_ON = Sets.newHashSet(new Block[] {Blocks.air});

	public durableCraftingTool(String unlocalizedName, float attackDamage, ToolMaterial material, Set effectiveBlocks) {
		super(attackDamage, material, effectiveBlocks);
		this.setUnlocalizedName(unlocalizedName);
	}
	
	public durableCraftingTool(String unlocalizedname, ToolMaterial material, Set effectiveBlocks) {
		this(unlocalizedname, 0.0f, material, (Set) effectiveBlocks);
	}

	public durableCraftingTool(String unlocalizedname) {
		this(unlocalizedname, DIAMONDFILE, EFFECTIVE_ON);
	}
	
	@Override
	public boolean hasContainerItem(ItemStack itemstack) {
		return true;
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemstack) {
		itemstack.attemptDamageItem(1, this.itemRand);
		return itemstack;
	}
	
}
//fuh
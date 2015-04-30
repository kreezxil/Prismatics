package com.kreezxil.prismatics.blocks;

import java.util.Random;

import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class GlassBlock extends BlockGlass {
	
	private static final boolean ignoreSimilarity = false;

	public GlassBlock(String unlocalizedName, Material material, float hardness, float resistance, boolean ignoreSimilarity) {
		super(material, ignoreSimilarity);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setStepSound(soundTypeGlass);
	}
	
	public GlassBlock(String unlocalizedName, Material material, float hardness, float resistance) {
		this(unlocalizedName, material, hardness, resistance, ignoreSimilarity);
	}

	public GlassBlock(String unlocalizedName, float hardness, float resistance) {
		this(unlocalizedName, Material.glass, hardness, resistance, ignoreSimilarity);
	}
	
	public GlassBlock(String unlocalizedName) {
		this(unlocalizedName, 0.5f, 1.0f);
	}
	
	@Override
	public boolean isOpaqueCube() {
		return false;
	}
	
	@Override
	public int quantityDropped(Random random)
    {
        return 1;
    }

	@SideOnly(Side.CLIENT)
    public EnumWorldBlockLayer getBlockLayer()
    {
        return EnumWorldBlockLayer.CUTOUT;
    }

    @Override
    public boolean isFullCube()
    {
        return false;
    }

    //not needed since we return an item on break from this class
    /*
    @Override
    @see net.minecraft.block.BlockGlass#canSilkHarvest()
    protected boolean canSilkHarvest()
    {
        return true;
    }
    */
}
//fuh
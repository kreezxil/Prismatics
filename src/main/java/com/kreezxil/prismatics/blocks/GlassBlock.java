package com.kreezxil.prismatics.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.World;
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

    //My goal is that the blocks I create that extend this class will not allow themselves
    //to float in air without being attached to at least one solid block.
    @Override
    public void onNeighborBlockChange(World worldIn, BlockPos pos, IBlockState state, Block neighborBlock) {
    	if(worldIn.isAirBlock(pos.up()) && worldIn.isAirBlock(pos.down()) &&
           worldIn.isAirBlock(pos.east()) && worldIn.isAirBlock(pos.west()) &&
    	   worldIn.isAirBlock(pos.north()) && worldIn.isAirBlock(pos.south())
    	   ) {
    		worldIn.setBlockToAir(pos);
    		this.dropBlockAsItem(worldIn, pos, getDefaultState(), 0);
    	}
    }
    
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(this);
    }

}

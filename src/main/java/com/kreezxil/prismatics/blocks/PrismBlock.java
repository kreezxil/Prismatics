package com.kreezxil.prismatics.blocks;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class PrismBlock extends GlassBlock {
	
	public static int sunAngle;
	
	
	public PrismBlock(String unlocalizedName) {
		super(unlocalizedName);
		this.setUnlocalizedName(unlocalizedName);
	}
	
/*
	public boolean canSeeSun() {
		return 
	}
	*/
	
	@SideOnly(Side.CLIENT)
    public void randomDisplayTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
    {
	 
    }
}
//fuh
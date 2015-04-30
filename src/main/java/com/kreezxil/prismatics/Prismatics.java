package com.kreezxil.prismatics;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Prismatics.MODID, version = Prismatics.VERSION)
public class Prismatics {
		public static final String MODID = "prismatics";
        public static final String VERSION = "0.0.2";
	    
        @SidedProxy(clientSide="com.kreezxil.prismatics.ClientProxy", serverSide="com.kreezxil.prismatics.ServerProxy")
        public static CommonProxy proxy;
        
        @Instance
        public static Prismatics instance = new Prismatics();
        
	    @EventHandler
	    public void preInit(FMLPreInitializationEvent event)
	    {
	    	this.proxy.preInit(event);
	    }

	    @EventHandler
	    public void init(FMLInitializationEvent event)
	    {
	    	this.proxy.init(event);
	    }

	    @EventHandler
	    public void postInit(FMLPostInitializationEvent event)
	    {
	    	this.proxy.postInit(event);
	    }

}
//fuh
package com.ridebuilder5.futuremod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import org.apache.logging.log4j.Logger;

import com.ridebuilder5.futuremod.init.ModRecipes;
import com.ridebuilder5.futuremod.proxy.CommonProxy;
import com.ridebuilder5.futuremod.tabs.FutureBlocksTab;
import com.ridebuilder5.futuremod.tabs.FutureCombatTab;
import com.ridebuilder5.futuremod.tabs.FutureFoodTab;
import com.ridebuilder5.futuremod.tabs.FutureMaterialsTab;
import com.ridebuilder5.futuremod.tabs.FutureToolsTab;
import com.ridebuilder5.futuremod.util.Reference;
import com.ridebuilder5.futuremod.world.ModWorldGen;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main
{
	@Instance
	public static Main Instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final CreativeTabs FUTUREBLOCKSTAB = new FutureBlocksTab("futureblockstab");
	public static final CreativeTabs FUTUREMATERIALSTAB = new FutureMaterialsTab("futurematerialstab");
	public static final CreativeTabs FUTUREFOODTAB = new FutureFoodTab("futurefoodtab");
	public static final CreativeTabs FUTURETOOLSTAB = new FutureToolsTab("futuretoolstab");
	public static final CreativeTabs FUTURECOMBATTAB = new FutureCombatTab("futurecombattab");
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		ModRecipes.init();
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event)
	{
		
	}
}

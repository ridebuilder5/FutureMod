package com.ridebuilder5.futuremod.items;

import com.ridebuilder5.futuremod.Main;
import com.ridebuilder5.futuremod.init.ModItems;
import com.ridebuilder5.futuremod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.FUTUREMATERIALSTAB);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}

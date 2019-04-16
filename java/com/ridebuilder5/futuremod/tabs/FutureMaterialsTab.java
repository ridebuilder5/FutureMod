package com.ridebuilder5.futuremod.tabs;

import com.ridebuilder5.futuremod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class FutureMaterialsTab extends CreativeTabs {

	public FutureMaterialsTab(String label) {
		super("futurematerialstab");
		this.setBackgroundImageName("futurematerials.png");
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.FUTURE_INGOT);
	}
	
}

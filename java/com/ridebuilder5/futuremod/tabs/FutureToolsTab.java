package com.ridebuilder5.futuremod.tabs;

import com.ridebuilder5.futuremod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class FutureToolsTab extends CreativeTabs {

	public FutureToolsTab(String label) {
		super("futuretoolstab");
		this.setBackgroundImageName("futuretools.png");
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.FUTURE_AXE);
	}

}

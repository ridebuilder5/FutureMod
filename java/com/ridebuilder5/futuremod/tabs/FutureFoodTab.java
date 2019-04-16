package com.ridebuilder5.futuremod.tabs;

import com.ridebuilder5.futuremod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class FutureFoodTab extends CreativeTabs {

	public FutureFoodTab(String label) {
		super("futurefoodtab");
		this.setBackgroundImageName("futurefood.png");
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.FUTURE_FOOD);
	}
}

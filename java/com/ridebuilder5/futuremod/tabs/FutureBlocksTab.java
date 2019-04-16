package com.ridebuilder5.futuremod.tabs;

import com.ridebuilder5.futuremod.init.ModBlocks;
import com.ridebuilder5.futuremod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class FutureBlocksTab extends CreativeTabs {

	public FutureBlocksTab(String label) {
		super("futureblockstab");
		this.setBackgroundImageName("futureblocks.png");
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModBlocks.FUTURE_ORE);
	}
}

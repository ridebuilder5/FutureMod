package com.ridebuilder5.futuremod.tabs;

import com.ridebuilder5.futuremod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class FutureCombatTab extends CreativeTabs {

	public FutureCombatTab(String label) {
		super("futurecombattab");
		this.setBackgroundImageName("futurecombat.png");
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.FUTURE_SWORD);
	}
}

package com.ridebuilder5.futuremod.items.tools;

import com.ridebuilder5.futuremod.Main;
import com.ridebuilder5.futuremod.init.ModItems;
import com.ridebuilder5.futuremod.items.ItemHammer;
import com.ridebuilder5.futuremod.util.IHasModel;

import net.minecraft.item.Item.ToolMaterial;

public class ToolHammer extends ItemHammer implements IHasModel {

	public ToolHammer(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.FUTURETOOLSTAB);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}

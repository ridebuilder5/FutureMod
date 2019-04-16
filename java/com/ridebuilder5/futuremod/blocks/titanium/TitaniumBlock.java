package com.ridebuilder5.futuremod.blocks.titanium;

import com.ridebuilder5.futuremod.blocks.BlockBase;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class TitaniumBlock extends BlockBase {

	public TitaniumBlock(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
	}
}

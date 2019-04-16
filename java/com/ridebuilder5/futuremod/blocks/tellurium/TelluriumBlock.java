package com.ridebuilder5.futuremod.blocks.tellurium;

import com.ridebuilder5.futuremod.blocks.BlockBase;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class TelluriumBlock extends BlockBase {

	public TelluriumBlock(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(7.5F);
		setResistance(17.5F);
		setHarvestLevel("pickaxe", 2);
	}
}

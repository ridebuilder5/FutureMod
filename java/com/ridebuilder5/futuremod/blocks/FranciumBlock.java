package com.ridebuilder5.futuremod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class FranciumBlock extends BlockBase {

	public FranciumBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.SAND);
        setHardness(1.0f);
        setResistance(5.0f);
        setHarvestLevel("shovel", 1);
        setLightLevel(1.0f);
        //setLightOpacity(1);
        //setBlockUnbreakable();

	}
}

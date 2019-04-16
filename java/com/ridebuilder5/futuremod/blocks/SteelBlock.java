package com.ridebuilder5.futuremod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class SteelBlock extends BlockBase {

	public SteelBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.METAL);
        setHardness(10.0f);
        setResistance(30.0f);
        //setHarvestLevel("pickaxe", 3);
        setHarvestLevel("hammer", 3);
        setLightLevel(0.1f);
        //setLightOpacity(1);
        //setBlockUnbreakable();

	}
}

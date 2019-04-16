package com.ridebuilder5.futuremod.blocks.uranium;

import com.ridebuilder5.futuremod.blocks.BlockBase;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class UraniumOre extends BlockBase {

	public UraniumOre(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
        setHardness(5.0f);
        setResistance(10.0f);
        //setHarvestLevel("pickaxe", 3);
        setHarvestLevel("pickaxe", 2);
        setLightLevel(0.3f);
        //setLightOpacity(1);
        //setBlockUnbreakable();

	}
}

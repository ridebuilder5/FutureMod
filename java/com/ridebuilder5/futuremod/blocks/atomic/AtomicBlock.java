package com.ridebuilder5.futuremod.blocks.atomic;

import com.ridebuilder5.futuremod.blocks.BlockBase;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class AtomicBlock extends BlockBase {

	public AtomicBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
        setHardness(3.5f);
        setResistance(6.0f);
        setHarvestLevel("pickaxe", 1);
        setLightLevel(0.8f);
        //setLightOpacity(1);
        //setBlockUnbreakable();

	}
}

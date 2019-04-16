package com.ridebuilder5.futuremod.blocks.atomic;

import com.ridebuilder5.futuremod.blocks.BlockBase;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class AtomicOre extends BlockBase {

	public AtomicOre(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(2.5F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", 1);
	}
	
	/*@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.FUTURE_INGOT;
	}
	
	@Override
	public int quantityDropped(Random rand) {
		int max = 1;
		int min = 1;
		return rand.nextInt(max) + min;
	}*/
}

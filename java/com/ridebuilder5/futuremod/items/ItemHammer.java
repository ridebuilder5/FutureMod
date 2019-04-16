package com.ridebuilder5.futuremod.items;

import java.util.Set;

import com.google.common.collect.Sets;
import com.ridebuilder5.futuremod.init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class ItemHammer extends ItemTool {

	private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(ModBlocks.STEEL_BLOCK);

    protected ItemHammer(Item.ToolMaterial material)
    {
        super(1.0F, -2.8F, material, EFFECTIVE_ON);
    }

    /**
     * Check whether this Item can harvest the given Block
     */
    public boolean canHarvestBlock(IBlockState blockIn)
    {
        Block block = blockIn.getBlock();
        
        if (block == ModBlocks.STEEL_BLOCK) {
        	return this.toolMaterial.getHarvestLevel() == 3;
        } else {
        	return false;
        }
    }
    public float getDestroySpeed(ItemStack stack, IBlockState state)
    {
        Material material = state.getMaterial();
        return material != Material.IRON && material != Material.ANVIL && material != Material.ROCK ? super.getDestroySpeed(stack, state) : this.efficiency;
    }

}

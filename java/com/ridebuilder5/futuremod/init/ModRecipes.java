package com.ridebuilder5.futuremod.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init() {
		GameRegistry.addSmelting(ModBlocks.FUTURE_ORE, new ItemStack(ModItems.FUTURE_INGOT, 1), 1.5f);
		GameRegistry.addSmelting(ModItems.FUTURE_INGOT, new ItemStack(ModItems.FUTURE_FOOD, 1), 2.5f);
		
		GameRegistry.addSmelting(ModBlocks.ATOMIC_ORE, new ItemStack(ModItems.ATOMIC_DUST, 1), 1.0f);
		GameRegistry.addSmelting(ModItems.ATOMIC_DUST, new ItemStack(ModItems.ATOMIC_FOOD, 1), 2.0f);
		
		GameRegistry.addSmelting(Items.IRON_INGOT, new ItemStack(ModItems.STEEL_BAR, 1), 3.0f);
		
		GameRegistry.addSmelting(ModBlocks.TELLURIUM_ORE, new ItemStack(ModItems.TELLURIUM_INGOT, 1), 2.5f);
		GameRegistry.addSmelting(ModItems.TELLURIUM_INGOT, new ItemStack(ModItems.TELLURIUM_FOOD, 1), 3.5f);
		
		GameRegistry.addSmelting(ModBlocks.TITANIUM_ORE, new ItemStack(ModItems.TITANIUM_INGOT, 1), 3.5f);
		
		GameRegistry.addSmelting(Blocks.STONE, new ItemStack(ModItems.FRANCIUM_INGOT, 1), 3.0f);
		
		GameRegistry.addSmelting(ModBlocks.URANIUM_ORE, new ItemStack(ModItems.URANIUM_INGOT), 4.0f);
	}
}

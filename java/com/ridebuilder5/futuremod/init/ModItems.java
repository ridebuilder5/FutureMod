package com.ridebuilder5.futuremod.init;

import java.util.ArrayList;
import java.util.List;

import com.ridebuilder5.futuremod.items.ItemBase;
import com.ridebuilder5.futuremod.items.ItemHammer;
import com.ridebuilder5.futuremod.items.armor.ArmorBase;
import com.ridebuilder5.futuremod.items.food.FoodEffectBase;
import com.ridebuilder5.futuremod.items.tools.ToolAxe;
import com.ridebuilder5.futuremod.items.tools.ToolHammer;
import com.ridebuilder5.futuremod.items.tools.ToolHoe;
import com.ridebuilder5.futuremod.items.tools.ToolPickaxe;
import com.ridebuilder5.futuremod.items.tools.ToolSpade;
import com.ridebuilder5.futuremod.items.tools.ToolSword;
import com.ridebuilder5.futuremod.util.Reference;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	/* MATERIALS (harvestLevel, maxUses, efficiency, damage, enchantability
	 * WOOD(0, 59, 2.0F, 0.0F, 15),
        STONE(1, 131, 4.0F, 1.0F, 5),
        IRON(2, 250, 6.0F, 2.0F, 14),
        DIAMOND(3, 1561, 8.0F, 3.0F, 10),
        GOLD(0, 32, 12.0F, 0.0F, 22);
	 */
	//Materials (name, harvestLevel, maxUses, efficiency, damage, enchantability)
	public static final ToolMaterial MATERIAL_FUTURE = EnumHelper.addToolMaterial("material_future", 2, 1000, 7.0F, 2.5F, 15);
	public static final ToolMaterial MATERIAL_ATOMIC = EnumHelper.addToolMaterial("material_atomic", 1, 100, 3.0F, 1.0F, 10);
	public static final ToolMaterial MATERIAL_STEEL = EnumHelper.addToolMaterial("material_steel", 3, 1750, 8.5F, 3.5F, 18);
	public static final ToolMaterial MATERIAL_TELLURIUM = EnumHelper.addToolMaterial("material_tellurium", 2, 500, 6.5F, 2.7F, 16);
	public static final ToolMaterial MATERIAL_TITANIUM = EnumHelper.addToolMaterial("material_titanium", 3, 1800, 9.0F, 4.0F, 20);
	public static final ToolMaterial MATERIAL_FRANCIUM = EnumHelper.addToolMaterial("material_francium", 1, 25, 1.0F, 8.0F, 10);
	public static final ToolMaterial MATERIAL_URANIUM = EnumHelper.addToolMaterial("material_uranium", 2, 175, 5.0F, 1.5F, 15);
	
	/* ARMOR MATERIALS (name, durability, reductionAmounts (boots, leggings, chestplate, helmet), enchantability, soundOnEquip, toughness
	 * LEATHER("leather", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F),
        CHAIN("chainmail", 15, new int[]{1, 4, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F),
        IRON("iron", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F),
        GOLD("gold", 7, new int[]{1, 3, 5, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F),
        DIAMOND("diamond", 33, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	 */
	// Armor Materials (name, textureName, durability, reductionAmounts (boots, leggings, chestplate, helmet), enchantability, soundOnEquip, toughness
	public static final ArmorMaterial ARMOR_MATERIAL_FUTURE = EnumHelper.addArmorMaterial("armor_material_future", Reference.MOD_ID + ":future", 15, new int[] {2, 5, 7, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_ATOMIC = EnumHelper.addArmorMaterial("armor_material_atomic", Reference.MOD_ID + ":atomic", 8, new int[] {1, 3, 4, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_STEEL = EnumHelper.addArmorMaterial("armor_material_steel", Reference.MOD_ID + ":steel", 36, new int[] {3, 6, 8, 3}, 18, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_TELLURIUM = EnumHelper.addArmorMaterial("armor_material_tellurium", Reference.MOD_ID + ":tellurium", 20, new int[] {3, 5, 7, 3}, 16, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_TITANIUM = EnumHelper.addArmorMaterial("armor_material_titanium", Reference.MOD_ID + ":titanium", 40, new int[] {3, 6, 8, 3}, 20, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_FRANCIUM = EnumHelper.addArmorMaterial("armor_material_francium", Reference.MOD_ID + ":francium", 5, new int[] {1, 2, 2, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_URANIUM = EnumHelper.addArmorMaterial("armor_material_uranium", Reference.MOD_ID + ":uranium", 13, new int[] {2, 4, 5, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	
	//Items
	public static final Item FUTURE_INGOT = new ItemBase("future_ingot");
	public static final Item ATOMIC_DUST = new ItemBase("atomic_dust");
	public static final Item STEEL_BAR = new ItemBase("steel_bar");
	public static final Item TELLURIUM_INGOT = new ItemBase("tellurium_ingot");
	public static final Item TITANIUM_INGOT = new ItemBase("titanium_ingot");
	public static final Item FRANCIUM_INGOT = new ItemBase("francium_ingot");
	public static final Item URANIUM_INGOT = new ItemBase("uranium_ingot");
	
	//Tools
	public static final ItemSword FUTURE_SWORD = new ToolSword("future_sword", MATERIAL_FUTURE);
	public static final ItemSpade FUTURE_SHOVEL = new ToolSpade("future_shovel", MATERIAL_FUTURE);
	public static final ItemPickaxe FUTURE_PICKAXE = new ToolPickaxe("future_pickaxe", MATERIAL_FUTURE);
	public static final ItemAxe FUTURE_AXE = new ToolAxe("future_axe", MATERIAL_FUTURE);
	public static final ItemHoe FUTURE_HOE = new ToolHoe("future_hoe", MATERIAL_FUTURE);
	
	public static final ItemSword ATOMIC_SWORD = new ToolSword("atomic_sword", MATERIAL_ATOMIC);
	public static final ItemSpade ATOMIC_SHOVEL = new ToolSpade("atomic_shovel", MATERIAL_ATOMIC);
	public static final ItemPickaxe ATOMIC_PICKAXE = new ToolPickaxe("atomic_pickaxe", MATERIAL_ATOMIC);
	public static final ItemAxe ATOMIC_AXE = new ToolAxe("atomic_axe", MATERIAL_ATOMIC);
	public static final ItemHoe ATOMIC_HOE = new ToolHoe("atomic_hoe", MATERIAL_ATOMIC);
	
	public static final ItemSword STEEL_SWORD = new ToolSword("steel_sword", MATERIAL_STEEL);
	public static final ItemSpade STEEL_SHOVEL = new ToolSpade("steel_shovel", MATERIAL_STEEL);
	public static final ItemPickaxe STEEL_PICKAXE = new ToolPickaxe("steel_pickaxe", MATERIAL_STEEL);
	public static final ItemAxe STEEL_AXE = new ToolAxe("steel_axe", MATERIAL_STEEL);
	public static final ItemHoe STEEL_HOE = new ToolHoe("steel_hoe", MATERIAL_STEEL);
	public static final ItemHammer STEEL_HAMMER = new ToolHammer("steel_hammer", MATERIAL_STEEL);
	
	public static final ItemSword TELLURIUM_SWORD = new ToolSword("tellurium_sword", MATERIAL_TELLURIUM);
	public static final ItemSpade TELLURIUM_SHOVEL = new ToolSpade("tellurium_shovel", MATERIAL_TELLURIUM);
	public static final ItemPickaxe TELLURIUM_PICKAXE = new ToolPickaxe("tellurium_pickaxe", MATERIAL_TELLURIUM);
	public static final ItemAxe TELLURIUM_AXE = new ToolAxe("tellurium_axe", MATERIAL_TELLURIUM);
	public static final ItemHoe TELLURIUM_HOE = new ToolHoe("tellurium_hoe", MATERIAL_TELLURIUM);
	
	public static final ItemSword TITANIUM_SWORD = new ToolSword("titanium_sword", MATERIAL_TITANIUM);
	public static final ItemSpade TITANIUM_SHOVEL = new ToolSpade("titanium_shovel", MATERIAL_TITANIUM);
	public static final ItemPickaxe TITANIUM_PICKAXE = new ToolPickaxe("titanium_pickaxe", MATERIAL_TITANIUM);
	public static final ItemAxe TITANIUM_AXE = new ToolAxe("titanium_axe", MATERIAL_TITANIUM);
	public static final ItemHoe TITANIUM_HOE = new ToolHoe("titanium_hoe", MATERIAL_TITANIUM);
	
	public static final ItemSword FRANCIUM_SWORD = new ToolSword("francium_sword", MATERIAL_FRANCIUM);
	public static final ItemSpade FRANCIUM_SHOVEL = new ToolSpade("francium_shovel", MATERIAL_FRANCIUM);
	public static final ItemPickaxe FRANCIUM_PICKAXE = new ToolPickaxe("francium_pickaxe", MATERIAL_FRANCIUM);
	public static final ItemAxe FRANCIUM_AXE = new ToolAxe("francium_axe", MATERIAL_FRANCIUM);
	public static final ItemHoe FRANCIUM_HOE = new ToolHoe("francium_hoe", MATERIAL_FRANCIUM);
	
	public static final ItemSword URANIUM_SWORD = new ToolSword("uranium_sword", MATERIAL_URANIUM);
	public static final ItemSpade URANIUM_SHOVEL = new ToolSpade("uranium_shovel", MATERIAL_URANIUM);
	public static final ItemPickaxe URANIUM_PICKAXE = new ToolPickaxe("uranium_pickaxe", MATERIAL_URANIUM);
	public static final ItemAxe URANIUM_AXE = new ToolAxe("uranium_axe", MATERIAL_URANIUM);
	public static final ItemHoe URANIUM_HOE = new ToolHoe("uranium_hoe", MATERIAL_URANIUM);
	
	//Armor
	public static final Item FUTURE_HELMET = new ArmorBase("future_helmet", ARMOR_MATERIAL_FUTURE, 1, EntityEquipmentSlot.HEAD);
	public static final Item FUTURE_CHESTPLATE = new ArmorBase("future_chestplate", ARMOR_MATERIAL_FUTURE, 1, EntityEquipmentSlot.CHEST);
	public static final Item FUTURE_LEGGINGS = new ArmorBase("future_leggings", ARMOR_MATERIAL_FUTURE, 2, EntityEquipmentSlot.LEGS);
	public static final Item FUTURE_BOOTS = new ArmorBase("future_boots", ARMOR_MATERIAL_FUTURE, 1, EntityEquipmentSlot.FEET);
	
	public static final Item ATOMIC_HELMET = new ArmorBase("atomic_helmet", ARMOR_MATERIAL_ATOMIC, 1, EntityEquipmentSlot.HEAD);
	public static final Item ATOMIC_CHESTPLATE = new ArmorBase("atomic_chestplate", ARMOR_MATERIAL_ATOMIC, 1, EntityEquipmentSlot.CHEST);
	public static final Item ATOMIC_LEGGINGS = new ArmorBase("atomic_leggings", ARMOR_MATERIAL_ATOMIC, 2, EntityEquipmentSlot.LEGS);
	public static final Item ATOMIC_BOOTS = new ArmorBase("atomic_boots", ARMOR_MATERIAL_ATOMIC, 1, EntityEquipmentSlot.FEET);
	
	public static final Item STEEL_HELMET = new ArmorBase("steel_helmet", ARMOR_MATERIAL_STEEL, 1, EntityEquipmentSlot.HEAD);
	public static final Item STEEL_CHESTPLATE = new ArmorBase("steel_chestplate", ARMOR_MATERIAL_STEEL, 1, EntityEquipmentSlot.CHEST);
	public static final Item STEEL_LEGGINGS = new ArmorBase("steel_leggings", ARMOR_MATERIAL_STEEL, 2, EntityEquipmentSlot.LEGS);
	public static final Item STEEL_BOOTS = new ArmorBase("steel_boots", ARMOR_MATERIAL_STEEL, 1, EntityEquipmentSlot.FEET);
	
	public static final Item TELLURIUM_HELMET = new ArmorBase("tellurium_helmet", ARMOR_MATERIAL_TELLURIUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item TELLURIUM_CHESTPLATE = new ArmorBase("tellurium_chestplate", ARMOR_MATERIAL_TELLURIUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item TELLURIUM_LEGGINGS = new ArmorBase("tellurium_leggings", ARMOR_MATERIAL_TELLURIUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item TELLURIUM_BOOTS = new ArmorBase("tellurium_boots", ARMOR_MATERIAL_TELLURIUM, 1, EntityEquipmentSlot.FEET);
	
	public static final Item TITANIUM_HELMET = new ArmorBase("titanium_helmet", ARMOR_MATERIAL_TITANIUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item TITANIUM_CHESTPLATE = new ArmorBase("titanium_chestplate", ARMOR_MATERIAL_TITANIUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item TITANIUM_LEGGINGS = new ArmorBase("titanium_leggings", ARMOR_MATERIAL_TITANIUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item TITANIUM_BOOTS = new ArmorBase("titanium_boots", ARMOR_MATERIAL_TITANIUM, 1, EntityEquipmentSlot.FEET);
	
	public static final Item FRANCIUM_HELMET = new ArmorBase("francium_helmet", ARMOR_MATERIAL_FRANCIUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item FRANCIUM_CHESTPLATE = new ArmorBase("francium_chestplate", ARMOR_MATERIAL_FRANCIUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item FRANCIUM_LEGGINGS = new ArmorBase("francium_leggings", ARMOR_MATERIAL_FRANCIUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item FRANCIUM_BOOTS = new ArmorBase("francium_boots", ARMOR_MATERIAL_FRANCIUM, 1, EntityEquipmentSlot.FEET);
	
	public static final Item URANIUM_HELMET = new ArmorBase("uranium_helmet", ARMOR_MATERIAL_URANIUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item URANIUM_CHESTPLATE = new ArmorBase("uranium_chestplate", ARMOR_MATERIAL_URANIUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item URANIUM_LEGGINGS = new ArmorBase("uranium_leggings", ARMOR_MATERIAL_URANIUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item URANIUM_BOOTS = new ArmorBase("uranium_boots", ARMOR_MATERIAL_URANIUM, 1, EntityEquipmentSlot.FEET);
	
	//Food (name, amount, saturation, isAnimalFood)
	//public static final Item FUTURE_FOOD = new FoodBase("future_food", 4, 2.4f, false);
	
	//Food Effects (name, amount, saturation, isAnimalFood, potion, duration, strength, ambient, particles
	public static final Item FUTURE_FOOD = new FoodEffectBase("future_food", 6, 4.5f, false, new PotionEffect(MobEffects.REGENERATION, (60*20), 1, false, true));
	public static final Item ATOMIC_FOOD = new FoodEffectBase("atomic_food", 2, 1.0f, false, new PotionEffect(MobEffects.POISON, (60*20), 1, false, true));
	public static final Item TELLURIUM_FOOD = new FoodEffectBase("tellurium_food", 4, 3.0f, false, new PotionEffect(MobEffects.STRENGTH, (60*20), 1, false, true));
	public static final Item FRANCIUM_FOOD = new FoodEffectBase("francium_food", 2, 1.5f, false, new PotionEffect(MobEffects.POISON, (60*20), 2, true, true));
}

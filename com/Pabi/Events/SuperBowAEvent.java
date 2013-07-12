package com.Pabi.Events;

import com.Pabi.pabimodbase;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.ICraftingHandler;

public class SuperBowAEvent implements ICraftingHandler {

/**
 * Crafting super bow achievement event.
 */
	@Override
	public void onCrafting(EntityPlayer player, ItemStack item,
			IInventory craftMatrix) {
		if(item.itemID == pabimodbase.SuperBow.itemID)
		{
			player.addStat(pabimodbase.SuperBowA, 1);
		}
	}

	@Override
	public void onSmelting(EntityPlayer player, ItemStack item) {
		
	}

}

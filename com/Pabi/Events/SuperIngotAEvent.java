package com.Pabi.Events;

import com.Pabi.pabimodbase;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.ICraftingHandler;

public class SuperIngotAEvent implements ICraftingHandler {

	/**
	 * Crafting wand Achievement event.
	 */

	@Override
	public void onCrafting(EntityPlayer player, ItemStack item,
			IInventory craftMatrix) {
		
	}
	
	@Override
	public void onSmelting(EntityPlayer player, ItemStack item)
		{
			if(item.itemID == pabimodbase.SuperIngot.itemID)
			{
				player.addStat(pabimodbase.SuperIngotA, 1);
			}

	}

}

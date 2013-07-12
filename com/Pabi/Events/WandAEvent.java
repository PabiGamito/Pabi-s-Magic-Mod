package com.Pabi.Events;

import com.Pabi.pabimodbase;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.ICraftingHandler;

public class WandAEvent implements ICraftingHandler {

	/**
	 * Crafting wand Achievement event.
	 */
	@Override
	public void onCrafting(EntityPlayer player, ItemStack item,
			IInventory craftMatrix) {
		if(item.itemID == pabimodbase.Wand.itemID)
		{
			player.addStat(pabimodbase.WandA, 1);
		}
	}

	@Override
	public void onSmelting(EntityPlayer player, ItemStack item) {
		// TODO Auto-generated method stub
		
	}
	
	/*public void onPickup(EntityPlayer player, ItemStack item,
			IInventory craftMatrix) {
		if(item.itemID == PabiModBase.Wand.itemID)
		{
			player.addStat(PabiModBase.WandA, 1);
		}
	}*/

}

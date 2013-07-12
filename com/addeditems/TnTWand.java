package com.addeditems;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFluid;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class TnTWand extends ItemSword {

	public TnTWand(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		this.setCreativeTab(CreativeTabs.tabCombat);
	}
    public void registerIcons(IconRegister iconReg)
    {
        itemIcon = iconReg.registerIcon("pabimodbase:TnTWand");
    }
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
    		if(!par2World.isRemote)
	    	{
    	   	par3EntityPlayer.posY++;
	    	MovingObjectPosition Coords = par3EntityPlayer.rayTrace(45, 1);
	    	if(Coords != null)
	    	{
	    			par2World.createExplosion(par3EntityPlayer, Coords.blockX, Coords.blockY + 1 , Coords.blockZ, 3, true);
	    	        par1ItemStack.damageItem(2, par3EntityPlayer);
	    	}
	    	return par1ItemStack;
	
	    }
    		par3EntityPlayer.posY--;
			return par1ItemStack;
    }
}

package com.addeditems;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFluid;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.command.CommandTime;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class NightWand extends ItemSword {

	public NightWand(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		this.setCreativeTab(CreativeTabs.tabTools);
	}

	public void registerIcons(IconRegister iconReg) {
		itemIcon = iconReg.registerIcon("PabiModBase:NightWand");
	}
	
	/**
	 * When right clicked with it sets time in world to 13000.
	 */
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World,
			EntityPlayer par3EntityPlayer) 
	{
		par2World.setWorldTime(13000);
        par1ItemStack.damageItem(1, par3EntityPlayer);
		return par1ItemStack;
	}

}
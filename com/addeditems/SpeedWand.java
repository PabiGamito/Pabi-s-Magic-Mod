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
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class SpeedWand extends ItemSword {

	public SpeedWand(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		this.setCreativeTab(CreativeTabs.tabCombat);
	}
    public void registerIcons(IconRegister iconReg)
    {
        itemIcon = iconReg.registerIcon("PabiModBase:SpeedWand");
    }
    	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
    	par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 100, 3));
        par1ItemStack.damageItem(2, par3EntityPlayer);
    	return par1ItemStack;
    }

}
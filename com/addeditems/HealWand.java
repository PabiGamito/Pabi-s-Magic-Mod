package com.addeditems;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFluid;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
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

public class HealWand extends ItemSword {

	public HealWand(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		this.setCreativeTab(CreativeTabs.tabCombat);
	}
    public void registerIcons(IconRegister iconReg)
    {
        itemIcon = iconReg.registerIcon("pabimodbase:HealWand");
    }
    
    /**
     * When used (right clicked with it) applies heal potion effect to you and entities (mobs, animals) around you.
     */
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
{
        if (!par2World.isRemote)
        {
            ArrayList<EntityLiving> List1= new ArrayList<EntityLiving>(); 
            if (par2World.loadedEntityList == null)
                return par1ItemStack;
            for(Object _Entity: par2World.loadedEntityList)
            {
                EntityLiving temp;
                try
                {
                        temp = (EntityLiving) _Entity;
                }
                catch(Exception e)
                {
                        continue;
                }
                if(temp != null)
                {
                        if (temp.getPosition(1).distanceTo(par3EntityPlayer.getPosition(1)) < 10)
                        {
                                temp.addPotionEffect(new PotionEffect(Potion.regeneration.id, 15, 5));
                        }
                }
            }
}
        par1ItemStack.damageItem(6, par3EntityPlayer);
		return par1ItemStack;
    }

}
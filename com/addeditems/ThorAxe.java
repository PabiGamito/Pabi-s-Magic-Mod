package com.addeditems;

import java.util.ArrayList;

import com.PabiCodes.util;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class ThorAxe extends ItemAxe {

	public ThorAxe(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		this.setCreativeTab(CreativeTabs.tabCombat);
	}
    public void registerIcons(IconRegister iconReg)
    {
        itemIcon = iconReg.registerIcon("pabimodbase:ThorAxe");
       }
    public int getDamageVsEntity (Entity par1Entity)
    {
    	return 10;
    }
    
    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        /*
        if (!par3EntityPlayer.capabilities.isCreativeMode)
        {
            --par1ItemStack.stackSize;
        }
        */
        par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

    	if(!par2World.isRemote)
    	{
    		par3EntityPlayer.posY++;
	    	MovingObjectPosition Coords = par3EntityPlayer.rayTrace(300, 1);
	    	if(Coords != null)
	        {
	            
	    		Coords.blockY = par2World.getPrecipitationHeight((int)Coords.blockX , (int)Coords.blockZ );
	    		EntityLightningBolt lightning = (EntityLightningBolt)new EntityLightningBolt(par2World, Coords.blockX, Coords.blockY, Coords.blockZ);	
				par2World.addWeatherEffect(lightning);
				par1ItemStack.damageItem(3, par3EntityPlayer);
	        }
    	}
        ArrayList<EntityLiving> List1= new ArrayList<EntityLiving>(); 
       if (par2World.loadedEntityList == null)
           return par1ItemStack;
       if (!par3EntityPlayer.capabilities.isCreativeMode)
   {
       --par1ItemStack.stackSize;
   }
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
                           float speed = 10;
                           Vec3 diffVec = par3EntityPlayer.getPosition(1).subtract(temp.getPosition(1));
                           diffVec = diffVec.normalize();
                           diffVec = Vec3.createVectorHelper(diffVec.xCoord * speed, diffVec.yCoord * 3, diffVec.zCoord*speed);
                           temp.setVelocity(diffVec.xCoord, diffVec.yCoord, diffVec.zCoord);
                   }
           }
           par1ItemStack.stackSize--;
}
	return par1ItemStack;
    }
}

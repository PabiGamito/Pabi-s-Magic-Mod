package com.addeditems;

import com.PabiCodes.util;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class LongSwordThunder extends ItemSword {

	public LongSwordThunder(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		this.setCreativeTab(CreativeTabs.tabCombat);
	}
    public void registerIcons(IconRegister iconReg)
    {
        itemIcon = iconReg.registerIcon("PabiModBase:LongSwordThunder");
       }
    public int getDamageVsEntity (Entity par1Entity)
    {
    	return 11;
    }
    
    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     * When right clicked with it spawns thunder in the world.
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
	    	par3EntityPlayer.posY--;
        
    }
		return par1ItemStack;
    
    
}
}
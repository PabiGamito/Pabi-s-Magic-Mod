package com.addeditems;

import cpw.mods.fml.common.network.Player;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class EnderWand extends ItemSword {
	
		public EnderWand(int par1, EnumToolMaterial par2EnumToolMaterial) {
			super(par1, par2EnumToolMaterial);
			this.setCreativeTab(CreativeTabs.tabTools);
        }
        
	/**
	 * When used (right clicked with it) teleports you to selected location.
	 */
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
        MovingObjectPosition Coord = par3EntityPlayer.rayTrace(500, 1);
        if(Coord != null) {
                Vec3 look = par3EntityPlayer.getLookVec();
                par3EntityPlayer.setPosition(Coord.blockX - look.xCoord, Coord.blockY - look.yCoord + 2, Coord.blockZ - look.zCoord);
        		par3EntityPlayer
				.addPotionEffect(new PotionEffect(Potion.resistance.id, 30, 6));
        }
        par1ItemStack.damageItem(3, par3EntityPlayer);
        return par1ItemStack;
    }
        
        public void registerIcons(IconRegister iconReg) 
        {
                itemIcon = iconReg.registerIcon("PabiModBase:EnderWand");
        }

}
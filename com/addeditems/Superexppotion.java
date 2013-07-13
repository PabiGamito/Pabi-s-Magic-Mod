package com.addeditems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.item.EntityExpBottle;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemExpBottle;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Superexppotion extends ItemExpBottle {
public Superexppotion(int par1) {
  super(par1);
}

/**
         * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
         */
@Override
        public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
        {
                if (!par3EntityPlayer.capabilities.isCreativeMode)
                {
                        --par1ItemStack.stackSize;
                }
                par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
                if (!par2World.isRemote)
                {
                 for (int i = 0; i < 18; ++i) {
                  par2World.spawnEntityInWorld(new EntityExpBottle(par2World, par3EntityPlayer));
                 }
                }
                return par1ItemStack;
        }

@SideOnly(Side.CLIENT)
@Override
public void registerIcons(IconRegister iconReg)
{
    itemIcon = iconReg.registerIcon("pabimodbase:Superexpbottle");
}
}
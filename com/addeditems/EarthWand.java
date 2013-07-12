package com.addeditems;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.Event.Result;
import net.minecraftforge.event.entity.player.UseHoeEvent;

public class EarthWand extends ItemHoe {
        public EarthWand(int par1,EnumToolMaterial et) {
                super(par1, et);
                this.setCreativeTab(CreativeTabs.tabTools);
        }
    public void registerIcons(IconRegister iconReg) {
        itemIcon = iconReg.registerIcon("pabimodbase:EarthWand");
    }
    
    /**
     * When used (right clicked with it on grass or dirt) set a 5x5 place of tilled dirt ready to be farmed on.
     */
    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
        for (int i=-2;i<3;i++)
        {
                for (int j=-2;j<3;j++)
                {
                        onItemUseLooped(par1ItemStack, par2EntityPlayer, par3World,  par4+i,  par5,  par6+j,  par7,  par8,  par9,  par10);
                }
        }
        return true;
    }
    /**
     * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
     * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
     */
    public boolean onItemUseLooped(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
        if (!par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack))
        {
            return false;
        }
        else
        {
            UseHoeEvent event = new UseHoeEvent(par2EntityPlayer, par1ItemStack, par3World, par4, par5, par6);
            if (MinecraftForge.EVENT_BUS.post(event))
            {
                return false;
            }

            if (event.getResult() == Result.ALLOW)
            {
                par1ItemStack.damageItem(1, par2EntityPlayer);
                return true;
            }

            int i1 = par3World.getBlockId(par4, par5, par6);
            boolean air = par3World.isAirBlock(par4, par5 + 1, par6);

            //Forge: Change 0 to air, also BugFix: parens mismatch causing you to be able to hoe dirt under dirt/grass
            if (par7 == 0 || !air || (i1 != Block.grass.blockID && i1 != Block.dirt.blockID))
            {
                return false;
            }
            else
            {
                Block block = Block.tilledField;
                par3World.playSoundEffect((double)((float)par4 + 0.5F), (double)((float)par5 + 0.5F), (double)((float)par6 + 0.5F), block.stepSound.getStepSound(), (block.stepSound.getVolume() + 1.0F) / 2.0F, block.stepSound.getPitch() * 0.8F);

                if (par3World.isRemote)
                {
                    return true;
                }
                else
                {
                    par3World.setBlock(par4, par5, par6, block.blockID);
                    par1ItemStack.damageItem(2, par2EntityPlayer);
                    return true;
                }
            }
        }
    }

}
package com.addeditems;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSeeds;

public class magic extends ItemFood {
        public magic(int par1, int par2, int par3, boolean alwaysEdible) {
        	super(par1, par2, par3, alwaysEdible);
                this.setCreativeTab(CreativeTabs.tabFood);
        }
        
        
    public void registerIcons(IconRegister iconReg) {
        itemIcon = iconReg.registerIcon("PabiModBase:magicplant");
    }
}
package com.addeditems;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSeeds;

public class seed_magic extends ItemSeeds {
        public seed_magic(int par1,int par2, int par3) {
                super(par1, par2, par3);
                this.setCreativeTab(CreativeTabs.tabMaterials);
        }
    public void registerIcons(IconRegister iconReg) {
        itemIcon = iconReg.registerIcon("pabimodbase:seeds_magic");
    }
}
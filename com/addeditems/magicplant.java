package com.addeditems;

import java.util.Random;

import com.Pabi.pabimodbase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;

public class magicplant extends Block
{
    private Icon field_94393_a;
	private Icon field_94393_b;
	public <isDoubleSlab> magicplant(int par1, Material par2Material) 
    {
		super(par1, par2Material);
        this.setCreativeTab(CreativeTabs.tabBlock);
        
	}
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon("pabimodbase:magicplant_side");
        this.field_94393_a = par1IconRegister.registerIcon("pabimodbase:magicplant_top");
        this.field_94393_b = par1IconRegister.registerIcon("pabimodbase:magicplant_top");
    }
    public Icon getIcon(int par1, int par2)
    {
       return par1 == 1 ? this.field_94393_a : (par1 == 0 ? this.field_94393_b : this.blockIcon);
    }
    public int idDropped(int i, Random r, int j)
    {
        return pabimodbase.magicmelon.itemID;
    }
}
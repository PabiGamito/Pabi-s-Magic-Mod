package com.addeditems;

import java.util.Random;

import com.Pabi.PabiModBase;

import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class SuperOre extends BlockOre {

	public SuperOre(int par1) {
                super(par1);
                this.setCreativeTab(CreativeTabs.tabBlock);
                this.setHardness(2.5f);
        this.setResistance(50f);
        this.setStepSound(soundStoneFootstep);
        }
    
    public int idDropped(int i, Random r, int j)
    {
        return PabiModBase.SuperOre.blockID;
    }

        public void registerIcons(IconRegister iconReg) {
        blockIcon = iconReg.registerIcon("PabiModBase:SuperOre"); 
    }
        public int quantityDropped(Random r){
        	return 1;
        }

}

package com.addeditems;

import java.util.Random;

import com.Pabi.pabimodbase;

import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class StartArenaGlowing extends Block {
    public StartArenaGlowing(int par1, Material par2Material) {
		super(par1, par2Material);
        this.setBlockUnbreakable();
	}
        public void registerIcons(IconRegister iconReg) {
        blockIcon = iconReg.registerIcon("pabimodbase:AreanaStartGlowing"); 
    }
}
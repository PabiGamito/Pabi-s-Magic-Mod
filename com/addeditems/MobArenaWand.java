package com.addeditems;

import java.util.List;
import java.util.Random;

import com.Pabi.pabimodbase;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraft.world.gen.structure.ComponentVillageStartPiece;
import net.minecraft.world.gen.structure.ComponentVillageWoodHut;
import net.minecraft.world.gen.structure.StructureBoundingBox;
import net.minecraft.world.gen.structure.StructureComponent;

public class MobArenaWand extends ItemSword {

        public MobArenaWand(int par1, EnumToolMaterial par2EnumToolMaterial) {
                super(par1, par2EnumToolMaterial);
                this.setCreativeTab(CreativeTabs.tabTools);
        }

        public void registerIcons(IconRegister iconReg) {
                itemIcon = iconReg.registerIcon("pabimodbase:MobArenaWand");
        }

        public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World,EntityPlayer par3EntityPlayer) 
        {
                if (!par2World.isRemote)
                {
                        par3EntityPlayer.posY++;
                        MovingObjectPosition coord = par3EntityPlayer.rayTrace(500, 1);
                        if (coord != null)
                        {
                                
                                int height = 6;
                                int length = 20;
                                int depth = 20;
                                coord.blockX -= length/2;
                                coord.blockZ -= depth/2;
                                
                                for (int j = +1; j < length; j ++)
                                {
                                        for (int k = +1; k < depth; k ++)
                                        {
                                                par2World.setBlock((int)coord.blockX+j, (int)coord.blockY+21,(int) coord.blockZ+k, Block.cobblestone.blockID);
                                        }
                                }
                                for (int j = +1; j < length; j ++)
                                {
                                        for (int k = +1; k < depth; k ++)
                                        {
                                                par2World.setBlock((int)coord.blockX+j, (int)coord.blockY+22,(int) coord.blockZ+k, Block.cobblestone.blockID);
                                        }
                                }
                                coord.blockY++;
                                for (int i = 0;i < height;i++)
                                {
                                        for (int j = 0; j < length; j ++)
                                        {
                                                par2World.setBlock((int)coord.blockX++, (int)coord.blockY+20,(int) coord.blockZ, Block.stoneBrick.blockID);
                                                
                                        }
                                        for (int k = 0; k < length; k ++)
                                        {
                                                par2World.setBlock((int)coord.blockX, (int)coord.blockY+20,(int) coord.blockZ++, Block.stoneBrick.blockID);
                                                
                                        }
                                        for (int l = 0; l < length; l ++)
                                        {
                                                par2World.setBlock((int)coord.blockX--, (int)coord.blockY+20,(int) coord.blockZ, Block.stoneBrick.blockID);
                                                
                                        }
                                        for (int m = 0; m< length; m ++)
                                        {
                                                par2World.setBlock((int)coord.blockX, (int)coord.blockY+20,(int) coord.blockZ--, Block.stoneBrick.blockID);
                                                
                                        }
                                                
                                coord.blockY++;
                                }
                                coord.blockY--;
                                for (int j = +1; j < length; j ++)
                                {
                                        for (int k = +1; k < depth; k ++)
                                        {
                                                par2World.setBlock((int)coord.blockX+j, (int)coord.blockY+21,(int) coord.blockZ+k, Block.cobblestone.blockID);
                                        }
                                }
                                par2World.setBlock((int)coord.blockX+1, (int)coord.blockY+16,(int) coord.blockZ+1, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+2, (int)coord.blockY+16,(int) coord.blockZ+1, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+3, (int)coord.blockY+16,(int) coord.blockZ+1, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+4, (int)coord.blockY+16,(int) coord.blockZ+1, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+5, (int)coord.blockY+16,(int) coord.blockZ+1, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+6, (int)coord.blockY+16,(int) coord.blockZ+1, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+7, (int)coord.blockY+16,(int) coord.blockZ+1, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+8, (int)coord.blockY+16,(int) coord.blockZ+1, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+9, (int)coord.blockY+16,(int) coord.blockZ+1, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+10, (int)coord.blockY+16,(int) coord.blockZ+1, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+11, (int)coord.blockY+16,(int) coord.blockZ+1, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+12, (int)coord.blockY+16,(int) coord.blockZ+1, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+13, (int)coord.blockY+16,(int) coord.blockZ+1, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+14, (int)coord.blockY+16,(int) coord.blockZ+1, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+15, (int)coord.blockY+16,(int) coord.blockZ+1, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+16, (int)coord.blockY+16,(int) coord.blockZ+1, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+17, (int)coord.blockY+16,(int) coord.blockZ+1, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+18, (int)coord.blockY+16,(int) coord.blockZ+1, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+19, (int)coord.blockY+16,(int) coord.blockZ+1, Block.lavaMoving.blockID);
                                
                                par2World.setBlock((int)coord.blockX+1, (int)coord.blockY+16,(int) coord.blockZ+1, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+1, (int)coord.blockY+16,(int) coord.blockZ+2, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+1, (int)coord.blockY+16,(int) coord.blockZ+3, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+1, (int)coord.blockY+16,(int) coord.blockZ+4, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+1, (int)coord.blockY+16,(int) coord.blockZ+5, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+1, (int)coord.blockY+16,(int) coord.blockZ+6, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+1, (int)coord.blockY+16,(int) coord.blockZ+7, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+1, (int)coord.blockY+16,(int) coord.blockZ+8, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+1, (int)coord.blockY+16,(int) coord.blockZ+9, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+1, (int)coord.blockY+16,(int) coord.blockZ+10, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+1, (int)coord.blockY+16,(int) coord.blockZ+11, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+1, (int)coord.blockY+16,(int) coord.blockZ+12, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+1, (int)coord.blockY+16,(int) coord.blockZ+13, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+1, (int)coord.blockY+16,(int) coord.blockZ+14, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+1, (int)coord.blockY+16,(int) coord.blockZ+15, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+1, (int)coord.blockY+16,(int) coord.blockZ+16, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+1, (int)coord.blockY+16,(int) coord.blockZ+17, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+1, (int)coord.blockY+16,(int) coord.blockZ+18, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+1, (int)coord.blockY+16,(int) coord.blockZ+19, Block.lavaMoving.blockID);
                                
                                par2World.setBlock((int)coord.blockX+1, (int)coord.blockY+16,(int) coord.blockZ+1, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+2, (int)coord.blockY+16,(int) coord.blockZ+1, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+3, (int)coord.blockY+16,(int) coord.blockZ+1, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+4, (int)coord.blockY+16,(int) coord.blockZ+1, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+5, (int)coord.blockY+16,(int) coord.blockZ+1, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+6, (int)coord.blockY+16,(int) coord.blockZ+1, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+7, (int)coord.blockY+16,(int) coord.blockZ+1, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+8, (int)coord.blockY+16,(int) coord.blockZ+1, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+9, (int)coord.blockY+16,(int) coord.blockZ+1, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+10, (int)coord.blockY+16,(int) coord.blockZ+1, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+11, (int)coord.blockY+16,(int) coord.blockZ+1, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+12, (int)coord.blockY+16,(int) coord.blockZ+1, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+13, (int)coord.blockY+16,(int) coord.blockZ+1, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+14, (int)coord.blockY+16,(int) coord.blockZ+1, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+15, (int)coord.blockY+16,(int) coord.blockZ+1, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+16, (int)coord.blockY+16,(int) coord.blockZ+1, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+17, (int)coord.blockY+16,(int) coord.blockZ+1, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+18, (int)coord.blockY+16,(int) coord.blockZ+1, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+19, (int)coord.blockY+16,(int) coord.blockZ+1, Block.lavaMoving.blockID);
                                
                                par2World.setBlock((int)coord.blockX+19, (int)coord.blockY+16,(int) coord.blockZ+1, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+19, (int)coord.blockY+16,(int) coord.blockZ+2, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+19, (int)coord.blockY+16,(int) coord.blockZ+3, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+19, (int)coord.blockY+16,(int) coord.blockZ+4, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+19, (int)coord.blockY+16,(int) coord.blockZ+5, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+19, (int)coord.blockY+16,(int) coord.blockZ+6, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+19, (int)coord.blockY+16,(int) coord.blockZ+7, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+19, (int)coord.blockY+16,(int) coord.blockZ+8, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+19, (int)coord.blockY+16,(int) coord.blockZ+9, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+19, (int)coord.blockY+16,(int) coord.blockZ+10, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+19, (int)coord.blockY+16,(int) coord.blockZ+11, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+19, (int)coord.blockY+16,(int) coord.blockZ+12, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+19, (int)coord.blockY+16,(int) coord.blockZ+13, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+19, (int)coord.blockY+16,(int) coord.blockZ+14, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+19, (int)coord.blockY+16,(int) coord.blockZ+15, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+19, (int)coord.blockY+16,(int) coord.blockZ+16, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+19, (int)coord.blockY+16,(int) coord.blockZ+17, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+19, (int)coord.blockY+16,(int) coord.blockZ+18, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+19, (int)coord.blockY+16,(int) coord.blockZ+19, Block.lavaMoving.blockID);
                                
                                par2World.setBlock((int)coord.blockX+1, (int)coord.blockY+16,(int) coord.blockZ+19, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+2, (int)coord.blockY+16,(int) coord.blockZ+19, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+3, (int)coord.blockY+16,(int) coord.blockZ+19, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+4, (int)coord.blockY+16,(int) coord.blockZ+19, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+5, (int)coord.blockY+16,(int) coord.blockZ+19, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+6, (int)coord.blockY+16,(int) coord.blockZ+19, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+7, (int)coord.blockY+16,(int) coord.blockZ+19, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+8, (int)coord.blockY+16,(int) coord.blockZ+19, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+9, (int)coord.blockY+16,(int) coord.blockZ+19, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+10, (int)coord.blockY+16,(int) coord.blockZ+19, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+11, (int)coord.blockY+16,(int) coord.blockZ+19, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+12, (int)coord.blockY+16,(int) coord.blockZ+19, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+13, (int)coord.blockY+16,(int) coord.blockZ+19, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+14, (int)coord.blockY+16,(int) coord.blockZ+19, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+15, (int)coord.blockY+16,(int) coord.blockZ+19, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+16, (int)coord.blockY+16,(int) coord.blockZ+19, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+17, (int)coord.blockY+16,(int) coord.blockZ+19, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+18, (int)coord.blockY+16,(int) coord.blockZ+19, Block.lavaMoving.blockID);
                                par2World.setBlock((int)coord.blockX+19, (int)coord.blockY+16,(int) coord.blockZ+19, Block.lavaMoving.blockID);
                                
                                par2World.setBlock((int)coord.blockX+10, (int)coord.blockY+17,(int) coord.blockZ+10, pabimodbase.StartArena.blockID);
                                
                                par2World.setBlock((int)coord.blockX-5, (int)coord.blockY-6,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-5, (int)coord.blockY-5,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-5, (int)coord.blockY-4,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-5, (int)coord.blockY-3,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-5, (int)coord.blockY-2,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-5, (int)coord.blockY-1,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-5, (int)coord.blockY,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-5, (int)coord.blockY+1,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-5, (int)coord.blockY+2,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-5, (int)coord.blockY+3,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-5, (int)coord.blockY+4,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-5, (int)coord.blockY+5,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-5, (int)coord.blockY+6,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-5, (int)coord.blockY+7,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-5, (int)coord.blockY+8,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-5, (int)coord.blockY+9,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-5, (int)coord.blockY+10,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-5, (int)coord.blockY+11,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-5, (int)coord.blockY+12,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-5, (int)coord.blockY+13,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-5, (int)coord.blockY+14,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-5, (int)coord.blockY+15,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-5, (int)coord.blockY+16,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                
                                par2World.setBlock((int)coord.blockX-4, (int)coord.blockY-6,(int) coord.blockZ+10, pabimodbase.LaunchPad.blockID);
                                par2World.setBlockToAir((int)coord.blockX-4, (int)coord.blockY-5,(int) coord.blockZ+10);
                                par2World.setBlockToAir((int)coord.blockX-4, (int)coord.blockY-4,(int) coord.blockZ+10);
                                par2World.setBlockToAir((int)coord.blockX-4, (int)coord.blockY-3,(int) coord.blockZ+10);
                                par2World.setBlockToAir((int)coord.blockX-4, (int)coord.blockY-2,(int) coord.blockZ+10);
                                par2World.setBlockToAir((int)coord.blockX-4, (int)coord.blockY-1,(int) coord.blockZ+10);
                                par2World.setBlockToAir((int)coord.blockX-3, (int)coord.blockY-5,(int) coord.blockZ+10);
                                par2World.setBlockToAir((int)coord.blockX-3, (int)coord.blockY-4,(int) coord.blockZ+10);
                                par2World.setBlockToAir((int)coord.blockX-3, (int)coord.blockY-3,(int) coord.blockZ+10);
                                par2World.setBlockToAir((int)coord.blockX-3, (int)coord.blockY-2,(int) coord.blockZ+10);
                                par2World.setBlockToAir((int)coord.blockX-3, (int)coord.blockY-1,(int) coord.blockZ+10);
                                
                                par2World.setBlock((int)coord.blockX-3, (int)coord.blockY-3,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-3, (int)coord.blockY-2,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-3, (int)coord.blockY-1,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-3, (int)coord.blockY,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-3, (int)coord.blockY+1,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-3, (int)coord.blockY+2,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-3, (int)coord.blockY+3,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-3, (int)coord.blockY+4,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-3, (int)coord.blockY+5,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-3, (int)coord.blockY+6,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-3, (int)coord.blockY+7,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-3, (int)coord.blockY+8,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-3, (int)coord.blockY+9,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-3, (int)coord.blockY+10,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-3, (int)coord.blockY+11,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-3, (int)coord.blockY+12,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-3, (int)coord.blockY+13,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-3, (int)coord.blockY+14,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-3, (int)coord.blockY+15,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-3, (int)coord.blockY+16,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                
                                par2World.setBlock((int)coord.blockX-4, (int)coord.blockY-6,(int) coord.blockZ+9, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-4, (int)coord.blockY-5,(int) coord.blockZ+9, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-4, (int)coord.blockY-4,(int) coord.blockZ+9, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-4, (int)coord.blockY-3,(int) coord.blockZ+9, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-4, (int)coord.blockY-2,(int) coord.blockZ+9, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-4, (int)coord.blockY-1,(int) coord.blockZ+9, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-4, (int)coord.blockY,(int) coord.blockZ+9, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-4, (int)coord.blockY+1,(int) coord.blockZ+9, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-4, (int)coord.blockY+2,(int) coord.blockZ+9, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-4, (int)coord.blockY+3,(int) coord.blockZ+9, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-4, (int)coord.blockY+4,(int) coord.blockZ+9, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-4, (int)coord.blockY+5,(int) coord.blockZ+9, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-4, (int)coord.blockY+6,(int) coord.blockZ+9, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-4, (int)coord.blockY+7,(int) coord.blockZ+9, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-4, (int)coord.blockY+8,(int) coord.blockZ+9, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-4, (int)coord.blockY+9,(int) coord.blockZ+9, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-4, (int)coord.blockY+10,(int) coord.blockZ+9, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-4, (int)coord.blockY+11,(int) coord.blockZ+9, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-4, (int)coord.blockY+12,(int) coord.blockZ+9, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-4, (int)coord.blockY+13,(int) coord.blockZ+9, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-4, (int)coord.blockY+14,(int) coord.blockZ+9, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-4, (int)coord.blockY+15,(int) coord.blockZ+9, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-4, (int)coord.blockY+16,(int) coord.blockZ+9, Block.cobblestone.blockID);
                                
                                par2World.setBlock((int)coord.blockX-4, (int)coord.blockY-6,(int) coord.blockZ+11, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-4, (int)coord.blockY-5,(int) coord.blockZ+11, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-4, (int)coord.blockY-4,(int) coord.blockZ+11, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-4, (int)coord.blockY-3,(int) coord.blockZ+11, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-4, (int)coord.blockY-2,(int) coord.blockZ+11, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-4, (int)coord.blockY-1,(int) coord.blockZ+11, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-4, (int)coord.blockY,(int) coord.blockZ+11, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-4, (int)coord.blockY+1,(int) coord.blockZ+11, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-4, (int)coord.blockY+2,(int) coord.blockZ+11, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-4, (int)coord.blockY+3,(int) coord.blockZ+11, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-4, (int)coord.blockY+4,(int) coord.blockZ+11, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-4, (int)coord.blockY+5,(int) coord.blockZ+11, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-4, (int)coord.blockY+6,(int) coord.blockZ+11, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-4, (int)coord.blockY+7,(int) coord.blockZ+11, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-4, (int)coord.blockY+8,(int) coord.blockZ+11, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-4, (int)coord.blockY+9,(int) coord.blockZ+11, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-4, (int)coord.blockY+10,(int) coord.blockZ+11, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-4, (int)coord.blockY+11,(int) coord.blockZ+11, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-4, (int)coord.blockY+12,(int) coord.blockZ+11, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-4, (int)coord.blockY+13,(int) coord.blockZ+11, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-4, (int)coord.blockY+14,(int) coord.blockZ+11, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-4, (int)coord.blockY+15,(int) coord.blockZ+11, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-4, (int)coord.blockY+16,(int) coord.blockZ+11, Block.cobblestone.blockID);
                                
                                par2World.setBlock((int)coord.blockX-3, (int)coord.blockY+16,(int) coord.blockZ+11, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-4, (int)coord.blockY+16,(int) coord.blockZ+11, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-4, (int)coord.blockY+16,(int) coord.blockZ+9, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-5, (int)coord.blockY+16,(int) coord.blockZ+11, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-5, (int)coord.blockY+16,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-5, (int)coord.blockY+16,(int) coord.blockZ+9, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-2, (int)coord.blockY+16,(int) coord.blockZ+11, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-1, (int)coord.blockY+16,(int) coord.blockZ+11, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-3, (int)coord.blockY+16,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-2, (int)coord.blockY+16,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-1, (int)coord.blockY+16,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-3, (int)coord.blockY+16,(int) coord.blockZ+9, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-2, (int)coord.blockY+16,(int) coord.blockZ+9, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-1, (int)coord.blockY+16,(int) coord.blockZ+9, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-3, (int)coord.blockY+16,(int) coord.blockZ+12, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-2, (int)coord.blockY+16,(int) coord.blockZ+12, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-1, (int)coord.blockY+16,(int) coord.blockZ+12, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-3, (int)coord.blockY+16,(int) coord.blockZ+8, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-2, (int)coord.blockY+16,(int) coord.blockZ+8, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-1, (int)coord.blockY+16,(int) coord.blockZ+8, Block.cobblestone.blockID);
                                
                                par2World.setBlock((int)coord.blockX-5, (int)coord.blockY+16,(int) coord.blockZ+12, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-4, (int)coord.blockY+16,(int) coord.blockZ+12, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-4, (int)coord.blockY+16,(int) coord.blockZ+8, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-5, (int)coord.blockY+16,(int) coord.blockZ+8, Block.cobblestone.blockID);
                                
                                par2World.setBlock((int)coord.blockX-5, (int)coord.blockY+17,(int) coord.blockZ+12, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-4, (int)coord.blockY+17,(int) coord.blockZ+12, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-4, (int)coord.blockY+17,(int) coord.blockZ+8, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-5, (int)coord.blockY+17,(int) coord.blockZ+8, Block.cobblestone.blockID);
                                
                                par2World.setBlock((int)coord.blockX-5, (int)coord.blockY+18,(int) coord.blockZ+12, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-4, (int)coord.blockY+18,(int) coord.blockZ+12, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-4, (int)coord.blockY+18,(int) coord.blockZ+8, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-5, (int)coord.blockY+18,(int) coord.blockZ+8, Block.cobblestone.blockID);
                                
                                par2World.setBlock((int)coord.blockX-6, (int)coord.blockY+16,(int) coord.blockZ+11, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-6, (int)coord.blockY+16,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-6, (int)coord.blockY+16,(int) coord.blockZ+9, Block.cobblestone.blockID);
                                
                                par2World.setBlock((int)coord.blockX-3, (int)coord.blockY+17,(int) coord.blockZ+12, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-2, (int)coord.blockY+17,(int) coord.blockZ+12, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-1, (int)coord.blockY+17,(int) coord.blockZ+12, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-3, (int)coord.blockY+17,(int) coord.blockZ+8, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-2, (int)coord.blockY+17,(int) coord.blockZ+8, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-1, (int)coord.blockY+17,(int) coord.blockZ+8, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-6, (int)coord.blockY+17,(int) coord.blockZ+11, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-6, (int)coord.blockY+17,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-6, (int)coord.blockY+17,(int) coord.blockZ+9, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-3, (int)coord.blockY+18,(int) coord.blockZ+12, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-2, (int)coord.blockY+18,(int) coord.blockZ+12, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-1, (int)coord.blockY+18,(int) coord.blockZ+12, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-3, (int)coord.blockY+18,(int) coord.blockZ+8, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-2, (int)coord.blockY+18,(int) coord.blockZ+8, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-1, (int)coord.blockY+18,(int) coord.blockZ+8, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-6, (int)coord.blockY+18,(int) coord.blockZ+11, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-6, (int)coord.blockY+18,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-6, (int)coord.blockY+18,(int) coord.blockZ+9, Block.cobblestone.blockID);
                                
                                par2World.setBlockToAir((int)coord.blockX, (int)coord.blockY+17,(int) coord.blockZ+10);
                                par2World.setBlockToAir((int)coord.blockX, (int)coord.blockY+18,(int) coord.blockZ+10);
                                
                                /*par2World.setBlock((int)coord.blockX, (int)coord.blockY+16,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX+1, (int)coord.blockY+16,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-1, (int)coord.blockY+17,(int) coord.blockZ+10, Block.pressurePlateStone.blockID);
                                par2World.setBlock((int)coord.blockX-1, (int)coord.blockY+14,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-1, (int)coord.blockY+14,(int) coord.blockZ+9, Block.torchRedstoneIdle.blockID);
                                par2World.setBlock((int)coord.blockX, (int)coord.blockY+13,(int) coord.blockZ+9, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX, (int)coord.blockY+14,(int) coord.blockZ+9, Block.redstoneWire.blockID);
                                par2World.setBlock((int)coord.blockX+1, (int)coord.blockY+13,(int) coord.blockZ+9, Block.torchRedstoneIdle.blockID);
                                par2World.setBlock((int)coord.blockX+1, (int)coord.blockY+13,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX+1, (int)coord.blockY+14,(int) coord.blockZ+10, Block.torchRedstoneIdle.blockID);
                                par2World.setBlock((int)coord.blockX+2, (int)coord.blockY+12,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX+3, (int)coord.blockY+12,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX+2, (int)coord.blockY+12,(int) coord.blockZ+9, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX+3, (int)coord.blockY+12,(int) coord.blockZ+9, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX+3, (int)coord.blockY+13,(int) coord.blockZ+10, Block.redstoneWire.blockID);
                                par2World.setBlock((int)coord.blockX+2, (int)coord.blockY+12,(int) coord.blockZ+9, Block.redstoneWire.blockID);
                                par2World.setBlock((int)coord.blockX+3, (int)coord.blockY+12,(int) coord.blockZ+9, Block.redstoneWire.blockID);
                                par2World.setBlock((int)coord.blockX+2, (int)coord.blockY+13,(int) coord.blockZ+10, Block.redstoneRepeaterIdle.blockID);
                                par2World.setBlock((int)coord.blockX+1, (int)coord.blockY+14,(int) coord.blockZ+10, Block.pistonStickyBase.blockID);*/
                                
                                par2World.setBlock((int)coord.blockX, (int)coord.blockY+16,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX+1, (int)coord.blockY+16,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-1, (int)coord.blockY+17,(int) coord.blockZ+10, Block.pressurePlateStone.blockID);
                                par2World.setBlock((int)coord.blockX-1, (int)coord.blockY+14,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-1, (int)coord.blockY+14,(int) coord.blockZ+11, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-1, (int)coord.blockY+14,(int) coord.blockZ+12, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-2, (int)coord.blockY+14,(int) coord.blockZ+12, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-2, (int)coord.blockY+14,(int) coord.blockZ+13, Block.cobblestone.blockID);
                                
                                par2World.setBlock((int)coord.blockX-1, (int)coord.blockY+15,(int) coord.blockZ+10, Block.redstoneWire.blockID);
                                par2World.setBlock((int)coord.blockX-1, (int)coord.blockY+15,(int) coord.blockZ+11, Block.redstoneWire.blockID);
                                par2World.setBlock((int)coord.blockX-1, (int)coord.blockY+15,(int) coord.blockZ+12, Block.redstoneWire.blockID);
                                par2World.setBlock((int)coord.blockX-2, (int)coord.blockY+15,(int) coord.blockZ+12, Block.redstoneWire.blockID);
                                par2World.setBlock((int)coord.blockX-2, (int)coord.blockY+15,(int) coord.blockZ+13, Block.redstoneWire.blockID); 
                                
                                par2World.setBlock((int)coord.blockX-2, (int)coord.blockY+15,(int) coord.blockZ+14, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-2, (int)coord.blockY+16,(int) coord.blockZ+14, Block.torchRedstoneIdle.blockID);
                                par2World.setBlock((int)coord.blockX-2, (int)coord.blockY+17,(int) coord.blockZ+14, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-2, (int)coord.blockY+18,(int) coord.blockZ+14, Block.torchRedstoneIdle.blockID);
                                par2World.setBlock((int)coord.blockX-2, (int)coord.blockY+19,(int) coord.blockZ+14, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-2, (int)coord.blockY+20,(int) coord.blockZ+14, Block.torchRedstoneIdle.blockID);
                                par2World.setBlock((int)coord.blockX-2, (int)coord.blockY+21,(int) coord.blockZ+14, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-1, (int)coord.blockY+20,(int) coord.blockZ+14, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX-1, (int)coord.blockY+21,(int) coord.blockZ+14, Block.redstoneWire.blockID);
                                par2World.setBlock((int)coord.blockX, (int)coord.blockY+21,(int) coord.blockZ+14, Block.redstoneWire.blockID);
                                par2World.setBlock((int)coord.blockX, (int)coord.blockY+21,(int) coord.blockZ+13, Block.redstoneWire.blockID);
                                par2World.setBlock((int)coord.blockX, (int)coord.blockY+21,(int) coord.blockZ+12, Block.redstoneWire.blockID);
                                par2World.setBlock((int)coord.blockX, (int)coord.blockY+21,(int) coord.blockZ+11, Block.redstoneWire.blockID);
                                par2World.setBlock((int)coord.blockX, (int)coord.blockY+21,(int) coord.blockZ+10, Block.stoneBrick.blockID);
                                
                                par2World.setBlock((int)coord.blockX-1, (int)coord.blockY+20,(int) coord.blockZ+10, Block.stoneBrick.blockID);
                                par2World.setBlock((int)coord.blockX-1, (int)coord.blockY+19,(int) coord.blockZ+10, Block.stoneBrick.blockID);
                                par2World.setBlock((int)coord.blockX-1, (int)coord.blockY+19,(int) coord.blockZ+9, Block.stoneBrick.blockID);
                                par2World.setBlock((int)coord.blockX-1, (int)coord.blockY+19,(int) coord.blockZ+11, Block.stoneBrick.blockID);
                                par2World.setBlock((int)coord.blockX+1, (int)coord.blockY+20,(int) coord.blockZ+10, Block.stoneBrick.blockID);
                                par2World.setBlock((int)coord.blockX+1, (int)coord.blockY+19,(int) coord.blockZ+10, Block.stoneBrick.blockID);
                                par2World.setBlock((int)coord.blockX+1, (int)coord.blockY+19,(int) coord.blockZ+9, Block.stoneBrick.blockID);
                                par2World.setBlock((int)coord.blockX+1, (int)coord.blockY+19,(int) coord.blockZ+11, Block.stoneBrick.blockID);
                                par2World.setBlock((int)coord.blockX, (int)coord.blockY+18,(int) coord.blockZ+11, Block.stoneBrick.blockID);
                                par2World.setBlock((int)coord.blockX, (int)coord.blockY+20,(int) coord.blockZ+10, Block.pistonStickyBase.blockID);
                                
                                
                }
        }
                par1ItemStack.damageItem(50, par3EntityPlayer);
				return par1ItemStack;
}
}
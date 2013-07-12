package com.addeditems;

import java.util.List;
import java.util.Random;

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

public class QuickBaseWand extends ItemSword {

        public QuickBaseWand(int par1, EnumToolMaterial par2EnumToolMaterial) {
                super(par1, par2EnumToolMaterial);
                this.setCreativeTab(CreativeTabs.tabTools);
        }

        public void registerIcons(IconRegister iconReg) {
                itemIcon = iconReg.registerIcon("pabimodbase:QuickBaseWand");
        }
        
        /**
         * When used (right clicked with it) create a quick house/base for you placing block at selected coords.
         */
        public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World,EntityPlayer par3EntityPlayer) 
        {
                if (!par2World.isRemote)
                {
                        par3EntityPlayer.posY++;
                        MovingObjectPosition coord = par3EntityPlayer.rayTrace(500, 1);
                        if (coord != null)
                        {
                                
                                int height = 4;
                                int length = 10;
                                int depth = 10;
                                coord.blockX -= length/2;
                                coord.blockZ -= depth/2;
                                //int number = 0;
                                
                                /*do{
                                	par2World.setBlockToAir((int)coord.blockX, (int)coord.blockY++,(int) coord.blockZ + number);
                                	par2World.setBlockToAir((int)coord.blockX + number, (int)coord.blockY++,(int) coord.blockZ);
                                	number = number + 1;
                                }
                                while (number < 10);*/
                                
                                for (int j = 0; j < length; j ++)
                                {
                                        for (int k = 0; k < depth; k ++)
                                        {
                                                par2World.setBlock((int)coord.blockX+j, (int)coord.blockY,(int) coord.blockZ+k, Block.cobblestone.blockID);
                                        }
                                }
                                coord.blockY++;
                                for (int i = 0;i < height;i++)
                                {
	                                    /*for (int b = 0; b < length; b ++)
	                                    {
	                                            par2World.setBlockToAir((int)coord.blockX++, (int)coord.blockY,(int) coord.blockZ+1);
	                                            
	                                    }
	                                    for (int b = 0; b < length; b ++)
	                                    {
	                                            par2World.setBlockToAir((int)coord.blockX++, (int)coord.blockY,(int) coord.blockZ+2);
	                                            
	                                    }
	                                    for (int b = 0; b < length; b ++)
	                                    {
	                                            par2World.setBlockToAir((int)coord.blockX++, (int)coord.blockY,(int) coord.blockZ+3);
	                                            
	                                    }
	                                    for (int b = 0; b < length; b ++)
	                                    {
	                                            par2World.setBlockToAir((int)coord.blockX++, (int)coord.blockY,(int) coord.blockZ+4);
	                                            
	                                    }
	                                    for (int b = 0; b < length; b ++)
	                                    {
	                                            par2World.setBlockToAir((int)coord.blockX++, (int)coord.blockY,(int) coord.blockZ+5);
	                                            
	                                    }
	                                    for (int b = 0; b < length; b ++)
	                                    {
	                                            par2World.setBlockToAir((int)coord.blockX++, (int)coord.blockY,(int) coord.blockZ+6);
	                                            
	                                    }
	                                    for (int b = 0; b < length; b ++)
	                                    {
	                                            par2World.setBlockToAir((int)coord.blockX++, (int)coord.blockY,(int) coord.blockZ+7);
	                                            
	                                    }
	                                    for (int b = 0; b < length; b ++)
	                                    {
	                                            par2World.setBlockToAir((int)coord.blockX++, (int)coord.blockY,(int) coord.blockZ+8);
	                                            
	                                    }
	                                    for (int b = 0; b < length; b ++)
	                                    {
	                                            par2World.setBlockToAir((int)coord.blockX++, (int)coord.blockY,(int) coord.blockZ+9);
	                                            
	                                    }*/
                                		for (int j = 0; j < length; j ++)
                                        {
                                                par2World.setBlock((int)coord.blockX++, (int)coord.blockY,(int) coord.blockZ, Block.planks.blockID);
                                                
                                        }
                                        for (int k = 0; k < length; k ++)
                                        {
                                                par2World.setBlock((int)coord.blockX, (int)coord.blockY,(int) coord.blockZ++, Block.planks.blockID);
                                                
                                        }
                                        for (int l = 0; l < length; l ++)
                                        {
                                                par2World.setBlock((int)coord.blockX--, (int)coord.blockY,(int) coord.blockZ, Block.planks.blockID);
                                                
                                        }
                                        for (int m = 0; m< length; m ++)
                                        {
                                                par2World.setBlock((int)coord.blockX, (int)coord.blockY,(int) coord.blockZ--, Block.planks.blockID);
                                                
                                        }
                                        par2World.setBlock((int)coord.blockX, (int)coord.blockY,(int) coord.blockZ, Block.wood.blockID);
                                        par2World.setBlock((int)coord.blockX+10, (int)coord.blockY,(int) coord.blockZ+10, Block.wood.blockID);
                                        par2World.setBlock((int)coord.blockX+10, (int)coord.blockY,(int) coord.blockZ, Block.wood.blockID);
                                        par2World.setBlock((int)coord.blockX, (int)coord.blockY,(int) coord.blockZ+10, Block.wood.blockID);
                                        par2World.setBlock((int)coord.blockX+5, (int)coord.blockY,(int) coord.blockZ, Block.wood.blockID);
                                        par2World.setBlock((int)coord.blockX+5, (int)coord.blockY,(int) coord.blockZ, Block.wood.blockID);
                                        par2World.setBlock((int)coord.blockX+5, (int)coord.blockY,(int) coord.blockZ+10, Block.wood.blockID);
                                        par2World.setBlock((int)coord.blockX+10, (int)coord.blockY,(int) coord.blockZ+5, Block.wood.blockID);
                                        par2World.setBlock((int)coord.blockX, (int)coord.blockY,(int) coord.blockZ+5, Block.wood.blockID);
                                        
                                        
                                coord.blockY++;
                                }
                                coord.blockY--;
                                for (int j = 0; j < length; j ++)
                                {
                                        for (int k = 0; k < depth; k ++)
                                        {
                                                par2World.setBlock((int)coord.blockX+j, (int)coord.blockY,(int) coord.blockZ+k, Block.glass.blockID);
                                        }
                                }
                                par2World.setBlock((int)coord.blockX+9, (int)coord.blockY-3,(int) coord.blockZ+9, Block.workbench.blockID);
                                par2World.setBlock((int)coord.blockX+9, (int)coord.blockY-3,(int) coord.blockZ+8, Block.furnaceBurning.blockID);
                                par2World.setBlock((int)coord.blockX+9, (int)coord.blockY-2,(int) coord.blockZ+9, Block.furnaceIdle.blockID);
                                par2World.setBlock((int)coord.blockX+9, (int)coord.blockY-2,(int) coord.blockZ+8, Block.furnaceIdle.blockID);
                                par2World.setBlock((int)coord.blockX+2, (int)coord.blockY-3,(int) coord.blockZ+1, Block.enderChest.blockID);
                                par2World.setBlock((int)coord.blockX+4, (int)coord.blockY-3,(int) coord.blockZ+1, Block.chest.blockID);
                                par2World.setBlock((int)coord.blockX+5, (int)coord.blockY-3,(int) coord.blockZ+1, Block.chest.blockID);
                                
                                par2World.setBlock((int)coord.blockX+9, (int)coord.blockY,(int) coord.blockZ, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+8, (int)coord.blockY,(int) coord.blockZ, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+7, (int)coord.blockY,(int) coord.blockZ, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+6, (int)coord.blockY,(int) coord.blockZ, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+5, (int)coord.blockY,(int) coord.blockZ, Block.wood.blockID);
                                par2World.setBlock((int)coord.blockX+4, (int)coord.blockY,(int) coord.blockZ, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+3, (int)coord.blockY,(int) coord.blockZ, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+2, (int)coord.blockY,(int) coord.blockZ, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+1, (int)coord.blockY,(int) coord.blockZ, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX, (int)coord.blockY,(int) coord.blockZ, Block.wood.blockID);
                                par2World.setBlock((int)coord.blockX, (int)coord.blockY,(int) coord.blockZ+9, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX, (int)coord.blockY,(int) coord.blockZ+8, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX, (int)coord.blockY,(int) coord.blockZ+7, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX, (int)coord.blockY,(int) coord.blockZ+6, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX, (int)coord.blockY,(int) coord.blockZ+5, Block.wood.blockID);
                                par2World.setBlock((int)coord.blockX, (int)coord.blockY,(int) coord.blockZ+4, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX, (int)coord.blockY,(int) coord.blockZ+3, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX, (int)coord.blockY,(int) coord.blockZ+2, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX, (int)coord.blockY,(int) coord.blockZ+1, Block.planks.blockID);
                                
                                par2World.setBlock((int)coord.blockX+10, (int)coord.blockY-4,(int) coord.blockZ, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX+9, (int)coord.blockY-4,(int) coord.blockZ, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX+8, (int)coord.blockY-4,(int) coord.blockZ, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX+7, (int)coord.blockY-4,(int) coord.blockZ, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX+6, (int)coord.blockY-4,(int) coord.blockZ, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX+5, (int)coord.blockY-4,(int) coord.blockZ, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX+4, (int)coord.blockY-4,(int) coord.blockZ, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX+3, (int)coord.blockY-4,(int) coord.blockZ, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX+2, (int)coord.blockY-4,(int) coord.blockZ, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX+1, (int)coord.blockY-4,(int) coord.blockZ, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX, (int)coord.blockY-4,(int) coord.blockZ, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX, (int)coord.blockY-4,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX, (int)coord.blockY-4,(int) coord.blockZ+9, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX, (int)coord.blockY-4,(int) coord.blockZ+8, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX, (int)coord.blockY-4,(int) coord.blockZ+7, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX, (int)coord.blockY-4,(int) coord.blockZ+6, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX, (int)coord.blockY-4,(int) coord.blockZ+5, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX, (int)coord.blockY-4,(int) coord.blockZ+4, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX, (int)coord.blockY-4,(int) coord.blockZ+3, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX, (int)coord.blockY-4,(int) coord.blockZ+2, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX, (int)coord.blockY-4,(int) coord.blockZ+1, Block.cobblestone.blockID);
                                
                                par2World.setBlock((int)coord.blockX+10, (int)coord.blockY-4,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX+9, (int)coord.blockY-4,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX+8, (int)coord.blockY-4,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX+7, (int)coord.blockY-4,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX+6, (int)coord.blockY-4,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX+5, (int)coord.blockY-4,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX+4, (int)coord.blockY-4,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX+3, (int)coord.blockY-4,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX+2, (int)coord.blockY-4,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX+1, (int)coord.blockY-4,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX, (int)coord.blockY-4,(int) coord.blockZ, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX+10, (int)coord.blockY-4,(int) coord.blockZ+9, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX+10, (int)coord.blockY-4,(int) coord.blockZ+10, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX+10, (int)coord.blockY-4,(int) coord.blockZ+8, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX+10, (int)coord.blockY-4,(int) coord.blockZ+7, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX+10, (int)coord.blockY-4,(int) coord.blockZ+6, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX+10, (int)coord.blockY-4,(int) coord.blockZ+5, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX+10, (int)coord.blockY-4,(int) coord.blockZ+4, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX+10, (int)coord.blockY-4,(int) coord.blockZ+3, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX+10, (int)coord.blockY-4,(int) coord.blockZ+2, Block.cobblestone.blockID);
                                par2World.setBlock((int)coord.blockX+10, (int)coord.blockY-4,(int) coord.blockZ+1, Block.cobblestone.blockID);
                                
                                par2World.setBlock((int)coord.blockX+3, (int)coord.blockY-2,(int) coord.blockZ+10, Block.stone.blockID-1);
                                par2World.setBlock((int)coord.blockX+3, (int)coord.blockY-3,(int) coord.blockZ+10, Block.fenceGate.blockID);
                                
                                par2World.setBlock((int)coord.blockX+1, (int)coord.blockY-2,(int) coord.blockZ+7, Block.torchWood.blockID);
                                par2World.setBlock((int)coord.blockX+1, (int)coord.blockY-2,(int) coord.blockZ+8, Block.torchWood.blockID);
                                par2World.setBlock((int)coord.blockX+1, (int)coord.blockY-2,(int) coord.blockZ+3, Block.torchWood.blockID);
                                par2World.setBlock((int)coord.blockX+1, (int)coord.blockY-2,(int) coord.blockZ+2, Block.torchWood.blockID);
                                par2World.setBlock((int)coord.blockX+7, (int)coord.blockY-2,(int) coord.blockZ+1, Block.torchWood.blockID);
                                par2World.setBlock((int)coord.blockX+6, (int)coord.blockY-2,(int) coord.blockZ+1, Block.torchWood.blockID);
                                //par2World.setBlock((int)coord.blockX+3, (int)coord.blockY-2,(int) coord.blockZ+1, Block.torchWood.blockID);
                                //par2World.setBlock((int)coord.blockX+2, (int)coord.blockY-2,(int) coord.blockZ+1, Block.torchWood.blockID);
                                
                                par2World.setBlock((int)coord.blockX+9, (int)coord.blockY-2,(int) coord.blockZ+7, Block.torchWood.blockID);
                                par2World.setBlock((int)coord.blockX+9, (int)coord.blockY-2,(int) coord.blockZ+6, Block.torchWood.blockID);
                                par2World.setBlock((int)coord.blockX+9, (int)coord.blockY-2,(int) coord.blockZ+3, Block.torchWood.blockID);
                                par2World.setBlock((int)coord.blockX+9, (int)coord.blockY-2,(int) coord.blockZ+2, Block.torchWood.blockID);
                                //par2World.setBlock((int)coord.blockX+7, (int)coord.blockY-2,(int) coord.blockZ+9, Block.torchWood.blockID);
                                //par2World.setBlock((int)coord.blockX+6, (int)coord.blockY-2,(int) coord.blockZ+9, Block.torchWood.blockID);
                                //par2World.setBlock((int)coord.blockX+3, (int)coord.blockY-2,(int) coord.blockZ+9, Block.torchWood.blockID);
                                par2World.setBlock((int)coord.blockX+2, (int)coord.blockY-2,(int) coord.blockZ+9, Block.torchWood.blockID);
                                
                                par2World.setBlock((int)coord.blockX+9, (int)coord.blockY-3,(int) coord.blockZ+1, Block.stairsWoodOak.blockID);
                                par2World.setBlock((int)coord.blockX+9, (int)coord.blockY-3,(int) coord.blockZ+2, Block.stairsWoodOak.blockID);
                                par2World.setBlock((int)coord.blockX+9, (int)coord.blockY-3,(int) coord.blockZ+3, Block.stairsWoodOak.blockID);
                                par2World.setBlock((int)coord.blockX+7, (int)coord.blockY-3,(int) coord.blockZ+2, Block.planks.blockID);
                                
                                par2World.setBlock((int)coord.blockX, (int)coord.blockY-2,(int) coord.blockZ+4, Block.brick.blockID);
                                par2World.setBlock((int)coord.blockX, (int)coord.blockY-2,(int) coord.blockZ+5, Block.brick.blockID);
                                par2World.setBlock((int)coord.blockX, (int)coord.blockY-2,(int) coord.blockZ+6, Block.brick.blockID);
                                par2World.setBlock((int)coord.blockX, (int)coord.blockY-3,(int) coord.blockZ+4, Block.brick.blockID);
                                par2World.setBlock((int)coord.blockX, (int)coord.blockY-3,(int) coord.blockZ+5, Block.stone.blockID-1);
                                par2World.setBlock((int)coord.blockX, (int)coord.blockY-3,(int) coord.blockZ+6, Block.brick.blockID);
                                par2World.setBlock((int)coord.blockX, (int)coord.blockY-4,(int) coord.blockZ+4, Block.brick.blockID);
                                par2World.setBlock((int)coord.blockX, (int)coord.blockY-4,(int) coord.blockZ+5, Block.brick.blockID);
                                par2World.setBlock((int)coord.blockX, (int)coord.blockY-4,(int) coord.blockZ+6, Block.brick.blockID);
                                par2World.setBlock((int)coord.blockX-1, (int)coord.blockY-2,(int) coord.blockZ+4, Block.brick.blockID);
                                par2World.setBlock((int)coord.blockX-1, (int)coord.blockY-2,(int) coord.blockZ+6, Block.brick.blockID);
                                par2World.setBlock((int)coord.blockX-1, (int)coord.blockY-4,(int) coord.blockZ+4, Block.brick.blockID);
                                par2World.setBlock((int)coord.blockX-1, (int)coord.blockY-4,(int) coord.blockZ+5, Block.netherrack.blockID);
                                par2World.setBlock((int)coord.blockX-1, (int)coord.blockY-4,(int) coord.blockZ+6, Block.brick.blockID);
                                par2World.setBlock((int)coord.blockX-1, (int)coord.blockY-3,(int) coord.blockZ+4, Block.brick.blockID);
                                par2World.setBlock((int)coord.blockX-1, (int)coord.blockY-3,(int) coord.blockZ+5, Block.fire.blockID);
                                par2World.setBlock((int)coord.blockX-1, (int)coord.blockY-3,(int) coord.blockZ+6, Block.brick.blockID);
                                par2World.setBlock((int)coord.blockX-2, (int)coord.blockY-2,(int) coord.blockZ+4, Block.brick.blockID);
                                par2World.setBlock((int)coord.blockX-2, (int)coord.blockY-2,(int) coord.blockZ+5, Block.brick.blockID);
                                par2World.setBlock((int)coord.blockX-2, (int)coord.blockY-2,(int) coord.blockZ+6, Block.brick.blockID);
                                par2World.setBlock((int)coord.blockX-2, (int)coord.blockY-3,(int) coord.blockZ+4, Block.brick.blockID);
                                par2World.setBlock((int)coord.blockX-2, (int)coord.blockY-3,(int) coord.blockZ+5, Block.brick.blockID);
                                par2World.setBlock((int)coord.blockX-2, (int)coord.blockY-3,(int) coord.blockZ+6, Block.brick.blockID);
                                par2World.setBlock((int)coord.blockX-2, (int)coord.blockY-4,(int) coord.blockZ+4, Block.brick.blockID);
                                par2World.setBlock((int)coord.blockX-2, (int)coord.blockY-4,(int) coord.blockZ+5, Block.brick.blockID);
                                par2World.setBlock((int)coord.blockX-2, (int)coord.blockY-4,(int) coord.blockZ+6, Block.brick.blockID);
                                par2World.setBlock((int)coord.blockX-1, (int)coord.blockY-2,(int) coord.blockZ+5, Block.brick.blockID);
                                par2World.setBlock((int)coord.blockX, (int)coord.blockY-2,(int) coord.blockZ+5, Block.brick.blockID);
                                par2World.setBlock((int)coord.blockX, (int)coord.blockY-1,(int) coord.blockZ+5, Block.brick.blockID);
                                par2World.setBlock((int)coord.blockX, (int)coord.blockY,(int) coord.blockZ+5, Block.brick.blockID);
                                par2World.setBlock((int)coord.blockX, (int)coord.blockY+1,(int) coord.blockZ+5, Block.brick.blockID);
                                par2World.setBlock((int)coord.blockX-2, (int)coord.blockY-2,(int) coord.blockZ+5, Block.brick.blockID);
                                par2World.setBlock((int)coord.blockX-2, (int)coord.blockY-1,(int) coord.blockZ+5, Block.brick.blockID);
                                par2World.setBlock((int)coord.blockX-2, (int)coord.blockY,(int) coord.blockZ+5, Block.brick.blockID);
                                par2World.setBlock((int)coord.blockX-2, (int)coord.blockY+1,(int) coord.blockZ+5, Block.brick.blockID);
                                par2World.setBlock((int)coord.blockX-1, (int)coord.blockY-2,(int) coord.blockZ+6, Block.brick.blockID);
                                par2World.setBlock((int)coord.blockX-1, (int)coord.blockY-1,(int) coord.blockZ+6, Block.brick.blockID);
                                par2World.setBlock((int)coord.blockX-1, (int)coord.blockY,(int) coord.blockZ+6, Block.brick.blockID);
                                par2World.setBlock((int)coord.blockX-1, (int)coord.blockY+1,(int) coord.blockZ+6, Block.brick.blockID);
                                par2World.setBlock((int)coord.blockX-1, (int)coord.blockY-2,(int) coord.blockZ+4, Block.brick.blockID);
                                par2World.setBlock((int)coord.blockX-1, (int)coord.blockY-1,(int) coord.blockZ+4, Block.brick.blockID);
                                par2World.setBlock((int)coord.blockX-1, (int)coord.blockY,(int) coord.blockZ+4, Block.brick.blockID);
                                par2World.setBlock((int)coord.blockX-1, (int)coord.blockY+1,(int) coord.blockZ+4, Block.brick.blockID);
                                par2World.setBlock((int)coord.blockX-3, (int)coord.blockY-4,(int) coord.blockZ+5, Block.brick.blockID);
                                par2World.setBlock((int)coord.blockX-3, (int)coord.blockY-3,(int) coord.blockZ+5, Block.brick.blockID);
                                
                                par2World.setBlock((int)coord.blockX-1, (int)coord.blockY,(int) coord.blockZ+5, Block.netherrack.blockID);
                                par2World.setBlock((int)coord.blockX-1, (int)coord.blockY+1,(int) coord.blockZ+5, Block.fire.blockID);
                                par2World.setBlock((int)coord.blockX, (int)coord.blockY+1,(int) coord.blockZ+6, Block.brick.blockID);
                                par2World.setBlock((int)coord.blockX, (int)coord.blockY+1,(int) coord.blockZ+4, Block.brick.blockID);
                                par2World.setBlock((int)coord.blockX+2, (int)coord.blockY-3,(int) coord.blockZ+5, Block.woodSingleSlab.blockID);
                                par2World.setBlock((int)coord.blockX+3, (int)coord.blockY-3,(int) coord.blockZ+5, Block.stairsWoodOak.blockID);
                                
                                par2World.setBlock((int)coord.blockX+4, (int)coord.blockY-2,(int) coord.blockZ+9, Block.torchWood.blockID);
                                par2World.setBlock((int)coord.blockX+6, (int)coord.blockY-2,(int) coord.blockZ+10, Block.glass.blockID);
                                par2World.setBlock((int)coord.blockX+7, (int)coord.blockY-2,(int) coord.blockZ+10, Block.glass.blockID);
                                par2World.setBlock((int)coord.blockX+8, (int)coord.blockY-2,(int) coord.blockZ+10, Block.glass.blockID);
                                par2World.setBlock((int)coord.blockX+2, (int)coord.blockY-2,(int) coord.blockZ, Block.glass.blockID);
                                par2World.setBlock((int)coord.blockX+3, (int)coord.blockY-2,(int) coord.blockZ, Block.glass.blockID);
                                
                                
                                
                        }
                        
                        
                        par3EntityPlayer.posY--;
                }
                par1ItemStack.damageItem(50, par3EntityPlayer);
                return par1ItemStack;
        }
}
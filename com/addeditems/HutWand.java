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

public class HutWand extends ItemSword {

        public HutWand(int par1, EnumToolMaterial par2EnumToolMaterial) {
                super(par1, par2EnumToolMaterial);
                this.setCreativeTab(CreativeTabs.tabTools);
        }

        public void registerIcons(IconRegister iconReg) {
                itemIcon = iconReg.registerIcon("pabimodbase:QuickHutWand");
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
                            int length = 7;
                            int depth = 7;
                            coord.blockX -= length/2;
                            coord.blockZ -= depth/2;
                            
                                par2World.setBlock((int)coord.blockX, (int)coord.blockY+1,(int) coord.blockZ, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX, (int)coord.blockY+1,(int) coord.blockZ+1, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX, (int)coord.blockY+1,(int) coord.blockZ+2, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX, (int)coord.blockY+1,(int) coord.blockZ+3, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX, (int)coord.blockY+1,(int) coord.blockZ+4, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX, (int)coord.blockY+1,(int) coord.blockZ+5, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX, (int)coord.blockY+1,(int) coord.blockZ+6, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+1, (int)coord.blockY+2,(int) coord.blockZ, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+1, (int)coord.blockY+2,(int) coord.blockZ+1, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+1, (int)coord.blockY+2,(int) coord.blockZ+2, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+1, (int)coord.blockY+2,(int) coord.blockZ+3, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+1, (int)coord.blockY+2,(int) coord.blockZ+4, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+1, (int)coord.blockY+2,(int) coord.blockZ+5, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+1, (int)coord.blockY+2,(int) coord.blockZ+6, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+2, (int)coord.blockY+3,(int) coord.blockZ, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+2, (int)coord.blockY+3,(int) coord.blockZ+1, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+2, (int)coord.blockY+3,(int) coord.blockZ+2, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+2, (int)coord.blockY+3,(int) coord.blockZ+3, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+2, (int)coord.blockY+3,(int) coord.blockZ+4, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+2, (int)coord.blockY+3,(int) coord.blockZ+5, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+2, (int)coord.blockY+3,(int) coord.blockZ+6, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+3, (int)coord.blockY+4,(int) coord.blockZ, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+3, (int)coord.blockY+4,(int) coord.blockZ+1, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+3, (int)coord.blockY+4,(int) coord.blockZ+2, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+3, (int)coord.blockY+4,(int) coord.blockZ+3, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+3, (int)coord.blockY+4,(int) coord.blockZ+4, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+3, (int)coord.blockY+4,(int) coord.blockZ+5, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+3, (int)coord.blockY+4,(int) coord.blockZ+6, Block.planks.blockID);
                                
                                par2World.setBlock((int)coord.blockX+6, (int)coord.blockY+1,(int) coord.blockZ, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+6, (int)coord.blockY+1,(int) coord.blockZ+1, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+6, (int)coord.blockY+1,(int) coord.blockZ+2, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+6, (int)coord.blockY+1,(int) coord.blockZ+3, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+6, (int)coord.blockY+1,(int) coord.blockZ+4, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+6, (int)coord.blockY+1,(int) coord.blockZ+5, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+6, (int)coord.blockY+1,(int) coord.blockZ+6, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+5, (int)coord.blockY+2,(int) coord.blockZ, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+5, (int)coord.blockY+2,(int) coord.blockZ+1, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+5, (int)coord.blockY+2,(int) coord.blockZ+2, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+5, (int)coord.blockY+2,(int) coord.blockZ+3, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+5, (int)coord.blockY+2,(int) coord.blockZ+4, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+5, (int)coord.blockY+2,(int) coord.blockZ+5, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+5, (int)coord.blockY+2,(int) coord.blockZ+6, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+4, (int)coord.blockY+3,(int) coord.blockZ, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+4, (int)coord.blockY+3,(int) coord.blockZ+1, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+4, (int)coord.blockY+3,(int) coord.blockZ+2, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+4, (int)coord.blockY+3,(int) coord.blockZ+3, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+4, (int)coord.blockY+3,(int) coord.blockZ+4, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+4, (int)coord.blockY+3,(int) coord.blockZ+5, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+4, (int)coord.blockY+3,(int) coord.blockZ+6, Block.planks.blockID);
                                
                                par2World.setBlock((int)coord.blockX+1, (int)coord.blockY+1,(int) coord.blockZ, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+2, (int)coord.blockY+1,(int) coord.blockZ, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+2, (int)coord.blockY+2,(int) coord.blockZ, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+3, (int)coord.blockY+1,(int) coord.blockZ, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+3, (int)coord.blockY+2,(int) coord.blockZ, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+3, (int)coord.blockY+3,(int) coord.blockZ, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+4, (int)coord.blockY+1,(int) coord.blockZ, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+4, (int)coord.blockY+2,(int) coord.blockZ, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+5, (int)coord.blockY+1,(int) coord.blockZ, Block.planks.blockID);
                                
                                par2World.setBlock((int)coord.blockX+1, (int)coord.blockY+1,(int) coord.blockZ+6, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+2, (int)coord.blockY+1,(int) coord.blockZ+6, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+2, (int)coord.blockY+2,(int) coord.blockZ+6, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+3, (int)coord.blockY+1,(int) coord.blockZ+6, Block.web.blockID);
                                par2World.setBlock((int)coord.blockX+3, (int)coord.blockY+2,(int) coord.blockZ+6, Block.web.blockID);
                                par2World.setBlock((int)coord.blockX+3, (int)coord.blockY+3,(int) coord.blockZ+6, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+4, (int)coord.blockY+1,(int) coord.blockZ+6, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+4, (int)coord.blockY+2,(int) coord.blockZ+6, Block.planks.blockID);
                                par2World.setBlock((int)coord.blockX+5, (int)coord.blockY+1,(int) coord.blockZ+6, Block.planks.blockID);
                                
                                par2World.setBlock((int)coord.blockX+1, (int)coord.blockY+1,(int) coord.blockZ+2, Block.workbench.blockID);
                                par2World.setBlock((int)coord.blockX+1, (int)coord.blockY+1,(int) coord.blockZ+3, Block.furnaceIdle.blockID);
                                par2World.setBlock((int)coord.blockX+1, (int)coord.blockY+1,(int) coord.blockZ+4, Block.furnaceIdle.blockID);
                                
                                par2World.setBlock((int)coord.blockX+2, (int)coord.blockY+2,(int) coord.blockZ+4, Block.torchWood.blockID);
                                par2World.setBlock((int)coord.blockX+2, (int)coord.blockY+2,(int) coord.blockZ+2, Block.torchWood.blockID);
                                par2World.setBlock((int)coord.blockX+4, (int)coord.blockY+2,(int) coord.blockZ+4, Block.torchWood.blockID);
                                par2World.setBlock((int)coord.blockX+4, (int)coord.blockY+2,(int) coord.blockZ+2, Block.torchWood.blockID);
                                par2World.setBlock((int)coord.blockX+3, (int)coord.blockY+1,(int) coord.blockZ+1, Block.chest.blockID);
                                par2World.setBlock((int)coord.blockX+4, (int)coord.blockY+2,(int) coord.blockZ+7, Block.torchWood.blockID);
                                par2World.setBlock((int)coord.blockX+2, (int)coord.blockY+2,(int) coord.blockZ+7, Block.torchWood.blockID);

                        }
                        
                        
                        par3EntityPlayer.posY--;
                }
                par1ItemStack.damageItem(50, par3EntityPlayer);
                return par1ItemStack;
        }
}
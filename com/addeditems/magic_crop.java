package com.addeditems;

import static net.minecraftforge.common.EnumPlantType.Cave;
import static net.minecraftforge.common.EnumPlantType.Crop;
import static net.minecraftforge.common.EnumPlantType.Desert;
import static net.minecraftforge.common.EnumPlantType.Nether;
import static net.minecraftforge.common.EnumPlantType.Plains;
import static net.minecraftforge.common.EnumPlantType.Water;

import java.util.Random;

import com.Pabi.PabiModBase;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSeeds;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.ForgeDirection;


public class magic_crop extends BlockFlower
{
	
     
	public magic_crop(int par1, Material par2Material) 
    {
		super(par1, par2Material);    
    }
	
    public void registerIcons(IconRegister iconReg) 
    {
        blockIcon = iconReg.registerIcon("PabiModBase:magic_crop");
    }
	            
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z)
	{
	    return null;
	}

	public int getRenderType()
	{
	    return 6;
	}
	public boolean isOpaqueCube()
	{
	    return false;
	}


	public int getBlockTextureFromSideAndMetadata (int side, int metadata)
	{
	return 32 + metadata;
	}

	public void updateTick( World world, int x, int y, int z, Random random)
	{
		if (world.getBlockMetadata(x, y, z)== 1)
		{
		    return;
		}
		if (random.nextInt(isFertile(world, x, y-1, z)? 12:25) != 0)
		{
		    return;
		}
		world.setBlockMetadataWithNotify(x, y, z, 1,0);
	}

	public void onNeighborChange(World world, int x, int y, int z, int neighborId)
	{
		if (!canBlockStay(world, x,y,z))
		{
		    dropBlockAsItem(world, x, y, z, world.getBlockMetadata(x, y, z), 0);
		    world.setBlock(x, y, z, 0);
		    
		}
	}
	public boolean canBlockStay(World world, int x, int y, int z)
	{
		Block soil = blocksList[world.getBlockId(x, y-1, z)];
		return (world.getFullBlockLightValue(x, y, z) >= 8 || world.canBlockSeeTheSky(x, y, z)) && (soil != null && soil.canSustainPlant(world, x, y-1, z, ForgeDirection.UP,PabiModBase.seeds_magic)); 
	            
	
	}

	public int idDropped(int metadata, Random r, int p)
	{
		switch (metadata)
		{
		case 0:
		    return PabiModBase.seeds_magic.itemID;
		case 1:
		    return PabiModBase.magicmelon.itemID;
		default :
		    return -1;
		    
		}
	}

	public int idPicked(World world, int x, int y, int z)
	{
		return PabiModBase.seeds_magic.itemID;
	}
	
	@Override
	public EnumPlantType getPlantType(World world, int x, int y, int z)
	{
		if (blockID == crops.blockID        ) return Crop;
		if (blockID == deadBush.blockID     ) return Desert;
		if (blockID == waterlily.blockID    ) return Water;
		if (blockID == mushroomRed.blockID  ) return Cave;
		if (blockID == mushroomBrown.blockID) return Cave;
		if (blockID == netherStalk.blockID  ) return Nether;
		if (blockID == sapling.blockID      ) return Plains;
		if (blockID == melonStem.blockID    ) return Crop;
		if (blockID == pumpkinStem.blockID  ) return Crop;
		if (blockID == tallGrass.blockID    ) return Plains;
		return Plains;
	}

	@Override
	public int getPlantID(World world, int x, int y, int z)
	{
	return blockID;
	}
	
	@Override
	public int getPlantMetadata(World world, int x, int y, int z)
	{
	return world.getBlockMetadata(x, y, z);
	}
}
package com.Pabi;

import java.util.Random;

import com.addeditems.SuperOre;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class GenerateSuperOre implements IWorldGenerator{
	
	/**
	   * 
	   * This Method adds ore generation. See below what all params mean
	   * 
	   * @param Block which you want to spawn
	   * @param World where you want it to spawn
	   * @param Randomizer used for spawning
	   * @param Start of the Chunk in X-Direction
	   * @param Start of the Chunk in Z-Direction
	   * @param Max X-Size where the block can spawn, normal = 16
	   * @param Max Z-Size where the block can spawn, normal = 16
	   * @param The vain size
	   * @param The chance to spawn a block
	   * @param Minimum Y-level to spawn block
	   * @param Maximum Y-level to spawn block
	   * 
	   */
  
  @Override
  public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
    switch(world.provider.dimensionId){
    case 0:  generateSurface   (world, random, chunkX * 16, chunkZ * 16);
    case 1:  generateEnd     (world, random, chunkX * 16, chunkZ * 16);
    case -1: generateNether      (world, random, chunkX * 16, chunkZ * 16);
    }
  }
  
  /**
   * 
   * Blocks which spawn in the in world automatically such as ores.
   */
  
  public void generateSurface (World world, Random random, int chunkX, int chunkZ){
    for(int i = 0; i < 8; i++){
    	int xCoord = chunkX + random.nextInt(16);
    	int yCoord = random.nextInt(28);
    	int zCoord = chunkZ + random.nextInt(16); 
        
    	(new WorldGenMinable(pabimodbase.SuperOre.blockID, 10)).generate(world, random, xCoord, yCoord, zCoord);
    }
  }
  
  public void generateEnd (World world, Random random, int chunkX, int chunkZ){
    
  }

  public void generateNether (World world, Random random, int chunkX, int chunkZ){
  
  }
}
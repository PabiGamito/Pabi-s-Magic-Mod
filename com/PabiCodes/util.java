package com.PabiCodes;

import com.Pabi.PabiModBase;

import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import cpw.mods.fml.common.registry.GameRegistry;

public class util {
	
	/**
	 * Add variable for items/blocks to use in the crafting recipes.
	 */
	public static void recepies(){
		ItemStack wood = new ItemStack (Block.planks);
		ItemStack wood4 = new ItemStack (Block.planks, 4);
		ItemStack workbench = new ItemStack (Block.workbench);
		ItemStack dirt = new ItemStack (Block.dirt);
		ItemStack golden_apple = new ItemStack (Item.appleGold);
		ItemStack stick = new ItemStack (Item.stick);
		ItemStack diamond_sword = new ItemStack (Item.swordDiamond);
		ItemStack diamond_shovel = new ItemStack (Item.shovelDiamond);
		ItemStack diamond_axe = new ItemStack (Item.axeDiamond);
		ItemStack diamond_hoe = new ItemStack (Item.hoeDiamond);
		ItemStack diamond_pickaxe = new ItemStack (Item.pickaxeDiamond);
		ItemStack diamond_helmet = new ItemStack (Item.helmetDiamond);
		ItemStack diamond_chestplate = new ItemStack (Item.plateDiamond);
		ItemStack diamond_legs = new ItemStack (Item.legsDiamond);
		ItemStack diamond_boots = new ItemStack (Item.bootsDiamond);
		ItemStack iron_sword = new ItemStack (Item.swordIron);
		ItemStack iron_shovel = new ItemStack (Item.shovelIron);
		ItemStack iron_axe = new ItemStack (Item.axeIron);
		ItemStack iron_hoe = new ItemStack (Item.hoeIron);
		ItemStack iron_pickaxe = new ItemStack (Item.pickaxeIron);
		ItemStack iron_helmet = new ItemStack (Item.helmetIron);
		ItemStack iron_chestplate = new ItemStack (Item.plateIron);
		ItemStack iron_legs = new ItemStack (Item.legsIron);
		ItemStack iron_boots = new ItemStack (Item.bootsIron);
		ItemStack chain_helmet = new ItemStack (Item.helmetChain);
		ItemStack chain_chestplate = new ItemStack (Item.plateChain);
		ItemStack chain_legs = new ItemStack (Item.legsChain);
		ItemStack chain_boots = new ItemStack (Item.bootsChain);
		ItemStack sand = new ItemStack (Block.sand);
		ItemStack expBottle = new ItemStack (Item.expBottle);
		ItemStack diamond = new ItemStack (Item.diamond);
		ItemStack iron_ingot = new ItemStack (Item.ingotIron);
		ItemStack Obsidian_Sword = new ItemStack (PabiModBase.SwordObsidian);
		ItemStack obsidian = new ItemStack (Block.obsidian);
		ItemStack Dirt_Sword = new ItemStack (PabiModBase.SwordDirt);
		ItemStack Super_Sword = new ItemStack (PabiModBase.SwordSuper);
		ItemStack Super_Ingot = new ItemStack (PabiModBase.SuperIngot);
		ItemStack Long_Sword_Thunder = new ItemStack (PabiModBase.LongSwordThunder);
		ItemStack Thunder_Sword = new ItemStack (PabiModBase.SwordThunder);
		ItemStack Slime_Ball = new ItemStack (Item.slimeBall);
		ItemStack stone = new ItemStack (Block.stone);
		ItemStack ThorHammer = new ItemStack (PabiModBase.ThorAxe);
		ItemStack SuperBow = new ItemStack (PabiModBase.SuperBow);
		ItemStack Bow = new ItemStack (Item.bow);
		ItemStack Superexpbottle = new ItemStack (PabiModBase.Superexppotion);
		ItemStack Diamondblock = new ItemStack (Block.blockDiamond);
		ItemStack SuperOre = new ItemStack (PabiModBase.SuperOre);
		ItemStack glass = new ItemStack (Block.glass);
		ItemStack Nether_Star = new ItemStack (Item.netherStar);
		ItemStack Wand = new ItemStack (PabiModBase.Wand);
		ItemStack FireWand = new ItemStack (PabiModBase.FireWand);
		ItemStack SnowWand = new ItemStack (PabiModBase.SnowWand);
		ItemStack FlyWand = new ItemStack (PabiModBase.FlyWand);
		ItemStack TnTWand = new ItemStack (PabiModBase.TnTWand);
		ItemStack HealWand = new ItemStack (PabiModBase.HealWand);
		ItemStack Fire_Charge = new ItemStack (Item.fireballCharge);
		ItemStack snowball = new ItemStack (Item.snowball);
		ItemStack feather = new ItemStack (Item.feather);
		ItemStack TnT = new ItemStack (Block.tnt);
		ItemStack soup = new ItemStack (Item.bowlSoup);
		ItemStack SuperSoup = new ItemStack (PabiModBase.SuperSoup);
		ItemStack PoisonWand = new ItemStack (PabiModBase.PoisonWand);
		ItemStack SpiderEye = new ItemStack (Item.spiderEye);
		ItemStack blazerod = new ItemStack (Item.blazeRod);
		ItemStack EnderWand = new ItemStack (PabiModBase.EnderWand);
		ItemStack EarthWand = new ItemStack (PabiModBase.EarthWand);
		ItemStack EnderPearl = new ItemStack (Item.enderPearl);
		ItemStack DayWand = new ItemStack (PabiModBase.DayWand);
		ItemStack NightWand = new ItemStack (PabiModBase.NightWand);
		ItemStack SpeedWand = new ItemStack (PabiModBase.SpeedWand);
		ItemStack Sugar = new ItemStack (Item.sugar);
		ItemStack Clock = new ItemStack (Item.pocketSundial);
		ItemStack glowstone = new ItemStack (Block.glowStone);
		ItemStack HutPart = new ItemStack (PabiModBase.HutPart);
		ItemStack HutWand = new ItemStack (PabiModBase.QuickHutWand);
		ItemStack BaseWand = new ItemStack (PabiModBase.QuickBaseWand);
		ItemStack gold_ingot = new ItemStack (Item.ingotGold);
		ItemStack HousePart = new ItemStack (PabiModBase.HousePart);
		ItemStack Brick = new ItemStack (Block.brick);
		ItemStack cobblestone = new ItemStack (Block.cobblestone);
		ItemStack magicmelonblock = new ItemStack (PabiModBase.magicplant);
		ItemStack magicmelon = new ItemStack (PabiModBase.magicmelon);
		ItemStack LaunchPad = new ItemStack (PabiModBase.LaunchPad);
		ItemStack helmetSuper = new ItemStack (PabiModBase.helmetSuper);
		ItemStack plateSuper = new ItemStack (PabiModBase.chestplateSuper);
		ItemStack legsSuper = new ItemStack (PabiModBase.legsSuper);
		ItemStack bootsSuper = new ItemStack (PabiModBase.bootsSuper);
		ItemStack mobarenawand = new ItemStack (PabiModBase.MobArenaWand);
		ItemStack mobarenapart = new ItemStack (PabiModBase.mobarenapart);
		ItemStack stonebrick = new ItemStack (Block.stoneBrick);
		ItemStack mobhead = new ItemStack (Block.skull);
		
		/**
		 * Add enchantment to items when crafted.
		 */
		SuperBow.addEnchantment(Enchantment.power, 3);
		SuperBow.addEnchantment(Enchantment.infinity, 1);
		SuperBow.addEnchantment(Enchantment.flame, 1);
		
		//GameRegistry.addShapelessRecipe(golden_apple, sand);
		//GameRegistry.addShapedRecipe(diamond_sword," x "," x "," y ",'x', sand,'y', stick);
		//GameRegistry.addShapedRecipe(diamond_shovel," x "," y "," y ",'x', sand,'y', stick);
		//GameRegistry.addShapedRecipe(diamond_axe,"xx ","xy "," y ",'x', sand,'y', stick);
		//GameRegistry.addShapedRecipe(diamond_hoe,"xx "," y "," y ",'x', sand,'y', stick);
		//GameRegistry.addShapedRecipe(diamond_pickaxe,"xxx"," y "," y ",'x', sand,'y', stick);
		//GameRegistry.addShapedRecipe(iron_shovel," x "," y "," y ",'x', dirt,'y', stick);
		//GameRegistry.addShapedRecipe(iron_axe,"xx ","xy "," y ",'x', dirt,'y', stick);
		//GameRegistry.addShapedRecipe(iron_hoe,"xx "," y "," y ",'x', dirt,'y', stick);
		//GameRegistry.addShapedRecipe(iron_pickaxe,"xxx"," y "," y ",'x', dirt,'y', stick);
		//GameRegistry.addShapedRecipe(diamond_helmet,"xxx","x x","   ",'x', sand);
		//GameRegistry.addShapedRecipe(diamond_chestplate,"x x","xxx","xxx",'x', sand);
		//GameRegistry.addShapedRecipe(diamond_legs,"xxx","x x","x x",'x', sand);
		//GameRegistry.addShapedRecipe(diamond_boots,"   ","x x","x x",'x', sand);
		//GameRegistry.addShapedRecipe(iron_helmet,"xxx","x x","   ",'x', dirt);
		//GameRegistry.addShapedRecipe(iron_chestplate,"x x","xxx","xxx",'x', dirt);
		//GameRegistry.addShapedRecipe(iron_legs,"xxx","x x","x x",'x', dirt);
		//GameRegistry.addShapedRecipe(iron_boots,"   ","x x","x x",'x', dirt);
		
		/**
		 * Add custom recipes to games (shapeless and shaped).
		 */
		GameRegistry.addShapelessRecipe(wood4,workbench);
		GameRegistry.addShapelessRecipe(SuperSoup, soup, magicmelon);
		GameRegistry.addShapelessRecipe(SuperBow, Super_Ingot, Bow);
		//GameRegistry.addShapelessRecipe(Super_Ingot, iron_ingot, Slime_Ball);
		GameRegistry.addShapelessRecipe(Thunder_Sword, diamond, Super_Sword);
		
		GameRegistry.addShapedRecipe(Dirt_Sword," x "," x "," y ",'x', dirt,'y', stick);
		GameRegistry.addShapedRecipe(Dirt_Sword,"x  ","x  ","y  ",'x', dirt,'y', stick);
		GameRegistry.addShapedRecipe(chain_helmet,"yxy","x x","   ",'x', iron_ingot,'y', stick);
		GameRegistry.addShapedRecipe(chain_chestplate,"x x","yxy","xyx",'x', iron_ingot,'y', stick);
		GameRegistry.addShapedRecipe(chain_legs,"yxy","x x","y y",'x', iron_ingot,'y', stick);
		GameRegistry.addShapedRecipe(chain_boots,"   ","y x","x y",'x', iron_ingot,'y', stick);
		GameRegistry.addSmelting(Item.diamond.itemID, expBottle, 2000);
		GameRegistry.addSmelting(Block.blockDiamond.blockID, Superexpbottle, 5000);
		GameRegistry.addSmelting(PabiModBase.SuperOre.blockID, Super_Ingot, 5000);
		GameRegistry.addShapedRecipe(Obsidian_Sword," x "," x "," y ",'x', obsidian,'y', stick);
		GameRegistry.addShapedRecipe(Super_Sword," x "," x ","zyz",'x', Super_Ingot,'y', stick,'z', stone);
		GameRegistry.addShapedRecipe(Long_Sword_Thunder,"   "," x "," y ",'x', Super_Ingot,'y', Thunder_Sword);
		GameRegistry.addShapedRecipe(Long_Sword_Thunder,"   ","x  ","y  ",'x', Super_Ingot,'y', Thunder_Sword);
		GameRegistry.addShapedRecipe(Long_Sword_Thunder," x "," y ","   ",'x', Super_Ingot,'y', Thunder_Sword);
		GameRegistry.addShapedRecipe(Long_Sword_Thunder,"x  ","y  ","   ",'x', Super_Ingot,'y', Thunder_Sword);
		GameRegistry.addShapedRecipe(ThorHammer,"xxx","xyx"," y ",'x', iron_ingot,'y', stick);
		GameRegistry.addShapedRecipe(Superexpbottle,"xxx","xxx","xxx",'x', expBottle);
		GameRegistry.addShapedRecipe(Wand," y "," x "," x ",'y', Nether_Star,'x', stick);
		GameRegistry.addShapedRecipe(Wand,"y  ","x  ","x  ",'y', Nether_Star,'x', stick);
		GameRegistry.addShapedRecipe(Nether_Star,"xxx","xyx","xxx",'x', glass,'y', diamond);
		GameRegistry.addShapedRecipe(FireWand," x ","xyx"," x ",'x', blazerod,'y', Wand);
		GameRegistry.addShapedRecipe(SnowWand," x ","xyx"," x ",'x', snowball,'y', Wand);
		GameRegistry.addShapedRecipe(FlyWand," x ","xyx"," x ",'x', feather,'y', Wand);
		GameRegistry.addShapedRecipe(TnTWand," x ","xyx"," x ",'x', TnT,'y', Wand);
		GameRegistry.addShapedRecipe(HealWand," x ","xyx"," x ",'x', Super_Ingot,'y', Wand);
		GameRegistry.addShapedRecipe(PoisonWand," x ","xyx"," x ",'x', SpiderEye,'y', Wand);
		GameRegistry.addShapedRecipe(EnderWand," x ","xyx"," x ",'x', EnderPearl,'y', Wand);
		GameRegistry.addShapedRecipe(EarthWand," x ","xyx"," x ",'x', dirt,'y', Wand);
		GameRegistry.addShapedRecipe(SpeedWand," x ","xyx"," x ",'x', Sugar,'y', Wand);
		GameRegistry.addShapedRecipe(NightWand," z ","xyx"," x ",'x', obsidian,'y', Wand,'z', Clock);
		GameRegistry.addShapedRecipe(DayWand," z ","xyx"," x ",'x', glowstone,'y', Wand,'z', Clock);
		GameRegistry.addShapedRecipe(HutPart," x ","xzx","xxx",'x', wood, 'z', gold_ingot);
		GameRegistry.addShapedRecipe(HutWand," x ","xyx"," x ",'x', HutPart,'y', Wand);
		GameRegistry.addShapedRecipe(HousePart,"xxp","zyp","nnp",'x', glass,'y', diamond,'p', Brick,'z', wood, 'n', cobblestone);
		GameRegistry.addShapedRecipe(BaseWand," x ","xyx"," x ",'x', HousePart,'y', Wand);
		GameRegistry.addShapedRecipe(magicmelonblock,"xxx","xxx","xxx",'x', magicmelon);
		GameRegistry.addShapedRecipe(LaunchPad,"xyx","xxx","xxx",'x', iron_ingot, 'y', Slime_Ball);
		GameRegistry.addShapedRecipe(helmetSuper,"xxx","x x","   ",'x', Super_Ingot);
		GameRegistry.addShapedRecipe(helmetSuper,"   ","xxx","x x",'x', Super_Ingot);
		GameRegistry.addShapedRecipe(plateSuper,"x x","xxx","xxx",'x', Super_Ingot);
		GameRegistry.addShapedRecipe(legsSuper,"xxx","x x","x x",'x', Super_Ingot);
		GameRegistry.addShapedRecipe(bootsSuper,"   ","x x","x x",'x', Super_Ingot);
		GameRegistry.addShapedRecipe(bootsSuper,"x x","x x","   ",'x', Super_Ingot);
		GameRegistry.addShapedRecipe(mobarenapart,"xxx","xzx","xxx",'x', mobhead, 'z', Super_Ingot);
		GameRegistry.addShapedRecipe(mobarenawand," x ","xyx"," x ",'x', mobarenapart,'y', Wand);
	}
	
	/**
	 * Variable (vec3) for getting positions (block clicked, random position...).
	 */
	 public static Vec3 placeInFrontOfEntity(Entity _entity, float meters )
     {
             Vec3 ret = Vec3.createVectorHelper(0,0,0);
             ret.xCoord = _entity.posX;
             ret.yCoord = _entity.posY;
             ret.zCoord = _entity.posZ;
             float yaw = _entity.rotationYaw - 90;
             ret.xCoord -= ((double)(MathHelper.cos(yaw/ 180.0F * (float)Math.PI))) * meters;
             ret.zCoord -= ((double)(MathHelper.sin(yaw/ 180.0F * (float)Math.PI))) * meters;
             return ret;
     }
	 
	 public static Vec3 placeInRandomDir(int x,int y, int z, float meters )
     {
             Vec3 ret = Vec3.createVectorHelper(0,0,0);
             ret.xCoord = x;
             ret.yCoord = y;
             ret.zCoord = z;
             float yaw = (float)Math.random()*360;
             ret.xCoord -= ((double)(MathHelper.cos(yaw/ 180.0F * (float)Math.PI))) * meters;
             ret.zCoord -= ((double)(MathHelper.sin(yaw/ 180.0F * (float)Math.PI))) * meters;
             return ret;
     }
}

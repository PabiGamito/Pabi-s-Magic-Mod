package com.Pabi;

import com.Pabi.Events.SuperBowAEvent;
import com.Pabi.Events.SuperIngotAEvent;
import com.Pabi.Events.WandAEvent;
import com.PabiCodes.EntityMobWizard;
import com.PabiCodes.util;
import com.addeditems.MobArenaPart;

import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.ForgeHooks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.src.ModLoader;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;
import net.minecraft.world.biome.BiomeGenBase;

@Mod(modid = "PabiModBase", name = "PabiModBase", version = "0.0.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class pabimodbase 
{
	
	@Instance("PabiModBase")
	public static pabimodbase instance;
	
	@SidedProxy(clientSide="com.Pabi.ClientProxy", serverSide="com.Pabi.CommonProxy")
	public static CommonProxy proxy;
	
	static int startEntityId = 300;
	
	
	/**
	 * Add custom EnumMaterial to game.
	 */
	static EnumArmorMaterial SuperArmor = EnumHelper.addArmorMaterial("superarmor", 25, new int[]{3, 10, 6, 3}, 22);
	
	
	/**
	 * "Register" and add custom items & blocks to be usable in game.
	 */
	public static Item SwordObsidian = new com.addeditems.SwordObsidian(600,EnumToolMaterial.EMERALD).setUnlocalizedName("obsidianSword");
	
	public static Item SwordDirt = new com.addeditems.SwordDirt(601,EnumToolMaterial.GOLD).setUnlocalizedName("dirtSword");
	
	public static Item SwordSuper = new com.addeditems.SwordSuper(602,EnumToolMaterial.IRON).setUnlocalizedName("superSword");
	
	public static Item SuperIngot = new com.addeditems.SuperIngot(603).setUnlocalizedName("superIngot");
	
	public static Item SwordThunder = new com.addeditems.SwordThunder(604,EnumToolMaterial.EMERALD).setUnlocalizedName("thunderSword");
	
	public static Item LongSwordThunder = new com.addeditems.LongSwordThunder(605,EnumToolMaterial.EMERALD).setUnlocalizedName("longthunderSword");

	public static Item ThorAxe = new com.addeditems.ThorAxe(606,EnumToolMaterial.IRON).setUnlocalizedName("ThorAxe");
	
	public static Item SuperBow = new com.addeditems.SuperBow(607, null).setUnlocalizedName("SuperBow");
	
	public static Item Superexppotion = new com.addeditems.Superexppotion(609).setUnlocalizedName("Superexppotion");
	
	public static Block SuperOre = new com.addeditems.SuperOre(610).setLightValue(0.0001F).setHardness(2.5F).setUnlocalizedName("Super Ore");
	
	public static Item FireWand = new com.addeditems.FireWand(611,EnumToolMaterial.STONE).setUnlocalizedName("FireWand");

	public static Item SnowWand = new com.addeditems.SnowWand(612,EnumToolMaterial.STONE).setUnlocalizedName("SnowWand");
	
	public static Item Wand = new com.addeditems.Wand(613,EnumToolMaterial.STONE).setUnlocalizedName("Wand");
	
	public static Item EnderWand = new com.addeditems.EnderWand(614, EnumToolMaterial.STONE).setUnlocalizedName("EnderWand");
	
	public static Item TnTWand = new com.addeditems.TnTWand(615, EnumToolMaterial.STONE).setUnlocalizedName("TnTwand");
	
	public static Item FlyWand = new com.addeditems.FlyWand(616, EnumToolMaterial.STONE).setUnlocalizedName("Flywand");
	
	public static Item SuperSoup = new com.addeditems.SuperSoup(617, 8, 10F, false).setUnlocalizedName("SuperSoup");
	
	public static Item HealWand = new com.addeditems.HealWand(618, EnumToolMaterial.STONE).setUnlocalizedName("HealWand");
	
	public static Item PoisonWand = new com.addeditems.PoisonWand(619, EnumToolMaterial.STONE).setUnlocalizedName("PoisonWand");
	
	public static Item EarthWand = new com.addeditems.EarthWand(620, EnumToolMaterial.STONE).setUnlocalizedName("EarthWand");
	
	public static Item QuickBaseWand = new com.addeditems.QuickBaseWand(621, EnumToolMaterial.STONE).setUnlocalizedName("QuickBaseWand");
	
	public static Item SpeedWand = new com.addeditems.SpeedWand(622, EnumToolMaterial.STONE).setUnlocalizedName("SpeedWand");
	
	public static Item DayWand = new com.addeditems.DayWand(623, EnumToolMaterial.STONE).setUnlocalizedName("DayWand");
	
	public static Item NightWand = new com.addeditems.NightWand(624, EnumToolMaterial.STONE).setUnlocalizedName("NightWand");
	
	public static Block StartArena = new com.addeditems.StartArena(625, Material.rock).setUnlocalizedName("StartArena");
	
	//public static Block StartArenaGlowing = new com.addeditems.StartArena(626, Material.rock).setUnlocalizedName("StartArenaGlowing");
	
	public static Item QuickHutWand = new com.addeditems.HutWand(627, EnumToolMaterial.STONE).setUnlocalizedName("QuickHutWand");
	
	public static Item HutPart = new com.addeditems.HutPart(628, EnumToolMaterial.STONE).setUnlocalizedName("HutPart");
	
	public static Item HousePart = new com.addeditems.HousePart(629, EnumToolMaterial.STONE).setUnlocalizedName("HousePart");
	
	public static Item MobArenaWand = new com.addeditems.MobArenaWand(630, EnumToolMaterial.STONE).setUnlocalizedName("MobArenaWand");
	
	public static Block LaunchPad = new com.addeditems.LaunchPad(631, Material.sponge).setUnlocalizedName("LaunchPad");
	
	public static Item helmetSuper;
	
	public static Item chestplateSuper;
	
	public static Item legsSuper;
	
	public static Item bootsSuper;

	public static Block magiccrop = new com.addeditems.magic_crop(639, Material.plants).setUnlocalizedName("MagicCrop");
	
	public static ItemSeeds seeds_magic = (ItemSeeds)new com.addeditems.seed_magic(5003, magiccrop.blockID, Block.tilledField.blockID).setUnlocalizedName("seedsmagic");
	
	public static Block magicplant = new com.addeditems.magicplant(637, Material.plants).setUnlocalizedName("magicplant");
	
	public static Item magicmelon = new com.addeditems.magic(638, 5, 8, false).setUnlocalizedName("magicmelon");
	
	public static Item mobarenapart = new MobArenaPart(639, EnumToolMaterial.STONE).setUnlocalizedName("mobarenapart");
	
	
	
	//New add Custom Achievements and Achievement pages.
	public static final Achievement SuperBowA = new Achievement(6650, "SuperBowA", 0, 0, SuperBow, AchievementList.buildWorkBench).registerAchievement().setIndependent();
	public static final Achievement WandA = new Achievement(6651, "WandA", 2, 0, Wand, AchievementList.buildWorkBench).registerAchievement();
	public static final Achievement SuperIngotA = new Achievement(6652, "SuperIngotA", 3, 2, SuperIngot, AchievementList.buildWorkBench).registerAchievement();
	public static AchievementPage page1 = new AchievementPage("Magic", AchievementList.openInventory ,SuperBowA, WandA, SuperIngotA);
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event)
	{
		
	}
	@Init
	public void load(FMLInitializationEvent event)
	{
		
		GameRegistry.registerWorldGenerator(new GenerateSuperOre());
		proxy.registerRenderers();
		
		/**
		 * Add/register entity mob and custom spawn for mob to game.
		 */
		EntityRegistry.registerModEntity(EntityMobWizard.class, "Wizard", 850, this, 100, 1, true);
		 EntityRegistry.addSpawn(EntityMobWizard.class, 5, 1, 1, EnumCreatureType.monster, BiomeGenBase.forest, BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore, BiomeGenBase.plains, BiomeGenBase.river, BiomeGenBase.swampland, BiomeGenBase.forestHills, BiomeGenBase.ocean); //BiomeGenBase.beach, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.jungle, BiomeGenBase.jungleHills, BiomeGenBase.ocean);
		
		/**
		* Add customized armor to game
		*/
		helmetSuper = new SuperArmor(632, SuperArmor, proxy.addArmor("SuperArmor"), 0).setUnlocalizedName("helmetSuper").setUnlocalizedName("helmetSuper");
		chestplateSuper = new SuperArmor(633, SuperArmor, proxy.addArmor("SuperArmor"), 1).setUnlocalizedName("chestplateSuper").setUnlocalizedName("chestplateSuper");
		legsSuper = new SuperArmor(634, SuperArmor, proxy.addArmor("SuperArmor"), 2).setUnlocalizedName("legsSuper").setUnlocalizedName("legsSuper");
		bootsSuper = new SuperArmor(635, SuperArmor, proxy.addArmor("SuperArmor"), 3).setUnlocalizedName("bootsSuper").setUnlocalizedName("bootsSuper");
		
		
		util.recepies();
		/**
		 * Add achievement & mob egg name and description.
		 */
		LanguageRegistry.instance().addStringLocalization("achievement.SuperBowA", "en_US", "Super Bow");
        LanguageRegistry.instance().addStringLocalization("achievement.SuperBowA.desc", "en_US", "Start snipping everything!");
        LanguageRegistry.instance().addStringLocalization("achievement.WandA", "en_US", "Wand");
        LanguageRegistry.instance().addStringLocalization("achievement.WandA.desc", "en_US", "Start your wizard carear here!");
        LanguageRegistry.instance().addStringLocalization("achievement.SuperIngotA", "en_US", "Super Ore");
        LanguageRegistry.instance().addStringLocalization("achievement.SuperIngotA.desc", "en_US", "Start crafting super stuff!");
		
        LanguageRegistry.instance().addStringLocalization("entity.PabiModBase.Wizard.name", "Super Ghost");
        
        /**
		 * Add Item Names.
		 */
        LanguageRegistry.addName(SwordObsidian, "Obsidian Sword");
		LanguageRegistry.addName(SuperIngot, "Super Ingot");
		LanguageRegistry.addName(SwordSuper, "Super Sword");
		LanguageRegistry.addName(SwordDirt, "Dirt Sword");
		LanguageRegistry.addName(SwordThunder, "Thunder Sword");
		LanguageRegistry.addName(LongSwordThunder, "Long Thunder Sword");
		LanguageRegistry.addName(ThorAxe, "Thor's Hammer");
		LanguageRegistry.addName(SuperBow, "Super Swordbow");
		LanguageRegistry.addName(Superexppotion, "Super expbottle");
		LanguageRegistry.addName(SuperOre, "Super Ore");
		LanguageRegistry.addName(FireWand, "Fire Wand");
		LanguageRegistry.addName(SnowWand, "Snow Wand");
		LanguageRegistry.addName(Wand, "Wand");
		LanguageRegistry.addName(EnderWand, "Ender Wand");
		LanguageRegistry.addName(TnTWand, "TnT Wand");
		LanguageRegistry.addName(FlyWand, "Fly Wand");
		LanguageRegistry.addName(SuperSoup, "Super Soup");
		LanguageRegistry.addName(HealWand, "Heal Wand");
		LanguageRegistry.addName(PoisonWand, "Poison Wand");
		LanguageRegistry.addName(EarthWand, "Earth Wand");
		LanguageRegistry.addName(QuickBaseWand, "Quick Base Wand");
		LanguageRegistry.addName(SpeedWand, "Speed Wand");
		LanguageRegistry.addName(DayWand, "Day Wand");
		LanguageRegistry.addName(NightWand, "Night Wand");
		LanguageRegistry.addName(StartArena, "Start Arena");
		LanguageRegistry.addName(QuickHutWand, "Quick Hut Wand");
		LanguageRegistry.addName(HutPart, "Hut Part");
		LanguageRegistry.addName(HousePart, "House Part");
		LanguageRegistry.addName(MobArenaWand, "Mob Arena Wand");
		LanguageRegistry.addName(LaunchPad, "Launch Pad");
		LanguageRegistry.addName(helmetSuper, "Super Helmet");
		LanguageRegistry.addName(chestplateSuper, "Super Chestplate");
		LanguageRegistry.addName(bootsSuper, "Super Boots");
		LanguageRegistry.addName(legsSuper, "Super Leggings");
		LanguageRegistry.addName(seeds_magic, "Magic Seeds");
		LanguageRegistry.addName(magicplant, "Magic Melon");
		LanguageRegistry.addName(magicmelon, "Magic Melon");
		LanguageRegistry.addName(mobarenapart, "Mob Arena Part");
		
		GameRegisters();
		LanguageRegisters();
		
		proxy.registerRenderers();
		
		/**
		 * Register blocks for them to be usable in game.
		 */
		GameRegistry.registerBlock(StartArena);
		//GameRegistry.registerBlock(StartArenaGlowing);
		GameRegistry.registerBlock(LaunchPad);
		GameRegistry.registerBlock(magicplant);
		GameRegistry.registerBlock(SuperOre, SuperOre.getLocalizedName());
		GameRegistry.registerBlock(magicplant);
		
		/**
		 * Register events, ticks & more.
		 */
		GameRegistry.registerCraftingHandler(new SuperBowAEvent());
		AchievementPage.registerAchievementPage(page1);
		GameRegistry.registerCraftingHandler(new WandAEvent());
		GameRegistry.registerCraftingHandler(new SuperIngotAEvent());
		TickRegistry.registerTickHandler(new CommonTickHandler(), Side.SERVER);
		
		/**
		 * Register new custom mobs and spawn eggs.
		 */
		registerEntityEgg(EntityMobWizard.class, 0xffffff, 0x000000);
		}
		public static int getUniqueEntityId()
		{
		do
		{
		startEntityId++;
		}
		while (EntityList.getStringFromID(startEntityId) != null);
		return startEntityId;
}
public static void registerEntityEgg(Class<? extends Entity> entity, int primaryColor, int secondaryColor)
{
int id = getUniqueEntityId();
EntityList.IDtoClassMapping.put(id, entity);
EntityList.entityEggs.put(id, new EntityEggInfo(id, primaryColor, secondaryColor));
}
		
	private void LanguageRegisters() {
		
	}
	private void GameRegisters() {
		
	}
	@PostInit 
	public void postInit(FMLPostInitializationEvent event)
	{
	}
}

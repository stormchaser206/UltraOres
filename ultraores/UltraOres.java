package ultraores;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = UltraOres.modid, name = "Ultra Ores", version = "0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class UltraOres 
{
	public static final String modid = "stormchaser206_ultraores";
	
	public static Block oreCopper;
	
	public static Item ingotCopper;
	
	@EventHandler
	
	public void load(FMLInitializationEvent event)
	{
		oreCopper = new BlockCopperOre(2115, Material.rock).setUnlocalizedName("oreCopper");
		GameRegistry.registerBlock(oreCopper, modid + oreCopper.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(oreCopper, "Copper Ore");
		
		ingotCopper = new ItemCopperIngot(6020).setUnlocalizedName("ingotCopper");
		LanguageRegistry.addName(ingotCopper, "Copper Ingot");
		
		ModCrafting.addRecipes();
	}
}

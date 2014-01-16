package ultraores;

import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import cpw.mods.fml.common.registry.GameRegistry;
public class ModCrafting
{
       public static void addRecipes()
       {    
             FurnaceRecipes.smelting().addSmelting(2115, new ItemStack(UltraOres.ingotCopper), 0.1F);
       }
}
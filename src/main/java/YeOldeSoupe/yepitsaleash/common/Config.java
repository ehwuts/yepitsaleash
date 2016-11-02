package yeoldesoupe.yepitsaleash.common;

import net.minecraft.item.Item;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import cpw.mods.fml.common.registry.GameRegistry;

import yeoldesoupe.yepitsaleash.common.items.ItemStrongLeash;

public class Config {	
	public static Item itemStrongLeash;
	
	public static void init() {
		itemStrongLeash = new ItemStrongLeash();
		
		GameRegistry.registerItem(itemStrongLeash, "ItemStrongLeash");
		GameRegistry.addRecipe(new ItemStack(itemStrongLeash), "xe ", "es " , "  x", 'x', Items.string, 's', Items.slime_ball, 'e', Items.leather);
	}
}
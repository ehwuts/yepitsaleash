package yeoldesoupe.yepitsaleash;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import yeoldesoupe.yepitsaleash.common.Config;

@Mod(modid = "yepitsaleash", name="YepItsALeash", version = @MODVER@)
public class yepitsaleash
{   	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Config.init();
	}
}

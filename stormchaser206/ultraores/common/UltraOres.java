package stormchaser206.ultraores.common; //The package your mod is in

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.network.NetworkMod.SidedPacketHandler;
import cpw.mods.fml.common.SidedProxy;
import stormchaser206.ultraores.common.UltraOresCommonProxy;

@NetworkMod(clientSideRequired=true,serverSideRequired=true, //Whether client side and server side are needed
clientPacketHandlerSpec = @SidedPacketHandler(channels = {"UltraOres"}, packetHandler = UltraOresClientPacketHandler.class), //For clientside packet handling
serverPacketHandlerSpec = @SidedPacketHandler(channels = {"UltraOres"}, packetHandler = UltraOresServerPacketHandler.class)) //For serverside packet handling

//MOD BASICS
@Mod(modid="UltraOres",name="Ultra Ores",version="Beta")

public class UltraOres {

@Instance("Ultra Ores") //The instance, this is very important later on
public static UltraOres instance = new UltraOres();

@SidedProxy(clientSide = "stormchaser206.ultraores.client.UltraOresClientProxy", serverSide = "stormchaser206.ultraores.common.UltraOresCommonProxy") //Tells Forge the location of your proxies
public static UltraOresCommonProxy proxy;

@PreInit
public void PreInit(FMLPreInitializationEvent e){

}

@Init
public void InitUltraOres(FMLInitializationEvent event){ //Your main initialization method

//MULTIPLAYER ABILITY
NetworkRegistry.instance().registerGuiHandler(this, proxy); //Registers the class that deals with GUI data

}
}
package testmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import testmod.proxy.CommonProxy;

import java.lang.ref.Reference;

@Mod(
	modid = Main.MODID,
	name = Main.NAME,
	version = Main.VERSION
)
public class Main {
	@Mod.Instance
	public static Main instance;

	public static final String MODID = "mymod";
	public static final String NAME = "my112mod";
	public static final String VERSION = "1.0";
	public static final String CLIENT = "testmod.proxy.ClientProxy";
	public static final String COMMON = "testmod.proxy.CommonProxy";

	public static final Logger LOGGER = LogManager.getLogger(MODID);

	@SidedProxy(clientSide = CLIENT, serverSide = COMMON)
	public static CommonProxy proxy;

	@Mod.EventHandler
	public static void preInit(FMLPreInitializationEvent event) {LOGGER.info("Hello, world!");}
	@Mod.EventHandler
	public static void init(FMLInitializationEvent event) {LOGGER.info("world!");}
	@Mod.EventHandler
	public static void postInit(FMLPostInitializationEvent event) {LOGGER.info("Goodbye, world!");}
}

package testmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(
	modid = MyMod.MODID,
	name = MyMod.NAME,
	version = MyMod.VERSION
)
public class MyMod {
	public static final String MODID = "mymod";
	public static final String NAME = "my112mod";
	public static final String VERSION = "1.0";
	
	public static final Logger LOGGER = LogManager.getLogger(MODID);
	
	@Mod.EventHandler
	public void preinit(FMLPreInitializationEvent preinit) {
		LOGGER.info("Hello, world!");
	}
}

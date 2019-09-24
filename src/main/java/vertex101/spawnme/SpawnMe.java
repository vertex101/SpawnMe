package vertex101.spawnme;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import vertex101.spawnme.util.EventHandler;

import java.util.stream.Collectors;

@Mod("spawnme")
public class SpawnMe
{
    public static final String MOD_ID = "spawnme";

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public SpawnMe() {
        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.register(new EventHandler());
    }
}

package vertex101.spawnme.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import vertex101.spawnme.items.*;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EventHandler {
    @SubscribeEvent
    public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent)
    {
        blockRegistryEvent.getRegistry().registerAll(
/*                new BurningTorchBlock(Block.Properties.create(Material.MISCELLANEOUS)
                        .doesNotBlockMovement()
                        .hardnessAndResistance(0)
                        .sound(SoundType.WOOD)
                        .tickRandomly())
                        .setRegistryName("burningtorch"),
                new BurningPumpkinBlock(Block.Properties.create(Material.GOURD, MaterialColor.ADOBE)
                        .hardnessAndResistance(1.0F)
                        .sound(SoundType.WOOD))
                        .setRegistryName("burningpumpkin")*/
        );
    }

    @SubscribeEvent
    public static void onRegisterItem(final RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(
                new ItemHelix(new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName("cow_helix"),
                new ItemHelix(new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName("pig_helix"),
                new ItemHelix(new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName("pigmen_helix"),
                new ItemHelix(new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName("sheep_helix"),
                new ItemHelix(new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName("skeleton_helix"),
                new ItemHelix(new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName("zombie_helix")
        );
    }

    @SubscribeEvent
    public static void onRegisterTileEntityType(final RegistryEvent.Register<TileEntityType<?>> event)
    {
        /*event.getRegistry().registerAll(
                TileEntityType.Builder.create(TorchTE::new, BlockHolder.burningtorch).build(null).setRegistryName("torchte"),
                TileEntityType.Builder.create(PumpkinTorchTE::new, BlockHolder.burningpumpkin).build(null).setRegistryName("pumpkintorchte")
        );*/
    }
}

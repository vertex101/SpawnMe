package vertex101.spawnme.util;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import vertex101.spawnme.blocks.BlockHolder;
import vertex101.spawnme.blocks.BlockWoodenSpawner;
import vertex101.spawnme.items.*;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EventHandler {
    @SubscribeEvent
    public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
        blockRegistryEvent.getRegistry().registerAll(
            new BlockWoodenSpawner(Block.Properties.create(Material.MISCELLANEOUS)
                    .hardnessAndResistance(0)
                    .sound(SoundType.ANVIL)
                    .tickRandomly())
                    .setRegistryName("woodenspawner")
        );
    }

    @SubscribeEvent
    public static void onRegisterItem(final RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(
            new BlockItem(BlockHolder.woodenspawner, (new Item.Properties()).group(UtilMethods.itemGroup)).setRegistryName("woodenspawner"),
            //Mob Helix
            new ItemHelix(new Item.Properties().group(UtilMethods.itemGroup)).setRegistryName("cow_helix"),
            new ItemHelix(new Item.Properties().group(UtilMethods.itemGroup)).setRegistryName("creeper_helix"),
            new ItemHelix(new Item.Properties().group(UtilMethods.itemGroup)).setRegistryName("pig_helix"),
            new ItemHelix(new Item.Properties().group(UtilMethods.itemGroup)).setRegistryName("pigmen_helix"),
            new ItemHelix(new Item.Properties().group(UtilMethods.itemGroup)).setRegistryName("sheep_helix"),
            new ItemHelix(new Item.Properties().group(UtilMethods.itemGroup)).setRegistryName("skeleton_helix"),
            new ItemHelix(new Item.Properties().group(UtilMethods.itemGroup)).setRegistryName("zombie_helix"),
            //Mob Spheroid
            new ItemSpheroid(new Item.Properties().group(UtilMethods.itemGroup)).setRegistryName("cow_spheroid"),
            new ItemSpheroid(new Item.Properties().group(UtilMethods.itemGroup)).setRegistryName("creeper_spheroid"),
            new ItemSpheroid(new Item.Properties().group(UtilMethods.itemGroup)).setRegistryName("pig_spheroid"),
            new ItemSpheroid(new Item.Properties().group(UtilMethods.itemGroup)).setRegistryName("pigmen_spheroid"),
            new ItemSpheroid(new Item.Properties().group(UtilMethods.itemGroup)).setRegistryName("sheep_spheroid"),
            new ItemSpheroid(new Item.Properties().group(UtilMethods.itemGroup)).setRegistryName("skeleton_spheroid"),
            new ItemSpheroid(new Item.Properties().group(UtilMethods.itemGroup)).setRegistryName("zombie_spheroid")
        );
    }

    @SubscribeEvent
    public static void onRegisterTileEntityType(final RegistryEvent.Register<TileEntityType<?>> event) {
    }
}

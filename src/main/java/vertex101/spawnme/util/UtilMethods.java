package vertex101.spawnme.util;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import static vertex101.spawnme.items.ItemHolder.cow_helix;

public class UtilMethods {
    public static ItemGroup itemGroup = new ItemGroup("SpawnMe") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(cow_helix);
        }
    };
}

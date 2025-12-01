package net.universal.uniqol.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.universal.uniqol.UniQoL;

public class UniQoLItems {
    public static final Item AMULET = registerItem("amulet", new Item
            (new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(UniQoL.MOD_ID, "amulet")))));

    private static Item registerItem(String name ,Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(UniQoL.MOD_ID,name),item);
    }

    public static void registerUniQoLItems(){
        UniQoL.LOGGER.info("Registering Mod Items for "+UniQoL.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries->{
            entries.add(AMULET);
        });
    }
}

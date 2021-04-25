package com.frogastudios.reglib;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegLib implements ModInitializer {
    static String id;
    public static Item ITEM;
    static String ModID;
    public static void regI(Item ITEMI, String identifier, String MODID, ItemGroup itemGroup)
    {
            id = identifier;
            ModID = MODID;
            ITEMI = ITEM;
            ITEM = new Item(new FabricItemSettings().group(itemGroup));
    }
    public static void initregI()
    {
        Registry.register(Registry.ITEM, new Identifier(id, ModID), ITEM);
    }

    @Override
    public void onInitialize() {
        initregI();
    }
}

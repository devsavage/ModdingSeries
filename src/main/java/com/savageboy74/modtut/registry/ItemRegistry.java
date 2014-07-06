package com.savageboy74.modtut.registry;

import com.savageboy74.modtut.items.ItemMT;
import com.savageboy74.modtut.items.ItemSquare;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ItemRegistry
{
    public static Item itemCircle;
    public static Item itemSquare;



    public static void registerItems() {

        itemCircle = new ItemMT().setUnlocalizedName("itemCircle");
        GameRegistry.registerItem(itemCircle, "itemCircle");
        itemSquare = new ItemSquare();
        GameRegistry.registerItem(itemSquare, "itemSquare");

    }
}

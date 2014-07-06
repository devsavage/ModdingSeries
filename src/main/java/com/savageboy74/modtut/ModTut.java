package com.savageboy74.modtut;

import com.savageboy74.modtut.proxy.CommonProxy;
import com.savageboy74.modtut.registry.BlockRegistry;
import com.savageboy74.modtut.registry.ItemRegistry;
import com.savageboy74.modtut.utility.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

@Mod(modid = Reference.MOD_ID, version = Reference.VERSION)
public class ModTut
{

    @Mod.Instance(Reference.MOD_ID)
    public static ModTut instance;

    public static CreativeTabs modTutTab;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        modTutTab = new CreativeTabs("modTutTab") {
            @Override
            public Item getTabIconItem() {
                return Item.getItemFromBlock(Blocks.emerald_block);
            }
        };

        ItemRegistry.registerItems();
        BlockRegistry.registerBlocks();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}

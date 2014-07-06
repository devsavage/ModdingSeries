package com.savageboy74.modtut.registry;

import com.savageboy74.modtut.blocks.BlockBlock;
import com.savageboy74.modtut.blocks.BlockMT;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockRegistry
{
    public static Block blockCube;
    public static Block blockBlock;


    public static void registerBlocks()
    {
        blockCube = new BlockMT(Material.rock).setBlockName("blockCube");
        GameRegistry.registerBlock(blockCube, "blockCube");
        blockBlock = new BlockBlock();
        GameRegistry.registerBlock(blockBlock, "blockBlock");
    }
}

package com.savageboy74.modtut.blocks;

import net.minecraft.block.material.Material;

public class BlockBlock extends BlockMT
{

    public BlockBlock() {
        super(Material.ice);
        this.setStepSound(soundTypeWood);
        this.setHardness(3.0F);
        this.setResistance(5.0F);
        this.setBlockName("blockBlock");
    }
}

package com.savageboy74.modtut.blocks;

import com.savageboy74.modtut.ModTut;
import com.savageboy74.modtut.utility.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockMT extends Block
{

    public BlockMT(Material material) {
        super(material);

        this.setResistance(10.0F);
        this.setHardness(2.0F);
        this.setCreativeTab(ModTut.modTutTab);
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(5));
    }
}

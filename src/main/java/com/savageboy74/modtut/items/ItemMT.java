package com.savageboy74.modtut.items;

import com.savageboy74.modtut.ModTut;
import com.savageboy74.modtut.utility.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class ItemMT extends Item
{
    public ItemMT() {
        this.setMaxStackSize(1);
        this.setCreativeTab(ModTut.modTutTab);
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iIconRegister) {
        this.itemIcon = iIconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(5));
    }
}

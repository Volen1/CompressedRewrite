package com.volen.compressed.blocks;

import com.volen.compressed.Compressed;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class QuadrupleCompressedCobblestone extends Block{

    public QuadrupleCompressedCobblestone() {

        super(Material.ROCK);
        setUnlocalizedName(Compressed.MODID + ".quadruplecompressedcobblestone");
        setRegistryName("quadruplecompressedcobblestone");

        setCreativeTab(Compressed.compressedTab);

    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}


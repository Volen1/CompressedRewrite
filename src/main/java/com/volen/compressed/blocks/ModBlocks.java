package com.volen.compressed.blocks;


import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {

    @GameRegistry.ObjectHolder("cpd:compressedcobblestone")
    public static CompressedCobblestone compressedCobblestone;

    @GameRegistry.ObjectHolder("cpd:doublecompressedcobblestone")
    public static DoubleCompressedCobblestone doubleCompressedCobblestone;

    @SideOnly(Side.CLIENT)
    public static void initModels() {

        compressedCobblestone.initModel();
        doubleCompressedCobblestone.initModel();
    }
}

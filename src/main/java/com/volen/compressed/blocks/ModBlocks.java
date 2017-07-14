package com.volen.compressed.blocks;


import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {

    // Cobblestone
    @GameRegistry.ObjectHolder("cpd:compressedcobblestone")
    public static CompressedCobblestone compressedCobblestone;

    @GameRegistry.ObjectHolder("cpd:doublecompressedcobblestone")
    public static DoubleCompressedCobblestone doubleCompressedCobblestone;

    @GameRegistry.ObjectHolder("cpd:triplecompressedcobblestone")
    public static TripleCompressedCobblestone tripleCompressedCobblestone;

    @GameRegistry.ObjectHolder("cpd:quadruplecompressedcobblestone")
    public static QuadrupleCompressedCobblestone quadrupleCompressedCobblestone;

    @GameRegistry.ObjectHolder("cpd:quintuplecompressedcobblestone")
    public static QuintupleCompressedCobblestone quintupleCompressedCobblestone;

    @GameRegistry.ObjectHolder("cpd:sextuplecompressedcobblestone")
    public static SextupleCompressedCobblestone sextupleCompressedCobblestone;

    @GameRegistry.ObjectHolder("cpd:septuplecompressedcobblestone")
    public static SeptupleCompressedCobblestone septupleCompressedCobblestone;

    @GameRegistry.ObjectHolder("cpd:octuplecompressedcobblestone")
    public static OctupleCompressedCobblestone octupleCompressedCobblestone;

    @GameRegistry.ObjectHolder("cpd:nontuplecompressedcobblestone")
    public static NontupleCompressedCobblestone nontupleCompressedCobblestone;

    @GameRegistry.ObjectHolder("cpd:decuplecompressedcobblestone")
    public static DecupleCompressedCobblestone decupleCompressedCobblestone;

    // Dirt

    @SideOnly(Side.CLIENT)
    public static void initModels() {

        // Cobblestone
        compressedCobblestone.initModel();
        doubleCompressedCobblestone.initModel();
        tripleCompressedCobblestone.initModel();
        quadrupleCompressedCobblestone.initModel();
        quintupleCompressedCobblestone.initModel();
        sextupleCompressedCobblestone.initModel();
        septupleCompressedCobblestone.initModel();
        octupleCompressedCobblestone.initModel();
        nontupleCompressedCobblestone.initModel();
        decupleCompressedCobblestone.initModel();
    }
}

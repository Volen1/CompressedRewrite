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
    @GameRegistry.ObjectHolder("cpd:compresseddirt")
    public static CompressedDirt compressedDirt;

    @GameRegistry.ObjectHolder("cpd:doublecompresseddirt")
    public static DoubleCompressedDirt doubleCompressedDirt;

    @GameRegistry.ObjectHolder("cpd:triplecompresseddirt")
    public static TripleCompressedDirt tripleCompressedDirt;

    @GameRegistry.ObjectHolder("cpd:quadruplecompresseddirt")
    public static QuadrupleCompressedDirt quadrupleCompressedDirt;

    @GameRegistry.ObjectHolder("cpd:quintuplecompresseddirt")
    public static QuintupleCompressedDirt quintupleCompressedDirt;

    @GameRegistry.ObjectHolder("cpd:sextuplecompresseddirt")
    public static SextupleCompressedDirt sextupleCompressedDirt;

    @GameRegistry.ObjectHolder("cpd:septuplecompresseddirt")
    public static SeptupleCompressedDirt septupleCompressedDirt;

    @GameRegistry.ObjectHolder("cpd:octuplecompresseddirt")
    public static OctupleCompressedDirt octupleCompressedDirt;

    @GameRegistry.ObjectHolder("cpd:nontuplecompresseddirt")
    public static NontupleCompressedDirt nontupleCompressedDirt;

    @GameRegistry.ObjectHolder("cpd:decuplecompresseddirt")
    public static DecupleCompressedDirt decupleCompressedDirt;

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

        // Dirt
        compressedDirt.initModel();
        doubleCompressedDirt.initModel();
        tripleCompressedDirt.initModel();
        quadrupleCompressedDirt.initModel();
        quintupleCompressedDirt.initModel();
        sextupleCompressedDirt.initModel();
        septupleCompressedDirt.initModel();
        octupleCompressedDirt.initModel();
        nontupleCompressedDirt.initModel();
        decupleCompressedDirt.initModel();
    }
}

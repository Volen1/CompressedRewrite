package com.volen.compressed.proxy;

import com.volen.compressed.ModBlocks;
import com.volen.compressed.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


@Mod.EventBusSubscriber
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e) {

    }

    public void init(FMLInitializationEvent e) {

    }

    public void postInit(FMLPostInitializationEvent e) {

    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {

        // Cobblestone
        event.getRegistry().register(new CompressedCobblestone());
        event.getRegistry().register(new DoubleCompressedCobblestone());
        event.getRegistry().register(new TripleCompressedCobblestone());
        event.getRegistry().register(new QuadrupleCompressedCobblestone());
        event.getRegistry().register(new QuintupleCompressedCobblestone());
        event.getRegistry().register(new SextupleCompressedCobblestone());
        event.getRegistry().register(new SeptupleCompressedCobblestone());
        event.getRegistry().register(new OctupleCompressedCobblestone());
        event.getRegistry().register(new NontupleCompressedCobblestone());
        event.getRegistry().register(new DecupleCompressedCobblestone());

        // Dirt
        event.getRegistry().register(new CompressedDirt());
        event.getRegistry().register(new DoubleCompressedDirt());
        event.getRegistry().register(new TripleCompressedDirt());
        event.getRegistry().register(new QuadrupleCompressedDirt());
        event.getRegistry().register(new QuintupleCompressedDirt());
        event.getRegistry().register(new SextupleCompressedDirt());
        event.getRegistry().register(new SeptupleCompressedDirt());
        event.getRegistry().register(new OctupleCompressedDirt());
        event.getRegistry().register(new NontupleCompressedDirt());
        event.getRegistry().register(new DecupleCompressedDirt());

        // Gravel
        event.getRegistry().register(new CompressedGravel());
        event.getRegistry().register(new DoubleCompressedGravel());
        event.getRegistry().register(new TripleCompressedGravel());
        event.getRegistry().register(new QuadrupleCompressedGravel());
        event.getRegistry().register(new QuintupleCompressedGravel());
        event.getRegistry().register(new SextupleCompressedGravel());
        event.getRegistry().register(new SeptupleCompressedGravel());
        event.getRegistry().register(new OctupleCompressedGravel());
        event.getRegistry().register(new NontupleCompressedGravel());
        event.getRegistry().register(new DecupleCompressedGravel());

        // Sand
        event.getRegistry().register(new CompressedSand());
        event.getRegistry().register(new DoubleCompressedSand());
        event.getRegistry().register(new TripleCompressedSand());
        event.getRegistry().register(new QuadrupleCompressedSand());
        event.getRegistry().register(new QuintupleCompressedSand());
        event.getRegistry().register(new SextupleCompressedSand());
        event.getRegistry().register(new OctupleCompressedSand());
        event.getRegistry().register(new NontupleCompressedSand());
        event.getRegistry().register(new DecupleCompressedSand());
    }

     @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {

        // Cobblestone
        event.getRegistry().register(new ItemBlock(ModBlocks.compressedCobblestone).setRegistryName(ModBlocks.compressedCobblestone.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.doubleCompressedCobblestone).setRegistryName(ModBlocks.doubleCompressedCobblestone.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.tripleCompressedCobblestone).setRegistryName(ModBlocks.tripleCompressedCobblestone.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.quadrupleCompressedCobblestone).setRegistryName(ModBlocks.quadrupleCompressedCobblestone.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.quintupleCompressedCobblestone).setRegistryName(ModBlocks.quintupleCompressedCobblestone.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.sextupleCompressedCobblestone).setRegistryName(ModBlocks.sextupleCompressedCobblestone.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.septupleCompressedCobblestone).setRegistryName(ModBlocks.septupleCompressedCobblestone.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.octupleCompressedCobblestone).setRegistryName(ModBlocks.octupleCompressedCobblestone.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.nontupleCompressedCobblestone).setRegistryName(ModBlocks.nontupleCompressedCobblestone.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.decupleCompressedCobblestone).setRegistryName(ModBlocks.decupleCompressedCobblestone.getRegistryName()));

        // Dirt
        event.getRegistry().register(new ItemBlock(ModBlocks.compressedDirt).setRegistryName(ModBlocks.compressedDirt.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.doubleCompressedDirt).setRegistryName(ModBlocks.doubleCompressedDirt.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.tripleCompressedDirt).setRegistryName(ModBlocks.tripleCompressedDirt.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.quadrupleCompressedDirt).setRegistryName(ModBlocks.quadrupleCompressedDirt.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.quintupleCompressedDirt).setRegistryName(ModBlocks.quintupleCompressedDirt.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.sextupleCompressedDirt).setRegistryName(ModBlocks.sextupleCompressedDirt.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.septupleCompressedDirt).setRegistryName(ModBlocks.septupleCompressedDirt.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.octupleCompressedDirt).setRegistryName(ModBlocks.octupleCompressedDirt.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.nontupleCompressedDirt).setRegistryName(ModBlocks.nontupleCompressedDirt.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.decupleCompressedDirt).setRegistryName(ModBlocks.decupleCompressedDirt.getRegistryName()));

        // Gravel
        event.getRegistry().register(new ItemBlock(ModBlocks.compressedGravel).setRegistryName(ModBlocks.compressedGravel.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.doubleCompressedGravel).setRegistryName(ModBlocks.doubleCompressedGravel.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.tripleCompressedGravel).setRegistryName(ModBlocks.tripleCompressedGravel.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.quadrupleCompressedGravel).setRegistryName(ModBlocks.quadrupleCompressedGravel.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.quintupleCompressedGravel).setRegistryName(ModBlocks.quintupleCompressedGravel.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.sextupleCompressedGravel).setRegistryName(ModBlocks.sextupleCompressedGravel.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.septupleCompressedGravel).setRegistryName(ModBlocks.septupleCompressedGravel.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.octupleCompressedGravel).setRegistryName(ModBlocks.octupleCompressedGravel.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.nontupleCompressedGravel).setRegistryName(ModBlocks.nontupleCompressedGravel.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.decupleCompressedGravel).setRegistryName(ModBlocks.decupleCompressedGravel.getRegistryName()));

        // Sand
       event.getRegistry().register(new ItemBlock(ModBlocks.compressedSand).setRegistryName(ModBlocks.compressedSand.getRegistryName()));
       event.getRegistry().register(new ItemBlock(ModBlocks.doubleCompressedSand).setRegistryName(ModBlocks.doubleCompressedSand.getRegistryName()));
       event.getRegistry().register(new ItemBlock(ModBlocks.tripleCompressedSand).setRegistryName(ModBlocks.tripleCompressedSand.getRegistryName()));
       event.getRegistry().register(new ItemBlock(ModBlocks.quadrupleCompressedSand).setRegistryName(ModBlocks.quintupleCompressedSand.getRegistryName()));
       event.getRegistry().register(new ItemBlock(ModBlocks.quintupleCompressedSand).setRegistryName(ModBlocks.quintupleCompressedSand.getRegistryName()));
       event.getRegistry().register(new ItemBlock(ModBlocks.sextupleCompressedSand).setRegistryName(ModBlocks.sextupleCompressedSand.getRegistryName()));
       event.getRegistry().register(new ItemBlock(ModBlocks.septupleCompressedSand).setRegistryName(ModBlocks.septupleCompressedSand.getRegistryName()));
       event.getRegistry().register(new ItemBlock(ModBlocks.octupleCompressedSand).setRegistryName(ModBlocks.octupleCompressedSand.getRegistryName()));
       event.getRegistry().register(new ItemBlock(ModBlocks.nontupleCompressedSand).setRegistryName(ModBlocks.nontupleCompressedSand.getRegistryName()));
       event.getRegistry().register(new ItemBlock(ModBlocks.decupleCompressedSand).setRegistryName(ModBlocks.decupleCompressedSand.getRegistryName()));
    }

}

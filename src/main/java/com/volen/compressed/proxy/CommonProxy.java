package com.volen.compressed.proxy;

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
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
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
    }
}

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

import static com.volen.compressed.blocks.ModBlocks.octupleCompressedDirt;


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
    }
}

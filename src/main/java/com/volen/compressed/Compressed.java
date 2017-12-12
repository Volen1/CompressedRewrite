package com.volen.compressed;

import com.volen.compressed.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;


@Mod(modid = Compressed.MODID, name = Compressed.MODNAME, version = Compressed.VERSION, useMetadata = true)

public class Compressed {

    public static final String MODID = "cpd";
    public static final String MODNAME = "Compressed";
    public static final String VERSION = "0.1.5";

    @SidedProxy(clientSide = "com.volen.compressed.proxy.ClientProxy", serverSide = "com.volen.compressed.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static Compressed instance;

    public static Logger logger;

    public static CreativeTabs compressedTab = new CreativeTabs("Compressed") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ModBlocks.compressedCobblestone);
        }
    };

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event ) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {

        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {

        proxy.postInit(e);
    }
}

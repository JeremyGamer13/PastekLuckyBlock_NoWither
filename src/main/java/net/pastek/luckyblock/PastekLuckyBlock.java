package net.pastek.luckyblock;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.pastek.luckyblock.prefab.configuration.LBConfigurationHandler;
import net.pastek.luckyblock.registers.UnifiedLuckyBlockRegister;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod(PastekLuckyBlock.MOD_ID)
public class PastekLuckyBlock {
    public static final String MOD_ID = "pastekluckyblock";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public PastekLuckyBlock(FMLJavaModLoadingContext context) {
        context.registerConfig(ModConfig.Type.COMMON, LBConfigurationHandler.COMMON_SPEC);
        IEventBus EventBus = context.getModEventBus();
        EventBus.addListener(this::commonSetup);
        UnifiedLuckyBlockRegister.register(EventBus);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }


    public static ResourceLocation rl(String path) {
        return ResourceLocation.fromNamespaceAndPath(PastekLuckyBlock.MOD_ID, path);
    }
}
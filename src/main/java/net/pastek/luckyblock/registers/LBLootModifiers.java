package net.pastek.luckyblock.registers;

import com.mojang.serialization.Codec;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pastek.luckyblock.PastekLuckyBlock;
import net.pastek.luckyblock.common.loot.LootTableModifier;

public class LBLootModifiers {
    public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> LOOT_MODIFIER_SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, PastekLuckyBlock.MOD_ID);

    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> LOOT_TABLE =
            LOOT_MODIFIER_SERIALIZERS.register("loot_table", LootTableModifier.CODEC);


    public static void register(IEventBus eventBus) {
        LOOT_MODIFIER_SERIALIZERS.register(eventBus);
    }
}
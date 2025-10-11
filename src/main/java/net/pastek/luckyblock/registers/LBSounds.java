package net.pastek.luckyblock.registers;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pastek.luckyblock.PastekLuckyBlock;

public class LBSounds {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, PastekLuckyBlock.MOD_ID);

    public static final RegistryObject<SoundEvent> SOUND_BADLOOT = registerSoundEvents("badloot");
    public static final RegistryObject<SoundEvent> SOUND_MIDLOOT = registerSoundEvents("midloot");


    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        return SOUNDS.register(name, () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(PastekLuckyBlock.MOD_ID, name)));
    }
}
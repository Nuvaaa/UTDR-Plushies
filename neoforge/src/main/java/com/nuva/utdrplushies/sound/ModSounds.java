package com.nuva.utdrplushies.sound;

import com.nuva.utdrplushies.UTDRPlushies;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, UTDRPlushies.MODID);

    public static final Supplier<SoundEvent> PLUSHIE_SQUISH = registerSoundEvent("plushie_squish");
    public static final Supplier<SoundEvent> PINK_SQUISH = registerSoundEvent("pink_squish");
    public static final Supplier<SoundEvent> TENNA_SQUISH = registerSoundEvent("tenna_squish");
    public static final Supplier<SoundEvent> FLOWERY_SQUISH = registerSoundEvent("flowery_squish");

    public static final Supplier<SoundEvent> TENNA_DEATH = registerSoundEvent("tenna_death");

    private static Supplier<SoundEvent> registerSoundEvent(String name) {
        ResourceLocation id = ResourceLocation.fromNamespaceAndPath(UTDRPlushies.MODID, name);
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(id));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}

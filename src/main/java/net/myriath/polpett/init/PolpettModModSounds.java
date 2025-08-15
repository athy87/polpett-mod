/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.myriath.polpett.init;

import net.myriath.polpett.PolpettModMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

public class PolpettModModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, PolpettModMod.MODID);
	public static final RegistryObject<SoundEvent> POLPETT_SOUND_HAPPY = REGISTRY.register("polpett.sound.happy", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("polpett_mod", "polpett.sound.happy")));
	public static final RegistryObject<SoundEvent> POLPETT_SOUND_HUNGRY = REGISTRY.register("polpett.sound.hungry", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("polpett_mod", "polpett.sound.hungry")));
	public static final RegistryObject<SoundEvent> POLPETT_SOUND_SAD = REGISTRY.register("polpett.sound.sad", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("polpett_mod", "polpett.sound.sad")));
	public static final RegistryObject<SoundEvent> POLPETT_SOUND_VERYSAD = REGISTRY.register("polpett.sound.verysad", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("polpett_mod", "polpett.sound.verysad")));
	public static final RegistryObject<SoundEvent> POLPETT_SOUND_HURT = REGISTRY.register("polpett.sound.hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("polpett_mod", "polpett.sound.hurt")));
	public static final RegistryObject<SoundEvent> POLPETT_SOUND_IDLE = REGISTRY.register("polpett.sound.idle", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("polpett_mod", "polpett.sound.idle")));
}
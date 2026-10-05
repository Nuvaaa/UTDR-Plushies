package com.nuva.utdrplushies.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties CHOCOLATE = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200), 1f).build();
}

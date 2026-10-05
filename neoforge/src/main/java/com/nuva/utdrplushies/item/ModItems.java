package com.nuva.utdrplushies.item;

import com.nuva.utdrplushies.UTDRPlushies;
import com.nuva.utdrplushies.item.custom.BlackKnifeItem;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(UTDRPlushies.MODID);

    public static final DeferredItem<Item> CHOCOLATE = ITEMS.register("chocolate",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CHOCOLATE)) {
                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.utdrplushies.chocolate"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }});

    public static final DeferredItem<Item> BLACK_KNIFE = ITEMS.register("black_knife",
            () -> new BlackKnifeItem(new Item.Properties().stacksTo(1), "tooltip.utdrplushies.black_knife"));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

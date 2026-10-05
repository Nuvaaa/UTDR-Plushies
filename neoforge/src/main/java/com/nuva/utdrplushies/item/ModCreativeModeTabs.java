package com.nuva.utdrplushies.item;

import com.nuva.utdrplushies.UTDRPlushies;
import com.nuva.utdrplushies.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, UTDRPlushies.MODID);

    public static final Supplier<CreativeModeTab> SILLY_PLUSHIES_TAB = CREATIVE_MODE_TAB.register("silly_plushies_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.CHARA_PLUSH.get()))
                    .title(Component.translatable("creativetab.utdrplushies.plushies"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.DOG_PLUSH);
                        output.accept(ModBlocks.CHARA_PLUSH);
                        output.accept(ModBlocks.FRISK_PLUSH);
                        output.accept(ModBlocks.BUTTERSCOTCH_PIE_PLUSH);
                        output.accept(ModBlocks.SNAIL_PIE_PLUSH);
                        output.accept(ModBlocks.KRIS_PLUSH);
                        output.accept(ModBlocks.SUSIE_PLUSH);
                        output.accept(ModBlocks.RALSEI_PLUSH);
                        output.accept(ModBlocks.QUEEN_PLUSH);
                        output.accept(ModBlocks.BATTERY_ACID_PIE_PLUSH);
                        output.accept(ModBlocks.TENNA_PLUSH);
                        output.accept(ModBlocks.ARMLESS_TENNA_PLUSH);
                        output.accept(ModBlocks.FLOWERY_PLUSH);
                        output.accept(ModBlocks.ORANGE_PLUSH);
                        output.accept(ModBlocks.YELLOW_PLUSH);
                        output.accept(ModBlocks.GREEN_PLUSH);
                        output.accept(ModBlocks.AQUA_PLUSH);
                        output.accept(ModBlocks.BLUE_PLUSH);
                        output.accept(ModBlocks.SETH_PLUSH);
                        output.accept(ModBlocks.PINK_PLUSH);
                        output.accept(ModBlocks.GHOST_PLUSH);
                        output.accept(ModBlocks.CLOVER_PLUSH);
                        output.accept(ModBlocks.CEROBA_PLUSH);
                        output.accept(ModBlocks.AVERY_PLUSH);
                        output.accept(ModBlocks.CINDER_PLUSH);
                        output.accept(ModBlocks.EIDEN_PLUSH);
                        output.accept(ModBlocks.INTEGRA_PLUSH);
                        output.accept(ModBlocks.PERCY_PLUSH);
                        output.accept(ModItems.CHOCOLATE);
                        output.accept(ModItems.BLACK_KNIFE);
                    }).build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}

package com.nuva.utdrplushies.block;

import com.nuva.utdrplushies.UTDRPlushies;
import com.nuva.utdrplushies.block.custom.Pie;
import com.nuva.utdrplushies.block.custom.Plush;
import com.nuva.utdrplushies.item.ModItems;
import com.nuva.utdrplushies.sound.ModSounds;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(UTDRPlushies.MODID);

    public static final DeferredBlock<Block> DOG_PLUSH = registerBlock("dog_plush",
            () -> new Plush(BlockBehaviour.Properties.of().sound(SoundType.WOOL).noOcclusion().destroyTime(0.2f),
                    ModSounds.PLUSHIE_SQUISH.get(), "tooltip.utdrplushies.ut"));
;
    public static final DeferredBlock<Block> CHARA_PLUSH = registerBlock("chara_plush",
            () -> new Plush(BlockBehaviour.Properties.of().sound(SoundType.WOOL).noOcclusion().destroyTime(0.2f),
                    ModSounds.PLUSHIE_SQUISH.get(), "tooltip.utdrplushies.ut"));

    public static final DeferredBlock<Block> FRISK_PLUSH = registerBlock("frisk_plush",
            () -> new Plush(BlockBehaviour.Properties.of().sound(SoundType.WOOL).noOcclusion().destroyTime(0.2f),
                    ModSounds.PLUSHIE_SQUISH.get(), "tooltip.utdrplushies.ut"));

    public static final DeferredBlock<Block> BUTTERSCOTCH_PIE_PLUSH = registerBlock("butterscotch_pie_plush",
            () -> new Pie(BlockBehaviour.Properties.of().sound(SoundType.WOOL).destroyTime(0.2f)) {
                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.utdrplushies.pie_plush"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }});

    public static final DeferredBlock<Block> SNAIL_PIE_PLUSH = registerBlock("snail_pie_plush",
            () -> new Pie(BlockBehaviour.Properties.of().sound(SoundType.WOOL).destroyTime(0.2f)) {
                public static final VoxelShape SHAPE = Block.box(1.0, 0.0, 1.0, 15.0, 6.0, 15.0);
                @Override
                protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
                    return SHAPE;
                }
                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.utdrplushies.pie_plush"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }});

    public static final DeferredBlock<Block> KRIS_PLUSH = registerBlock("kris_plush",
            () -> new Plush(BlockBehaviour.Properties.of().sound(SoundType.WOOL).noOcclusion().destroyTime(0.2f),
                    ModSounds.PLUSHIE_SQUISH.get(), "tooltip.utdrplushies.dr"));

    public static final DeferredBlock<Block> SUSIE_PLUSH = registerBlock("susie_plush",
            () -> new Plush(BlockBehaviour.Properties.of().sound(SoundType.WOOL).noOcclusion().destroyTime(0.2f),
                    ModSounds.PLUSHIE_SQUISH.get(), "tooltip.utdrplushies.dr"));

    public static final DeferredBlock<Block> RALSEI_PLUSH = registerBlock("ralsei_plush",
            () -> new Plush(BlockBehaviour.Properties.of().sound(SoundType.WOOL).noOcclusion().destroyTime(0.2f),
                    ModSounds.PLUSHIE_SQUISH.get(), "tooltip.utdrplushies.dr"));

    public static final DeferredBlock<Block> LANCER_PLUSH = registerBlock("lancer_plush",
            () -> new Plush(BlockBehaviour.Properties.of().sound(SoundType.WOOL).noOcclusion().destroyTime(0.2f),
                    ModSounds.LANCER_SQUISH.get(), "tooltip.utdrplushies.drch1"));

    public static final DeferredBlock<Block> QUEEN_PLUSH = registerBlock("queen_plush",
            () -> new Plush(BlockBehaviour.Properties.of().sound(SoundType.WOOL).noOcclusion().destroyTime(0.2f),
                    ModSounds.QUEEN_SQUISH.get(), "tooltip.utdrplushies.drch2"));

    public static final DeferredBlock<Block> BATTERY_ACID_PIE_PLUSH = registerBlock("battery_acid_pie_plush",
            () -> new Pie(BlockBehaviour.Properties.of().sound(SoundType.WOOL).destroyTime(0.2f)) {
                public static final VoxelShape SHAPE = Block.box(1.0, 0.0, 1.0, 15.0, 4.0, 15.0);
                @Override
                protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
                    return SHAPE;
                }
                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.utdrplushies.pie_plush"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }});

    public static final DeferredBlock<Block> TENNA_PLUSH = registerBlock("tenna_plush",
            () -> new Plush(BlockBehaviour.Properties.of().sound(SoundType.WOOL).noOcclusion().destroyTime(0.2f),
                    ModSounds.TENNA_SQUISH.get(), "tooltip.utdrplushies.drch3"));

    public static final DeferredBlock<Block> ARMLESS_TENNA_PLUSH = registerBlock("armless_tenna_plush",
            () -> new Plush(BlockBehaviour.Properties.of().sound(SoundType.WOOL).noOcclusion().destroyTime(0.2f),
                    null, "tooltip.utdrplushies.drch3"));

    public static final DeferredBlock<Block> FLOWERY_PLUSH = registerBlock("flowery_plush",
            () -> new Plush(BlockBehaviour.Properties.of().sound(SoundType.WOOL).noOcclusion().destroyTime(0.2f),
                    ModSounds.FLOWERY_SQUISH.get(), "tooltip.utdrplushies.drch5"));

    public static final DeferredBlock<Block> ORANGE_PLUSH = registerBlock("orange_plush",
            () -> new Plush(BlockBehaviour.Properties.of().sound(SoundType.WOOL).noOcclusion().destroyTime(0.2f),
                    ModSounds.PLUSHIE_SQUISH.get(), "tooltip.utdrplushies.drch5"));

    public static final DeferredBlock<Block> YELLOW_PLUSH = registerBlock("yellow_plush",
            () -> new Plush(BlockBehaviour.Properties.of().sound(SoundType.WOOL).noOcclusion().destroyTime(0.2f),
                    ModSounds.PLUSHIE_SQUISH.get(), "tooltip.utdrplushies.drch5"));

    public static final DeferredBlock<Block> GREEN_PLUSH = registerBlock("green_plush",
            () -> new Plush(BlockBehaviour.Properties.of().sound(SoundType.WOOL).noOcclusion().destroyTime(0.2f),
                    null, "tooltip.utdrplushies.drch5"));

    public static final DeferredBlock<Block> AQUA_PLUSH = registerBlock("aqua_plush",
            () -> new Plush(BlockBehaviour.Properties.of().sound(SoundType.WOOL).noOcclusion().destroyTime(0.2f),
                    ModSounds.PLUSHIE_SQUISH.get(), "tooltip.utdrplushies.drch5"));

    public static final DeferredBlock<Block> BLUE_PLUSH = registerBlock("blue_plush",
            () -> new Plush(BlockBehaviour.Properties.of().sound(SoundType.WOOL).noOcclusion().destroyTime(0.2f),
                    ModSounds.PLUSHIE_SQUISH.get(), "tooltip.utdrplushies.drch5"));

    public static final DeferredBlock<Block> SETH_PLUSH = registerBlock("seth_plush",
            () -> new Plush(BlockBehaviour.Properties.of().sound(SoundType.WOOL).noOcclusion().destroyTime(0.2f),
                    ModSounds.PLUSHIE_SQUISH.get(), "tooltip.utdrplushies.drch5"));

    public static final DeferredBlock<Block> PINK_PLUSH = registerBlock("pink_plush",
            () -> new Plush(BlockBehaviour.Properties.of().sound(SoundType.WOOL).noOcclusion().destroyTime(0.2f),
                    ModSounds.PINK_SQUISH.get(), "tooltip.utdrplushies.drch5"));

    public static final DeferredBlock<Block> GHOST_PLUSH = registerBlock("ghost_plush",
            () -> new Plush(BlockBehaviour.Properties.of().sound(SoundType.WOOL).noOcclusion().destroyTime(0.2f),
                    ModSounds.PINK_SQUISH.get(), "tooltip.utdrplushies.drch5"));

    public static final DeferredBlock<Block> CLOVER_PLUSH = registerBlock("clover_plush",
            () -> new Plush(BlockBehaviour.Properties.of().sound(SoundType.WOOL).noOcclusion().destroyTime(0.2f),
                    ModSounds.PLUSHIE_SQUISH.get(), "tooltip.utdrplushies.uty"));

    public static final DeferredBlock<Block> CEROBA_PLUSH = registerBlock("ceroba_plush",
            () -> new Plush(BlockBehaviour.Properties.of().sound(SoundType.WOOL).noOcclusion().destroyTime(0.2f),
                    ModSounds.PLUSHIE_SQUISH.get(), "tooltip.utdrplushies.uty"));

    public static final DeferredBlock<Block> AVERY_PLUSH = registerBlock("avery_plush",
            () -> new Plush(BlockBehaviour.Properties.of().sound(SoundType.WOOL).noOcclusion().destroyTime(0.2f),
                    ModSounds.PLUSHIE_SQUISH.get(), "tooltip.utdrplushies.utgr"));

    public static final DeferredBlock<Block> CINDER_PLUSH = registerBlock("cinder_plush",
            () -> new Plush(BlockBehaviour.Properties.of().sound(SoundType.WOOL).noOcclusion().destroyTime(0.2f),
                    ModSounds.PLUSHIE_SQUISH.get(), "tooltip.utdrplushies.utgr"));

    public static final DeferredBlock<Block> INTEGRA_PLUSH = registerBlock("integra_plush",
            () -> new Plush(BlockBehaviour.Properties.of().sound(SoundType.WOOL).noOcclusion().destroyTime(0.2f),
                    ModSounds.PLUSHIE_SQUISH.get(), "tooltip.utdrplushies.utgr"));

    public static final DeferredBlock<Block> EIDEN_PLUSH = registerBlock("eiden_plush",
            () -> new Plush(BlockBehaviour.Properties.of().sound(SoundType.WOOL).noOcclusion().destroyTime(0.2f),
                    ModSounds.PLUSHIE_SQUISH.get(), "tooltip.utdrplushies.utgr"));

    public static final DeferredBlock<Block> PERCY_PLUSH = registerBlock("percy_plush",
            () -> new Plush(BlockBehaviour.Properties.of().sound(SoundType.WOOL).noOcclusion().destroyTime(0.2f),
                    ModSounds.PLUSHIE_SQUISH.get(), "tooltip.utdrplushies.utgr"));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

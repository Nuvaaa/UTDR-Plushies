package com.nuva.utdrplushies.item.custom;

import com.nuva.utdrplushies.block.ModBlocks;
import com.nuva.utdrplushies.block.custom.Plush;
import com.nuva.utdrplushies.sound.ModSounds;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

import java.util.List;
import java.util.Map;

public class BlackKnifeItem extends Item {
    private static final Map<Block, Block> BLACK_KNIFE_MAP =
            Map.of(
                    ModBlocks.TENNA_PLUSH.get(), ModBlocks.ARMLESS_TENNA_PLUSH.get()
            );

    MutableComponent TooltipKey = null;

    public BlackKnifeItem(Properties properties, String tooltip) {
        super(properties);
        if(tooltip != null) { TooltipKey = Component.translatable(tooltip); }
    }

    @Override
    public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        if(TooltipKey != null) {
            tooltipComponents.add(TooltipKey);
            super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
        }
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        Block clickedBlock = level.getBlockState(context.getClickedPos()).getBlock();

        if(BLACK_KNIFE_MAP.containsKey(clickedBlock)) {
            if(!level.isClientSide()) {
                Direction dir = level.getBlockState(context.getClickedPos()).getValue(Plush.FACING);

                level.setBlockAndUpdate(context.getClickedPos(), BLACK_KNIFE_MAP.get(clickedBlock).defaultBlockState().setValue(Plush.FACING, dir));

                if(clickedBlock == ModBlocks.TENNA_PLUSH.get()) {
                    level.playSound(null, context.getClickedPos(), ModSounds.TENNA_DEATH.get(), SoundSource.BLOCKS);
                }
            }
        }

        return InteractionResult.SUCCESS;
    }
}

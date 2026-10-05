package com.nuva.utdrplushies.block.custom;

import com.mojang.serialization.MapCodec;
import com.nuva.utdrplushies.block.ModBlocks;
import com.nuva.utdrplushies.sound.ModSounds;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class Plush extends HorizontalDirectionalBlock {
    public static final VoxelShape SHAPE = Block.box(4.0, 0.0, 4.0, 12.0, 15.0, 12.0);

    SoundEvent PlushieSquish = null;
    MutableComponent TooltipKey = null;

    public Plush(Properties properties, SoundEvent sound, String tooltip) {
        super(properties);
        if(sound != null) { PlushieSquish = sound; }
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
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return null;
    }

    @Override
    public @Nullable BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {
        if(!level.isClientSide()) {
            if (PlushieSquish != null) { // trying to play a null sound works, but causes errors
                level.playSound(null, pos, PlushieSquish, SoundSource.BLOCKS);
            }
        }
        return super.useWithoutItem(state, level, pos, player, hitResult);
    }
}

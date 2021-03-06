package net.pl3x.stairs.block.stairs;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.pl3x.stairs.block.BlockBase;
import net.pl3x.stairs.block.ModBlocks;

import java.util.Random;

public class StairsConcrete extends BlockBase {
    private final EnumDyeColor color;

    public StairsConcrete(EnumDyeColor color) {
        super(Material.ROCK, "stairs_concrete_" + color.getName());
        setSoundType(SoundType.STONE);
        setHardness(1.8F);
        this.color = color;
    }

    @Override
    public MapColor getMapColor(IBlockState state, IBlockAccess world, BlockPos pos) {
        return MapColor.getBlockColor(color);
    }

    @Override
    public Item createItemBlock() {
        return new ItemBlock(getBlock(color)).setRegistryName(getRegistryName());
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Item.getItemFromBlock(getBlock(color));
    }

    @Override
    public ItemStack getItem(World world, BlockPos pos, IBlockState state) {
        return new ItemStack(getBlock(color));
    }

    public static StairsConcrete getBlock(EnumDyeColor color) {
        switch (color) {
            case BLACK:
                return ModBlocks.STAIRS_CONCRETE_BLACK;
            case BLUE:
                return ModBlocks.STAIRS_CONCRETE_BLUE;
            case BROWN:
                return ModBlocks.STAIRS_CONCRETE_BROWN;
            case CYAN:
                return ModBlocks.STAIRS_CONCRETE_CYAN;
            case GRAY:
                return ModBlocks.STAIRS_CONCRETE_GRAY;
            case GREEN:
                return ModBlocks.STAIRS_CONCRETE_GREEN;
            case LIGHT_BLUE:
                return ModBlocks.STAIRS_CONCRETE_LIGHT_BLUE;
            case LIME:
                return ModBlocks.STAIRS_CONCRETE_LIME;
            case MAGENTA:
                return ModBlocks.STAIRS_CONCRETE_MAGENTA;
            case ORANGE:
                return ModBlocks.STAIRS_CONCRETE_ORANGE;
            case PINK:
                return ModBlocks.STAIRS_CONCRETE_PINK;
            case PURPLE:
                return ModBlocks.STAIRS_CONCRETE_PURPLE;
            case RED:
                return ModBlocks.STAIRS_CONCRETE_RED;
            case SILVER:
                return ModBlocks.STAIRS_CONCRETE_SILVER;
            case YELLOW:
                return ModBlocks.STAIRS_CONCRETE_YELLOW;
            case WHITE:
            default:
                return ModBlocks.STAIRS_CONCRETE_WHITE;
        }
    }
}

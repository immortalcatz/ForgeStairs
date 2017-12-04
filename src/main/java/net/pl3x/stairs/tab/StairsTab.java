package net.pl3x.stairs.tab;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.pl3x.stairs.block.ModBlocks;

import java.util.ArrayList;
import java.util.List;

public class StairsTab extends CreativeTabs {
    public static List<Block> LIST = new ArrayList<>();

    public StairsTab() {
        super("stairs");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModBlocks.STAIRS_ICE_PACKED);
    }

    @Override
    public void displayAllRelevantItems(NonNullList<ItemStack> items) {
        items.clear();
        LIST.forEach(block -> items.add(new ItemStack(block)));
    }

    static {
        LIST.add(ModBlocks.STAIRS_DIRT);
        LIST.add(ModBlocks.STAIRS_DIRT_COARSE);
        LIST.add(ModBlocks.STAIRS_GRASS);
        LIST.add(Blocks.OAK_STAIRS);
        LIST.add(Blocks.BIRCH_STAIRS);
        LIST.add(Blocks.JUNGLE_STAIRS);
        LIST.add(Blocks.SPRUCE_STAIRS);
        LIST.add(Blocks.ACACIA_STAIRS);
        LIST.add(Blocks.DARK_OAK_STAIRS);
        LIST.add(ModBlocks.STAIRS_LOG_OAK);
        LIST.add(ModBlocks.STAIRS_LOG_BIRCH);
        LIST.add(ModBlocks.STAIRS_LOG_JUNGLE);
        LIST.add(ModBlocks.STAIRS_LOG_SPRUCE);
        LIST.add(ModBlocks.STAIRS_LOG_ACACIA);
        LIST.add(ModBlocks.STAIRS_LOG_DARK_OAK);
        LIST.add(ModBlocks.STAIRS_LEAVES_OAK);
        LIST.add(ModBlocks.STAIRS_LEAVES_SPRUCE);
        LIST.add(ModBlocks.STAIRS_LEAVES_BIRCH);
        LIST.add(ModBlocks.STAIRS_LEAVES_JUNGLE);
        LIST.add(ModBlocks.STAIRS_LEAVES_ACACIA);
        LIST.add(ModBlocks.STAIRS_LEAVES_DARK_OAK);
        LIST.add(Blocks.STONE_STAIRS);
        LIST.add(ModBlocks.STAIRS_COBBLESTONE_MOSSY);
        LIST.add(ModBlocks.STAIRS_STONE);
        LIST.add(ModBlocks.STAIRS_ANDESITE);
        LIST.add(ModBlocks.STAIRS_ANDESITE_SMOOTH);
        LIST.add(ModBlocks.STAIRS_DIORITE);
        LIST.add(ModBlocks.STAIRS_DIORITE_SMOOTH);
        LIST.add(ModBlocks.STAIRS_GRANITE);
        LIST.add(ModBlocks.STAIRS_GRANITE_SMOOTH);
        LIST.add(Blocks.STONE_BRICK_STAIRS);
        LIST.add(ModBlocks.STAIRS_STONE_BRICK_CHISELED);
        LIST.add(ModBlocks.STAIRS_STONE_BRICK_CRACKED);
        LIST.add(ModBlocks.STAIRS_STONE_BRICK_MOSSY);
        LIST.add(Blocks.BRICK_STAIRS);
        LIST.add(Blocks.SANDSTONE_STAIRS);
        LIST.add(ModBlocks.STAIRS_SANDSTONE_CHISELED);
        LIST.add(ModBlocks.STAIRS_SANDSTONE_SMOOTH);
        LIST.add(Blocks.RED_SANDSTONE_STAIRS);
        LIST.add(ModBlocks.STAIRS_RED_SANDSTONE_CHISELED);
        LIST.add(ModBlocks.STAIRS_RED_SANDSTONE_SMOOTH);
        LIST.add(ModBlocks.STAIRS_NETHER_WART);
        LIST.add(ModBlocks.STAIRS_NETHERRACK);
        LIST.add(Blocks.NETHER_BRICK_STAIRS);
        LIST.add(ModBlocks.STAIRS_RED_NETHER_BRICK);
        LIST.add(Blocks.QUARTZ_STAIRS);
        LIST.add(ModBlocks.STAIRS_QUARTZ_CHISELED);
        LIST.add(ModBlocks.STAIRS_QUARTZ_PILLAR);
        LIST.add(ModBlocks.STAIRS_GLOWSTONE);
        LIST.add(ModBlocks.STAIRS_MAGMA);
        LIST.add(ModBlocks.STAIRS_OBSIDIAN);
        LIST.add(ModBlocks.STAIRS_COAL);
        LIST.add(ModBlocks.STAIRS_IRON);
        LIST.add(ModBlocks.STAIRS_GOLD);
        LIST.add(ModBlocks.STAIRS_LAPIS);
        LIST.add(ModBlocks.STAIRS_REDSTONE);
        LIST.add(ModBlocks.STAIRS_DIAMOND);
        LIST.add(ModBlocks.STAIRS_EMERALD);
        LIST.add(ModBlocks.STAIRS_PRISMARINE);
        LIST.add(ModBlocks.STAIRS_PRISMARINE_BRICK);
        LIST.add(ModBlocks.STAIRS_DARK_PRISMARINE);
        LIST.add(ModBlocks.STAIRS_SEA_LANTERN);
        LIST.add(ModBlocks.STAIRS_END_STONE);
        LIST.add(ModBlocks.STAIRS_END_BRICKS);
        LIST.add(Blocks.PURPUR_STAIRS);
        LIST.add(ModBlocks.STAIRS_PURPUR_PILLAR);
        LIST.add(ModBlocks.STAIRS_BONE);
        LIST.add(ModBlocks.STAIRS_ICE_PACKED);
        LIST.add(ModBlocks.STAIRS_SLIME);
        LIST.add(ModBlocks.STAIRS_CONCRETE_BLACK);
        LIST.add(ModBlocks.STAIRS_CONCRETE_BLUE);
        LIST.add(ModBlocks.STAIRS_CONCRETE_BROWN);
        LIST.add(ModBlocks.STAIRS_CONCRETE_CYAN);
        LIST.add(ModBlocks.STAIRS_CONCRETE_GRAY);
        LIST.add(ModBlocks.STAIRS_CONCRETE_GREEN);
        LIST.add(ModBlocks.STAIRS_CONCRETE_LIGHT_BLUE);
        LIST.add(ModBlocks.STAIRS_CONCRETE_LIME);
        LIST.add(ModBlocks.STAIRS_CONCRETE_MAGENTA);
        LIST.add(ModBlocks.STAIRS_CONCRETE_ORANGE);
        LIST.add(ModBlocks.STAIRS_CONCRETE_PINK);
        LIST.add(ModBlocks.STAIRS_CONCRETE_PURPLE);
        LIST.add(ModBlocks.STAIRS_CONCRETE_RED);
        LIST.add(ModBlocks.STAIRS_CONCRETE_SILVER);
        LIST.add(ModBlocks.STAIRS_CONCRETE_WHITE);
        LIST.add(ModBlocks.STAIRS_CONCRETE_YELLOW);
        LIST.add(ModBlocks.STAIRS_GLASS);
        LIST.add(ModBlocks.STAIRS_GLASS_BLACK);
        LIST.add(ModBlocks.STAIRS_GLASS_BLUE);
        LIST.add(ModBlocks.STAIRS_GLASS_BROWN);
        LIST.add(ModBlocks.STAIRS_GLASS_CYAN);
        LIST.add(ModBlocks.STAIRS_GLASS_GRAY);
        LIST.add(ModBlocks.STAIRS_GLASS_GREEN);
        LIST.add(ModBlocks.STAIRS_GLASS_LIGHT_BLUE);
        LIST.add(ModBlocks.STAIRS_GLASS_LIME);
        LIST.add(ModBlocks.STAIRS_GLASS_MAGENTA);
        LIST.add(ModBlocks.STAIRS_GLASS_ORANGE);
        LIST.add(ModBlocks.STAIRS_GLASS_PINK);
        LIST.add(ModBlocks.STAIRS_GLASS_PURPLE);
        LIST.add(ModBlocks.STAIRS_GLASS_RED);
        LIST.add(ModBlocks.STAIRS_GLASS_SILVER);
        LIST.add(ModBlocks.STAIRS_GLASS_WHITE);
        LIST.add(ModBlocks.STAIRS_GLASS_YELLOW);
        LIST.add(ModBlocks.STAIRS_TERRACOTTA);
        LIST.add(ModBlocks.STAIRS_TERRACOTTA_BLACK);
        LIST.add(ModBlocks.STAIRS_TERRACOTTA_BLUE);
        LIST.add(ModBlocks.STAIRS_TERRACOTTA_BROWN);
        LIST.add(ModBlocks.STAIRS_TERRACOTTA_CYAN);
        LIST.add(ModBlocks.STAIRS_TERRACOTTA_GRAY);
        LIST.add(ModBlocks.STAIRS_TERRACOTTA_GREEN);
        LIST.add(ModBlocks.STAIRS_TERRACOTTA_LIGHT_BLUE);
        LIST.add(ModBlocks.STAIRS_TERRACOTTA_LIME);
        LIST.add(ModBlocks.STAIRS_TERRACOTTA_MAGENTA);
        LIST.add(ModBlocks.STAIRS_TERRACOTTA_ORANGE);
        LIST.add(ModBlocks.STAIRS_TERRACOTTA_PINK);
        LIST.add(ModBlocks.STAIRS_TERRACOTTA_PURPLE);
        LIST.add(ModBlocks.STAIRS_TERRACOTTA_RED);
        LIST.add(ModBlocks.STAIRS_TERRACOTTA_SILVER);
        LIST.add(ModBlocks.STAIRS_TERRACOTTA_WHITE);
        LIST.add(ModBlocks.STAIRS_TERRACOTTA_YELLOW);
        LIST.add(ModBlocks.STAIRS_WOOL_BLACK);
        LIST.add(ModBlocks.STAIRS_WOOL_BLUE);
        LIST.add(ModBlocks.STAIRS_WOOL_BROWN);
        LIST.add(ModBlocks.STAIRS_WOOL_CYAN);
        LIST.add(ModBlocks.STAIRS_WOOL_GRAY);
        LIST.add(ModBlocks.STAIRS_WOOL_GREEN);
        LIST.add(ModBlocks.STAIRS_WOOL_LIGHT_BLUE);
        LIST.add(ModBlocks.STAIRS_WOOL_LIME);
        LIST.add(ModBlocks.STAIRS_WOOL_MAGENTA);
        LIST.add(ModBlocks.STAIRS_WOOL_ORANGE);
        LIST.add(ModBlocks.STAIRS_WOOL_PINK);
        LIST.add(ModBlocks.STAIRS_WOOL_PURPLE);
        LIST.add(ModBlocks.STAIRS_WOOL_RED);
        LIST.add(ModBlocks.STAIRS_WOOL_SILVER);
        LIST.add(ModBlocks.STAIRS_WOOL_WHITE);
        LIST.add(ModBlocks.STAIRS_WOOL_YELLOW);
    }
}

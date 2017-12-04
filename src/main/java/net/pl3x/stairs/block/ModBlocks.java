package net.pl3x.stairs.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;
import net.pl3x.stairs.block.stairs.BlockStairsBasic;
import net.pl3x.stairs.block.stairs.BlockStairsConcrete;
import net.pl3x.stairs.block.stairs.BlockStairsGlass;
import net.pl3x.stairs.block.stairs.BlockStairsGlassStained;
import net.pl3x.stairs.block.stairs.BlockStairsGrass;
import net.pl3x.stairs.block.stairs.BlockStairsLeaves;
import net.pl3x.stairs.block.stairs.BlockStairsMagma;
import net.pl3x.stairs.block.stairs.BlockStairsRedstone;
import net.pl3x.stairs.block.stairs.BlockStairsSlime;
import net.pl3x.stairs.block.stairs.BlockStairsTerracotta;
import net.pl3x.stairs.block.stairs.BlockStairsWool;
import net.pl3x.stairs.tab.StairsTab;

import java.util.HashSet;
import java.util.Set;

public class ModBlocks {
    public static final Set<BlockBase> __BLOCKS__ = new HashSet<>();

    public static final BlockStairsBasic STAIRS_ANDESITE = new BlockStairsBasic(Material.ROCK, "stairs_andesite", MapColor.STONE).setHardness(1.5F).setResistance(10F).setSoundType(SoundType.STONE);
    public static final BlockStairsBasic STAIRS_ANDESITE_SMOOTH = new BlockStairsBasic(Material.ROCK, "stairs_andesite_smooth", MapColor.STONE).setHardness(1.5F).setResistance(10F).setSoundType(SoundType.STONE);
    public static final BlockStairsBasic STAIRS_BONE = new BlockStairsBasic(Material.ROCK, "stairs_bone", MapColor.SAND).setHardness(2F).setSoundType(SoundType.STONE);
    public static final BlockStairsBasic STAIRS_COAL = new BlockStairsBasic(Material.ROCK, "stairs_coal", MapColor.BLACK).setHardness(5F).setResistance(10F).setSoundType(SoundType.STONE);
    public static final BlockStairsBasic STAIRS_COBBLESTONE_MOSSY = new BlockStairsBasic(Material.ROCK, "stairs_cobblestone_mossy", MapColor.STONE).setHardness(1F).setSoundType(SoundType.STONE);
    public static final BlockStairsConcrete STAIRS_CONCRETE_BLACK = new BlockStairsConcrete(EnumDyeColor.BLACK);
    public static final BlockStairsConcrete STAIRS_CONCRETE_BLUE = new BlockStairsConcrete(EnumDyeColor.BLUE);
    public static final BlockStairsConcrete STAIRS_CONCRETE_BROWN = new BlockStairsConcrete(EnumDyeColor.BROWN);
    public static final BlockStairsConcrete STAIRS_CONCRETE_CYAN = new BlockStairsConcrete(EnumDyeColor.CYAN);
    public static final BlockStairsConcrete STAIRS_CONCRETE_GRAY = new BlockStairsConcrete(EnumDyeColor.GRAY);
    public static final BlockStairsConcrete STAIRS_CONCRETE_GREEN = new BlockStairsConcrete(EnumDyeColor.GREEN);
    public static final BlockStairsConcrete STAIRS_CONCRETE_LIGHT_BLUE = new BlockStairsConcrete(EnumDyeColor.LIGHT_BLUE);
    public static final BlockStairsConcrete STAIRS_CONCRETE_LIME = new BlockStairsConcrete(EnumDyeColor.LIME);
    public static final BlockStairsConcrete STAIRS_CONCRETE_MAGENTA = new BlockStairsConcrete(EnumDyeColor.MAGENTA);
    public static final BlockStairsConcrete STAIRS_CONCRETE_ORANGE = new BlockStairsConcrete(EnumDyeColor.ORANGE);
    public static final BlockStairsConcrete STAIRS_CONCRETE_PINK = new BlockStairsConcrete(EnumDyeColor.PINK);
    public static final BlockStairsConcrete STAIRS_CONCRETE_PURPLE = new BlockStairsConcrete(EnumDyeColor.PURPLE);
    public static final BlockStairsConcrete STAIRS_CONCRETE_RED = new BlockStairsConcrete(EnumDyeColor.RED);
    public static final BlockStairsConcrete STAIRS_CONCRETE_SILVER = new BlockStairsConcrete(EnumDyeColor.SILVER);
    public static final BlockStairsConcrete STAIRS_CONCRETE_WHITE = new BlockStairsConcrete(EnumDyeColor.WHITE);
    public static final BlockStairsConcrete STAIRS_CONCRETE_YELLOW = new BlockStairsConcrete(EnumDyeColor.YELLOW);
    public static final BlockStairsBasic STAIRS_DARK_PRISMARINE = new BlockStairsBasic(Material.ROCK, "stairs_dark_prismarine", MapColor.DIAMOND).setHardness(1.5F).setResistance(10F).setSoundType(SoundType.STONE);
    public static final BlockStairsBasic STAIRS_DIAMOND = new BlockStairsBasic(Material.IRON, "stairs_diamond", MapColor.DIAMOND).setHardness(5F).setResistance(10F).setSoundType(SoundType.METAL);
    public static final BlockStairsBasic STAIRS_DIORITE = new BlockStairsBasic(Material.ROCK, "stairs_diorite", MapColor.QUARTZ).setHardness(1.5F).setResistance(10F).setSoundType(SoundType.STONE);
    public static final BlockStairsBasic STAIRS_DIORITE_SMOOTH = new BlockStairsBasic(Material.ROCK, "stairs_diorite_smooth", MapColor.QUARTZ).setHardness(1.5F).setResistance(10F).setSoundType(SoundType.STONE);
    public static final BlockStairsBasic STAIRS_DIRT = new BlockStairsBasic(Material.GROUND, "stairs_dirt", MapColor.DIRT).setHardness(0.5F).setResistance(0.5F).setSoundType(SoundType.GROUND);
    public static final BlockStairsBasic STAIRS_DIRT_COARSE = new BlockStairsBasic(Material.GROUND, "stairs_dirt_coarse", MapColor.DIRT).setHardness(0.5F).setResistance(0.5F).setSoundType(SoundType.GROUND);
    public static final BlockStairsBasic STAIRS_EMERALD = new BlockStairsBasic(Material.IRON, "stairs_emerald", MapColor.EMERALD).setHardness(5F).setResistance(10F).setSoundType(SoundType.METAL);
    public static final BlockStairsBasic STAIRS_END_BRICKS = new BlockStairsBasic(Material.ROCK, "stairs_end_bricks", MapColor.SAND).setHardness(0.8F).setSoundType(SoundType.STONE);
    public static final BlockStairsBasic STAIRS_END_STONE = new BlockStairsBasic(Material.ROCK, "stairs_end_stone", MapColor.SAND).setHardness(3F).setResistance(15F).setSoundType(SoundType.STONE);
    public static final BlockStairsGlass STAIRS_GLASS = new BlockStairsGlass();
    public static final BlockStairsGlassStained STAIRS_GLASS_BLACK = new BlockStairsGlassStained(EnumDyeColor.BLACK);
    public static final BlockStairsGlassStained STAIRS_GLASS_BLUE = new BlockStairsGlassStained(EnumDyeColor.BLUE);
    public static final BlockStairsGlassStained STAIRS_GLASS_BROWN = new BlockStairsGlassStained(EnumDyeColor.BROWN);
    public static final BlockStairsGlassStained STAIRS_GLASS_CYAN = new BlockStairsGlassStained(EnumDyeColor.CYAN);
    public static final BlockStairsGlassStained STAIRS_GLASS_GRAY = new BlockStairsGlassStained(EnumDyeColor.GRAY);
    public static final BlockStairsGlassStained STAIRS_GLASS_GREEN = new BlockStairsGlassStained(EnumDyeColor.GREEN);
    public static final BlockStairsGlassStained STAIRS_GLASS_LIGHT_BLUE = new BlockStairsGlassStained(EnumDyeColor.LIGHT_BLUE);
    public static final BlockStairsGlassStained STAIRS_GLASS_LIME = new BlockStairsGlassStained(EnumDyeColor.LIME);
    public static final BlockStairsGlassStained STAIRS_GLASS_MAGENTA = new BlockStairsGlassStained(EnumDyeColor.MAGENTA);
    public static final BlockStairsGlassStained STAIRS_GLASS_ORANGE = new BlockStairsGlassStained(EnumDyeColor.ORANGE);
    public static final BlockStairsGlassStained STAIRS_GLASS_PINK = new BlockStairsGlassStained(EnumDyeColor.PINK);
    public static final BlockStairsGlassStained STAIRS_GLASS_PURPLE = new BlockStairsGlassStained(EnumDyeColor.PURPLE);
    public static final BlockStairsGlassStained STAIRS_GLASS_RED = new BlockStairsGlassStained(EnumDyeColor.RED);
    public static final BlockStairsGlassStained STAIRS_GLASS_SILVER = new BlockStairsGlassStained(EnumDyeColor.SILVER);
    public static final BlockStairsGlassStained STAIRS_GLASS_WHITE = new BlockStairsGlassStained(EnumDyeColor.WHITE);
    public static final BlockStairsGlassStained STAIRS_GLASS_YELLOW = new BlockStairsGlassStained(EnumDyeColor.YELLOW);
    public static final BlockStairsBasic STAIRS_GLOWSTONE = new BlockStairsBasic(Material.GLASS, "stairs_glowstone", MapColor.SAND).setHardness(0.3F).setSoundType(SoundType.GLASS).setLightLevel(1F);
    public static final BlockStairsBasic STAIRS_GOLD = new BlockStairsBasic(Material.IRON, "stairs_gold", MapColor.GOLD).setHardness(3F).setResistance(10F).setSoundType(SoundType.METAL);
    public static final BlockStairsBasic STAIRS_GRANITE = new BlockStairsBasic(Material.ROCK, "stairs_granite", MapColor.DIRT).setHardness(1.5F).setResistance(10F).setSoundType(SoundType.STONE);
    public static final BlockStairsBasic STAIRS_GRANITE_SMOOTH = new BlockStairsBasic(Material.ROCK, "stairs_granite_smooth", MapColor.DIRT).setHardness(1.5F).setResistance(10F).setSoundType(SoundType.STONE);
    public static final BlockStairsGrass STAIRS_GRASS = new BlockStairsGrass();
    public static final BlockStairsBasic STAIRS_ICE_PACKED = new BlockStairsBasic(Material.PACKED_ICE, "stairs_ice_packed", MapColor.ICE).setHardness(0.5F).setSoundType(SoundType.GLASS).setSlipperiness(0.98F);
    public static final BlockStairsBasic STAIRS_IRON = new BlockStairsBasic(Material.IRON, "stairs_iron", MapColor.IRON).setHardness(5F).setResistance(10F).setSoundType(SoundType.METAL);
    public static final BlockStairsBasic STAIRS_LAPIS = new BlockStairsBasic(Material.IRON, "stairs_lapis", MapColor.LAPIS).setHardness(3F).setResistance(5F).setSoundType(SoundType.STONE);
    public static final BlockStairsLeaves STAIRS_LEAVES_ACACIA = new BlockStairsLeaves("stairs_leaves_acacia");
    public static final BlockStairsLeaves STAIRS_LEAVES_BIRCH = new BlockStairsLeaves("stairs_leaves_birch");
    public static final BlockStairsLeaves STAIRS_LEAVES_DARK_OAK = new BlockStairsLeaves("stairs_leaves_dark_oak");
    public static final BlockStairsLeaves STAIRS_LEAVES_JUNGLE = new BlockStairsLeaves("stairs_leaves_jungle");
    public static final BlockStairsLeaves STAIRS_LEAVES_OAK = new BlockStairsLeaves("stairs_leaves_oak");
    public static final BlockStairsLeaves STAIRS_LEAVES_SPRUCE = new BlockStairsLeaves("stairs_leaves_spruce");
    public static final BlockStairsBasic STAIRS_LOG_ACACIA = new BlockStairsBasic(Material.WOOD, "stairs_log_acacia", MapColor.ADOBE).setHardness(2F).setSoundType(SoundType.WOOD);
    public static final BlockStairsBasic STAIRS_LOG_BIRCH = new BlockStairsBasic(Material.WOOD, "stairs_log_birch", MapColor.SAND).setHardness(2F).setSoundType(SoundType.WOOD);
    public static final BlockStairsBasic STAIRS_LOG_DARK_OAK = new BlockStairsBasic(Material.WOOD, "stairs_log_dark_oak", MapColor.BROWN).setHardness(2F).setSoundType(SoundType.WOOD);
    public static final BlockStairsBasic STAIRS_LOG_JUNGLE = new BlockStairsBasic(Material.WOOD, "stairs_log_jungle", MapColor.DIRT).setHardness(2F).setSoundType(SoundType.WOOD);
    public static final BlockStairsBasic STAIRS_LOG_OAK = new BlockStairsBasic(Material.WOOD, "stairs_log_oak", MapColor.WOOD).setHardness(2F).setSoundType(SoundType.WOOD);
    public static final BlockStairsBasic STAIRS_LOG_SPRUCE = new BlockStairsBasic(Material.WOOD, "stairs_log_spruce", MapColor.OBSIDIAN).setHardness(2F).setSoundType(SoundType.WOOD);
    public static final BlockStairsMagma STAIRS_MAGMA = new BlockStairsMagma();
    public static final BlockStairsBasic STAIRS_NETHERRACK = new BlockStairsBasic(Material.ROCK, "stairs_netherrack", MapColor.NETHERRACK).setHardness(0.4F).setSoundType(SoundType.STONE);
    public static final BlockStairsBasic STAIRS_NETHER_WART = new BlockStairsBasic(Material.GRASS, "stairs_nether_wart", MapColor.RED).setHardness(1F).setSoundType(SoundType.WOOD);
    public static final BlockStairsBasic STAIRS_OBSIDIAN = new BlockStairsBasic(Material.ROCK, "stairs_obsidian", MapColor.BLACK).setHardness(50F).setResistance(2000F).setSoundType(SoundType.STONE);
    public static final BlockStairsBasic STAIRS_PRISMARINE = new BlockStairsBasic(Material.ROCK, "stairs_prismarine", MapColor.CYAN).setHardness(1.5F).setResistance(10F).setSoundType(SoundType.STONE);
    public static final BlockStairsBasic STAIRS_PRISMARINE_BRICK = new BlockStairsBasic(Material.ROCK, "stairs_prismarine_brick", MapColor.DIAMOND).setHardness(1.5F).setResistance(10F).setSoundType(SoundType.STONE);
    public static final BlockStairsBasic STAIRS_PURPUR_PILLAR = new BlockStairsBasic(Material.ROCK, "stairs_purpur_pillar", MapColor.MAGENTA).setHardness(1.5F).setResistance(10F).setSoundType(SoundType.STONE);
    public static final BlockStairsBasic STAIRS_QUARTZ_CHISELED = new BlockStairsBasic(Material.ROCK, "stairs_quartz_chiseled", MapColor.QUARTZ).setHardness(0.8F).setSoundType(SoundType.STONE);
    public static final BlockStairsBasic STAIRS_QUARTZ_PILLAR = new BlockStairsBasic(Material.ROCK, "stairs_quartz_pillar", MapColor.QUARTZ).setHardness(0.8F).setSoundType(SoundType.STONE);
    public static final BlockStairsBasic STAIRS_RED_NETHER_BRICK = new BlockStairsBasic(Material.ROCK, "stairs_red_nether_brick", MapColor.NETHERRACK).setHardness(2F).setResistance(10F).setSoundType(SoundType.STONE);
    public static final BlockStairsBasic STAIRS_RED_SANDSTONE_CHISELED = new BlockStairsBasic(Material.ROCK, "stairs_red_sandstone_chiseled", MapColor.ADOBE).setHardness(0.8F).setSoundType(SoundType.STONE);
    public static final BlockStairsBasic STAIRS_RED_SANDSTONE_SMOOTH = new BlockStairsBasic(Material.ROCK, "stairs_red_sandstone_smooth", MapColor.ADOBE).setHardness(0.8F).setSoundType(SoundType.STONE);
    public static final BlockStairsRedstone STAIRS_REDSTONE = new BlockStairsRedstone();
    public static final BlockStairsBasic STAIRS_SANDSTONE_CHISELED = new BlockStairsBasic(Material.ROCK, "stairs_sandstone_chiseled", MapColor.SAND).setHardness(0.8F).setSoundType(SoundType.STONE);
    public static final BlockStairsBasic STAIRS_SANDSTONE_SMOOTH = new BlockStairsBasic(Material.ROCK, "stairs_sandstone_smooth", MapColor.SAND).setHardness(0.8F).setSoundType(SoundType.STONE);
    public static final BlockStairsBasic STAIRS_SEA_LANTERN = new BlockStairsBasic(Material.GLASS, "stairs_sea_lantern", MapColor.QUARTZ).setHardness(0.3F).setSoundType(SoundType.GLASS).setLightLevel(1F);
    public static final BlockStairsSlime STAIRS_SLIME = new BlockStairsSlime();
    public static final BlockStairsBasic STAIRS_STONE = new BlockStairsBasic(Material.ROCK, "stairs_stone", MapColor.STONE).setHardness(1.5F).setResistance(10F).setSoundType(SoundType.STONE);
    public static final BlockStairsBasic STAIRS_STONE_BRICK_CHISELED = new BlockStairsBasic(Material.ROCK, "stairs_stone_brick_chiseled", MapColor.STONE).setHardness(1.5F).setResistance(10F).setSoundType(SoundType.STONE);
    public static final BlockStairsBasic STAIRS_STONE_BRICK_CRACKED = new BlockStairsBasic(Material.ROCK, "stairs_stone_brick_cracked", MapColor.STONE).setHardness(1.5F).setResistance(10F).setSoundType(SoundType.STONE);
    public static final BlockStairsBasic STAIRS_STONE_BRICK_MOSSY = new BlockStairsBasic(Material.ROCK, "stairs_stone_brick_mossy", MapColor.STONE).setHardness(1.5F).setResistance(10F).setSoundType(SoundType.STONE);
    public static final BlockStairsTerracotta STAIRS_TERRACOTTA = new BlockStairsTerracotta();
    public static final BlockStairsTerracotta STAIRS_TERRACOTTA_BLACK = new BlockStairsTerracotta(EnumDyeColor.BLACK);
    public static final BlockStairsTerracotta STAIRS_TERRACOTTA_BLUE = new BlockStairsTerracotta(EnumDyeColor.BLUE);
    public static final BlockStairsTerracotta STAIRS_TERRACOTTA_BROWN = new BlockStairsTerracotta(EnumDyeColor.BROWN);
    public static final BlockStairsTerracotta STAIRS_TERRACOTTA_CYAN = new BlockStairsTerracotta(EnumDyeColor.CYAN);
    public static final BlockStairsTerracotta STAIRS_TERRACOTTA_GRAY = new BlockStairsTerracotta(EnumDyeColor.GRAY);
    public static final BlockStairsTerracotta STAIRS_TERRACOTTA_GREEN = new BlockStairsTerracotta(EnumDyeColor.GREEN);
    public static final BlockStairsTerracotta STAIRS_TERRACOTTA_LIGHT_BLUE = new BlockStairsTerracotta(EnumDyeColor.LIGHT_BLUE);
    public static final BlockStairsTerracotta STAIRS_TERRACOTTA_LIME = new BlockStairsTerracotta(EnumDyeColor.LIME);
    public static final BlockStairsTerracotta STAIRS_TERRACOTTA_MAGENTA = new BlockStairsTerracotta(EnumDyeColor.MAGENTA);
    public static final BlockStairsTerracotta STAIRS_TERRACOTTA_ORANGE = new BlockStairsTerracotta(EnumDyeColor.ORANGE);
    public static final BlockStairsTerracotta STAIRS_TERRACOTTA_PINK = new BlockStairsTerracotta(EnumDyeColor.PINK);
    public static final BlockStairsTerracotta STAIRS_TERRACOTTA_PURPLE = new BlockStairsTerracotta(EnumDyeColor.PURPLE);
    public static final BlockStairsTerracotta STAIRS_TERRACOTTA_RED = new BlockStairsTerracotta(EnumDyeColor.RED);
    public static final BlockStairsTerracotta STAIRS_TERRACOTTA_SILVER = new BlockStairsTerracotta(EnumDyeColor.SILVER);
    public static final BlockStairsTerracotta STAIRS_TERRACOTTA_WHITE = new BlockStairsTerracotta(EnumDyeColor.WHITE);
    public static final BlockStairsTerracotta STAIRS_TERRACOTTA_YELLOW = new BlockStairsTerracotta(EnumDyeColor.YELLOW);
    public static final BlockStairsWool STAIRS_WOOL_BLACK = new BlockStairsWool(EnumDyeColor.BLACK);
    public static final BlockStairsWool STAIRS_WOOL_BLUE = new BlockStairsWool(EnumDyeColor.BLUE);
    public static final BlockStairsWool STAIRS_WOOL_BROWN = new BlockStairsWool(EnumDyeColor.BROWN);
    public static final BlockStairsWool STAIRS_WOOL_CYAN = new BlockStairsWool(EnumDyeColor.CYAN);
    public static final BlockStairsWool STAIRS_WOOL_GRAY = new BlockStairsWool(EnumDyeColor.GRAY);
    public static final BlockStairsWool STAIRS_WOOL_GREEN = new BlockStairsWool(EnumDyeColor.GREEN);
    public static final BlockStairsWool STAIRS_WOOL_LIGHT_BLUE = new BlockStairsWool(EnumDyeColor.LIGHT_BLUE);
    public static final BlockStairsWool STAIRS_WOOL_LIME = new BlockStairsWool(EnumDyeColor.LIME);
    public static final BlockStairsWool STAIRS_WOOL_MAGENTA = new BlockStairsWool(EnumDyeColor.MAGENTA);
    public static final BlockStairsWool STAIRS_WOOL_ORANGE = new BlockStairsWool(EnumDyeColor.ORANGE);
    public static final BlockStairsWool STAIRS_WOOL_PINK = new BlockStairsWool(EnumDyeColor.PINK);
    public static final BlockStairsWool STAIRS_WOOL_PURPLE = new BlockStairsWool(EnumDyeColor.PURPLE);
    public static final BlockStairsWool STAIRS_WOOL_RED = new BlockStairsWool(EnumDyeColor.RED);
    public static final BlockStairsWool STAIRS_WOOL_SILVER = new BlockStairsWool(EnumDyeColor.SILVER);
    public static final BlockStairsWool STAIRS_WOOL_WHITE = new BlockStairsWool(EnumDyeColor.WHITE);
    public static final BlockStairsWool STAIRS_WOOL_YELLOW = new BlockStairsWool(EnumDyeColor.YELLOW);

    public static void register(IForgeRegistry<Block> registry) {
        __BLOCKS__.forEach(registry::register);
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        __BLOCKS__.forEach(block -> registry.register(block.createItemBlock()));
    }

    public static void registerModels() {
        __BLOCKS__.forEach(block -> block.registerItemModel(Item.getItemFromBlock(block)));
    }

    public static final CreativeTabs TAB_STAIRS = new StairsTab();
}

package com.redandblue.rb_awt.init;

import com.redandblue.rb_awt.RedBlueAWTMod;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, RedBlueAWTMod.MODID);

    public static final RegistryObject<Block> RUBY_ORE_BLOCK = register("ruby_ore_block",
            () ->   new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                        .requiresCorrectToolForDrops()
                        .strength(3.0F, 3.0F)
                        .friction(0.5f), UniformInt.of(3, 7)),
                    new Item.Properties().tab(RedBlueAWTMod.TAB));

    public static final RegistryObject<Block> RUBY_DEEPSLATE_ORE_BLOCK = register("ruby_deepslate_ore_block",
            () ->   new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                        .requiresCorrectToolForDrops()
                        .strength(4.5F, 3.0F)
                        .friction(0.5f)
                        .sound(SoundType.DEEPSLATE), UniformInt.of(3, 7)),
            new Item.Properties().tab(RedBlueAWTMod.TAB));

    public static final RegistryObject<Block> RUBY_BLOCK = register("ruby_block",
            () ->   new Block(BlockBehaviour.Properties.of(Material.METAL)
                        .requiresCorrectToolForDrops()
                        .strength(5.0F, 6.0F)
                        .friction(0.5f)
                        .sound(SoundType.METAL)),
                    new Item.Properties().tab(RedBlueAWTMod.TAB));


    public static final RegistryObject<Block> RHODONITE_ORE_BLOCK = register("rhodonite_ore_block",
            () ->   new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops()
                    .strength(3.0F, 3.0F)
                    .friction(0.5f), UniformInt.of(3, 7)),
            new Item.Properties().tab(RedBlueAWTMod.TAB));

    public static final RegistryObject<Block> RHODONITE_DEEPSLATE_ORE_BLOCK = register("rhodonite_deepslate_ore_block",
            () ->   new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops()
                    .strength(4.5F, 3.0F)
                    .friction(0.5f)
                    .sound(SoundType.DEEPSLATE), UniformInt.of(3, 7)),
            new Item.Properties().tab(RedBlueAWTMod.TAB));

    public static final RegistryObject<Block> RHODONITE_BLOCK = register("rhodonite_block",
            () ->   new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .requiresCorrectToolForDrops()
                    .strength(5.0F, 6.0F)
                    .friction(0.5f)
                    .sound(SoundType.METAL)),
            new Item.Properties().tab(RedBlueAWTMod.TAB));


    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> supplier, Item.Properties properties){
        RegistryObject<T> block = BLOCKS.register(name, supplier);
        ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(), properties));
        return block;
    }
}

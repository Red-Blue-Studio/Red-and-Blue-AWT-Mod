package com.redandblue.rb_awt.init;

import com.google.common.base.Suppliers;
import com.redandblue.rb_awt.RedBlueAWTMod;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Supplier;

public class ConfiguredFeatureInit {

    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, RedBlueAWTMod.MODID);

    private static final Supplier<List<OreConfiguration.TargetBlockState>> RUBY_OVERWORLD_REPLACEMENT = Suppliers.memoize(() ->
            List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.RUBY_ORE_BLOCK.get().defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockInit.RUBY_DEEPSLATE_ORE_BLOCK.get().defaultBlockState())
            )
    );
    private static final Supplier<List<OreConfiguration.TargetBlockState>> RHODONITE_OVERWORLD_REPLACEMENT = Suppliers.memoize(() ->
            List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.RHODONITE_ORE_BLOCK.get().defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockInit.RHODONITE_DEEPSLATE_ORE_BLOCK.get().defaultBlockState())
            )
    );


    public static final RegistryObject<ConfiguredFeature<?, ?>> RUBY_ORE_BLOCK = CONFIGURED_FEATURES.register("ruby_ore_block",
            ()-> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(RUBY_OVERWORLD_REPLACEMENT.get(), 7)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> RHODONITE_ORE_BLOCK = CONFIGURED_FEATURES.register("rhodonite_ore_block",
            ()-> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(RHODONITE_OVERWORLD_REPLACEMENT.get(), 7)));
}

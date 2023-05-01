package com.redandblue.rb_awt.init;

import com.redandblue.rb_awt.RedBlueAWTMod;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class PlacedFeatureInit {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, RedBlueAWTMod.MODID);

    public static final RegistryObject<PlacedFeature> RUBY_ORE_BLOCK = PLACED_FEATURES.register("ruby_ore_block",
            () -> new PlacedFeature(ConfiguredFeatureInit.RUBY_ORE_BLOCK.getHolder().get(),
                    commonOrePlacement(4, HeightRangePlacement.uniform(
                            VerticalAnchor.bottom(),
                            VerticalAnchor.absolute(35)
                    ))));

    public static final RegistryObject<PlacedFeature> RHODONITE_ORE_BLOCK = PLACED_FEATURES.register("rhodonite_ore_block",
            () -> new PlacedFeature(ConfiguredFeatureInit.RHODONITE_ORE_BLOCK.getHolder().get(),
                    commonOrePlacement(4, HeightRangePlacement.uniform(
                            VerticalAnchor.bottom(),
                            VerticalAnchor.absolute(35)
                    ))));

    private static List<PlacementModifier> commonOrePlacement(int countPerChunk, PlacementModifier height) {
        return orePlacement(CountPlacement.of(countPerChunk), height);
    }

    private static List<PlacementModifier> orePlacement(PlacementModifier count, PlacementModifier height) {
        return List.of(count, InSquarePlacement.spread(), height, BiomeFilter.biome());
    }
}

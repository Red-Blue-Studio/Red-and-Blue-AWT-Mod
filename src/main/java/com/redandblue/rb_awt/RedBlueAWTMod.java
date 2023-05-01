package com.redandblue.rb_awt;

import com.redandblue.rb_awt.init.BlockInit;
import com.redandblue.rb_awt.init.ConfiguredFeatureInit;
import com.redandblue.rb_awt.init.ItemInit;
import com.redandblue.rb_awt.init.PlacedFeatureInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(RedBlueAWTMod.MODID)
public class RedBlueAWTMod {
    public static final String MODID = "rb_awt";

    public RedBlueAWTMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        ConfiguredFeatureInit.CONFIGURED_FEATURES.register(bus);
        PlacedFeatureInit.PLACED_FEATURES.register(bus);
    }
}

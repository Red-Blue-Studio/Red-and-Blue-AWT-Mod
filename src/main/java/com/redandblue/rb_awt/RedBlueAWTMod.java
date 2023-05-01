package com.redandblue.rb_awt;

import com.redandblue.rb_awt.init.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(RedBlueAWTMod.MODID)
public class RedBlueAWTMod {
    public static final String MODID = "rb_awt";

    public RedBlueAWTMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemInit.ITEMS.register(bus);
    }
}

package com.redandblue.rb_awt.init;

import com.redandblue.rb_awt.RedBlueAWTMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RedBlueAWTMod.MODID);

    public static final RegistryObject<Item> RUBY_ITEM = ITEMS.register("ruby_item",
            ()-> new Item(new Item.Properties()
                    .tab(CreativeModeTab.TAB_MISC)));
}

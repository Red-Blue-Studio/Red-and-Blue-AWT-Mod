package com.redandblue.rb_awt.init;

import com.redandblue.rb_awt.RedBlueAWTMod;
import com.redandblue.rb_awt.base.ModArmorMaterial;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RedBlueAWTMod.MODID);

    /*Creación de minerales personalizados RB
     */
    public static final RegistryObject<Item> RUBY_ITEM = ITEMS.register("ruby_item",
            ()-> new Item(new Item.Properties()
                    .tab(RedBlueAWTMod.TAB)));
    public static final RegistryObject<Item> RHODONITE_ITEM = ITEMS.register("rhodonite_item",
            ()-> new Item(new Item.Properties()
                    .tab(RedBlueAWTMod.TAB)));

    /*Creación de armaduras personalizadas RB
     */
    public static final RegistryObject<ArmorItem> IRON_LAPIS_HELMET = ITEMS.register("iron_lapis_helmet",
            () -> new ArmorItem(ArmorTiers.IRON_LAPIS_MATERIAL, EquipmentSlot.HEAD, props()));
    public static final RegistryObject<ArmorItem> IRON_LAPIS_CHESTPLATE = ITEMS.register("iron_lapis_chestplate",
            () -> new ArmorItem(ArmorTiers.IRON_LAPIS_MATERIAL, EquipmentSlot.CHEST, props()));
    public static final RegistryObject<ArmorItem> IRON_LAPIS_LEGGINS = ITEMS.register("iron_lapis_leggins",
            () -> new ArmorItem(ArmorTiers.IRON_LAPIS_MATERIAL, EquipmentSlot.LEGS, props()));
    public static final RegistryObject<ArmorItem> IRON_LAPIS_BOOTS = ITEMS.register("iron_lapis_boots",
            () -> new ArmorItem(ArmorTiers.IRON_LAPIS_MATERIAL, EquipmentSlot.FEET, props()));

    public static final RegistryObject<ArmorItem> IRON_EMERALD_HELMET = ITEMS.register("iron_emerald_helmet",
            () -> new ArmorItem(ArmorTiers.IRON_EMERALD_MATERIAL, EquipmentSlot.HEAD, props()));
    public static final RegistryObject<ArmorItem> IRON_EMERALD_CHESTPLATE = ITEMS.register("iron_emerald_chestplate",
            () -> new ArmorItem(ArmorTiers.IRON_EMERALD_MATERIAL, EquipmentSlot.CHEST, props()));
    public static final RegistryObject<ArmorItem> IRON_EMERALD_LEGGINS = ITEMS.register("iron_emerald_leggins",
            () -> new ArmorItem(ArmorTiers.IRON_EMERALD_MATERIAL, EquipmentSlot.LEGS, props()));
    public static final RegistryObject<ArmorItem> IRON_EMERALD_BOOTS = ITEMS.register("iron_emerald_boots",
            () -> new ArmorItem(ArmorTiers.IRON_EMERALD_MATERIAL, EquipmentSlot.FEET, props()));

    public static final RegistryObject<ArmorItem> IRON_RUBY_HELMET = ITEMS.register("iron_ruby_helmet",
            () -> new ArmorItem(ArmorTiers.IRON_RUBY_MATERIAL, EquipmentSlot.HEAD, props()));
    public static final RegistryObject<ArmorItem> IRON_RUBY_CHESTPLATE = ITEMS.register("iron_ruby_chestplate",
            () -> new ArmorItem(ArmorTiers.IRON_RUBY_MATERIAL, EquipmentSlot.CHEST, props()));
    public static final RegistryObject<ArmorItem> IRON_RUBY_LEGGINS = ITEMS.register("iron_ruby_leggins",
            () -> new ArmorItem(ArmorTiers.IRON_RUBY_MATERIAL, EquipmentSlot.LEGS, props()));
    public static final RegistryObject<ArmorItem> IRON_RUBY_BOOTS = ITEMS.register("iron_ruby_boots",
            () -> new ArmorItem(ArmorTiers.IRON_RUBY_MATERIAL, EquipmentSlot.FEET, props()));

    public static final RegistryObject<ArmorItem> IRON_AMETHYST_HELMET = ITEMS.register("iron_amethyst_helmet",
            () -> new ArmorItem(ArmorTiers.IRON_AMETHYST_MATERIAL, EquipmentSlot.HEAD, props()));
    public static final RegistryObject<ArmorItem> IRON_AMETHYST_CHESTPLATE = ITEMS.register("iron_amethyst_chestplate",
            () -> new ArmorItem(ArmorTiers.IRON_AMETHYST_MATERIAL, EquipmentSlot.CHEST, props()));
    public static final RegistryObject<ArmorItem> IRON_AMETHYST_LEGGINS = ITEMS.register("iron_amethyst_leggins",
            () -> new ArmorItem(ArmorTiers.IRON_AMETHYST_MATERIAL, EquipmentSlot.LEGS, props()));
    public static final RegistryObject<ArmorItem> IRON_AMETHYST_BOOTS = ITEMS.register("iron_amethyst_boots",
            () -> new ArmorItem(ArmorTiers.IRON_AMETHYST_MATERIAL, EquipmentSlot.FEET, props()));

    public static final RegistryObject<ArmorItem> IRON_COAL_HELMET = ITEMS.register("iron_coal_helmet",
            () -> new ArmorItem(ArmorTiers.IRON_COAL_MATERIAL, EquipmentSlot.HEAD, props()));
    public static final RegistryObject<ArmorItem> IRON_COAL_CHESTPLATE = ITEMS.register("iron_coal_chestplate",
            () -> new ArmorItem(ArmorTiers.IRON_COAL_MATERIAL, EquipmentSlot.CHEST, props()));
    public static final RegistryObject<ArmorItem> IRON_COAL_LEGGINS = ITEMS.register("iron_coal_leggins",
            () -> new ArmorItem(ArmorTiers.IRON_COAL_MATERIAL, EquipmentSlot.LEGS, props()));
    public static final RegistryObject<ArmorItem> IRON_COAL_BOOTS = ITEMS.register("iron_coal_boots",
            () -> new ArmorItem(ArmorTiers.IRON_COAL_MATERIAL, EquipmentSlot.FEET, props()));

    public static final RegistryObject<ArmorItem> IRON_QUARTZ_HELMET = ITEMS.register("iron_quartz_helmet",
            () -> new ArmorItem(ArmorTiers.IRON_QUARTZ_MATERIAL, EquipmentSlot.HEAD, props()));
    public static final RegistryObject<ArmorItem> IRON_QUARTZ_CHESTPLATE = ITEMS.register("iron_quartz_chestplate",
            () -> new ArmorItem(ArmorTiers.IRON_QUARTZ_MATERIAL, EquipmentSlot.CHEST, props()));
    public static final RegistryObject<ArmorItem> IRON_QUARTZ_LEGGINS = ITEMS.register("iron_quartz_leggins",
            () -> new ArmorItem(ArmorTiers.IRON_QUARTZ_MATERIAL, EquipmentSlot.LEGS, props()));
    public static final RegistryObject<ArmorItem> IRON_QUARTZ_BOOTS = ITEMS.register("iron_quartz_boots",
            () -> new ArmorItem(ArmorTiers.IRON_QUARTZ_MATERIAL, EquipmentSlot.FEET, props()));

    public static final RegistryObject<ArmorItem> IRON_GOLD_HELMET = ITEMS.register("iron_gold_helmet",
            () -> new ArmorItem(ArmorTiers.IRON_GOLD_MATERIAL, EquipmentSlot.HEAD, props()));
    public static final RegistryObject<ArmorItem> IRON_GOLD_CHESTPLATE = ITEMS.register("iron_gold_chestplate",
            () -> new ArmorItem(ArmorTiers.IRON_GOLD_MATERIAL, EquipmentSlot.CHEST, props()));
    public static final RegistryObject<ArmorItem> IRON_GOLD_LEGGINS = ITEMS.register("iron_gold_leggins",
            () -> new ArmorItem(ArmorTiers.IRON_GOLD_MATERIAL, EquipmentSlot.LEGS, props()));
    public static final RegistryObject<ArmorItem> IRON_GOLD_BOOTS = ITEMS.register("iron_gold_boots",
            () -> new ArmorItem(ArmorTiers.IRON_GOLD_MATERIAL, EquipmentSlot.FEET, props()));

    public static final RegistryObject<ArmorItem> IRON_RHODONITE_HELMET = ITEMS.register("iron_rhodonite_helmet",
            () -> new ArmorItem(ArmorTiers.IRON_RHODONITE_MATERIAL, EquipmentSlot.HEAD, props()));
    public static final RegistryObject<ArmorItem> IRON_RHODONITE_CHESTPLATE = ITEMS.register("iron_rhodonite_chestplate",
            () -> new ArmorItem(ArmorTiers.IRON_RHODONITE_MATERIAL, EquipmentSlot.CHEST, props()));
    public static final RegistryObject<ArmorItem> IRON_RHODONITE_LEGGINS = ITEMS.register("iron_rhodonite_leggins",
            () -> new ArmorItem(ArmorTiers.IRON_RHODONITE_MATERIAL, EquipmentSlot.LEGS, props()));
    public static final RegistryObject<ArmorItem> IRON_RHODONITE_BOOTS = ITEMS.register("iron_rhodonite_boots",
            () -> new ArmorItem(ArmorTiers.IRON_RHODONITE_MATERIAL, EquipmentSlot.FEET, props()));

    
    private static Item.Properties props(){
        return new Item.Properties().tab(RedBlueAWTMod.TAB);
    }

    public static class ArmorTiers{
        public static final ArmorMaterial IRON_LAPIS_MATERIAL = createModArmorMaterial("iron_lapis_material", () -> Ingredient.of(Items.LAPIS_LAZULI));
        public static final ArmorMaterial IRON_EMERALD_MATERIAL = createModArmorMaterial("iron_emerald_material", () -> Ingredient.of(Items.EMERALD));
        public static final ArmorMaterial IRON_RUBY_MATERIAL = createModArmorMaterial("iron_ruby_material", () -> Ingredient.of(ItemInit.RUBY_ITEM.get()));
        public static final ArmorMaterial IRON_AMETHYST_MATERIAL = createModArmorMaterial("iron_amethyst_material", () -> Ingredient.of(Items.AMETHYST_SHARD));
        public static final ArmorMaterial IRON_COAL_MATERIAL = createModArmorMaterial("iron_coal_material", () -> Ingredient.of(Items.COAL));
        public static final ArmorMaterial IRON_QUARTZ_MATERIAL = createModArmorMaterial("iron_quartz_material", () -> Ingredient.of(Items.QUARTZ));
        public static final ArmorMaterial IRON_GOLD_MATERIAL = createModArmorMaterial("iron_gold_material", () -> Ingredient.of(Items.GOLD_INGOT));
        public static final ArmorMaterial IRON_RHODONITE_MATERIAL = createModArmorMaterial("iron_rhodonite_material", () -> Ingredient.of(ItemInit.RHODONITE_ITEM.get()));

        private static ModArmorMaterial createModArmorMaterial(String name, Supplier<Ingredient> repairMaterial){
            ModArmorMaterial armorMaterial = new ModArmorMaterial(
                    name,
                    28,
                    new int[] {3, 6, 7, 3 },
                    10,
                    SoundEvents.ARMOR_EQUIP_IRON,
                    1.0f,
                    0.0f,
                    repairMaterial
            );
            return armorMaterial;
        }
    }

}

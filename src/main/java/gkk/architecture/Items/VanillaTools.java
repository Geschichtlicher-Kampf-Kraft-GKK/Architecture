package gkk.architecture.Items;

import gkk.architecture.Architecture;
import net.minecraft.item.*;

import java.util.ArrayList;
import java.util.List;

public class VanillaTools {

    public static List<Item> registryVanillaTool(String toolMaterial) {
        ArrayList<Item> items = new ArrayList<>();
        Item.ToolMaterial material = Item.ToolMaterial.valueOf(toolMaterial);
        items.add(new VanillaAxe(material));
        items.add(new VanillaPickaxe(material));
        items.add(new VanillaSword(material));
        items.add(new VanillaSpade(material));
        items.add(new VanillaHoe(material));
        return items;
    }

    private static class VanillaPickaxe extends ItemPickaxe {
        public VanillaPickaxe(ToolMaterial material) {
            super(material);
            setRegistryName(Architecture.MOD_ID, material.name() + "_pickaxe");
            setTranslationKey(material.name().toLowerCase() + "_pickaxe");
        }
    }

    private static class VanillaAxe extends ItemAxe {
        public VanillaAxe(ToolMaterial material) {
            super(material, 3 * material.getAttackDamage(), -(material.getEfficiency() * 0.4f));
            setRegistryName(Architecture.MOD_ID, material.name() + "_axe");
            setTranslationKey(material.name().toLowerCase() + "_axe");
        }
    }

    private static class VanillaHoe extends ItemHoe {
        public VanillaHoe(ToolMaterial material) {
            super(material);
            setRegistryName(Architecture.MOD_ID, material.name() + "_hoe");
            setTranslationKey(material.name().toLowerCase() + "_hoe");
        }
    }

    private static class VanillaSword extends ItemSword {
        public VanillaSword(ToolMaterial material) {
            super(material);
            setRegistryName(Architecture.MOD_ID, material.name() + "_sword");
            setTranslationKey(material.name().toLowerCase() + "_sword");
        }
    }

    private static class VanillaSpade extends ItemSpade {
        public VanillaSpade(ToolMaterial material) {
            super(material);
            setRegistryName(Architecture.MOD_ID, material.name() + "_spade");
            setTranslationKey(material.name().toLowerCase() + "_spade");
        }
    }
}

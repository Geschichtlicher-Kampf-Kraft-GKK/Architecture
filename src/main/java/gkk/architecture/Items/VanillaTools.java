package gkk.architecture.Items;

import net.minecraft.init.Items;
import net.minecraft.item.*;

import java.util.ArrayList;
import java.util.List;

public class VanillaTools {

    public static List<Item> registryVanillaTool(String toolMaterial) {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new VanillaAxe(Item.ToolMaterial.valueOf(toolMaterial)));
        items.add(new VanillaPickaxe(Item.ToolMaterial.valueOf(toolMaterial)));
        items.add(new VanillaSword(Item.ToolMaterial.valueOf(toolMaterial)));
        items.add(new VanillaSpade(Item.ToolMaterial.valueOf(toolMaterial)));
        items.add(new VanillaHoe(Item.ToolMaterial.valueOf(toolMaterial)));
        return items;
    }

    public static class VanillaPickaxe extends ItemPickaxe {
        public VanillaPickaxe(ToolMaterial material) {
            super(material);
        }
    }

    public static class VanillaAxe extends ItemAxe {
        public VanillaAxe(ToolMaterial material) {
            super(material);
        }
    }

    public static class VanillaHoe extends ItemHoe {
        public VanillaHoe(ToolMaterial material) {
            super(material);
        }
    }

    public static class VanillaSword extends ItemSword {
        public VanillaSword(ToolMaterial material) {
            super(material);
        }
    }

    public static class VanillaSpade extends ItemSpade {
        public VanillaSpade(ToolMaterial material) {
            super(material);
        }
    }
}

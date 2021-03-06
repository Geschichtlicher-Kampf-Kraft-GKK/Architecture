package gkk.architecture.registered_lists;

import gkk.architecture.Items.VanillaTools;
import gkk.gkkbase.GkkBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.registries.IForgeRegistryEntry;

import java.util.HashMap;
import java.util.Map;

public class ToolMaterials {
    public static Map<String, ToolMaterial> materials = new HashMap<>();

    public static void init() {
        addToolMaterial(new ToolMaterial("PIGIRON", 2, (int) (0.75f * 250), 6.0F, 1.9F, 10));
        addToolMaterial(new ToolMaterial("STAINLESS_STEEL", 2, (int) (1.3 * 250), 5.0f, 2.0F, 14));
        addToolMaterial(new ToolMaterial("TITANIUM", 2, (int) (1.8 * 250), 7.0F, 2.5f, 13));
        addToolMaterial(new ToolMaterial("ALUMINUM", 1, (int) (1.5 * 131), 4.5f, 1.5f, 6));
        addToolMaterial(new ToolMaterial("STEEL", 2, (int) (2 * 250), 8.0f, 2.5f, 15));


        for (ToolMaterials.ToolMaterial value : ToolMaterials.materials.values()) {
            EnumHelper.addToolMaterial(value.getName(), value.getHarvestLevel(), value.getMaxUses(), value.getEfficiency(), value.getDamage(), value.getEnchantAbility());
        }
    }

    public static void defineTools() {
        for (String value : materials.keySet()) {
            for (Item item : VanillaTools.registryVanillaTool(value)) {
                Items.addItem(item);
            }
        }
    }

    public static void addToolMaterial(ToolMaterial material) {
        materials.put(material.name, material);
    }

    public static class ToolMaterial {
        private final String name;
        private final int harvestLevel;
        private final int maxUses;
        private final float efficiency;
        private final float damage;
        private final int enchantAbility;

        public ToolMaterial(String name, int harvestLevel, int maxUses, float efficiency, float damage, int enchantAbility) {
            this.name = name;
            this.harvestLevel = harvestLevel;
            this.maxUses = maxUses;
            this.efficiency = efficiency;
            this.damage = damage;
            this.enchantAbility = enchantAbility;
        }

        public String getName() {
            return name;
        }

        public int getHarvestLevel() {
            return harvestLevel;
        }

        public int getMaxUses() {
            return maxUses;
        }

        public float getEfficiency() {
            return efficiency;
        }

        public float getDamage() {
            return damage;
        }

        public int getEnchantAbility() {
            return enchantAbility;
        }
    }
}

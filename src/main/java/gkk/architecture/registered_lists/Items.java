package gkk.architecture.registered_lists;

import net.minecraft.item.Item;

import java.util.ArrayList;

public class Items {
    public static ArrayList<Item> ITEMS = new ArrayList<>();

    public static void init() {
        ToolMaterials.init();
        ToolMaterials.defineTools();
    }

    public static void addItem(Item item) {
        ITEMS.add(item);
    }
}

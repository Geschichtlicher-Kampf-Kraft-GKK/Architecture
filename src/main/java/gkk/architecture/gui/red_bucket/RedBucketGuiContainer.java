package gkk.architecture.gui.red_bucket;

import gkk.architecture.gui.GuiContainerBase;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;

public class RedBucketGuiContainer extends GuiContainerBase {
    public RedBucketGuiContainer(Container inventorySlotsIn, ItemStack heldItem) {
        super(inventorySlotsIn);
    }
}

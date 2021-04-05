package gkk.architecture.enums;

import gkk.architecture.gui.GuiBase;
import gkk.architecture.gui.GuiContainerBase;
import gkk.architecture.gui.red_bucket.RedBucketGui;
import gkk.architecture.gui.red_bucket.RedBucketGuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public enum EnumGuiId {
    RED_BUCKET;

    public static GuiBase getGUI(int id, EntityPlayer player, World world, int x, int y, int z) {
        switch (EnumGuiId.values()[id]) {
            case RED_BUCKET: {
                return new RedBucketGui(player.getHeldItem(EnumHand.MAIN_HAND));
            }
        }
        return null;
    }

    public static GuiContainerBase getGUIContainer(int id, EntityPlayer player, World world, int x, int y, int z) {
        switch (EnumGuiId.values()[id]) {
            case RED_BUCKET: {
                return new RedBucketGuiContainer(player.inventoryContainer,player.getHeldItem(EnumHand.MAIN_HAND));
            }
        }
        return null;
    }
}

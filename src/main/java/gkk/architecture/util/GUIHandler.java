package gkk.architecture.util;

import gkk.architecture.Architecture;
import gkk.architecture.enums.EnumGuiId;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;

import javax.annotation.Nullable;

public class GUIHandler implements IGuiHandler {

    @Nullable
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        return EnumGuiId.getGUIContainer(ID, player, world, x, y, z);
    }

    @Nullable
    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        return EnumGuiId.getGUI(ID, player, world, x, y, z);
    }
}

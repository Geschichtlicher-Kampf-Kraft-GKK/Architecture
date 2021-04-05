package gkk.architecture.Items;

import gkk.architecture.Architecture;
import gkk.architecture.ArchitectureConfig;
import gkk.architecture.enums.EnumGuiId;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidUtil;
import net.minecraftforge.fluids.capability.IFluidHandlerItem;
import net.minecraftforge.fluids.capability.IFluidTankProperties;
import net.minecraftforge.fluids.capability.templates.FluidHandlerItemStackSimple;
import net.minecraftforge.fluids.capability.wrappers.FluidBucketWrapper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class RedBucket extends ItemNoSubtype {

    public RedBucket() {
        super("red_bucket", true);
        setMaxStackSize(1);
    }

    @Nullable
    @Override
    public ICapabilityProvider initCapabilities(ItemStack stack, @Nullable NBTTagCompound nbt) {
        return super.initCapabilities(stack, nbt);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        if (!worldIn.isRemote) {
            if (playerIn.isSneaking()) {
                if (handIn == EnumHand.MAIN_HAND) {
                    BlockPos position = playerIn.getPosition();
                    playerIn.openGui(Architecture.INSTANCE, EnumGuiId.RED_BUCKET.ordinal(), worldIn, position.getX(), position.getY(), position.getZ());
                }
            } else {
                RayTraceResult rayTraceResult = rayTrace(worldIn, playerIn, true);
                BlockPos blockPos = rayTraceResult.getBlockPos();
                ItemStack heldItem = playerIn.getHeldItem(handIn);
                int capacity = ArchitectureConfig.redBucketFluidCapacityPerSlot * ArchitectureConfig.redBucketSlotCount;
                if (heldItem.hasTagCompound() && heldItem.getTagCompound().hasKey("fluid_capacity")) {
                    capacity = heldItem.getTagCompound().getInteger("fluid_capacity");
                }
                Fluid fluid = FluidRegistry.lookupFluidForBlock(worldIn.getBlockState(blockPos).getBlock());
                FluidHandlerItemStackSimple fluidHandlerItemStackSimple = new FluidHandlerItemStackSimple(playerIn.getHeldItem(handIn), capacity);

                if (fluid != null) {
                    FluidStack fluidStack = new FluidStack(fluid, Fluid.BUCKET_VOLUME);
                    if (fluidHandlerItemStackSimple.canFillFluidType(fluidStack)){
//                        fluidHandlerItemStackSimple.fill(fluidStack,)//todo fix this handlerItemType
                    }
                }
            }

        }
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}

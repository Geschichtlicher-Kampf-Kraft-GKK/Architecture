package gkk.architecture;

import net.minecraftforge.common.config.Config;

@Config(modid = Architecture.MOD_ID)
@Config.LangKey(Architecture.CONFIG_TRANSLATION_KET)
public class ArchitectureConfig {

    @Config.LangKey(Architecture.CONFIG_TRANSLATION_KET + ".red_bucket_slot_count")
    @Config.RequiresMcRestart
    @Config.RangeInt(min = 1, max = 32)
    public static int redBucketSlotCount = 16;

    @Config.LangKey(Architecture.CONFIG_TRANSLATION_KET + ".red_bucket_fluid_capacity_per_slot")
    @Config.RequiresMcRestart
    @Config.RangeInt(min = 0, max = 13421772)
    public static int redBucketFluidCapacityPerSlot = 500;

}

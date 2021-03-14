package gkk.architecture.Items;

import gkk.architecture.Architecture;
import gkk.gkkbase.item.ItemBase;

public class ItemNoSubtype extends ItemBase {
    public ItemNoSubtype(String name, boolean needTab) {
        super(false, name, name, false, Architecture.MOD_ID, "");
        if (needTab)
            setCreativeTab(Architecture.CREATIVE_TAB);
    }
}

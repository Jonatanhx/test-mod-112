package testmod.objects.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import testmod.Main;
import testmod.init.ItemInit;
import testmod.util.IHasModel;

public class ItemBase extends Item implements IHasModel
{
    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }

    public ItemBase(String name)
    {
    setRegistryName(name);
    setCreativeTab(CreativeTabs.MATERIALS);

        ItemInit.ITEMS.add(this);
    }
}

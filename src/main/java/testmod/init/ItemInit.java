package testmod.init;

import net.minecraft.item.Item;
import testmod.objects.items.ItemBase;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {
    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static final Item GRENADE_INGOT = new ItemBase("ingot_grenade");
}

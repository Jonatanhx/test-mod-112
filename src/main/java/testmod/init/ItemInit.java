package testmod.init;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import testmod.objects.armor.ArmorBase;
import testmod.objects.items.ItemBase;
import testmod.objects.tools.*;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.List;

public class ItemInit {
    public static final List<Item> ITEMS = new ArrayList<Item>();

    //Material
    public static final Item.ToolMaterial TOOL_GRENADE = EnumHelper.addToolMaterial("tool_grenade", 2, 5, 4.0F, 1.0F, 5);
    public static final ItemArmor.ArmorMaterial ARMOR_GRENADE = EnumHelper.addArmorMaterial("armor_grenade", "jhx_utilities" + ":grenade", 5, new int[]{3, 6, 8, 3}, 20, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 2.0F);

    //Items
    public static final Item INGOT_GRENADE = new ItemBase("ingot_grenade");

    //Tools
    public static final Item AXE_GRENADE = new ToolAxe("axe_grenade", TOOL_GRENADE);
    public static final Item HOE_GRENADE = new ToolHoe("hoe_grenade", TOOL_GRENADE);
    public static final Item PICKAXE_GRENADE = new ToolPickaxe("pickaxe_grenade", TOOL_GRENADE);
    public static final Item SHOVEL_GRENADE = new ToolShovel("shovel_grenade", TOOL_GRENADE);
    public static final Item SWORD_GRENADE = new ToolSword("sword_grenade", TOOL_GRENADE);

    //Armour
    public static final Item HELMET_GRENADE = new ArmorBase("helmet_grenade", ARMOR_GRENADE, 1, EntityEquipmentSlot.HEAD);
    public static final Item CHESTPLATE_GRENADE = new ArmorBase("chestplate_grenade", ARMOR_GRENADE, 1, EntityEquipmentSlot.CHEST);
    public static final Item LEGGINGS_GRENADE = new ArmorBase("leggings_grenade", ARMOR_GRENADE, 2, EntityEquipmentSlot.LEGS);
    public static final Item BOOTS_GRENADE = new ArmorBase("boots_grenade", ARMOR_GRENADE, 1, EntityEquipmentSlot.FEET);
}

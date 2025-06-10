package testmod.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import testmod.objects.blocks.BlockBase;

import java.util.ArrayList;
import java.util.List;

public class BlockInit
{
    public static final List<Block> BLOCKS = new ArrayList<Block>();
    public static final Block BLOCK_GRENADE = new BlockBase("block_grenade", Material.IRON);
}

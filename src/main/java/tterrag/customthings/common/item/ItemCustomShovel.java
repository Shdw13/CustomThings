package tterrag.customthings.common.item;

import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import tterrag.customthings.common.config.json.items.ToolType;
import tterrag.customthings.common.config.json.items.ToolType.ToolClass;

public class ItemCustomShovel extends ItemSpade implements ICustomTool
{
    private ToolType type;
    
    public ItemCustomShovel(ToolType type)
    {
        super(type.getToolMaterial());
        this.type = type;
        this.setUnlocalizedName(type.getUnlocName(ToolClass.SHOVEL));
        this.setTextureName(type.getIconName(ToolClass.SHOVEL));
    }
    
    @Override
    public ToolType getType()
    {
        return type;
    }

    @Override
    public boolean getIsRepairable(ItemStack stack, ItemStack material)
    {
        return ItemCustomPickaxe.repairMatMatchesOredict(stack, material);
    }
}

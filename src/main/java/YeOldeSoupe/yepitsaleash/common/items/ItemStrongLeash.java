package yeoldesoupe.yepitsaleash.common.items;

import java.util.List;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemLead;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityFlying;
import net.minecraft.entity.passive.EntityAmbientCreature;
import net.minecraft.world.World;

public class ItemStrongLeash extends ItemLead {
	private final String name = "ItemStrongLeash";
	
	public ItemStrongLeash() {
		super();
		setMaxStackSize(64);
		setTextureName("yepitsaleash:ItemStrongLeash");
		setUnlocalizedName("ItemStrongLeash");
	}
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
		list.add("Your mileage may vary.");
	}
	
	public boolean itemInteractionForEntity(ItemStack paramItemStack, EntityPlayer paramEntityPlayer, EntityLivingBase paramEntityLivingBase) {
		//block players and bosses because
		if (!(paramEntityLivingBase instanceof EntityLiving) || (paramEntityLivingBase instanceof EntityPlayer) || (paramEntityLivingBase instanceof IBossDisplayData)) return false;
		//block bats and ghasts by their underlying classes because they totes busted with vanilla leash handling
		if ((paramEntityLivingBase instanceof EntityAmbientCreature) || (paramEntityLivingBase instanceof EntityFlying)) return false;
		
		ItemStack localItemStack = paramEntityPlayer.inventory.getCurrentItem();
		if (localItemStack != null && localItemStack.getItem() == this) {	
			((EntityLiving)paramEntityLivingBase).setLeashedToEntity(paramEntityPlayer, true);
			localItemStack.stackSize -= 1;
			return true;
		}
		
		return false;
	}
}
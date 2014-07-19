package com.brandon3055.draconicevolution.common.items;

import com.brandon3055.draconicevolution.common.items.armor.DraconicArmor;
import com.brandon3055.draconicevolution.common.items.armor.WyvernArmor;
import com.brandon3055.draconicevolution.common.lib.Strings;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;
import com.brandon3055.draconicevolution.common.items.tools.DraconicAxe;
import com.brandon3055.draconicevolution.common.items.tools.DraconicDistructionStaff;
import com.brandon3055.draconicevolution.common.items.tools.DraconicHoe;
import com.brandon3055.draconicevolution.common.items.tools.DraconicPickaxe;
import com.brandon3055.draconicevolution.common.items.tools.DraconicShovel;
import com.brandon3055.draconicevolution.common.items.tools.TeleporterMKI;
import com.brandon3055.draconicevolution.common.items.tools.TeleporterMKII;
import com.brandon3055.draconicevolution.common.items.tools.WyvernPickaxe;
import com.brandon3055.draconicevolution.common.items.tools.WyvernShovel;
import com.brandon3055.draconicevolution.common.items.weapons.DraconicBow;
import com.brandon3055.draconicevolution.common.items.weapons.DraconicSword;
import com.brandon3055.draconicevolution.common.items.weapons.WyvernBow;
import com.brandon3055.draconicevolution.common.items.weapons.WyvernSword;

public class ModItems {
	public static ArmorMaterial DRACONIUMARMOR_T1 = EnumHelper.addArmorMaterial("DRACONIUMARMOR_T1", -1, new int[] { 3, 8, 6, 3 }, 30);
	public static ArmorMaterial DRACONIUMARMOR_T2 = EnumHelper.addArmorMaterial("DRACONIUMARMOR_T2", -1, new int[] { 3, 8, 6, 3 }, 30);
	public static ToolMaterial DRACONIUM_T1 = EnumHelper.addToolMaterial("DRACONIUM_T1", 4, -1, 12.0F, 11.0F, 35);
	public static ToolMaterial DRACONIUM_T2 = EnumHelper.addToolMaterial("DRACONIUM_T2", 4, -1, 16.0F, 15.0F, 40);
	public static ToolMaterial DRACONIUM_T3 = EnumHelper.addToolMaterial("DRACONIUM_T3", 4, -1, 400.0F, 20.0F, 45);

	public static Item draconicPickaxe;
	public static Item draconicShovel;
	public static Item draconicHoe;
	public static Item draconicAxe;
	public static Item draconicSword;
	public static Item draconicBow;
	public static Item draconicHelm;
	public static Item draconicChest;
	public static Item draconicLeggs;
	public static Item draconicBoots;

	public static Item wyvernPickaxe;
	public static Item wyvernShovel;
	public static Item wyvernSword;
	public static Item wyvernBow;
	public static Item wyvernHelm;
	public static Item wyvernChest;
	public static Item wyvernLeggs;
	public static Item wyvernBoots;

	public static Item infusedCompound;
	public static Item draconiumDust;
	public static Item draconiumIngot;
	public static Item draconiumBlend;
	public static Item dragonHeart;
	public static Item draconicDistructionStaff;
	public static Item draconicCompound;
	public static Item tclogo;
	public static Item draconicCore;
	public static Item sunFocus;
	public static Item mobSoul;

	public static Item teleporterMKI;
	public static Item teleporterMKII;
	

	public static void init()
	{	
		draconicDistructionStaff = new DraconicDistructionStaff();
		draconicPickaxe = new DraconicPickaxe();
		draconicAxe = new DraconicAxe();
		draconicShovel = new DraconicShovel();
		draconicHoe = new DraconicHoe();
		draconicSword = new DraconicSword();
		draconicBow = new DraconicBow();
		draconicHelm = new DraconicArmor(DRACONIUMARMOR_T2, 0, Strings.draconicHelmName);
		draconicChest = new DraconicArmor(DRACONIUMARMOR_T2, 1, Strings.draconicChestName);
		draconicLeggs = new DraconicArmor(DRACONIUMARMOR_T2, 2, Strings.draconicLeggsName);
		draconicBoots = new DraconicArmor(DRACONIUMARMOR_T2, 3, Strings.draconicBootsName);
		
		wyvernPickaxe = new WyvernPickaxe();
		wyvernShovel = new WyvernShovel();
		wyvernSword = new WyvernSword();
		wyvernBow = new WyvernBow();
		wyvernHelm = new WyvernArmor(DRACONIUMARMOR_T1, 0, Strings.wyvernHelmName);
		wyvernChest = new WyvernArmor(DRACONIUMARMOR_T1, 1, Strings.wyvernChestName);
		wyvernLeggs = new WyvernArmor(DRACONIUMARMOR_T1, 2, Strings.wyvernLeggsName);
		wyvernBoots = new WyvernArmor(DRACONIUMARMOR_T1, 3, Strings.wyvernBootsName);

		infusedCompound = new InfusedCompound();
		draconiumDust = new DraconiumDust();
		draconiumIngot = new DraconiumIngot();
		draconiumBlend = new DraconiumBlend();
		dragonHeart = new DragonHeart();
		draconicCompound = new DraconicCompound();
		teleporterMKI = new TeleporterMKI();
		teleporterMKII = new TeleporterMKII();
		tclogo = new Tclogo();
		draconicCore = new DraconicCore();
		sunFocus = new SunFocus();
		mobSoul = new MobSoul();

	}

	public static void register(final DraconicEvolutionItem item)
	{
		GameRegistry.registerItem(item, item.getUnwrappedUnlocalizedName(item.getUnlocalizedName()));
	}
}
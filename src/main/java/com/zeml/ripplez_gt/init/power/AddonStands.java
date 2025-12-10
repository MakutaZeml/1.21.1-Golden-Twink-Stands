package com.zeml.ripplez_gt.init.power;

import com.github.standobyte.jojo.core.JojoRegistries;
import com.github.standobyte.jojo.powersystem.MovesetBuilder;
import com.github.standobyte.jojo.powersystem.ability.controls.InputKey;
import com.github.standobyte.jojo.powersystem.ability.controls.InputMethod;
import com.github.standobyte.jojo.powersystem.standpower.StandStats;
import com.github.standobyte.jojo.powersystem.standpower.entity.EntityStandType;
import com.github.standobyte.jojo.powersystem.standpower.type.StandType;

import com.zeml.ripplez_gt.RipplesAddon;
import com.zeml.ripplez_gt.powersystem.standpower.type.WhiteAlbumType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class AddonStands {
	public static final DeferredRegister<StandType> STANDS = DeferredRegister.create(JojoRegistries.DEFAULT_STANDS_REG, RipplesAddon.MOD_ID);
	
	public static final DeferredHolder<StandType, WhiteAlbumType> WHITE_ALBUM = STANDS.register(
			"white_album", id ->
			new WhiteAlbumType(
					new StandStats.Builder()
					.power(14)
					.speed(10)
					.range(10, 10)
					.durability(18)
					.precision(3.0)
					.build(),

					new MovesetBuilder()

					.addHumanoidStandStuff()
					.makeHotbar(0, InputKey.X, InputKey.C)
					
					.addAbility("placeholder1", AddonStandAbilities._PLACEHOLDER)
					.inHotbar(0, InputMethod.CLICK)
					
					.addAbility("placeholder2", AddonStandAbilities._PLACEHOLDER)
					.inHotbar(0, InputMethod.CLICK)
					
					.addAbility("placeholder3", AddonStandAbilities._PLACEHOLDER)
					.inHotbar(0, InputMethod.CLICK)
					
					.addAbility("placeholder4", AddonStandAbilities._PLACEHOLDER)
					.inHotbar(0, InputMethod.CLICK)
					
					.addAbility("placeholder5", AddonStandAbilities._PLACEHOLDER)
					.inHotbar(0, InputMethod.CLICK)
					
					.addAbility("placeholder6", AddonStandAbilities._PLACEHOLDER)
					.inHotbar(0, InputMethod.CLICK)

					, id));
}

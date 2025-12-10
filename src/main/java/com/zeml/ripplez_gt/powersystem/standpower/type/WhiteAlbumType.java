package com.zeml.ripplez_gt.powersystem.standpower.type;

import com.github.standobyte.jojo.powersystem.MovesetBuilder;
import com.github.standobyte.jojo.powersystem.standpower.StandStats;
import com.github.standobyte.jojo.powersystem.standpower.type.StandType;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.minecraft.resources.ResourceLocation;

import java.util.Optional;

public class WhiteAlbumType extends StandType {
    public WhiteAlbumType(StandStats stats, MovesetBuilder moveset, ResourceLocation id) {
        super(stats, moveset, id);
    }

    @Override
    public JsonObject makeConfigTemplate() {
        JsonObject json = super.makeConfigTemplate();
        json.addProperty("white_album_type","white_album");
        return json;
    }

    @Override
    public void applyConfig(JsonElement json) {
        super.applyConfig(json);
        JsonObject config = json.getAsJsonObject();
        Optional.ofNullable(config.get("white_album_type")).map(JsonElement::getAsString).orElse("white_album");

    }
}

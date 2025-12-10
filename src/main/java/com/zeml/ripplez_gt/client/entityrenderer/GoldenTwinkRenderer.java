package com.zeml.ripplez_gt.client.entityrenderer;

import com.zeml.ripplez_gt.RipplesAddon;
import com.zeml.ripplez_gt.jojoimp.stands.white_album.client.renderer.WhiteAlbumLayer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.world.entity.LivingEntity;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

import static com.github.standobyte.jojo.client.entityrender.ModEntityRenderers.castToHumanoid;

@EventBusSubscriber(modid = RipplesAddon.MOD_ID, value = Dist.CLIENT)
public class GoldenTwinkRenderer {


    @SubscribeEvent
    public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event){

    }


    @SubscribeEvent
    public static void addLayers(EntityRenderersEvent.AddLayers event) {
        var renderers = Minecraft.getInstance().getEntityRenderDispatcher();
        for (var renderer : renderers.getSkinMap().values()) {
            castToHumanoid(renderer).ifPresent(GoldenTwinkRenderer::addHumanoidLayers);
        }
        for (var playerRenderer : renderers.getSkinMap().values()) {
            castToHumanoid(playerRenderer).ifPresent(GoldenTwinkRenderer::addHumanoidLayers);
        }
    }

    private static <T extends LivingEntity, M extends HumanoidModel<T>> void addHumanoidLayers(LivingEntityRenderer<T, M> renderer) {
        renderer.addLayer(new WhiteAlbumLayer<>(renderer));
    }

}

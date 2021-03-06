package com.aether.client.model.armor;

import com.aether.Aether;
import com.aether.items.armor.AetherArmor;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ValkyrieArmorModel extends AnimatedGeoModel<AetherArmor> {

    @Override
    public Identifier getModelLocation(AetherArmor object) {
        return Aether.locate("geo/valkyrie_armor/valkyrie_armor.geo.json");
    }

    @Override
    public Identifier getTextureLocation(AetherArmor object) {
        return Aether.locate("textures/models/armor/valkyrie_armor.png");
    }

    @Override
    public Identifier getAnimationFileLocation(AetherArmor animatable) {
        return Aether.locate("animations/valkyrie_armor/wings_idle.animation");
    }
}
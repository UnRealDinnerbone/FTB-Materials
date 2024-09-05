package dev.ftb.mods.ftbmaterials.config;

import dev.architectury.platform.Platform;
import dev.ftb.mods.ftblibrary.snbt.config.ConfigUtil;
import dev.ftb.mods.ftblibrary.snbt.config.SNBTConfig;
import dev.ftb.mods.ftbmaterials.FTBMaterials;

public class GenerationConfig {
    static SNBTConfig CONFIG = SNBTConfig.create("generation-config");

    public static void init() {
        ConfigUtil.loadDefaulted(CONFIG, Platform.getConfigFolder().resolve(FTBMaterials.MOD_ID), FTBMaterials.MOD_ID, "generation.snbt");
    }
}

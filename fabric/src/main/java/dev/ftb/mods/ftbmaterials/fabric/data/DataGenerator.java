package dev.ftb.mods.ftbmaterials.fabric.data;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class DataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        FabricDataGenerator.Pack pack = generator.createPack();

        pack.addProvider(LanguageGenerator::new);
        pack.addProvider(ModelGenerator::new);
        pack.addProvider(ItemTagsGenerator::new);
        pack.addProvider(BlockTagsGenerator::new);
        pack.addProvider(LootTableGenerator::new);
        pack.addProvider(RecipesGenerator::new);
    }
}

package com.nemonotfound.nemos.copper.datagen;

import com.nemonotfound.nemos.copper.block.ModBlocks;
import com.nemonotfound.nemos.copper.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registryLookup, RecipeOutput output) {
        return new RecipeProvider(registryLookup, output) {

            @Override
            public void buildRecipes() {
                this.shaped(RecipeCategory.TRANSPORTATION, ModBlocks.COPPER_ACTIVATOR_RAIL.get(), 6)
                        .define('#', Blocks.REDSTONE_TORCH)
                        .define('S', Items.STICK)
                        .define('X', Items.COPPER_INGOT)
                        .pattern("XSX").pattern("X#X")
                        .pattern("XSX")
                        .unlockedBy("has_copper_rail", this.has(ModBlocks.COPPER_RAIL.get()))
                        .save(this.output);

                this.shaped(RecipeCategory.TRANSPORTATION, ModBlocks.COPPER_DETECTOR_RAIL.get(), 6)
                        .define('R', Items.REDSTONE)
                        .define('#', Blocks.STONE_PRESSURE_PLATE)
                        .define('X', Items.COPPER_INGOT)
                        .pattern("X X")
                        .pattern("X#X")
                        .pattern("XRX")
                        .unlockedBy("has_copper_rail", this.has(ModBlocks.COPPER_RAIL.get()))
                        .save(this.output);

                this.shaped(RecipeCategory.TRANSPORTATION, ModBlocks.COPPER_POWERED_RAIL.get(), 6)
                        .define('R', Items.REDSTONE)
                        .define('#', Items.STICK)
                        .define('X', Items.GOLD_INGOT)
                        .define('C', Items.COPPER_INGOT)
                        .pattern("X X")
                        .pattern("C#C")
                        .pattern("XRX")
                        .unlockedBy("has_copper_rail", this.has(ModBlocks.COPPER_RAIL.get()))
                        .save(this.output);

                this.shaped(RecipeCategory.TRANSPORTATION, ModBlocks.COPPER_RAIL.get(), 16)
                        .define('#', Items.STICK)
                        .define('X', Items.COPPER_INGOT)
                        .pattern("X X").pattern("X#X")
                        .pattern("X X")
                        .unlockedBy("has_copper_minecart", this.has(ModItems.COPPER_MINECART.get()))
                        .save(this.output);

                this.shapeless(RecipeCategory.TRANSPORTATION, ModItems.COPPER_CHEST_MINECART.get())
                        .requires(Blocks.CHEST)
                        .requires(ModItems.COPPER_MINECART.get())
                        .unlockedBy("has_copper_minecart", this.has(ModItems.COPPER_MINECART.get()))
                        .save(this.output);

                this.shapeless(RecipeCategory.TRANSPORTATION, ModItems.COPPER_FURNACE_MINECART.get())
                        .requires(Blocks.FURNACE)
                        .requires(ModItems.COPPER_MINECART.get())
                        .unlockedBy("has_copper_minecart", this.has(ModItems.COPPER_MINECART.get()))
                        .save(this.output);

                this.shapeless(RecipeCategory.TRANSPORTATION, ModItems.COPPER_HOPPER_MINECART.get())
                        .requires(Blocks.HOPPER)
                        .requires(ModItems.COPPER_MINECART.get())
                        .unlockedBy("has_copper_minecart", this.has(ModItems.COPPER_MINECART.get()))
                        .save(this.output);

                this.shaped(RecipeCategory.TRANSPORTATION, ModItems.COPPER_MINECART.get())
                        .define('#', Items.COPPER_INGOT)
                        .pattern("# #")
                        .pattern("###")
                        .unlockedBy("has_copper_ingot", this.has(Items.COPPER_INGOT))
                        .save(this.output);

                this.shapeless(RecipeCategory.TRANSPORTATION, ModItems.COPPER_TNT_MINECART.get())
                        .requires(Blocks.TNT)
                        .requires(ModItems.COPPER_MINECART.get())
                        .unlockedBy("has_copper_minecart", this.has(ModItems.COPPER_MINECART.get()))
                        .save(this.output);

                this.shaped(RecipeCategory.TOOLS, ModItems.COPPER_SHEARS.get())
                        .define('#', Items.COPPER_INGOT)
                        .pattern(" #")
                        .pattern("# ")
                        .unlockedBy("has_copper_ingot", this.has(Items.COPPER_INGOT))
                        .save(this.output);
            }
        };
    }

    @Override
    public @NotNull String getName() {
        return "Nemo's Copper Recipes";
    }
}

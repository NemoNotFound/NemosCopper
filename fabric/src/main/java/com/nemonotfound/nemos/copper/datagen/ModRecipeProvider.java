package com.nemonotfound.nemos.copper.datagen;

import com.nemonotfound.nemos.copper.block.ModBlocks;
import com.nemonotfound.nemos.copper.item.ModItems;
import com.nemonotfound.nemos.copper.tag.ModItemTags;
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
    protected @NotNull RecipeProvider createRecipeProvider(HolderLookup.Provider registryLookup, RecipeOutput output) {
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

                this.shaped(RecipeCategory.COMBAT, ModItems.COPPER_SWORD.get())
                        .define('#', Items.STICK)
                        .define('X', ModItemTags.COPPER_TOOL_MATERIALS)
                        .pattern("X")
                        .pattern("X")
                        .pattern("#")
                        .unlockedBy("has_copper_ingot", this.has(ModItemTags.COPPER_TOOL_MATERIALS))
                        .save(this.output);

                this.shaped(RecipeCategory.TOOLS, ModItems.COPPER_HOE.get())
                        .define('#', Items.STICK)
                        .define('X', ModItemTags.COPPER_TOOL_MATERIALS)
                        .pattern("XX")
                        .pattern(" #")
                        .pattern(" #")
                        .unlockedBy("has_copper_ingot", this.has(ModItemTags.COPPER_TOOL_MATERIALS))
                        .save(this.output);

                this.shaped(RecipeCategory.TOOLS, ModItems.COPPER_PICKAXE.get())
                        .define('#', Items.STICK)
                        .define('X', ModItemTags.COPPER_TOOL_MATERIALS)
                        .pattern("XXX")
                        .pattern(" # ")
                        .pattern(" # ")
                        .unlockedBy("has_copper_ingot", this.has(ModItemTags.COPPER_TOOL_MATERIALS))
                        .save(this.output);

                this.shaped(RecipeCategory.TOOLS, ModItems.COPPER_AXE.get())
                        .define('#', Items.STICK)
                        .define('X', ModItemTags.COPPER_TOOL_MATERIALS)
                        .pattern("XX")
                        .pattern("X#")
                        .pattern(" #")
                        .unlockedBy("has_copper_ingot", this.has(ModItemTags.COPPER_TOOL_MATERIALS))
                        .save(this.output);

                this.shaped(RecipeCategory.TOOLS, ModItems.COPPER_SHOVEL.get())
                        .define('#', Items.STICK)
                        .define('X', ModItemTags.COPPER_TOOL_MATERIALS)
                        .pattern("X")
                        .pattern("#")
                        .pattern("#")
                        .unlockedBy("has_copper_ingot", this.has(ModItemTags.COPPER_TOOL_MATERIALS))
                        .save(this.output);

                this.shaped(RecipeCategory.COMBAT, ModItems.COPPER_HELMET.get())
                        .define('X', Items.COPPER_INGOT)
                        .pattern("XXX")
                        .pattern("X X")
                        .unlockedBy("has_copper_ingot", this.has(Items.COPPER_INGOT))
                        .save(this.output);

                this.shaped(RecipeCategory.COMBAT, ModItems.COPPER_BOOTS.get())
                        .define('X', Items.COPPER_INGOT)
                        .pattern("X X")
                        .pattern("X X")
                        .unlockedBy("has_copper_ingot", this.has(Items.COPPER_INGOT))
                        .save(this.output);

                this.shaped(RecipeCategory.COMBAT, ModItems.COPPER_CHESTPLATE.get())
                        .define('X', Items.COPPER_INGOT)
                        .pattern("X X")
                        .pattern("XXX")
                        .pattern("XXX")
                        .unlockedBy("has_copper_ingot", this.has(Items.COPPER_INGOT))
                        .save(this.output);

                this.shaped(RecipeCategory.COMBAT, ModItems.COPPER_LEGGINGS.get())
                        .define('X', Items.COPPER_INGOT)
                        .pattern("XXX")
                        .pattern("X X")
                        .pattern("X X")
                        .unlockedBy("has_iron_ingot", this.has(Items.COPPER_INGOT))
                        .save(this.output);

                this.nineBlockStorageRecipesWithCustomPacking(
                        RecipeCategory.MISC,
                        ModItems.COPPER_NUGGET.get(),
                        RecipeCategory.MISC,
                        Items.COPPER_INGOT,
                        "copper_ingot_from_nuggets",
                        "copper_ingot"
                );

                this.shaped(RecipeCategory.DECORATIONS, ModBlocks.COPPER_LANTERN.get())
                        .define('#', Items.TORCH)
                        .define('X', ModItems.COPPER_NUGGET.get())
                        .pattern("XXX")
                        .pattern("X#X")
                        .pattern("XXX")
                        .unlockedBy("has_copper_nugget", this.has(ModItems.COPPER_NUGGET.get()))
                        .unlockedBy("has_copper_ingot", this.has(Items.COPPER_INGOT))
                        .save(this.output);

                this.shaped(RecipeCategory.DECORATIONS, ModBlocks.COPPER_SOUL_LANTERN.get())
                        .define('#', Items.SOUL_TORCH)
                        .define('X', ModItems.COPPER_NUGGET.get())
                        .pattern("XXX")
                        .pattern("X#X")
                        .pattern("XXX")
                        .unlockedBy("has_soul_torch", this.has(Items.SOUL_TORCH))
                        .save(this.output);

                this.shaped(RecipeCategory.DECORATIONS, ModBlocks.COPPER_CHAIN.get())
                        .define('C', Items.COPPER_INGOT)
                        .define('N', ModItems.COPPER_NUGGET.get())
                        .pattern("N")
                        .pattern("C")
                        .pattern("N")
                        .unlockedBy("has_copper_nugget", this.has(ModItems.COPPER_NUGGET.get()))
                        .unlockedBy("has_copper_ingot", this.has(Items.COPPER_INGOT))
                        .save(this.output);

                this.shaped(RecipeCategory.MISC, ModItems.COPPER_BUCKET.get())
                        .define('#', Items.COPPER_INGOT)
                        .pattern("# #")
                        .pattern(" # ")
                        .unlockedBy("has_copper_ingot", this.has(Items.COPPER_INGOT)).save(this.output);
            }
        };
    }

    @Override
    public @NotNull String getName() {
        return "Nemo's Copper Recipes";
    }
}

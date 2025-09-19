package com.devnemo.nemos.copper.datagen;

import com.devnemo.nemos.copper.block.CopperBlocks;
import com.devnemo.nemos.copper.item.CopperItems;
import com.devnemo.nemos.copper.tag.ModItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.tags.ItemTags;
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
                this.shaped(RecipeCategory.TRANSPORTATION, CopperBlocks.COPPER_ACTIVATOR_RAIL.get(), 6)
                        .define('#', Blocks.REDSTONE_TORCH)
                        .define('S', Items.STICK)
                        .define('X', Items.COPPER_INGOT)
                        .pattern("XSX").pattern("X#X")
                        .pattern("XSX")
                        .unlockedBy("has_copper_rail", this.has(CopperBlocks.COPPER_RAIL.get()))
                        .save(this.output);

                this.shaped(RecipeCategory.TRANSPORTATION, CopperBlocks.COPPER_DETECTOR_RAIL.get(), 6)
                        .define('R', Items.REDSTONE)
                        .define('#', Blocks.STONE_PRESSURE_PLATE)
                        .define('X', Items.COPPER_INGOT)
                        .pattern("X X")
                        .pattern("X#X")
                        .pattern("XRX")
                        .unlockedBy("has_copper_rail", this.has(CopperBlocks.COPPER_RAIL.get()))
                        .save(this.output);

                this.shaped(RecipeCategory.TRANSPORTATION, CopperBlocks.COPPER_POWERED_RAIL.get(), 6)
                        .define('R', Items.REDSTONE)
                        .define('#', Items.STICK)
                        .define('X', Items.GOLD_INGOT)
                        .define('C', Items.COPPER_INGOT)
                        .pattern("X X")
                        .pattern("C#C")
                        .pattern("XRX")
                        .unlockedBy("has_copper_rail", this.has(CopperBlocks.COPPER_RAIL.get()))
                        .save(this.output);

                this.shaped(RecipeCategory.TRANSPORTATION, CopperBlocks.COPPER_RAIL.get(), 16)
                        .define('#', Items.STICK)
                        .define('X', Items.COPPER_INGOT)
                        .pattern("X X").pattern("X#X")
                        .pattern("X X")
                        .unlockedBy("has_copper_minecart", this.has(CopperItems.COPPER_MINECART.get()))
                        .save(this.output);

                this.shapeless(RecipeCategory.TRANSPORTATION, CopperItems.COPPER_CHEST_MINECART.get())
                        .requires(Blocks.CHEST)
                        .requires(CopperItems.COPPER_MINECART.get())
                        .unlockedBy("has_copper_minecart", this.has(CopperItems.COPPER_MINECART.get()))
                        .save(this.output);

                this.shapeless(RecipeCategory.TRANSPORTATION, CopperItems.COPPER_FURNACE_MINECART.get())
                        .requires(Blocks.FURNACE)
                        .requires(CopperItems.COPPER_MINECART.get())
                        .unlockedBy("has_copper_minecart", this.has(CopperItems.COPPER_MINECART.get()))
                        .save(this.output);

                this.shapeless(RecipeCategory.TRANSPORTATION, CopperItems.HOPPER_COPPER_MINECART.get())
                        .requires(Blocks.HOPPER)
                        .requires(CopperItems.COPPER_MINECART.get())
                        .unlockedBy("has_copper_minecart", this.has(CopperItems.COPPER_MINECART.get()))
                        .save(this.output);

                this.shapeless(RecipeCategory.TRANSPORTATION, CopperItems.COPPER_HOPPER_COPPER_MINECART.get())
                        .requires(CopperBlocks.COPPER_HOPPER.get())
                        .requires(CopperItems.COPPER_MINECART.get())
                        .unlockedBy("has_copper_minecart", this.has(CopperItems.COPPER_MINECART.get()))
                        .save(this.output);

                this.shapeless(RecipeCategory.TRANSPORTATION, CopperItems.COPPER_HOPPER_MINECART.get())
                        .requires(CopperBlocks.COPPER_HOPPER.get())
                        .requires(Items.MINECART)
                        .unlockedBy("has_minecart", this.has(Items.MINECART))
                        .save(this.output);

                this.shaped(RecipeCategory.TRANSPORTATION, CopperItems.COPPER_MINECART.get())
                        .define('#', Items.COPPER_INGOT)
                        .pattern("# #")
                        .pattern("###")
                        .unlockedBy("has_copper_ingot", this.has(Items.COPPER_INGOT))
                        .save(this.output);

                this.shapeless(RecipeCategory.TRANSPORTATION, CopperItems.COPPER_TNT_MINECART.get())
                        .requires(Blocks.TNT)
                        .requires(CopperItems.COPPER_MINECART.get())
                        .unlockedBy("has_copper_minecart", this.has(CopperItems.COPPER_MINECART.get()))
                        .save(this.output);

                this.shaped(RecipeCategory.TOOLS, CopperItems.COPPER_SHEARS.get())
                        .define('#', Items.COPPER_INGOT)
                        .pattern(" #")
                        .pattern("# ")
                        .unlockedBy("has_copper_ingot", this.has(Items.COPPER_INGOT))
                        .save(this.output);

                this.shaped(RecipeCategory.COMBAT, CopperItems.COPPER_SWORD.get())
                        .define('#', Items.STICK)
                        .define('X', ModItemTags.COPPER_TOOL_MATERIALS)
                        .pattern("X")
                        .pattern("X")
                        .pattern("#")
                        .unlockedBy("has_copper_ingot", this.has(ModItemTags.COPPER_TOOL_MATERIALS))
                        .save(this.output);

                this.shaped(RecipeCategory.TOOLS, CopperItems.COPPER_HOE.get())
                        .define('#', Items.STICK)
                        .define('X', ModItemTags.COPPER_TOOL_MATERIALS)
                        .pattern("XX")
                        .pattern(" #")
                        .pattern(" #")
                        .unlockedBy("has_copper_ingot", this.has(ModItemTags.COPPER_TOOL_MATERIALS))
                        .save(this.output);

                this.shaped(RecipeCategory.TOOLS, CopperItems.COPPER_PICKAXE.get())
                        .define('#', Items.STICK)
                        .define('X', ModItemTags.COPPER_TOOL_MATERIALS)
                        .pattern("XXX")
                        .pattern(" # ")
                        .pattern(" # ")
                        .unlockedBy("has_copper_ingot", this.has(ModItemTags.COPPER_TOOL_MATERIALS))
                        .save(this.output);

                this.shaped(RecipeCategory.TOOLS, CopperItems.COPPER_AXE.get())
                        .define('#', Items.STICK)
                        .define('X', ModItemTags.COPPER_TOOL_MATERIALS)
                        .pattern("XX")
                        .pattern("X#")
                        .pattern(" #")
                        .unlockedBy("has_copper_ingot", this.has(ModItemTags.COPPER_TOOL_MATERIALS))
                        .save(this.output);

                this.shaped(RecipeCategory.TOOLS, CopperItems.COPPER_SHOVEL.get())
                        .define('#', Items.STICK)
                        .define('X', ModItemTags.COPPER_TOOL_MATERIALS)
                        .pattern("X")
                        .pattern("#")
                        .pattern("#")
                        .unlockedBy("has_copper_ingot", this.has(ModItemTags.COPPER_TOOL_MATERIALS))
                        .save(this.output);

                this.shaped(RecipeCategory.COMBAT, CopperItems.COPPER_HELMET.get())
                        .define('X', Items.COPPER_INGOT)
                        .pattern("XXX")
                        .pattern("X X")
                        .unlockedBy("has_copper_ingot", this.has(Items.COPPER_INGOT))
                        .save(this.output);

                this.shaped(RecipeCategory.COMBAT, CopperItems.COPPER_BOOTS.get())
                        .define('X', Items.COPPER_INGOT)
                        .pattern("X X")
                        .pattern("X X")
                        .unlockedBy("has_copper_ingot", this.has(Items.COPPER_INGOT))
                        .save(this.output);

                this.shaped(RecipeCategory.COMBAT, CopperItems.COPPER_CHESTPLATE.get())
                        .define('X', Items.COPPER_INGOT)
                        .pattern("X X")
                        .pattern("XXX")
                        .pattern("XXX")
                        .unlockedBy("has_copper_ingot", this.has(Items.COPPER_INGOT))
                        .save(this.output);

                this.shaped(RecipeCategory.COMBAT, CopperItems.COPPER_LEGGINGS.get())
                        .define('X', Items.COPPER_INGOT)
                        .pattern("XXX")
                        .pattern("X X")
                        .pattern("X X")
                        .unlockedBy("has_iron_ingot", this.has(Items.COPPER_INGOT))
                        .save(this.output);

                this.nineBlockStorageRecipesWithCustomPacking(
                        RecipeCategory.MISC,
                        CopperItems.COPPER_NUGGET.get(),
                        RecipeCategory.MISC,
                        Items.COPPER_INGOT,
                        "copper_ingot_from_nuggets",
                        "copper_ingot"
                );

                this.shaped(RecipeCategory.DECORATIONS, CopperBlocks.COPPER_LANTERN.get())
                        .define('#', Items.TORCH)
                        .define('X', ModItemTags.COPPER_NUGGETS)
                        .pattern("XXX")
                        .pattern("X#X")
                        .pattern("XXX")
                        .unlockedBy("has_copper_nugget", this.has(ModItemTags.COPPER_NUGGETS))
                        .unlockedBy("has_copper_ingot", this.has(Items.COPPER_INGOT))
                        .save(this.output);

                this.shaped(RecipeCategory.DECORATIONS, CopperBlocks.COPPER_SOUL_LANTERN.get())
                        .define('#', Items.SOUL_TORCH)
                        .define('X', ModItemTags.COPPER_NUGGETS)
                        .pattern("XXX")
                        .pattern("X#X")
                        .pattern("XXX")
                        .unlockedBy("has_soul_torch", this.has(Items.SOUL_TORCH))
                        .save(this.output);

                this.shaped(RecipeCategory.DECORATIONS, CopperBlocks.COPPER_CHAIN.get())
                        .define('C', Items.COPPER_INGOT)
                        .define('N', ModItemTags.COPPER_NUGGETS)
                        .pattern("N")
                        .pattern("C")
                        .pattern("N")
                        .unlockedBy("has_copper_nugget", this.has(ModItemTags.COPPER_NUGGETS))
                        .unlockedBy("has_copper_ingot", this.has(Items.COPPER_INGOT))
                        .save(this.output);

                this.shaped(RecipeCategory.MISC, CopperItems.COPPER_BUCKET.get())
                        .define('#', Items.COPPER_INGOT)
                        .pattern("# #")
                        .pattern(" # ")
                        .unlockedBy("has_copper_ingot", this.has(Items.COPPER_INGOT)).save(this.output);

                this.shaped(RecipeCategory.BREWING, CopperBlocks.COPPER_CAULDRON.get())
                        .define('#', Items.COPPER_INGOT)
                        .pattern("# #")
                        .pattern("# #")
                        .pattern("###")
                        .unlockedBy("has_water_bucket", this.has(Items.WATER_BUCKET))
                        .unlockedBy("has_copper_bucket", this.has(CopperItems.COPPER_WATER_BUCKET.get()))
                        .save(this.output);

                this.shaped(RecipeCategory.COMBAT, CopperItems.COPPER_SHIELD.get())
                        .define('W', ItemTags.WOODEN_TOOL_MATERIALS)
                        .define('o', Items.COPPER_INGOT)
                        .pattern("WoW")
                        .pattern("WWW")
                        .pattern(" W ")
                        .unlockedBy("has_copper_ingot", this.has(Items.COPPER_INGOT))
                        .save(this.output);

                this.shaped(RecipeCategory.DECORATIONS, CopperBlocks.COPPER_BARS.get(), 16)
                        .define('#', Items.COPPER_INGOT)
                        .pattern("###")
                        .pattern("###")
                        .unlockedBy("has_copper_ingot", this.has(Items.COPPER_INGOT))
                        .save(this.output);

                this.shaped(RecipeCategory.REDSTONE, CopperBlocks.COPPER_HOPPER.get())
                        .define('C', Blocks.CHEST)
                        .define('I', Items.COPPER_INGOT)
                        .pattern("I I")
                        .pattern("ICI")
                        .pattern(" I ")
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

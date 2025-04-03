package com.nemonotfound.nemos.copper.datagen;

import com.nemonotfound.nemos.copper.block.ModBlocks;
import com.nemonotfound.nemos.copper.item.Items;
import com.nemonotfound.nemos.copper.tag.ModItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
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
                        .define('S', net.minecraft.world.item.Items.STICK)
                        .define('X', net.minecraft.world.item.Items.COPPER_INGOT)
                        .pattern("XSX").pattern("X#X")
                        .pattern("XSX")
                        .unlockedBy("has_copper_rail", this.has(ModBlocks.COPPER_RAIL.get()))
                        .save(this.output);

                this.shaped(RecipeCategory.TRANSPORTATION, ModBlocks.COPPER_DETECTOR_RAIL.get(), 6)
                        .define('R', net.minecraft.world.item.Items.REDSTONE)
                        .define('#', Blocks.STONE_PRESSURE_PLATE)
                        .define('X', net.minecraft.world.item.Items.COPPER_INGOT)
                        .pattern("X X")
                        .pattern("X#X")
                        .pattern("XRX")
                        .unlockedBy("has_copper_rail", this.has(ModBlocks.COPPER_RAIL.get()))
                        .save(this.output);

                this.shaped(RecipeCategory.TRANSPORTATION, ModBlocks.COPPER_POWERED_RAIL.get(), 6)
                        .define('R', net.minecraft.world.item.Items.REDSTONE)
                        .define('#', net.minecraft.world.item.Items.STICK)
                        .define('X', net.minecraft.world.item.Items.GOLD_INGOT)
                        .define('C', net.minecraft.world.item.Items.COPPER_INGOT)
                        .pattern("X X")
                        .pattern("C#C")
                        .pattern("XRX")
                        .unlockedBy("has_copper_rail", this.has(ModBlocks.COPPER_RAIL.get()))
                        .save(this.output);

                this.shaped(RecipeCategory.TRANSPORTATION, ModBlocks.COPPER_RAIL.get(), 16)
                        .define('#', net.minecraft.world.item.Items.STICK)
                        .define('X', net.minecraft.world.item.Items.COPPER_INGOT)
                        .pattern("X X").pattern("X#X")
                        .pattern("X X")
                        .unlockedBy("has_copper_minecart", this.has(Items.COPPER_MINECART.get()))
                        .save(this.output);

                this.shapeless(RecipeCategory.TRANSPORTATION, Items.COPPER_CHEST_MINECART.get())
                        .requires(Blocks.CHEST)
                        .requires(Items.COPPER_MINECART.get())
                        .unlockedBy("has_copper_minecart", this.has(Items.COPPER_MINECART.get()))
                        .save(this.output);

                this.shapeless(RecipeCategory.TRANSPORTATION, Items.COPPER_FURNACE_MINECART.get())
                        .requires(Blocks.FURNACE)
                        .requires(Items.COPPER_MINECART.get())
                        .unlockedBy("has_copper_minecart", this.has(Items.COPPER_MINECART.get()))
                        .save(this.output);

                this.shapeless(RecipeCategory.TRANSPORTATION, Items.COPPER_HOPPER_MINECART.get())
                        .requires(Blocks.HOPPER)
                        .requires(Items.COPPER_MINECART.get())
                        .unlockedBy("has_copper_minecart", this.has(Items.COPPER_MINECART.get()))
                        .save(this.output);

                this.shaped(RecipeCategory.TRANSPORTATION, Items.COPPER_MINECART.get())
                        .define('#', net.minecraft.world.item.Items.COPPER_INGOT)
                        .pattern("# #")
                        .pattern("###")
                        .unlockedBy("has_copper_ingot", this.has(net.minecraft.world.item.Items.COPPER_INGOT))
                        .save(this.output);

                this.shapeless(RecipeCategory.TRANSPORTATION, Items.COPPER_TNT_MINECART.get())
                        .requires(Blocks.TNT)
                        .requires(Items.COPPER_MINECART.get())
                        .unlockedBy("has_copper_minecart", this.has(Items.COPPER_MINECART.get()))
                        .save(this.output);

                this.shaped(RecipeCategory.TOOLS, Items.COPPER_SHEARS.get())
                        .define('#', net.minecraft.world.item.Items.COPPER_INGOT)
                        .pattern(" #")
                        .pattern("# ")
                        .unlockedBy("has_copper_ingot", this.has(net.minecraft.world.item.Items.COPPER_INGOT))
                        .save(this.output);

                this.shaped(RecipeCategory.COMBAT, Items.COPPER_SWORD.get())
                        .define('#', net.minecraft.world.item.Items.STICK)
                        .define('X', ModItemTags.COPPER_TOOL_MATERIALS)
                        .pattern("X")
                        .pattern("X")
                        .pattern("#")
                        .unlockedBy("has_copper_ingot", this.has(ModItemTags.COPPER_TOOL_MATERIALS))
                        .save(this.output);

                this.shaped(RecipeCategory.TOOLS, Items.COPPER_HOE.get())
                        .define('#', net.minecraft.world.item.Items.STICK)
                        .define('X', ModItemTags.COPPER_TOOL_MATERIALS)
                        .pattern("XX")
                        .pattern(" #")
                        .pattern(" #")
                        .unlockedBy("has_copper_ingot", this.has(ModItemTags.COPPER_TOOL_MATERIALS))
                        .save(this.output);

                this.shaped(RecipeCategory.TOOLS, Items.COPPER_PICKAXE.get())
                        .define('#', net.minecraft.world.item.Items.STICK)
                        .define('X', ModItemTags.COPPER_TOOL_MATERIALS)
                        .pattern("XXX")
                        .pattern(" # ")
                        .pattern(" # ")
                        .unlockedBy("has_copper_ingot", this.has(ModItemTags.COPPER_TOOL_MATERIALS))
                        .save(this.output);

                this.shaped(RecipeCategory.TOOLS, Items.COPPER_AXE.get())
                        .define('#', net.minecraft.world.item.Items.STICK)
                        .define('X', ModItemTags.COPPER_TOOL_MATERIALS)
                        .pattern("XX")
                        .pattern("X#")
                        .pattern(" #")
                        .unlockedBy("has_copper_ingot", this.has(ModItemTags.COPPER_TOOL_MATERIALS))
                        .save(this.output);

                this.shaped(RecipeCategory.TOOLS, Items.COPPER_SHOVEL.get())
                        .define('#', net.minecraft.world.item.Items.STICK)
                        .define('X', ModItemTags.COPPER_TOOL_MATERIALS)
                        .pattern("X")
                        .pattern("#")
                        .pattern("#")
                        .unlockedBy("has_copper_ingot", this.has(ModItemTags.COPPER_TOOL_MATERIALS))
                        .save(this.output);

                this.shaped(RecipeCategory.COMBAT, Items.COPPER_HELMET.get())
                        .define('X', net.minecraft.world.item.Items.COPPER_INGOT)
                        .pattern("XXX")
                        .pattern("X X")
                        .unlockedBy("has_copper_ingot", this.has(net.minecraft.world.item.Items.COPPER_INGOT))
                        .save(this.output);

                this.shaped(RecipeCategory.COMBAT, Items.COPPER_BOOTS.get())
                        .define('X', net.minecraft.world.item.Items.COPPER_INGOT)
                        .pattern("X X")
                        .pattern("X X")
                        .unlockedBy("has_copper_ingot", this.has(net.minecraft.world.item.Items.COPPER_INGOT))
                        .save(this.output);

                this.shaped(RecipeCategory.COMBAT, Items.COPPER_CHESTPLATE.get())
                        .define('X', net.minecraft.world.item.Items.COPPER_INGOT)
                        .pattern("X X")
                        .pattern("XXX")
                        .pattern("XXX")
                        .unlockedBy("has_copper_ingot", this.has(net.minecraft.world.item.Items.COPPER_INGOT))
                        .save(this.output);

                this.shaped(RecipeCategory.COMBAT, Items.COPPER_LEGGINGS.get())
                        .define('X', net.minecraft.world.item.Items.COPPER_INGOT)
                        .pattern("XXX")
                        .pattern("X X")
                        .pattern("X X")
                        .unlockedBy("has_iron_ingot", this.has(net.minecraft.world.item.Items.COPPER_INGOT))
                        .save(this.output);

                this.nineBlockStorageRecipesWithCustomPacking(
                        RecipeCategory.MISC,
                        Items.COPPER_NUGGET.get(),
                        RecipeCategory.MISC,
                        net.minecraft.world.item.Items.COPPER_INGOT,
                        "copper_ingot_from_nuggets",
                        "copper_ingot"
                );

                this.shaped(RecipeCategory.DECORATIONS, ModBlocks.COPPER_LANTERN.get())
                        .define('#', net.minecraft.world.item.Items.TORCH)
                        .define('X', Items.COPPER_NUGGET.get())
                        .pattern("XXX")
                        .pattern("X#X")
                        .pattern("XXX")
                        .unlockedBy("has_copper_nugget", this.has(Items.COPPER_NUGGET.get()))
                        .unlockedBy("has_copper_ingot", this.has(net.minecraft.world.item.Items.COPPER_INGOT))
                        .save(this.output);

                this.shaped(RecipeCategory.DECORATIONS, ModBlocks.COPPER_SOUL_LANTERN.get())
                        .define('#', net.minecraft.world.item.Items.SOUL_TORCH)
                        .define('X', Items.COPPER_NUGGET.get())
                        .pattern("XXX")
                        .pattern("X#X")
                        .pattern("XXX")
                        .unlockedBy("has_soul_torch", this.has(net.minecraft.world.item.Items.SOUL_TORCH))
                        .save(this.output);

                this.shaped(RecipeCategory.DECORATIONS, ModBlocks.COPPER_CHAIN.get())
                        .define('C', net.minecraft.world.item.Items.COPPER_INGOT)
                        .define('N', Items.COPPER_NUGGET.get())
                        .pattern("N")
                        .pattern("C")
                        .pattern("N")
                        .unlockedBy("has_copper_nugget", this.has(Items.COPPER_NUGGET.get()))
                        .unlockedBy("has_copper_ingot", this.has(net.minecraft.world.item.Items.COPPER_INGOT))
                        .save(this.output);

                this.shaped(RecipeCategory.MISC, Items.COPPER_BUCKET.get())
                        .define('#', net.minecraft.world.item.Items.COPPER_INGOT)
                        .pattern("# #")
                        .pattern(" # ")
                        .unlockedBy("has_copper_ingot", this.has(net.minecraft.world.item.Items.COPPER_INGOT)).save(this.output);
            }

            //TODO: Add cauldron recipe
        };
    }

    @Override
    public @NotNull String getName() {
        return "Nemo's Copper Recipes";
    }
}

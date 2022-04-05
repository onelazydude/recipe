package com.testing.recipe.controller;

import com.testing.recipe.domain.Recipe;
import com.testing.recipe.service.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class RecipeController {
    private final RecipeService recipeService;


    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }
    // we need to get
    // 1. A route to this function(url)
    // 2. Need to grab Id

    @RequestMapping("/recipe/show/{recipeId}")
    public String getRecipeById(@PathVariable String recipeId, Model model){
        Optional<Recipe> recipe = recipeService.findById(Long.valueOf(recipeId));
        if(recipe.isPresent()){
            model.addAttribute("recipe", recipe.get());
            return "recipe/show";
        } else {
            return "404/404";
        }
    }
}

package com.testing.recipe.service;

import com.testing.recipe.domain.Recipe;

import java.util.Optional;
import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Optional<Recipe> findById(Long id);
}

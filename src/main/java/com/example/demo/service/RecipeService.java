package com.example.demo.service;


import com.example.demo.model.Recipe;
import com.example.demo.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecipeService {

    @Autowired
    RecipeRepository recipeRepository;

    public Recipe getRandomRecipe(String foodType, Integer cookDuration) {
        return recipeRepository.findRandomRecipe(foodType, cookDuration);
    }
}

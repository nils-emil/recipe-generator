package com.example.demo.controller;


import com.example.demo.model.FoodType;
import com.example.demo.model.Recipe;
import com.example.demo.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recipe")
public class RecipeController {


    @Autowired
    private RecipeService recipeService;

    @GetMapping("random")
    public Recipe getCalculationResult(@RequestParam String foodType,
                                       @RequestParam Integer cookDuration) {
        return recipeService.getRandomRecipe(foodType, cookDuration);
    }

}

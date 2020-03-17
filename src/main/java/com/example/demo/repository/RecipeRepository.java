package com.example.demo.repository;

import com.example.demo.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Integer> {

    @Query(value = "SELECT * FROM recipe r " +
            "where r.food_type = ?1 " +
            "AND r.cook_duration < ?2 " +
            "order by RANDOM() LIMIT 1", nativeQuery = true)
    Recipe findRandomRecipe(String foodType, Integer cookDuration);

}
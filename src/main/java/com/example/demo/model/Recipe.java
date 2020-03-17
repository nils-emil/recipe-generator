package com.example.demo.model;

import javax.persistence.*;

@Table(name = "recipe")
@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String description;

    @Column
    private String foodType;

    @Column
    private Integer cookDuration;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCookDuration() {
        return cookDuration;
    }

    public void setCookDuration(Integer cookDuration) {
        this.cookDuration = cookDuration;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }
}

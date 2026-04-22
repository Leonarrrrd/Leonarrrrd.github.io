package com.example.demo.dto;

public class FoodDto {
    private String name;
    private Double calories;
    private Double protein;
    private Double carbs;
    private Double fat;
    private String servingSize;

    public FoodDto(String name, Double calories, Double protein, Double carbs, Double fat, String servingSize) {
        this.name = name;
        this.calories = calories;
        this.protein = protein;
        this.carbs = carbs;
        this.fat = fat;
        this.servingSize = servingSize;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Double getCalories() { return calories; }
    public void setCalories(Double calories) { this.calories = calories; }

    public Double getProtein() { return protein; }
    public void setProtein(Double protein) { this.protein = protein; }

    public Double getCarbs() { return carbs; }
    public void setCarbs(Double carbs) { this.carbs = carbs; }

    public Double getFat() { return fat; }
    public void setFat(Double fat) { this.fat = fat; }

    public String getServingSize() { return servingSize; }
    public void setServingSize(String servingSize) { this.servingSize = servingSize; }
}
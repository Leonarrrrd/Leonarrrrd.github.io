package com.example.demo.dto;

public class ExerciseDto {
    private Long id;
    private String name;
    private String category;
    private String gifUrl;

    public ExerciseDto(Long id, String name, String category, String gifUrl) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.gifUrl = gifUrl;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getCategory() { return category; }
    public String getGifUrl() { return gifUrl; }
}
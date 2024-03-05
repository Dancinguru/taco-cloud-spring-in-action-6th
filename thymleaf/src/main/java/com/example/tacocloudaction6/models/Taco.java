package com.example.tacocloudaction6.models;

import lombok.Data;

import java.util.List;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Data
public class Taco {
    @NotNull
    @Size(min = 3, message = "Name must be at least 5 numbers...")
    private String name;
    @NotNull
    @Size(min = 5, message = "Ingredients must be at least 10 ")
    private List<Ingredient> ingredients;
}
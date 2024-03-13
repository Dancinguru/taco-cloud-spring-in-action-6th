package com.example.tacocloudaction6.models;

import lombok.Data;

import java.util.Date;
import java.util.List;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Data
public class Taco {

    private Long id;

    private Date createdAt = new Date();
    @NotNull
    @Size(min = 3, message = "Name must be at least 3 numbers...")
    private String name;
    @NotNull
    @Size(min = 5, message = "Ingredients must be at least 5 ")
    private List<Ingredient> ingredients;
}
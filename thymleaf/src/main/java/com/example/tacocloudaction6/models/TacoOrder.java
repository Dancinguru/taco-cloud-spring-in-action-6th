package com.example.tacocloudaction6.models;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.validator.constraints.CreditCardNumber;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Data
public class TacoOrder implements Serializable{
    private static final long serialVersionUID = 1L;
    private Long id;
    private Date placeAt;
    @NotBlank(message = "Delivery Name is required.")
    private String deliveryName;
    @NotBlank(message = "Delivery Street is required.")
    private String deliveryStreet;
    @NotBlank(message = "Delivery City is required.")
    private String deliveryCity;
    @NotBlank(message = "Delivery State is required.")
    private String deliveryState;
    @NotBlank(message = "Delivery Zip is required")
    private String deliveryZip;
    @CreditCardNumber(message = "Not a valid credit card number.")
    private String ccNumber;
    @Pattern(regexp = "^(0[0-9]|1[0-2])(\\/)([2-9][0-9])$",
            message = "Must be formatted MM/YY")
    private String ccExpiration;
    @Digits(integer = 3, fraction = 0, message = "Invalid CVV")
    private String ccCVV;

    private List<Taco> tacos = new ArrayList<>();

    public void addTaco(Taco taco) {
        this.tacos.add(taco);
    }
}

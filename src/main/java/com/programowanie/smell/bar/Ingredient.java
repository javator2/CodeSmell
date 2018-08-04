package com.programowanie.smell.bar;

public enum Ingredient {
    GIN(10),
    TONIC_WATER(5),
    GREEN_STUFF(15),
    LIMON(6);

    private  int price;

    Ingredient(int price) {
        this.price = price;
    }
}

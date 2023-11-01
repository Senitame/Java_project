package org.example;

import java.util.Objects;

class Motorcycle extends Vehicle implements saleOfGoods {
    private final Double price;
    private final Engine engine;
    public Motorcycle(String brand, String model, int year, double price, Engine engine) {
        super(brand, model, year);
        this.price = price;
        this.engine = engine;
    }

    @Override
    public void displayInfo() {
        System.out.println("Motorcycle information:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year of issue: " + year);
        System.out.println("Price: $" + calculatePrice());
        System.out.println("Engine: " + engine.getDisplacement() + " sm^3, " + engine.getHorsePower() + " h.p.");
    }
    @Override
    public String toString() {
        return "Motorcycle: " + year + " " + brand + " " + model;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Motorcycle)) return false;
        Motorcycle motorcycle = (Motorcycle) o;
        return year == motorcycle.year &&
                Objects.equals(brand, motorcycle.brand) &&
                Objects.equals(model, motorcycle.model);    }
    @Override
    public int hashCode() {
        return Objects.hash(brand, model, year);
    }

    @Override
    public double calculatePrice() {
        return price;
    }
}
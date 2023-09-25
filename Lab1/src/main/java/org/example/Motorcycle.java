package org.example;

class Motorcycle extends Vehicle implements saleOfGoods {
    private final double price;
    private Engine engine;
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
    public double calculatePrice() {
        return price;
    }
}
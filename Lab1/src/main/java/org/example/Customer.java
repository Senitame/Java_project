package org.example;

class Customer {
    private final String name;

    public Customer(String name) {
        this.name = name;
    }

    public void purchase(saleOfGoods item) {
        System.out.println(name + " bought " + item.getClass().getSimpleName() + " for " + item.calculatePrice() + " dollars.");
    }
}
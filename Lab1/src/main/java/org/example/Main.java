package org.example;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(998, 200);
        Motorcycle motorcycle = new Motorcycle("Kawasaki", "Nija H2 SX", 2022, 37806.84, engine);
        Customer customer = new Customer("Yuri Plisetsky");
        Dealer dealer = new Dealer();

        dealer.sell(motorcycle, customer);
    }
}
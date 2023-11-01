package org.example;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(998, 200);
        Engine engine1 = new Engine(313, 34);
        Motorcycle motorcycle = new Motorcycle("Kawasaki", "Nija H2 SX", 2022, 378006.84, engine);
        Motorcycle motorcycle1 = new Motorcycle("BMW", "G310R", 2018, 178075.65, engine);
        Customer customer = new Customer("Yuri Plisetsky");
        Dealer dealer = new Dealer();

        dealer.sell(motorcycle, customer);
        System.out.println();

        //toString()
        System.out.println("Motorcycle info 1: " + motorcycle.toString());
        System.out.println("Motorcycle info 2: " + motorcycle1.toString());
        System.out.println();
        //hashCode()
        System.out.println("Motorcycle hash code 1: " + motorcycle.hashCode());
        System.out.println("Motorcycle hash code 2: " + motorcycle1.hashCode());
        System.out.println();
        //equals()
        if (motorcycle.equals(motorcycle1)) {
            System.out.println("Motorcycles are the same.");
        } else {
            System.out.println("Motorcycles are different.");
        }
    }
}
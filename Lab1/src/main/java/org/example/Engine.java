package org.example;

public class Engine {
    private int displacement; // объем двигателя в кубических сантиметрах
    private int horsePower;  // мощность двигателя в лошадиных силах

    public Engine(int displacement, int horsePower) {
        this.displacement = displacement;
        this.horsePower = horsePower;
    }

    // геттеры и сеттеры для полей
    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}

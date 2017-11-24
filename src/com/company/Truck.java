package com.company;

public class Truck extends Vehicle {
    public Truck(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public int run() {
        return speed;
    }
}

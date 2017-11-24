package com.company;

public class Car extends Vehicle{
    String bodyType;

    public Car(String bodyType) {
        super();
        this.bodyType = bodyType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "bodyType='" + bodyType + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public int run(int speed) {
        return speed;
    }
}

package com.company;

public class Vehicle {
    protected String name = "noName";
    protected int id = 0;
    protected int speed = 60;

    public Vehicle(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Vehicle() {

    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public int run(){
        return speed;
    }
}

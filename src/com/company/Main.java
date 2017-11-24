package com.company;

public class Main {

    public static void main(String[] args) {
        Vehicle v = new Vehicle("Vehicle_01", 1);
	    Car c = new Car("Car_01");
	    Truck t = new Truck(30);
        System.out.println(v.toString());
        System.out.println(c.toString());
        System.out.println(t.toString());


        System.out.println("The speed of '" + c.name + "': " + c.run());
        System.out.println("The speed of '" + t.name + "': " + t.run());

        Vehicle c2 = new Car("Car_02");
        Vehicle t2 = new Truck(80);
        System.out.println("The speed of '" + c2.name + "': " + c2.run());
        System.out.println("The speed of '" + t2.name + "': " + t2.run());



    }
}

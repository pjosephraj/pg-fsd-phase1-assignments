package com.assignments;

abstract class Vehicle {
    int speed;
    long distance;

    abstract void run();
    abstract void stop();

    abstract void display();

    public void fuel(int a) {
        System.out.println("Fuel1: " + a);
    }
    public void fuel(float a, String b) {
        System.out.println("Fuel2: " + a + " -- " + b);
    }
    public void fuel(char a, int b) {
        System.out.println("Fuel3: " + a + " -- " + b);
    }

    void Vehicle(){}

    void Vehicle(int speed, long distance) {
        this.speed = speed;
        this.distance = distance;
    }
}

class TwoWheeler extends Vehicle {

    int nos_of_tyres = 2;

    public void run() {
        System.out.println("Two Wheeler runs");
    }

    public void stop() {
        System.out.println("Two Wheeler stopped");
    }

    public void display() {
        System.out.println("Speed: " + super.speed + "\n" + "Distance: " + super.distance + "\n" + "Tyres: " + this.nos_of_tyres);
    }

    public TwoWheeler(int speed, long distance) {
        this.speed = speed;
        this.distance = distance;
    }
}

class ThreeWheeler extends Vehicle {
    int nos_of_tyres = 3;

    public void run() {
        System.out.println("Three Wheeler runs");
    }

    public void stop() {
        System.out.println("Three Wheeler stopped");
    }

    public void display() {
        System.out.println("Speed: " + this.speed + "\n" + "Distance: " + this.distance + "\n" + "Tyres: " + this.nos_of_tyres);
    }

    public ThreeWheeler(int speed, long distance) {
        this.speed = speed;
        this.distance = distance;
    }
}

class FourWheeler extends Vehicle {
    int nos_of_tyres = 4;

    public void run() {
        System.out.println("Four Wheeler runs");
    }

    public void stop() {
        System.out.println("Four Wheeler stopped");
    }

    public void display() {
        System.out.println("Speed: " + this.speed + "\n" + "Distance: " + this.distance + "\n" + "Tyres: " + this.nos_of_tyres);
    }

    public FourWheeler(int speed, long distance) {
        this.speed = speed;
        this.distance = distance;
    }
}

class EightWheeler extends Vehicle {
    int nos_of_tyres = 8;

    public void run() {
        System.out.println("Eight Wheeler runs");
    }

    public void stop() {
        System.out.println("Eight Wheeler stopped");
    }

    public void display() {
        System.out.println("Speed: " + this.speed + "\n" + "Distance: " + this.distance + "\n" + "Tyres: " + this.nos_of_tyres);
    }

    public EightWheeler(int speed, long distance) {
        this.speed = speed;
        this.distance = distance;
    }
}

public class Assignment1 {

    public static void main(String[] args) {
        Vehicle vehicle = new TwoWheeler(140, 100);
        display(vehicle, 140, 100f, "Two Wheeler,", '2');
        vehicle = new ThreeWheeler(100, 60);
        display(vehicle, 100, 45f, "Three Wheeler,", '3');
        vehicle = new FourWheeler(200, 25);
        display(vehicle, 200, 25f, "Four Wheeler,", '4');
        vehicle = new EightWheeler(160, 15);
        display(vehicle, 200, 15f, "Eight Wheeler,", '4');
    }

    public static void display(Vehicle vehicle, int a, float b, String c, char d) {
        vehicle.display();
        vehicle.run();
        vehicle.stop();
        vehicle.fuel(a);
        vehicle.fuel(b, c);
        vehicle.fuel(d, a);
        System.out.println("==============================");
    }

}

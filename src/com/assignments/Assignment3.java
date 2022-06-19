package com.assignments;

abstract class Pen {
    abstract void write();
    abstract void refill();

    Pen() {}
}

class FountainPen extends Pen {

    void write() {
        System.out.println("Write");
    }

    @Override
    void refill() {
        System.out.println("Refill");
    }

    public void changeNib() {
        System.out.println("Change Nib");
    }

    FountainPen() {
        super();
    }

}

class Monkey {

    public void jump() {
        System.out.println("Monkey Jump");
    }

    public void bite() {
        System.out.println("Monkey Bite");
    }
}

class Human extends Monkey {

    public void eat() {
        System.out.println("Human Eat");
    }

    public void sleep() {
        System.out.println("Human Sleep");
    }
}

public class Assignment3 {
    public static void main(String[] args) {
        FountainPen pen = new FountainPen();
        pen.changeNib();
        pen.write();
        pen.refill();
        System.out.println("==============================");
        Human human = new Human();
        human.jump();
        human.bite();
        human.eat();
        human.sleep();
    }
}

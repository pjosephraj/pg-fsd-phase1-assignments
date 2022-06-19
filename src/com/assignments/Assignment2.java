package com.assignments;

abstract class MNC {

    abstract void mncAbstract();

    public void mncMethod() {
        System.out.println("MNC Normal Method");
    }

    MNC() {
        System.out.println("MNC Constructor");
    }
}

abstract class Infosys extends MNC {
    abstract void infosysAbstract();

    public void infosysMethod() {
        System.out.println("Infosys Normal Method");
    }
    Infosys() {
        super();
        System.out.println("InfoSys Constructor");
    }

}

class Hello extends Infosys {
    @Override
    public void mncAbstract() {
        System.out.println("MNC Abstract from Hello");
    }

    @Override
    public void infosysAbstract() {
        System.out.println("Infosys Abstract from Hello");
    }

    public void helloMethod() {
        System.out.println("Hello Normal Method");
    }

    Hello() {
        super();
        System.out.println("Hello Constructor");
    }
}

public class Assignment2 {
    public static void main(String[] args) {
        Hello mnc = new Hello();
        mnc.mncAbstract();
        mnc.mncMethod();
        mnc.infosysAbstract();
        mnc.infosysMethod();
        mnc.helloMethod();
    }
}

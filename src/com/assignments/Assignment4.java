package com.assignments;

abstract class Telephone {
    abstract void lift();
    abstract void disconected();

}

class SmartTelephone extends Telephone {
    @Override
    void lift() {
        System.out.println("Smart Telephone Lifted");
    }

    @Override
    void disconected() {
        System.out.println("Smart Telephone Disconnected");
    }

}

public class Assignment4 {
    public static void main(String[] args) {
        SmartTelephone smartTelephone = new SmartTelephone();
        smartTelephone.lift();
        smartTelephone.disconected();
    }
}

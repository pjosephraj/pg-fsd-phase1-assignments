package com.assignments;

interface TVremote {
    boolean hasNumberBtns = true;
    void changeChannel();
}

interface SmartTVremote extends TVremote {
    boolean hasNumberBtns = false;
    void changeOTT();
}

class TV implements SmartTVremote {

    boolean hasNumberBtns = false;

    public void changeChannel() {
        System.out.println("Change Channel");
    }

    public void changeOTT() {
        System.out.println("Change OTT");
    }

}

public class Assignment5 {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.changeChannel();
        tv.changeOTT();
        System.out.println("Has Number Buttons: " + (tv.hasNumberBtns ? "Yes" : "No"));
    }
}

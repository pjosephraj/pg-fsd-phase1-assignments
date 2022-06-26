package com.assignments;

class FactorialThread extends Thread {

    int num;

    FactorialThread(int num) {
        this.num = num;
    }

    synchronized public void factorial(int num) {
        int i, fact = 1;
        for (i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of Thread-" + Thread.currentThread().getName() + " ::: " + fact);
    }

    @Override
    public void run() {
        factorial(num);
    }
}

class SumThread extends Thread {
    int num1, num2;

    SumThread(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    synchronized public void sum(int num1, int num2) {
        System.out.println("Sum of Thread-" + Thread.currentThread().getName() + " ::: " + (num1 + num2));
    }

    @Override
    public void run() {
        sum(num1, num2);
    }
}

public class AssignmentThreadSyncronize {
    public static void main(String[] args) {

        FactorialThread t1 = new FactorialThread(4);
        FactorialThread t2 = new FactorialThread(6);
        SumThread t3 = new SumThread(4, 5);
        SumThread t4 = new SumThread(10, 20);

        t1.setName("T1");
        t2.setName("T2");
        t3.setName("T3");
        t4.setName("T4");

        t2.start();
        t4.start();
        t1.start();
        t3.start();

    }
}
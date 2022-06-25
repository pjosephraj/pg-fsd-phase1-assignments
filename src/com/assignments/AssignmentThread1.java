package com.assignments;

class ThreadAssignment extends Thread {
    public void run() {
        for(int i = 0; i < 3; i++) {
            try {
                System.out.println("Thread State: "+ Thread.currentThread().getName()+ " ::: " + Thread.currentThread().getState());
                System.out.println("Is Thread is Running?: "+ Thread.currentThread().getName()+ " ::: " + Thread.currentThread().getState());
                System.out.println("Is Thread is Alive?: "+ Thread.currentThread().getName()+ " ::: " + (Thread.currentThread().isAlive() ? "Yes" : "No"));
                System.out.println("Is Thread is Daemon?: "+ Thread.currentThread().getName()+ " ::: " + (Thread.currentThread().isDaemon() ? "Yes" : "No"));
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class AssignmentThread1 {

    public static void main(String[] args) {
        ThreadAssignment t1 = new ThreadAssignment();
        ThreadAssignment t2 = new ThreadAssignment();
        ThreadAssignment t3 = new ThreadAssignment();

        t1.setName("T1");
        t2.setName("T2");
        t3.setName("T3");

        t1.setPriority(Thread.NORM_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t2.setDaemon(true);

        t1.start();
        t2.start();
        t3.start();

    }
}

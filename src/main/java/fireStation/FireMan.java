package main.java.fireStation;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class FireMan extends Thread {
    private String name;
    private CyclicBarrier cyclicBarrier;

    public FireMan(String name, CyclicBarrier cyclicBarrier) {
        this.name = name;
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {
        System.out.println("Fireman " + this.name + " is waiting in " + Thread.currentThread().getName());
        try {
            cyclicBarrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
        System.out.println("Fireman " + name + " is going to the fire call in " + Thread.currentThread().getName());

    }
}

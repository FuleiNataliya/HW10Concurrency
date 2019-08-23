package main.java.fireStation;

import java.util.concurrent.CyclicBarrier;

public class FireStation {

    public static void main(String[] args) {

        CyclicBarrier cyclicBarrier = new CyclicBarrier(2, () ->
                System.out.println("\nAlarm! Fire! In Thread " + Thread.currentThread().getName() + ".\n"));

        FireMan maks = new FireMan("Bob", cyclicBarrier);
        FireMan nick = new FireMan("Peter", cyclicBarrier);

        maks.start();
        nick.start();
    }
}



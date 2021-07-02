package io.aturanj.leetcode;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

/**
 * https://leetcode.com/problems/building-h2o/
 */
public class BuildingH2O {

    private final CyclicBarrier cyclicBarrier;
    private final Semaphore semaphoreOxygen;
    private final Semaphore semaphoreHydrogen;

    public BuildingH2O() {
        cyclicBarrier = new CyclicBarrier(3);
        semaphoreOxygen = new Semaphore(1);
        semaphoreHydrogen = new Semaphore(2);
    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
        try {
            semaphoreHydrogen.acquire();
            cyclicBarrier.await();
            // releaseHydrogen.run() outputs "H". Do not change or remove this line.
            releaseHydrogen.run();
            semaphoreHydrogen.release();
        } catch (InterruptedException | BrokenBarrierException ex) {
            System.out.println(ex);
        }
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        try {
            semaphoreOxygen.acquire();
            cyclicBarrier.await();
            // releaseOxygen.run() outputs "O". Do not change or remove this line.
            releaseOxygen.run();
            semaphoreOxygen.release();
        } catch (InterruptedException | BrokenBarrierException ex) {
            System.out.println(ex);
        }
    }
}

package io.aturanj.leetcode;

import java.util.concurrent.Semaphore;

/**
 * https://leetcode.com/problems/the-dining-philosophers/
 */
public class DiningPhilosophers {

    private final Semaphore semaphore;

    public DiningPhilosophers() {
        semaphore = new Semaphore(1);
    }

    // call the run() method of any runnable to execute its code
    public void wantsToEat(int philosopher,
            Runnable pickLeftFork,
            Runnable pickRightFork,
            Runnable eat,
            Runnable putLeftFork,
            Runnable putRightFork) throws InterruptedException {

        semaphore.acquire();

        pickLeftFork.run();
        pickRightFork.run();
        eat.run();
        putRightFork.run();
        putLeftFork.run();

        semaphore.release();
    }
}

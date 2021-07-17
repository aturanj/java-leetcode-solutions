package io.aturanj.leetcode;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.function.IntConsumer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * https://leetcode.com/problems/fizz-buzz-multithreaded/
 */
public class FizzBuzzMultithreaded {

    private final int n;
    CyclicBarrier cyclicBarrier;

    public FizzBuzzMultithreaded(int n) {
        this.n = n;
        cyclicBarrier = new CyclicBarrier(4);
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            try {
                cyclicBarrier.await();
            } catch (BrokenBarrierException ex) {
                System.out.println(ex);
            }
            if (i % 3 == 0 && i % 5 != 0) {
                printFizz.run();
            }
        }
    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            try {
                cyclicBarrier.await();
            } catch (BrokenBarrierException ex) {
                System.out.println(ex);
            }

            if (i % 3 != 0 && i % 5 == 0) {
                printBuzz.run();
            }
        }
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            try {
                cyclicBarrier.await();
            } catch (BrokenBarrierException ex) {
                System.out.println(ex);
            }

            if (i % 3 == 0 && i % 5 == 0) {
                printFizzBuzz.run();
            }
        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            try {
                cyclicBarrier.await();
            } catch (BrokenBarrierException ex) {
                System.out.println(ex);
            }

            if (i % 3 != 0 && i % 5 != 0) {
                printNumber.accept(i);
            }
        }
    }

    public static void main(String[] args) {

        FizzBuzzMultithreaded fizzBuzz = new FizzBuzzMultithreaded(22);

        new Thread(() -> {
            try {
                fizzBuzz.fizz(() -> {
                    System.out.println("Fizz");
                });
            } catch (InterruptedException ex) {
                Logger.getLogger(FizzBuzzMultithreaded.class.getName()).log(Level.SEVERE, null, ex);
            }
        }).start();

        new Thread(() -> {
            try {
                fizzBuzz.fizzbuzz(() -> {
                    System.out.println("FizzBuzz");
                });
            } catch (InterruptedException ex) {
                Logger.getLogger(FizzBuzzMultithreaded.class.getName()).log(Level.SEVERE, null, ex);
            }
        }).start();

        new Thread(() -> {
            try {
                fizzBuzz.buzz(() -> {
                    System.out.println("Buzz");
                });
            } catch (InterruptedException ex) {
                Logger.getLogger(FizzBuzzMultithreaded.class.getName()).log(Level.SEVERE, null, ex);
            }
        }).start();

        new Thread(() -> {
            try {
                fizzBuzz.number((a) -> {
                    System.out.println(a);
                });
            } catch (InterruptedException ex) {
                Logger.getLogger(FizzBuzzMultithreaded.class.getName()).log(Level.SEVERE, null, ex);
            }
        }).start();
    }
}

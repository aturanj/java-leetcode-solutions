package io.aturanj.leetcode;

import java.util.function.IntConsumer;

/**
 * https://leetcode.com/problems/print-zero-even-odd/
 */
public class PrintZeroEvenOdd {

    private int n;
    volatile int counter = 0;
    volatile boolean isZero;
    volatile boolean isOdd;

    public PrintZeroEvenOdd(int n) {
        this.n = n;
        isZero = true;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public synchronized void zero(IntConsumer printNumber) throws InterruptedException {

        while (counter <= n) {

            if (!isZero) {
                wait();
            } else {

                if (counter != n) {
                    printNumber.accept(0);
                }

                isZero = false;

                counter++;

                isOdd = counter % 2 != 0;

                notifyAll();
            }
        }
    }

    public synchronized void even(IntConsumer printNumber) throws InterruptedException {

        while (counter <= n) {
            if (isOdd || isZero) {
                wait();
            } else {
                printNumber.accept(counter);
                isZero = true;
                isOdd = false;
                notifyAll();
            }
        }
    }

    public synchronized void odd(IntConsumer printNumber) throws InterruptedException {

        while (counter <= n) {
            if (!isOdd || isZero) {
                wait();
            } else {
                printNumber.accept(counter);
                isZero = true;
                isOdd = false;
                notifyAll();
            }
        }
    }
}

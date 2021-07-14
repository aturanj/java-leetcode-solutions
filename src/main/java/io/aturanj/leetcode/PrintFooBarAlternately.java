package io.aturanj.leetcode;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * https://leetcode.com/problems/print-foobar-alternately/
 */
public class PrintFooBarAlternately {

    private int n;
    private Semaphore fooSemaphore = new Semaphore(1);
    private Semaphore barSemaphore = new Semaphore(1);

    public PrintFooBarAlternately(int n) {

        this.n = n;

        try {
            barSemaphore.acquire();
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {

            fooSemaphore.acquire();
            // printFoo.run() outputs "foo". Do not change or remove this line.
            printFoo.run();
            barSemaphore.release();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {

            barSemaphore.acquire();
            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();
            fooSemaphore.release();
        }
    }

    public static void main(String[] args) {

        var print = new PrintFooBarAlternately(3);

        Thread threadOne = new Thread(() -> {
            try {
                print.foo(() -> {
                    System.out.print("foo");
                });
            } catch (InterruptedException ex) {
                Logger.getLogger(PrintFooBarAlternately.class.getName()).log(Level.SEVERE, null, ex);
            }
        });

        threadOne.start();

        Thread threadTwo = new Thread(() -> {
            try {
                print.bar(() -> {
                    System.out.print("bar");
                });
            } catch (InterruptedException ex) {
                Logger.getLogger(PrintFooBarAlternately.class.getName()).log(Level.SEVERE, null, ex);
            }
        });

        threadTwo.start();
    }
}

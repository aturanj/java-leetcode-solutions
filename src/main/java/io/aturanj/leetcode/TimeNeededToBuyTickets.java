package io.aturanj.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/time-needed-to-buy-tickets/
 */
public class TimeNeededToBuyTickets {

    public int timeRequiredToBuy(int[] tickets, int k) {

        var timer = 0;

        while (tickets[k] > 0) {

            for (var i = 0; i < tickets.length; i++) {

                if (tickets[i] > 0) {
                    tickets[i] -= 1;
                    timer++;
                }

                if (tickets[k] == 0) {
                    break; //our person is done
                }
            }
        }

        return timer;
    }

    public static void main(String[] args) {
        var timeNeededToBuyTickets = new TimeNeededToBuyTickets();
        var result = timeNeededToBuyTickets.timeRequiredToBuy(
                new int[]{2, 3, 2},
                2
        );
        System.out.println("result = " + result);
        assertEquals(6, result);
    }
}

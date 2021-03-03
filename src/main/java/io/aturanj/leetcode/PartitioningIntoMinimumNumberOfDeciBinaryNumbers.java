package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/submissions/
 */
public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {

    public int minPartitions(String n) {

        if (n == null || n.length() == 0) {
            return 0;
        }

        int maxDigit = 0;

        for (char c : n.toCharArray()) {

            var currentDigit = Character.getNumericValue(c);

            if (currentDigit > maxDigit) {
                maxDigit = currentDigit;
            }
        }

        return maxDigit;
    }

    public static void main(String[] args) {

        PartitioningIntoMinimumNumberOfDeciBinaryNumbers deciBinaryNumbers
                = new PartitioningIntoMinimumNumberOfDeciBinaryNumbers();

        var result = deciBinaryNumbers.minPartitions("263740484987262");

        System.out.println("result = " + result);
    }
}

package io.aturanj.leetcode;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/add-to-array-form-of-integer/
 */
public class AddToArrayFormOfInteger {

    public List<Integer> addToArrayForm(int[] num, int k) {
        var sb = new StringBuilder();
        Arrays.stream(num).forEach(x -> sb.append(x));
        var result = new BigInteger(sb.toString()).add(new BigInteger(k + "")).toString();
        return result
                .chars()
                .mapToObj(x -> Character.getNumericValue(x))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        var arrayFormOfInteger = new AddToArrayFormOfInteger();
        var result = arrayFormOfInteger.addToArrayForm(new int[]{1, 2, 0, 0}, 34);
        System.out.println("result = " + result);
        assertEquals(result, Arrays.asList(1, 2, 3, 4));
    }
}

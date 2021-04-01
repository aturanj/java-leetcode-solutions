package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/k-th-symbol-in-grammar/
 */
public class KthSymbolInGrammer {

    public int kthGrammar(int N, int K) {

        if (N <= 1) {
            return 0;
        }

        var parent = kthGrammar(N - 1, K / 2 + K % 2);

        if (parent == 1) { // 10

            return K % 2 == 1 ? 1 : 0;

        } else { // 01

            return K % 2 == 1 ? 0 : 1;
        }
    }

    public static void main(String[] args) {

        KthSymbolInGrammer kthSymbolInGrammer = new KthSymbolInGrammer();
        var result = kthSymbolInGrammer.kthGrammar(30, 222); //row 30 index 222

        System.out.println("result = " + result);
    }
}

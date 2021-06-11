package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/check-if-word-equals-summation-of-two-words/
 */
public class CheckIfWordEqualsSummationOfTwoWords {

    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {

        return getSummation(firstWord)
                + getSummation(secondWord)
                == getSummation(targetWord);
    }

    private int getNumericalValue(char character) {
        return (int) character - 97;
    }

    private int getSummation(String word) {

        StringBuilder sb = new StringBuilder();

        for (var item : word.toCharArray()) {
            sb.append(getNumericalValue(item));
        }

        return Integer.valueOf(sb.toString());
    }

    public static void main(String[] args) {
        CheckIfWordEqualsSummationOfTwoWords checkIfWordEquals
                = new CheckIfWordEqualsSummationOfTwoWords();

        var result = checkIfWordEquals.isSumEqual("acb", "cba", "cdb");

        System.out.println("result = " + result);
    }
}

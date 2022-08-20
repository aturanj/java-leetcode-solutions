package io.aturanj.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/goat-latin/
 */
public class GoatLatin {

    public String toGoatLatin(String sentence) {

        var array = sentence.split(" ");
        var sb = new StringBuilder();
        var counter = 1;

        for (var item : array) {
            switch (item.charAt(0)) {
                case 'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U' ->
                    sb.append(item).append("ma");
                default ->
                    sb.append(item.substring(1))
                            .append(item.charAt(0))
                            .append("ma");
            }

            for (var i = 0; i < counter; i++) {
                sb.append("a");
            }
            sb.append(" ");
            counter++;
        }
        sb.deleteCharAt(sb.length() - 1);//remove last space

        return sb.toString();
    }

    public static void main(String[] args) {
        var goatLatin = new GoatLatin();
        var result = goatLatin
                .toGoatLatin("The quick brown fox jumped over the lazy dog");
        System.out.println("result = " + result);
        assertEquals("heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa "
                + "overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa", result);
    }
}

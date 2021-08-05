package io.aturanj.leetcode;

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
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                    sb.append(item).append("ma");
                    break;
                default:
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
    }
}

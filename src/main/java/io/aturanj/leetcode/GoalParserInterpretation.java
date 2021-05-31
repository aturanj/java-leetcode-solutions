package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/goal-parser-interpretation/
 */
public class GoalParserInterpretation {

    public String interpret(String command) {
        return command.replace("(al)", "al").replace("()", "o");
    }

    public static void main(String[] args) {
        GoalParserInterpretation parser = new GoalParserInterpretation();
        var result = parser.interpret("(al)G(al)()()G");
        System.out.println("result = " + result); //alGalooG
    }
}

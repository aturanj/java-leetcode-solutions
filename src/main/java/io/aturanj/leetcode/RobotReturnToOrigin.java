package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/robot-return-to-origin/
 */
public class RobotReturnToOrigin {

    public boolean judgeCircle(String moves) {

        var countL = moves.chars().filter((x) -> x == 'L').count();
        var countR = moves.chars().filter((x) -> x == 'R').count();
        var countU = moves.chars().filter((x) -> x == 'U').count();
        var countD = moves.chars().filter((x) -> x == 'D').count();

        return countL == countR && countU == countD;
    }

    public static void main(String[] args) {

        var robotReturnToOrigin = new RobotReturnToOrigin();
        var result = robotReturnToOrigin.judgeCircle("LUUDLRRD");
        System.out.println("result = " + result);
    }
}

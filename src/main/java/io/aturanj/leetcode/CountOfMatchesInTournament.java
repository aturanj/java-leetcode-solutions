package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/count-of-matches-in-tournament/
 */
public class CountOfMatchesInTournament {

    public int numberOfMatches(int n) {

        int teams = n;
        int match = 0;

        while (teams > 1) {

            var odd = teams % 2;

            int roundMatch = (int) Math.floor(teams / 2);

            match += roundMatch;

            teams = roundMatch + odd;
        }

        return match;
    }

    public static void main(String[] args) {

        CountOfMatchesInTournament tournament = new CountOfMatchesInTournament();
        var result = tournament.numberOfMatches(7);

        System.out.println("result = " + result);
    }
}

package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/first-bad-version/
 */
public class FirstBadVersion {

    public int firstBadVersion(int n) {

        double low = 0;
        double high = n;
        double mid = (int) Math.ceil((low + high) / 2);

        while (true) {

            if (n == 1) {
                return 1;
            }

            if (!isBadVersion(((int) mid) - 1) && isBadVersion((int) mid)) {
                return (int) mid;
            }

            if (!isBadVersion((int) mid)) {
                low = mid;
            } else {
                high = mid;
            }

            mid = (int) Math.ceil((low + high) / 2d);
        }
    }

    /**
     * this method is actually an API method given by leetcode
     */
    private boolean isBadVersion(int i) {
        return false;
    }
}

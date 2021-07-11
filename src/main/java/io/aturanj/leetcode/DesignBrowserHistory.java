package io.aturanj.leetcode;

import java.util.Stack;

/**
 * https://leetcode.com/problems/design-browser-history/
 */
public class DesignBrowserHistory {

    Stack<String> history;
    Stack<String> forwardHistory;

    public DesignBrowserHistory(String homepage) {
        history = new Stack();
        forwardHistory = new Stack();
        visit(homepage);
    }

    public void visit(String url) {
        forwardHistory.clear();
        history.push(url);
    }

    public String back(int steps) {
        while (steps > 0 && history.size() > 1) {
            forwardHistory.push(history.pop());
            steps--;
        }
        return history.peek();
    }

    public String forward(int steps) {
        while (steps > 0 && !forwardHistory.isEmpty()) {
            history.push(forwardHistory.pop());
            steps--;
        }

        return history.peek();
    }
}

// Your BrowserHistory object will be instantiated and called as such:
// BrowserHistory obj = new BrowserHistory(homepage);
// obj.visit(url);
// String param_2 = obj.back(steps);
// String param_3 = obj.forward(steps);

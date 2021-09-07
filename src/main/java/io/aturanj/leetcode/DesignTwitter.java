package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * https://leetcode.com/problems/design-twitter/
 */
public class DesignTwitter {

    Map<Integer, Set<Integer>> followingMap;
    Map<Integer, Integer> tweets;

    /**
     * Initialize your data structure here.
     */
    public DesignTwitter() {
        followingMap = new HashMap<>();
        tweets = new LinkedHashMap<>();
    }

    /**
     * Compose a new tweet.
     */
    public void postTweet(int userId, int tweetId) {
        tweets.put(tweetId, userId);
    }

    /**
     * Retrieve the 10 most recent tweet ids in the user's news feed. Each item
     * in the news feed must be posted by users who the user followed or by the
     * user herself. Tweets must be ordered from most recent to least recent.
     */
    public List<Integer> getNewsFeed(int userId) {

        var following = followingMap.getOrDefault(userId, new HashSet<>());
        var entryList = new ArrayList<>(tweets.entrySet());
        var resultList = new ArrayList<Integer>();

        for (var i = entryList.size() - 1; i >= 0; i--) {

            var item = entryList.get(i);

            if (item.getValue() == userId || following.contains(item.getValue())) {
                resultList.add(item.getKey());
            }

            if (resultList.size() == 10) {
                break;
            }
        }

        return resultList;
    }

    /**
     * Follower follows a followee. If the operation is invalid, it should be a
     * no-op.
     */
    public void follow(int followerId, int followeeId) {
        Set set = followingMap.getOrDefault(followerId, new HashSet<>());
        set.add(followeeId);
        followingMap.put(followerId, set);
    }

    /**
     * Follower unfollows a followee. If the operation is invalid, it should be
     * a no-op.
     */
    public void unfollow(int followerId, int followeeId) {

        var followingSet = followingMap.getOrDefault(followerId, new HashSet<>());

        if (followingSet.contains(followeeId)) {
            followingMap.remove(followerId);
            System.out.println("Unfollow: " + followeeId);
        }
    }

    public static void main(String[] args) {
        var twitter = new DesignTwitter();
        twitter.postTweet(1, 5); // User 1 posts a new tweet (id = 5).
        twitter.getNewsFeed(1);  // User 1's news feed should return a list with 1 tweet id -> [5]. return [5]
        twitter.follow(1, 2);    // User 1 follows user 2.
        twitter.postTweet(2, 6); // User 2 posts a new tweet (id = 6).
        twitter.getNewsFeed(1);  // User 1's news feed should return a list with 2 tweet ids -> [6, 5]. Tweet id 6 should precede tweet id 5 because it is posted after tweet id 5.
        twitter.unfollow(1, 2);  // User 1 unfollows user 2.
        twitter.getNewsFeed(1);  // User 1's news feed should return a list with 1 tweet id -> [5], since user 1 is no longer following user 2.
    }
}

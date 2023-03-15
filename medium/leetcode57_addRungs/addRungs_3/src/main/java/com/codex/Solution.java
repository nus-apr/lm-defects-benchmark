package com.codex;

import java.util.*;

public class Solution {
    public static int addRungs(int[] rungs, int dist) {
        /** You are given a strictly increasing integer array rungs that represents the height of rungs on a ladder. You are currently on the floor at height 0, and you want to reach the last rung.
         * You are also given an integer dist. You can only climb to the next highest rung if the distance between where you are currently at (the floor or on a rung) and the next rung is at most dist. You are able to insert rungs at any positive integer height if a rung is not already there.
         * Return the minimum number of rungs that must be added to the ladder in order for you to climb to the last rung.
         */
        int rungsCount = 1;
        int maxReach = rungs[0];
        if (rungs.length == 1) {
            return 0;
        }
        for (int i = 1; i < rungs.length; i++) {
            if (rungs[i] > maxReach + dist) {
                rungsCount++;
                maxReach = rungs[i - 1] + dist;
            }
        }
        return rungsCount;
    }

    }
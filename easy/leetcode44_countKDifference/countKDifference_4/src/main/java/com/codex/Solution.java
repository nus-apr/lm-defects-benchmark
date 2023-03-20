package com.codex;

import java.util.*;

public class Solution {
    public static int countKDifference(int[] nums, int k) {
        /** Given an integer array nums and an integer k, return the number of pairs (i, j) where i < j such that |nums[i] - nums[j]| == k.
         * The value of |x| is defined as:
         * x if x >= 0.
         * -x if x < 0.
         */
        if (nums == null || nums.length == 0) return 0;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int key : map.keySet()) {
            if (k == 0) {
                if (map.get(key) >= 2) count++;
            } else {
                if (map.containsKey(key + k)) count++;
            }
        }
        return count;
    }

    }
package com.codex;

import java.util.*;

public class Solution {
    public static int minimumOperations(int[] nums) {
        /** You are given a 0-indexed array nums consisting of n positive integers.
         * The array nums is called alternating if:
         * nums[i - 2] == nums[i], where 2 <= i <= n - 1.
         * nums[i - 1] != nums[i], where 1 <= i <= n - 1.
         * In one operation, you can choose an index i and change nums[i] into any positive integer.
         * Return the minimum number of operations required to make the array alternating.
         */
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            int a = dp[i - 2] + Math.abs(nums[i] - nums[i - 2]);
            int b = dp[i - 1] + Math.abs(nums[i] - nums[i - 1]);
            dp[i] = Math.min(a, b);
        }
        return dp[nums.length - 1];
    }

    }
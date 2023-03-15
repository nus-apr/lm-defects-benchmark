package com.codex;

import java.util.*;

public class Solution {
    public static int sumOfBeauties(int[] nums) {
        /** You are given a 0-indexed integer array nums. For each index i (1 <= i <= nums.length - 2) the beauty of nums[i] equals:
         * 2, if nums[j] < nums[i] < nums[k], for all 0 <= j < i and for all i < k <= nums.length - 1.
         * 1, if nums[i - 1] < nums[i] < nums[i + 1], and the previous condition is not satisfied.
         * 0, if none of the previous conditions holds.
         * Return the sum of beauty of all nums[i] where 1 <= i <= nums.length - 2.
         */
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int nowmin = nums[0];
        int nowmax = nums[nums.length - 1];
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nowmin) {
                left[i] = 1;
            }
            nowmin = Math.min(nums[i], nowmin);
            if (nums[nums.length - 1 - i] < nowmax) {
                right[nums.length - 1 - i] = 1;
            }
            nowmax = Math.max(nums[nums.length - 1 - i], nowmax);
        }
        for (int i = 1; i < nums.length - 1; i++) {
            if (left[i] == 1 && right[i] == 1) {
                res[i] = 2;
            } else if (left[i] == 1 || right[i] == 1) {
                res[i] = 1;
            }
        }
        int sum = 0;
        for (int i = 1; i < res.length - 1; i++) {
            sum += res[i];
        }
        return sum;
    }

    }
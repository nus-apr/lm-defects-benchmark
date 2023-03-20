package com.codex;

import java.util.*;

public class Solution {
    public static boolean divideArray(int[] nums) {
        /** You are given an integer array nums consisting of 2 * n integers.
         * You need to divide nums into n pairs such that:
         * Each element belongs to exactly one pair.
         * The elements present in a pair are equal.
         * Return true if nums can be divided into n pairs, otherwise return false.
         */

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 2) {
            if (i == nums.length - 1 || nums[i] != nums[i + 1]) {
                return false;
            }
        }
        return true;
    }
}}
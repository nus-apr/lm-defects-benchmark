package com.codex;

import java.util.*;

public class Solution {
    public static int numOfPairs(String[] nums, String target) {
        /** Given an array of digit strings nums and a digit string target, return the number of pairs of indices (i, j) (where i != j) such that the concatenation of nums[i] + nums[j] equals target.
         */
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) count++;
            }
        }
        return count;
    }

    }
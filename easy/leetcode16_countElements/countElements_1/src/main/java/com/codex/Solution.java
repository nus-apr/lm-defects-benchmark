package com.codex;

import java.util.*;

public class Solution {
    public static int countElements(int[] nums) {
        /** Given an integer array nums, return the number of elements that have both a strictly smaller and a strictly greater element appear in nums.
         */
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == nums[i] + 1) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    }
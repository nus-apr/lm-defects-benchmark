package com.codex;

import java.util.*;

public class Solution {
    public static int[] rearrangeArray2(int[] nums) {
        /** You are given a 0-indexed array nums of distinct integers. You want to rearrange the elements in the array such that every element in the rearranged array is not equal to the average of its neighbors.
         * More formally, the rearranged array should have the property such that for every i in the range 1 <= i < nums.length - 1, (nums[i-1] + nums[i+1]) / 2 is not equal to nums[i].
         * Return any rearrangement of nums that meets the requirements.
         */

        ArrayList<Integer> notAverage = new ArrayList<>();
        ArrayList<Integer> average = new ArrayList<>();
        int[] newArray;
        double averageValue = 0;

        if (nums.length > 1) {
            for (int i = 1; i < nums.length - 1; i++) {
                averageValue = (nums[i - 1] + nums[i + 1]) / 2.0;
                if (nums[i] > averageValue) {
                    notAverage.add(nums[i]);
                } else if (nums[i] < averageValue) {
                    average.add(nums[i]);
                }
            }
        }

        newArray = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                newArray[0] = nums[0];
            } else if (i == nums.length - 1) {
                newArray[nums.length - 1] = nums[nums.length - 1];
            } else {
                if (notAverage.size() > 0) {
                    newArray[i] = notAverage.get(0);
                    notAverage.remove(0);
                } else if (average.size() > 0) {
                    newArray[i] = average.get(0);
                    average.remove(0);
                }
            }
        }

        return newArray;
    }

    static int[] sort(int[] nums) {
        int[] newArray = new int[nums.length];
        ArrayList<Integer> positives = new ArrayList<>();
        ArrayList<Integer> negatives = new ArrayList<>();
        int positiveIndex = 0;
        int negativeIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                positives.add(nums[i]);
            } else {
                negatives.add(nums[i]);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (positives.size() > 0 && negativeIndex == 0) {
                newArray[i] = positives.get(0);
                positives.remove(0);
            } else if (negatives.size() > 0 && positiveIndex == 0) {
                newArray[i] = negatives.get(0);
                negatives.remove(0);
            } else if (positives.size() > 0 && negativeIndex > 0) {
                newArray[i] = positives.get(0);
                positives.remove(0);
            } else if (negatives.size() > 0 && positiveIndex > 0) {
                newArray[i] = negatives.get(0);
                negatives.remove(0);
            }

            if (newArray[i] >= 0) {
                positiveIndex = i;
            } else {
                negativeIndex = i;
            }
        }

        return newArray;
    }

    }
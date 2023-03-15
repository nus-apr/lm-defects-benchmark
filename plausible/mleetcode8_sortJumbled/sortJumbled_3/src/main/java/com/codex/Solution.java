package com.codex;

import java.util.*;

public class Solution {
    public static int[] sortJumbled(int[] mapping, int[] nums) {
        /** You are given a 0-indexed integer array mapping which represents the mapping rule of a shuffled decimal system. mapping[i] = j means digit i should be mapped to digit j in this system.
         * The mapped value of an integer is the new integer obtained by replacing each occurrence of digit i in the integer with mapping[i] for all 0 <= i <= 9.
         * You are also given another integer array nums. Return the array nums sorted in non-decreasing order based on the mapped values of its elements.
         * Notes:
         * Elements with the same mapped values should appear in the same relative order as in the input.
         * The elements of nums should only be sorted based on their mapped values and not be replaced by them.
         */
        int[] nums2 = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int result = 0;
            int length = String.valueOf(num).length();
            for (int j = 0; j < length; j++) {
                int divisor = (int) Math.pow(10, (length - j - 1));
                int dividend = num / divisor; }
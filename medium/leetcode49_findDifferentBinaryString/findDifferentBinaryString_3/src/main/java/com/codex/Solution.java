package com.codex;

import java.util.*;

public class Solution {
    public static String findDifferentBinaryString(String[] nums) {
        /** Given an array of strings nums containing n unique binary strings each of length n, return a binary string of length n that does not appear in nums. If there are multiple answers, you may return any of them.
         */
        int n = nums[0].length();
        char[][] char2D = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                char2D[i][j] = nums[i].charAt(j);
            }
        }
        String s = "";
        for (int i = 0; i < n; i++) {
            int ones = 0;
            for (int j = 0; j < n; j++) {
                if (char2D[j][i] == '1') {
                    ones++;
                }
            }
            if (ones <= n / 2) {
                s += "0";
            } else {
                s += "1";
            }
        }
        return s;
    }

    }
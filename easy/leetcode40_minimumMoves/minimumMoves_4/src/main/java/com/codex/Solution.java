package com.codex;

import java.util.*;

public class Solution {
    public static int minimumMoves(String s) {
        /** You are given a string s consisting of n characters which are either 'X' or 'O'.
         * A move is defined as selecting three consecutive characters of s and converting them to 'O'. Note that if a move is applied to the character 'O', it will stay the same.
         * Return the minimum number of moves required so that all the characters of s are converted to 'O'.
         */
        int[] dp = new int[s.length()];
        char[] sChar = s.toCharArray();
        if (sChar[0] == sChar[1] && sChar[1] == sChar[2]) {
            dp[0] = sChar[0] == 'X'? 0 : 1;
        }
        else if (sChar[0] == sChar[1] && sChar[1] != sChar[2]) {
            dp[0] = sChar[0] == 'X'? 1 : 0;
        } else {
            dp[0] = 0;
        }
        dp[1] = dp[0];
        for (int i = 2; i < sChar.length; i++) {
            if (sChar[i] == sChar[i-1] && sChar[i-1] == sChar[i-2]) {
                dp[i] = sChar[i] == 'X'? 0 : 1;
            } else if (sChar[i] == sChar[i-1] && sChar[i-1] != sChar[i-2]) {
                dp[i] = sChar[i] == 'X'? 1 : 0;
            } else {
                dp[i] = 0;
            }
            dp[i] += dp[i-1];
        }
        return dp[dp.length-1];
    }

    }
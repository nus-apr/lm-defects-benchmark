package com.codex;

import java.util.*;

public class Solution {
    public static int minimumMoves(String s) {
        /** You are given a string s consisting of n characters which are either 'X' or 'O'.
         * A move is defined as selecting three consecutive characters of s and converting them to 'O'. Note that if a move is applied to the character 'O', it will stay the same.
         * Return the minimum number of moves required so that all the characters of s are converted to 'O'.
         */
        if (s.length() < 3) return 0;
        int count = 0;
        for (int i = 2; i < s.length(); i++) {
            if (s.charAt(i) == 'X' && s.charAt(i - 1) == 'X' && s.charAt(i - 2) == 'X') {
                count++;
                i += 2;
            }
        }
        return count;
    }

    }
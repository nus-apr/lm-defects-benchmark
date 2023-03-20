package com.codex;

import java.util.*;

public class Solution {
    public static long countVowels(String word) {
        /** Given a string word, return the sum of the number of vowels ('a', 'e', 'i', 'o', and 'u') in every substring of word.
         * A substring is a contiguous (non-empty) sequence of characters within a string.
         * Note: Due to the large constraints, the answer may not fit in a signed 32-bit integer. Please be careful during the calculations.
         */

        long count = 0;
        int cnt, len = word.length();
        char c;
        for (int i = 0; i < len; i++) {
            c = word.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                cnt = 1;
                for (int j = i + 1; j < len; j++) {
                    if (word.charAt(j) == c)
                        cnt++;
                    count += cnt;
                }
            }
        }
        return count;
    }

    }
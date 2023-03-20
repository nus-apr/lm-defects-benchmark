package com.codex;

import java.util.*;

public class Solution {
    public static int minOperations(int[][] grid, int x) {
        /** You are given a 2D integer grid of size m x n and an integer x. In one operation, you can add x to or subtract x from any element in the grid.
         * A uni-value grid is a grid where all the elements of it are equal.
         * Return the minimum number of operations to make the grid uni-value. If it is not possible, return -1.
         */

        int N = grid.length;
        int M = grid[0].length;
        int[][] dp = new int[N][M];
        for (int[] arr : dp){
            Arrays.fill(arr, -1);
        }
        dp[0][0] = 0;
        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                if (dp[i][j] == -1){
                    continue;
                }
                int target = grid[i][j];
                if (i != 0){
                    if (dp[i - 1][j] != -1){
                        if (grid[i - 1][j] > target){
                            if ((grid[i - 1][j] - target) % x == 0){
                                dp[i][j] = Math.max(dp[i][j], dp[i - 1][j] + (grid[i - 1][j] - target) / x);
                            }
                        }else if (grid[i - 1][j] < target){
                            if ((target - grid[i - 1][j]) % x == 0){
                                dp[i][j] = Math.max(dp[i][j], dp[i - 1][j] + (target - grid[i - 1][j]) / x);
                            }
                        }else{
                            dp[i][j] = Math.max(dp[i][j], dp[i - 1][j]);
                        }
                    }
                }
                if (j != 0){
                    if (dp[i][j - 1] != -1){
                        if (grid[i][j - 1] > target){
                            if ((grid[i][j - 1] - target) % x == 0){
                                dp[i][j] = Math.max(dp[i][j], dp[i][j - 1] + (grid[i][j - 1] - target) / x);
                            }
                        }else if (grid[i][j - 1] < target){
                            if ((target - grid[i][j - 1]) % x == 0){
                                dp[i][j] = Math.max(dp[i][j], dp[i][j - 1] + (target - grid[i][j - 1]) / x);
                            }
                        }else{
                            dp[i][j] = Math.max(dp[i][j], dp[i][j - 1]);
                        }
                    }
                }
            }
        }
        return (dp[N - 1][M - 1] == -1) ? -1 : dp[N - 1][M - 1];
    }

    }
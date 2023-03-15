package com.codex;

import java.util.*;

public class Solution {
    public static List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        /** You have information about n different recipes. You are given a string array recipes and a 2D string array ingredients. The ith recipe has the name recipes[i], and you can create it if you have all the needed ingredients from ingredients[i]. Ingredients to a recipe may need to be created from other recipes, i.e., ingredients[i] may contain a string that is in recipes.
         * You are also given a string array supplies containing all the ingredients that you initially have, and you have an infinite supply of all of them.
         * Return a list of all the recipes that you can create. You may return the answer in any order.
         * Note that two recipes may contain each other in their ingredients.
         */

        List<String> res = new ArrayList<>();
        Map<String, Integer> suppliesMap = new HashMap<>();
        for (String supply : supplies){
            suppliesMap.put(supply, 1);
        }

        for (int i = 0; i < recipes.length; i++){
            String recipe = recipes[i];
            boolean canMake = true;
            for (String ingredient : ingredients.get(i)){
                if (!suppliesMap.containsKey(ingredient)){
                    canMake = false;
                }
            }
            if (canMake){
                res.add(recipe);
                for (String ingredient : ingredients.get(i)){
                    suppliesMap.put(ingredient, 1);
                }
            }
        }

        return res;
    }

    }
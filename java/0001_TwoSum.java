// https://leetcode.com/problems/two-sum/

package io.github.dmaccormac;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int[] twoSum(int[] numbers, int target) {

        // Approach #1: Two pass hashmap. Time complexity O(2n)
        // Map<Integer, Integer> map = new HashMap<>();

        // // populate hashmap
        // for (int i = 0; i < numbers.length; i++)
        // map.put(numbers[i], i);

        // // check if diff exists in hashmap
        // for (int i = 0; i < numbers.length; i++) {
        // int diff = target - numbers[i];
        // if (map.containsKey(diff) && map.get(diff) != i)
        // return new int[] { i, map.get(diff) };
        // }

        // return new int[] {}; // no solution

        // Approach #2: Single hashmap. Time complexity O(n)
        Map<Integer, Integer> map = new HashMap<>();

        // check if diff exists in hashmap.
        // if yes, return solution. otherwise, add num + index to hashmap
        for (int i = 0; i < numbers.length; i++) {
            int diff = target - numbers[i];
            if (map.containsKey(diff))
                return new int[] { map.get(diff), i };
            map.put(numbers[i], i);
        }
        return new int[] {}; // no solution

    }
}
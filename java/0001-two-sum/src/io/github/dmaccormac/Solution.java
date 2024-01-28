package io.github.dmaccormac;

import java.util.HashMap;
import java.util.Map;

class Solution {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        // approach - hashmap and calculate difference

        // loop over each number in array and store number/index in hashmap
        // for each num, the other value we're looking for is: target - current number
        // if we have that other value in the hasmap, then we have found the two numbers
        // so return index of current number and the index of other num from hashmap

        // time complexity: O(n)
        // space complexity: O(n)

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff))
                return new int[] { map.get(diff), i };
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}
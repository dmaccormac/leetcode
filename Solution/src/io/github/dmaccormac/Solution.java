package io.github.dmaccormac;

class Solution {

    public int majorityElement(int[] nums) {

        // Approach #1: Sorting and linear traverse
        // Time complexity O(n log(n))

        // Arrays.sort(nums);
        // var majority = nums.length / 2;

        // int count = 0;
        // int candidate = 0;
        // for (int i = 0; i < nums.length; i++) {
        // if (nums[i] != candidate) {
        // candidate = nums[i];
        // count = 0;
        // }
        // count++;

        // if (count > majority)
        // return candidate;

        // }
        // throw new IllegalStateException("Majority element not found");

        // Approach #2: Moore's voting algorithm
        // Time complexity: O(n)

        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0)
                candidate = num;

            if (num == candidate)
                count++;
            else
                count--;
        }

        return candidate;
    }

}
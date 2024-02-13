package io.github.dmaccormac;

class Solution {

    public int majorityElement(int[] nums) {

        // Approach #1: Moore's voting algorithm

        // Start with a count of 0 and no candidate number.
        // Go through each number one by one
        // If the count is 0, make the current number the candidate
        // If the current number is the same as the candidate, increase the count
        // If the current number is different from the candidate, decrease the count
        // After checking all nums, candidate will be the one that appears most often

        // Time: O(n)
        // Space O(1)

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

        // Approach #2: Sorting

        // Define the majority as half the size of the array
        // Iterate over each element in array, incrementing count
        // Reset the count if we encounter a new candidate
        // If count is greater than majority, return candiate

        // Time: O(n log(n))
        // Space: O(n)

        // Arrays.sort(nums);
        // var majority = nums.length / 2;
        //
        // int count = 0;
        // int candidate = 0;
        // for (int i = 0; i < nums.length; i++) {
        // if (nums[i] != candidate) {
        // candidate = nums[i];
        // count = 0;
        // }
        // count++;
        //
        // if (count > majority)
        // return candidate;
        //
        // }
        // return candidate;
    }

}

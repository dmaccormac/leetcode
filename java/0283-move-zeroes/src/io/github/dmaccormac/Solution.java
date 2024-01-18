package io.github.dmaccormac;

import java.util.Arrays;

// slow and fast pointer approach:

// iterate through array using fast pointer.
// if the current element is non zero, copy it to the slow pointer index and increment the slow pointer.
// set all elements from slow pointer index to end of array equal to zero.

// Time complexity: O(n)

class Solution {

    public void moveZeroes(int[] nums) {

        int j = 0;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] != 0)
                nums[j++] = nums[i];

        for (int i = j; i < nums.length; i++)
            nums[i] = 0;

        System.out.println(Arrays.toString(nums));

    }
}

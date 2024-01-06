// https://leetcode.com/problems/move-zeroes/

package io.github.dmaccormac;

import java.util.Arrays;

class Solution {

    public void moveZeroes(int[] nums) {

        int curr = 0;

        for (int i = 0; i < nums.length; i++)
            if (nums[i] != 0)
                nums[curr++] = nums[i];

        for (int i = curr; i < nums.length; i++)
            nums[i] = 0;

        System.out.println(Arrays.toString(nums));

    }
}

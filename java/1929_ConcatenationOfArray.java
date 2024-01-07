// https://leetcode.com/problems/concatenation-of-array/
package io.github.dmaccormac;

class Solution {
    public int[] getConcatenation(int[] nums) {

        int iter = 2;
        int curr = 0;
        int[] ans = new int[nums.length * iter];

        for (int i = 0; i < iter; i++)
            for (int j = 0; j < nums.length; j++)
                ans[curr++] = nums[j];

        return ans;

    }
}

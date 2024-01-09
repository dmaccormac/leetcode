package io.github.dmaccormac;

import java.util.Arrays;

public class Main {

    public static void main(String args[]) {

        Solution solution = new Solution();

        int[] nums = new int[] { 2, 7, 11, 15 };
        var result = solution.twoSum(nums, 9);
        System.out.println(Arrays.toString(result));

        nums = new int[] { 3, 2, 4 };
        result = solution.twoSum(nums, 6);
        System.out.println(Arrays.toString(result));

        nums = new int[] { 3, 3 };
        result = solution.twoSum(nums, 6);
        System.out.println(Arrays.toString(result));

    }

}

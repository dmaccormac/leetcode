package io.github.dmaccormac;

import java.util.Arrays;

public class Main {

    public static void main(String args[]) {

        var nums = new int[] { 0, 1, 0, 3, 12 };

        System.out.println(Arrays.toString(nums));

        Solution solution = new Solution();
        solution.moveZeroes(nums);

    }

}

package io.github.dmaccormac;

import java.util.Arrays;

public class Main {

    public static void main(String args[]) {

        int[] nums = new int[] { 1, 2, 1 };

        Solution solution = new Solution();
        var ans = solution.getConcatenation(nums);
        System.out.println(Arrays.toString(ans));

    }

}

package io.github.dmaccormac;

public class Main {

    public static void main(String args[]) {

        Solution s = new Solution();

        int[] nums = new int[] { 3, 2, 3 };
        System.out.println(s.majorityElement(nums));

        nums = new int[] { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(s.majorityElement(nums));

    }

}

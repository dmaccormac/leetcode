package io.github.dmaccormac;

public class Main {

    public static void main(String args[]) {

        Arrays arr = new Arrays();
        int[] nums = { 1, 2, 3, 4, 5 };
        System.out.println(arr.ContainsDuplicate(nums));
        nums = new int[] { 1, 2, 3, 4, 5, 5 };
        System.out.println(arr.ContainsDuplicate(nums));
    }

}

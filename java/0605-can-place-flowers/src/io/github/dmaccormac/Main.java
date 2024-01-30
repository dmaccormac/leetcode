package io.github.dmaccormac;

public class Main {

    public static void main(String args[]) {

        Solution solution = new Solution();

        int[] flowerbed = { 1, 0, 0, 0, 1 };
        var result = solution.canPlaceFlowers(flowerbed, 1);
        System.out.println(result);

        flowerbed = new int[] { 1, 0, 0, 0, 1 };
        result = solution.canPlaceFlowers(flowerbed, 2);
        System.out.println(result);

        flowerbed = new int[] { 0, 0, 1, 0, 1 }; // edge case
        result = solution.canPlaceFlowers(flowerbed, 1);
        System.out.println(result);

    }

}

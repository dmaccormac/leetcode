package io.github.dmaccormac;

// approach: single pass on array

// we need to check the current element, and it's left and right neighbors for all zeroes
// in that case, we insert 1 at curent element and decrement n
// the tricky part is the edge cases -- checking the neighbors of the fist and last array items
// to address this we can assume neighbors of first and last are equal to zero
// if n reaches zero, all items have been placed so we return true

// time: O(n)
// space: O(1)

class Solution {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        for (int i = 0; i < flowerbed.length; i++) {
            int left = (i == 0) ? 0 : flowerbed[i - 1];
            int right = (i == flowerbed.length - 1) ? 0 : flowerbed[i + 1];

            if (flowerbed[i] == 0 && (left == 0 && right == 0)) {
                flowerbed[i] = 1;
                n--;
                if (n == 0)
                    return true;
            }

        }
        return false;
    }

}
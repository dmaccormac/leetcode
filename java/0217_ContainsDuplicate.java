// https://leetcode.com/problems/contains-duplicate/

package io.github.dmaccormac;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public boolean ContainsDuplicate(int[] items) {

        // Approach #1: Hashset. Time complexity O(n)
        Set<Integer> set = new HashSet<>();
        for (int i : items) {
            if (set.contains(i))
                return true;

            set.add(i);

        }

        return false;
    }

}

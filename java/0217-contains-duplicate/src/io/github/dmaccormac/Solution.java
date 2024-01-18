package io.github.dmaccormac;

import java.util.HashSet;
import java.util.Set;

// Create a HashSet
// Add each number to the set
// When adding each number, check if it already exists in the set
// If number exists in the set then we have a duplicate, so return true
// Otherwise there are no duplicates, so return false

// Time complexity: O(n)

public class Solution {

    public boolean ContainsDuplicate(int[] items) {

        Set<Integer> set = new HashSet<>();
        for (int i : items) {
            if (set.contains(i))
                return true;

            set.add(i);

        }

        return false;
    }

}

// https://leetcode.com/problems/contains-duplicate/

package io.github.dmaccormac;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    Set<Integer> set = new HashSet<>();

    public boolean ContainsDuplicate(int[] items) {
        set.clear();
        for (int i : items) {
            if (set.contains(i))
                return true;

            set.add(i);

        }

        return false;
    }

}

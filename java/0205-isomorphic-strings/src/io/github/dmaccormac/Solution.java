package io.github.dmaccormac;

import java.util.HashMap;
import java.util.Map;

// HashsMap solution

// Create HashMap for each word
// Count character frequency in each word and store in corresponding HashMap
// At each iteration, compare current value (char count) in both HashMaps
// Return false if char count is not equal, otherwise return true

// Time complexity: O(n)

class Solution {

    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length())
            return false;

        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (sMap.get(s.charAt(i)) != tMap.get(t.charAt(i)))
                return false;

            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);

        }

        return true;
    }

}
package io.github.dmaccormac;

import java.util.HashMap;
import java.util.Map;

// Approach: 2 HashMaps

// Count character frequency in each word and store in corresponding HashMaps.
// Then for each key in both maps, compare values:
// If all values are equal it means the words are isomorphic.

// example true
// egg  ... add
// [e :1] ... [a: 1]
// [g: 2] ... [d: 2]

// example false
// ege  ... add
// [e: 2] ... [a: 1]
// [g: 1] ... [d: 2]

// Time complexity: O(n)

class Solution {

    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length())
            return false;

        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);

        }

        for (int i = 0; i < s.length(); i++)
            if (sMap.get(s.charAt(i)) != tMap.get(t.charAt(i)))
                return false;

        return true;
    }

}
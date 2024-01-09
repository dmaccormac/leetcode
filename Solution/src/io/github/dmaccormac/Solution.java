package io.github.dmaccormac;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length())
            return false;

        // Approach #1: Sorting. Time complexity: O(n log n)
        // char[] sChars = s.toCharArray();
        // char[] tChars = t.toCharArray();

        // Arrays.sort(sChars);
        // Arrays.sort(tChars);

        // return (Arrays.equals(sChars, tChars));

        // Appraoch #2 - Hashmaps. Time complexity O(n)
        // Map<Character, Integer> sMap = new HashMap<>();
        // Map<Character, Integer> tMap = new HashMap<>();

        // for (char ch : s.toCharArray()) {
        // var count = (sMap.getOrDefault(ch, 0) + 1);
        // sMap.put(ch, count);

        // }
        // for (char ch : t.toCharArray()) {
        // var count = (tMap.getOrDefault(ch, 0) + 1);
        // tMap.put(ch, count);

        // }

        // return sMap.equals(tMap);

        // Approach #3: Single hashmap. Time complexity O(n)
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray())
            map.put(ch, map.getOrDefault(ch, 0) + 1);

        for (char ch : t.toCharArray())
            map.put(ch, map.getOrDefault(ch, 0) - 1);

        for (var item : map.entrySet())
            if (item.getValue() != 0)
                return false;

        return true;

    }
}

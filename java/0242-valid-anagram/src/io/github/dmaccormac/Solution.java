package io.github.dmaccormac;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length())
            return false;

        // Approach #1: Hashmap to count frequency of characters in both words.
        // Loop over the first string, incrementing values for each char occurence.
        // Loop over the second string, decrementing values for each char occurence.
        // If both words have same freq of chars, all hashmap values will be zero
        // time: O(n)
        // space: O(n)

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray())
            map.put(ch, map.getOrDefault(ch, 0) + 1);

        for (char ch : t.toCharArray())
            map.put(ch, map.getOrDefault(ch, 0) - 1);

        for (var item : map.entrySet())
            if (item.getValue() != 0)
                return false;

        return true;

        // Approach #2: Sorting
        // we can easily determine if words are anagrams by comparing sorted string
        // this approach has overhead of time/space complexity of sorting algorithm
        // time: O(n log n)
        // space O(n)

        // char[] sChars = s.toCharArray();
        // char[] tChars = t.toCharArray();

        // Arrays.sort(sChars);
        // Arrays.sort(tChars);

        // return (Arrays.equals(sChars, tChars));

    }
}

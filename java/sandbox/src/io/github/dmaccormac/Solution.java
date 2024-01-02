// https://leetcode.com/problems/valid-anagram/

package io.github.dmaccormac;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length())
            return false;

        // approach 1 - sorting
        // char[] sChars = s.toCharArray();
        // char[] tChars = t.toCharArray();

        // Arrays.sort(sChars);
        // Arrays.sort(tChars);

        // return (Arrays.equals(sChars, tChars));

        // appraoch 2 - hashmaps
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for (char ch : s.toCharArray()) {
            var count = (sMap.containsKey(ch)) ? sMap.get(ch) + 1 : 1;
            sMap.put(ch, count);

        }
        for (char ch : t.toCharArray()) {
            var count = (tMap.containsKey(ch)) ? tMap.get(ch) + 1 : 1;
            tMap.put(ch, count);

        }

        return sMap.equals(tMap);

    }
}

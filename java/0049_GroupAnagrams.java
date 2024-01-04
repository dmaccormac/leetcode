// https://leetcode.com/problems/group-anagrams/

package io.github.dmaccormac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {

        // Approach #1: Sort words and store in hashmap.
        // Time complexity m*(n log n) m = strs len / n = avg. str. len
        // Map<String, ArrayList<String>> map = new HashMap<>();

        // for (var word : strs) {
        // var chars = word.toCharArray();
        // Arrays.sort(chars);
        // var sortedWord = new String(chars);

        // map.putIfAbsent(sortedWord, new ArrayList<String>());
        // map.get(sortedWord).add(word);

        // }

        // return new ArrayList<>(map.values());

        // Approach #2: Count chars + hash map.
        // Time complexity O(m*n)
        Map<Integer, List<String>> map = new HashMap<>();

        for (var word : strs) {
            // map frequency of chars in each word to int array
            // example, "acdc" -> [1, 0, 2, 1, 0, 0, ... 0] //length 26
            int[] count = new int[26];
            for (char ch : word.toCharArray())
                count[ch - 'a'] += 1;

            // hash the count array and use as key
            var key = Arrays.toString(count).hashCode();
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(word);
        }

        return new ArrayList<>(map.values());
    }

}

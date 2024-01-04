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
        // Time complexity n*(Klogk) where k is average length of string
        Map<String, ArrayList<String>> map = new HashMap<>();

        for (var word : strs) {
            var chars = word.toCharArray();
            Arrays.sort(chars);
            var sortedWord = new String(chars);

            map.putIfAbsent(sortedWord, new ArrayList<String>());
            map.get(sortedWord).add(word);

        }

        return new ArrayList<>(map.values());
    }

}

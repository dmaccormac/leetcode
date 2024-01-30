package io.github.dmaccormac;

class Solution {

    public boolean isSubsequence(String s, String t) {

        // approach: two pointer loop

        // loop to compare corresponding characters in each string
        // if we have a match, move first and second pointer
        // if we don't have a match, move only second pointer
        // if first pointer equals length of first string, we found all values
        // otherwise values were missing or not in correct order

        // time: O(n)
        // space: O(n)

        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j))
                i++;

            j++;
        }

        return (i == s.length());

    }

}
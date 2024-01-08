// https://leetcode.com/problems/length-of-last-word/
package io.github.dmaccormac;

class Solution {
    public int lengthOfLastWord(String s) {

        // Approach #1: Traverse string from end
        // Increment count for each non whitespace we hit
        // When we hit the next whitespace, return the count
        // Time complexity: O(n)
        int count = 0;
        for (int i = s.length() - 1; i > 0; i--) {
            if (!(s.charAt(i) == ' '))
                count++;

            if ((s.charAt(i) == ' ') && (count > 0))
                return count;

        }

        return count;

    }
}
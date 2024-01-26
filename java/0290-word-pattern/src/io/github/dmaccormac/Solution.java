package io.github.dmaccormac;

import java.util.HashMap;

// Two hashmap soution

// create two hashmaps - charToWord and wordToChar
// loop over pattern string, populating hashmaps:
// current char of pattern --> current word of s
// current word of s --> current char of pattern 
// at each iteration, check both hashmaps for non matching key/value
// return false if we find non matching value

// time complexity: O(n+m)
// space complexity: O(n+m)

class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");
        if (words.length != pattern.length())
            return false;

        HashMap<Character, String> charToWord = new HashMap<>();
        HashMap<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {

            if (charToWord.containsKey(pattern.charAt(i)) && !charToWord.get(pattern.charAt(i)).equals(words[i]))
                return false;

            if (wordToChar.containsKey(words[i]) && !wordToChar.get(words[i]).equals(pattern.charAt(i)))
                return false;

            charToWord.put(pattern.charAt(i), words[i]);
            wordToChar.put(words[i], pattern.charAt(i));
        }

        return true;

    }
}
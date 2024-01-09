package io.github.dmaccormac;

public class Main {

    public static void main(String args[]) {

        Solution solution = new Solution();

        String s = "anagram", t = "nagaram";
        System.out.println(solution.isAnagram(s, t));

        s = "rat";
        t = "car";
        System.out.println(solution.isAnagram(s, t));

    }

}

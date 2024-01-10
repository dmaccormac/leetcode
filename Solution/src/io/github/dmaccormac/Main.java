package io.github.dmaccormac;

public class Main {

    public static void main(String args[]) {

        Solution s = new Solution();

        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
        System.out.println(s.groupAnagrams(strs));

        strs = new String[] { "" };
        System.out.println(s.groupAnagrams(strs));

        strs = new String[] { "a" };
        System.out.println(s.groupAnagrams(strs));

    }

}

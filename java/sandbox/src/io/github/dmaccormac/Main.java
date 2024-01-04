package io.github.dmaccormac;

public class Main {

    public static void main(String args[]) {

        Solution solution = new Solution();
        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
        var result = solution.groupAnagrams(strs);
        System.out.println(result);

    }

}

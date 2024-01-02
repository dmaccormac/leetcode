package io.github.dmaccormac;

public class Main {

    public static void main(String args[]) {

        Solution solution = new Solution();
        String s = "moon";
        String t = "mono";

        System.out.println(solution.isAnagram(s, t));

        t += "x";
        System.out.println(solution.isAnagram(s, t));

    }

}

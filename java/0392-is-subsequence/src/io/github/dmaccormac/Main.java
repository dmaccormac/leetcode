package io.github.dmaccormac;

public class Main {

    public static void main(String args[]) {

        Solution solution = new Solution();

        var s = "abc";
        var t = "ahbgdc";
        var result = solution.isSubsequence(s, t);
        System.out.println(result);

        s = "aec";
        t = "abcde";
        result = solution.isSubsequence(s, t);
        System.out.println(result);

    }

}

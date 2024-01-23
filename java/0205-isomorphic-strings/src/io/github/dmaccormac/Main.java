package io.github.dmaccormac;

public class Main {

    public static void main(String args[]) {

        Solution solution = new Solution();

        // true
        var s = "add";
        var t = "egg";
        System.out.println(solution.isIsomorphic(s, t));

        // false
        s = "foo";
        t = "bar";
        System.out.println(solution.isIsomorphic(s, t));

        // true
        s = "paper";
        t = "title";
        System.out.println(solution.isIsomorphic(s, t));

    }

}

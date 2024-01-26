package io.github.dmaccormac;

public class Main {

    public static void main(String args[]) {

        Solution solution = new Solution();

        var pattern = "abba";
        var s = "dog cat cat dog";
        System.out.println(solution.wordPattern(pattern, s));

        s = "dog cat cat fish";
        System.out.println(solution.wordPattern(pattern, s));

        pattern = "aaaa";
        s = "dog cat cat dog";
        System.out.println(solution.wordPattern(pattern, s));

    }

}

package io.github.dmaccormac;

public class Main {

    public static void main(String args[]) {

        Solution solution = new Solution();

        String s = "Hello World";
        System.out.println(solution.lengthOfLastWord(s));

        s = " fly me to the moon ";
        System.out.println(solution.lengthOfLastWord(s));

        s = "luffy is still joyboy";
        System.out.println(solution.lengthOfLastWord(s));

    }

}

package io.github.dmaccormac;

public class Main {

    public static void main(String args[]) {

        Solution solution = new Solution();

        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);

        head.next = second;
        second.next = third;
        third.next = null;

        solution.print(head);
        head = solution.reverseList(head);
        solution.print(head);
    }

}

package io.github.dmaccormac;

public class Main {

    public static void main(String args[]) {

        ListNode head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);

        head.next = second;
        second.next = third;
        third.next = null;

        Solution solution = new Solution();
        head = solution.reverseList(head);
        System.out.println("breakpoint");
    }

}

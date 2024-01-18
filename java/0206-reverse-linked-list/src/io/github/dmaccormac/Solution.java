package io.github.dmaccormac;

import java.util.ArrayList;

// iterative approach
// iterate list, point curr.next to prev node at each iteration
// important: keep a copy of curr.next before updating it

// time complexity: O(n)

class Solution {

    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }

        head = prev;

        return head;
    }

    public void print(ListNode head) {

        var curr = head;
        var tmp = new ArrayList<>();

        while (curr != null) {
            tmp.add(curr.val);
            curr = curr.next;
        }

        System.out.println(tmp);
    }
}

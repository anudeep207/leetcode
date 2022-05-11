/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head != null && head.next != null) {
            ListNode fast = head;
            ListNode temp = head;
            ListNode slow = head;
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
                if (slow == fast) {
                    while (slow != temp) {
                        slow = slow.next;
                        temp = temp.next;
                    }
                    return slow;
                }
            }
        }
        return null;
    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = new ListNode();
        ListNode fast = new ListNode();
        slow = head;
        fast = head;
        
        Stack<Integer> s = new Stack<>();
        while (null != fast && null != fast.next) {
            s.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }
        if (null != fast) {
            slow = slow.next;
        }
        while (null != slow) {
            if (s.peek() != slow.val) {
                return false;
            }
            s.pop();
            slow = slow.next;
        }
        return true;
    }
}
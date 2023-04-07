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
    public ListNode insertionSortList(ListNode head) {
        ListNode cur = head;
        ListNode dummy = new ListNode(0), p;
        while (cur != null) {
            //locate the insertion position.
            p = dummy;
            while (p.next != null &&  cur.val > p.next.val) {
                p = p.next;
            }
            //insert between p and p.next.
            ListNode pNext = p.next;
            p.next = cur;
            ListNode next = cur.next;
            cur.next = pNext;
            cur = next;
        }
        return dummy.next;
    }
}
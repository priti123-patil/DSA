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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode p = get(head,k);
        int n = getLength(head);
        ListNode q = get(head, (n-k+1));
        int value = p.val;
        p.val = q.val;
        q.val = value;
        return head;
    }
    private ListNode get(ListNode head, int i) {
        ListNode temp = head;
        while(i > 1) {
            temp = temp.next;
            i--;
        }
        return temp;
    }
    private int getLength(ListNode head) {
        ListNode temp = head;
        int cnt = 0;
        while(temp != null) {
            temp = temp.next;
            cnt++;
        }
        return cnt;
    }
}
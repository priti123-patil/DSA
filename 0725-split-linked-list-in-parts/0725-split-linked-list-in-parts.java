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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int len = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        int partsize = len / k, part1size = len % k;
        ListNode[] ans = new ListNode[k];
        temp = head;
        int cnt = 0;
        for (int i = 0; i < k; ++i) {
            ListNode headp = new ListNode(0), write = headp;
            for (int j = 0; j < partsize + (i < part1size ? 1 : 0); ++j) {
                write = write.next = new ListNode(temp.val);
                if (temp != null) temp = temp.next;
            }
            ans[i] = headp.next;
        }
        return ans;
    }
}
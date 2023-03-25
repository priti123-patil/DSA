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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode temp = head;
        ListNode p = null;
        do{
            p = temp.next;
            if(p.val == temp.val){
                temp.next = p.next;
                p = p.next;
            }
            else{
                temp = temp.next;
            }
        }while(temp.next != null);
        return head;
    }
}
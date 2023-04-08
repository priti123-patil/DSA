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
    
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null) return null;
        ListNode head = null;
        for(ListNode list : lists){
            head = mergeTwoLists(list,head);
        }
        return head;
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //optimal approach
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        if(l1.val > l2.val){
            ListNode temp = l1;
            l1 = l2;
            l2 = temp;
        }
        ListNode res = l1;
        while(l1 != null && l2 != null){
            ListNode temp = l1;
            while(l1 != null && l1.val <= l2.val){
                temp = l1;
                l1 = l1.next;
            }
            temp.next = l2;
            ListNode temp2 = l1; //Swapping
            l1 = l2;
            l2 = temp2;
        }
        return res;
    }
}
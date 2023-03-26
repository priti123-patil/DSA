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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right)
            return head;
        ListNode curr = head, prev = null , next = null , first = null, newEnd = null;
        //Skip left-1 nodes which doesnt need to reverse
        for(int i = 0;i < left-1 ; i++){
            prev = curr;
            curr = curr.next;
        }
        first = prev;
        newEnd = curr;
        //Now reverse the sublist
        for(int i= 0;curr != null && i<(right-left+1); i++){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        newEnd.next = curr;
        if(first != null){
            first.next = prev;
        }
        else{
            head = prev;
        }
        return head;
    }
}
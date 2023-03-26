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
        ListNode slow = head,fast=head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode mid = slow;
        ListNode headSecond = reverse(mid);
        while(head != null && headSecond != null){
            if(head.val != headSecond.val){
                return false;
            }
            head = head.next;
            headSecond = headSecond.next;
        }
        return true;
    }
    public ListNode reverse(ListNode head){
        ListNode prev = null, next = null, curr = head;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
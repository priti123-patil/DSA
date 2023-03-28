/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp = headA, temp2 = null;
        if(headA == headB)
            return headA;
        while(temp != null){
            temp2 = headB;
            while(temp2 != null){
                if(temp == temp2)
                    return temp;
                temp2 = temp2.next;
            }
            temp = temp.next;
        }
        return null;
    }
}
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
    public int lengthCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                // calculate the length
                ListNode temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                return length;
            }
        }
        return 0;
    }
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        int length = 0;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                //Step 1 - Detect length of cyle
                length = lengthCycle(slow);
                break;
            }
        }
        if(length == 0){
            return null;
        }
        //Step 2 - Move second length times from head
        ListNode first = head, second = head;
        while(length > 0){
            second = second.next;
            length--;
        }
        //Step 3 - Move first & second k=l-(l-k) times
        while(first != second){
            first = first.next;
            second = second.next;
        }
        return first;
    }
}
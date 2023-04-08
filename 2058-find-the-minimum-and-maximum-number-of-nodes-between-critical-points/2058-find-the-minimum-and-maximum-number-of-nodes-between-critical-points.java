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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] res = new int[]{-1,-1};
        if(head == null || head.next == null || head.next.next == null) 
            return res;
        int minind = Integer.MAX_VALUE, curridx = -1, lastidx = -1;
        ListNode prev = head, ptr = head.next;
        int idx = 1, minD = Integer.MAX_VALUE;
        while(ptr != null && ptr.next != null)
        {
            if((ptr.val > prev.val && ptr.val > ptr.next.val) ||(ptr.val < prev.val&& ptr.val < ptr.next.val)){
                if(idx < minind) 
                    minind = idx;
                lastidx = curridx;
                curridx = idx;
                if(lastidx != -1 && curridx - lastidx < minD) 
                    minD = curridx-lastidx;
            }
            prev = ptr;
            ptr = ptr.next;
            idx++;
        }
        if(lastidx == -1) 
            return res;
        else{
            res[0] = minD;
            res[1] = curridx - minind;
        }
        return res;
    }
}
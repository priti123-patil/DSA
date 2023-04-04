/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {     
        Node curr = head;
        recur(curr);
        return head;
    }
    
   public Node recur(Node node) {
        Node prev = node;
        while(node != null) {
            prev = node;
            
            // continue until you Come to the node which has a child.
            if (node.child == null) {
                node = node.next;
                continue;
            }
            
            // At this point, the current node has a child.
            Node next = node.next; // Save the next node, will be used, when we backtrack.
            node.next = node.child; // Point the current node's next pointer to child node.
            node.child.prev = node; // Update the prev pointer of child node.

            // Recurse over the child node.
            Node ret = recur(node.child);
            node.child = null;

            if (next != null) {
                ret.next = next;
                next.prev = ret;
                node = next;
            } else {
                node = ret;
            }
        }
        return prev;
    }
}
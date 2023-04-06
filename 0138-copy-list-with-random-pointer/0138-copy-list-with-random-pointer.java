/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    private HashMap<Node,Node> mp = new HashMap<>();
    public Node copyRandomList(Node head) {   
        if(head == null)
            return null;
        if(mp.containsKey(head)){
            return mp.get(head);
        }
        Node newhead = new Node(head.val);
        mp.put(head,newhead);
        newhead.next = copyRandomList(head.next);
        newhead.random = copyRandomList(head.random);
        return newhead;
    }
}
class Node {
    Node next, prev;
    String val;
    Node(String s){
        val = s;
    }
}
class BrowserHistory {
    Node curr;
    public BrowserHistory(String homepage) {
        curr = new Node(homepage); 
    }
    public void visit(String url) {
        curr.next = null;
        Node node = new Node(url);
        curr.next = node;
        node.prev = curr;
        curr = node;
    }
    public String back(int steps) {
        while(steps > 0 && curr.prev != null){
            curr = curr.prev;
            steps--;
        }
        return curr.val;
    }
    public String forward(int steps) {
        while(steps > 0 && curr.next != null){
            curr = curr.next;
            steps--;
        }
        return curr.val;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
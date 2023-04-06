class LFUCache {
    final int capacity;
    int curSize;
    int minFreq;
    Map<Integer, DLLNode> cache = new HashMap<>();
    Map<Integer, DoubleLinkedList> freqMap = new HashMap<>();
    
    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.curSize = 0;
        this.minFreq = 0;
    }
    
    public int get(int key) {
        DLLNode node =  cache.get(key);
        if(node == null){
            return -1;
        }
        update(node);
        return node.val;
    }
    
    public void put(int key, int value) {
        if(capacity == 0){
            return;
        }
        if(cache.containsKey(key)){
            DLLNode node = cache.get(key);
            node.val = value;
            update(node);
        }
        else{
            curSize++;
            if(curSize > capacity){
                DoubleLinkedList minFreqList = freqMap.get(minFreq);
                cache.remove(minFreqList.tail.prev.key);
                minFreqList.removeNode(minFreqList.tail.prev);
                curSize--;
            }
            minFreq = 1;
            DLLNode node = new DLLNode(key, value);
            DoubleLinkedList curList = freqMap.getOrDefault(1, new DoubleLinkedList());
            curList.addNode(node);
            freqMap.put(1, curList);
            cache.put(key, node);
        }
    }
    
    private void update(DLLNode curNode){
        int curFreq = curNode.frequency;
        DoubleLinkedList curList = freqMap.get(curFreq);
        curList.removeNode(curNode);
        if(curFreq == minFreq && curList.listSize == 0){
            minFreq++;
        }
        curNode.frequency++;
        DoubleLinkedList newList = freqMap.getOrDefault(curNode.frequency, new DoubleLinkedList());
        newList.addNode(curNode);
        freqMap.put(curNode.frequency, newList);
    }
    
    public class DLLNode{
        int key, val;
        int frequency;
        DLLNode prev;
        DLLNode next;
        public DLLNode(int _key, int _value){
            this.key = _key;
            this.val = _value;
            this.frequency = 1;
        }
    }
    
    public class DoubleLinkedList{
        int listSize;
        DLLNode head;
        DLLNode tail;
        public DoubleLinkedList(){
            this.listSize = 0;
            this.head = new DLLNode(0,0);
            this.tail = new DLLNode(0,0);
            head.next = tail;
            tail.prev = head;
        }
        public void addNode(DLLNode curNode){
            DLLNode nextNode = head.next;
            curNode.next = nextNode;
            curNode.prev = head;
            head.next = curNode;
            nextNode.prev = curNode;
            listSize++;
        }
        public void removeNode(DLLNode curNode){
            DLLNode prevNode = curNode.prev;
            DLLNode nextNode = curNode.next;
            prevNode.next = nextNode;
            nextNode.prev = prevNode;
            listSize--;
        }
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
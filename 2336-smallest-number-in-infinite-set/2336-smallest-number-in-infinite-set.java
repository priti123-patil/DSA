class SmallestInfiniteSet {

    private PriorityQueue<Integer> pq;

    public SmallestInfiniteSet() {
        pq = new PriorityQueue<>();
        for(int i = 0; i < 1000; i++){
            pq.add(i+1);
        }
    }
    
    public int popSmallest() {
        if(!pq.isEmpty()){
            return pq.remove();
        }
        return -1;
    }
    
    public void addBack(int num) {
        if(!pq.contains(num)){
            pq.add(num);
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int val : stones) pq.offer(val);
        
        while (!pq.isEmpty()) {
            if (pq.size() == 1) return pq.poll();
            
            int value1 = pq.poll();
            int value2 = pq.poll();
            
            if (value1 != value2) {
                pq.offer(value1 - value2);
            }
        }
        return 0;
    }
}
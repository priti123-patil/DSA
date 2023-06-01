class Solution {
    public int[] topKFrequent(int[] nums, int k) {
     Map<Integer, Integer> elemCountMap = new HashMap<>();
 
     for(int num : nums) {
        elemCountMap.put(num, elemCountMap.getOrDefault(num, 0) + 1);
     }
 
      //Create a priority queue (Min heap)
      PriorityQueue<Integer> pq = new PriorityQueue<Integer>((num1, num2) -> elemCountMap.get(num1) - elemCountMap.get(num2));
 
     for(int num : elemCountMap.keySet()) {
          pq.add(num);
 
          if (pq.size() > k) 
              pq.poll();    
     }
 
     int[] resultArr = new int[k];
 
     for(int i = k - 1; i >= 0; --i) 
         resultArr[i] = pq.poll();
 
     return resultArr;
    }
}
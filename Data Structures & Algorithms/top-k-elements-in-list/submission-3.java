class Solution {
    public int[] topKFrequent(int[] nums, int k) {
            Map<Integer, Integer> freq = new HashMap<>();
         for(int i = 0; i < nums.length; i++){
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
            
        }
           
        PriorityQueue<Integer> heap = new PriorityQueue<>(
        
            (a, b) -> freq.get(a) - freq.get(b)
        );
          

            for( int num : freq.keySet()){
                heap.offer(num);
                if(heap.size() > k){
                    heap.poll();
                }
            }


            int [] result = new int[k];
            for (int i = k - 1; i >= 0;  i--){
                result[i] = heap.poll();
            }

            return result;
    }
}

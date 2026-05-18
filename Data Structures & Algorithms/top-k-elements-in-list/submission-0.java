class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        List<Integer> keys = new ArrayList<>(count.keySet());
        Collections.sort(keys, (a, b)-> count.get(b) - count.get(a));

        int[] result = new int[k];
        for(int j = 0; j < k; j++){
            result[j] = keys.get(j);
        }

        return result;
    }
}

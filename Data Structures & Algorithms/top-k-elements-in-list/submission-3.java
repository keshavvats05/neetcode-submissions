
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        
        // Create a list of ArrayLists to use as buckets
        List<Integer>[] bucket = new ArrayList[nums.length + 1];
        for (int key : count.keySet()) {
            int freq = count.get(key);
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }
        
        int index = 0;
        int[] res = new int[k];
        // Iterate over the bucket array from the end to the beginning
        for (int i = nums.length; i >= 0; i--) {
            if (bucket[i] != null) {
                for (int j = 0; j < bucket[i].size(); j++) {
                    res[index++] = bucket[i].get(j);
                    if (index == k) {
                        return res;
                    }
                }
            }
        }
        
        return res; // Added a return statement to handle edge cases
    }
}

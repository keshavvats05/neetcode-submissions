class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mapIdx = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if (mapIdx.containsKey(target - nums[i])){
                return new int[]{mapIdx.get(target-nums[i]), i};
            }
            else{
                mapIdx.put(nums[i], i);
            }
        }
        return new int[0];
        
    }
}


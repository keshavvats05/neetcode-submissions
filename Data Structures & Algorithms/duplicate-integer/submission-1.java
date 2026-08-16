class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> countDict = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if (countDict.containsKey(nums[i])){
                return true;
            }
            else{
                countDict.put(nums[i],1);
            }
        }
        return false;
        
 
    }
}

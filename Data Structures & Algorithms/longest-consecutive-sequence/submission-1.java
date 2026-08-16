class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        int maxLen = 0;
        int len = 0;
        for (int num: nums){
            numsSet.add(num);
        }
        for (int num: numsSet){
            if (!numsSet.contains(num-1)){
                len = 0;
                while (numsSet.contains(num+len)){
                    len++;
                }
            }
            maxLen = Math.max(maxLen,len);
        }
        return maxLen;
    }
}

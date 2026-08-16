class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        freqSum = {}
        for idx,num in enumerate(nums):
            if ((target-num) in freqSum):
                return [freqSum[(target-num)],idx]
            else:
                freqSum[num] = idx
        
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        myDict ={}
        for idx, num in enumerate(nums):
            if target-num in myDict:
                return [myDict[target-num],idx]
            else:
                myDict[num]=idx
        
        
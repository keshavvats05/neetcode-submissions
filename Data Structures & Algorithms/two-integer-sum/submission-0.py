class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        mydict = {}
        for idx, num in enumerate(nums):
            if target - num in mydict:
                return mydict[target-num], idx
            else:
                mydict[num] = idx

        
class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        mydict = {}
        for num in nums:
            if num not in mydict:
                mydict[num] = 1
            else:
                mydict[num] += 1
        for i in mydict:
            if mydict[i] > 1:
                return True
        return False



         
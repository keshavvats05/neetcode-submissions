class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        myDict = {}
        for num in nums:
            if num in myDict:
                myDict[num] += 1
            else:
                myDict[num] = 1

        # Sort the dictionary by frequency and convert to a list of tuples
        sorted_dict = sorted(myDict.items(), key=lambda item: item[1], reverse=True)
        
        # Return the top k elements (frequent elements)
        return [item[0] for item in sorted_dict[:k]]

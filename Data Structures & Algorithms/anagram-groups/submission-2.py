class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        group = {}
        for i in strs:
            sortedStr = "".join(sorted(i))
            if (sortedStr in group):
                group[sortedStr].append(i)
            else:
                group[sortedStr] = [i]
        return group.values()
        
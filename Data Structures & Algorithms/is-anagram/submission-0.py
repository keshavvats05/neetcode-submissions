class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        mydict1 = {}
        mydict2 = {}
        for l in s:
            if l not in mydict1:
                mydict1[l] = 1
            else:
                mydict1[l] += 1
        for l in t:
            if l not in mydict2:
                mydict2[l] = 1
            else:
                mydict2[l] += 1
        if mydict1 == mydict2:
            return True
        else:
            return False
            
        

class Solution:
	def isAnagram(self, s: str, t: str) -> bool:
		valuesS = {}
		valuesT = {}

		for i in s:
			if i in valuesS:
				valuesS[i] = valuesS[i]+1
			else:
				valuesS[i] = 1

		for i in t:
			if i in valuesT:
				valuesT[i] = valuesT[i]+1
			else:
				valuesT[i] = 1
		if valuesS == valuesT:
			return True
		else:
			return False

		

        
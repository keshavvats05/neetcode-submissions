class Solution:
	def hasDuplicate(self, nums: List[int]) -> bool:
		values = {}
		for idx, num in enumerate(nums):
			if num in values:
				return True
			else:
				values[num] = idx
		return False
        
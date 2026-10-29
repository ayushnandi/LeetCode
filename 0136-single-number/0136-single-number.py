class Solution:
    def singleNumber(self, nums: list[int]) -> int:
        r = 0
        for i in nums:
            r ^= i
        return r
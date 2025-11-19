class Solution:
    def findFinalValue(self, nums: List[int], original: int) -> int:
        s= set()
        for num in nums:
            s.add(num)
        while original in s:
            original *= 2
        
        return original
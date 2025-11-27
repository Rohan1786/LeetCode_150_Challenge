class Solution:
    def maxSubarraySum(self, nums: List[int], k: int) -> int:
        n = len(nums)
        prefixsum =0
        maxsum =- sys.maxsize
        ksum=[sys.maxsize//2] *k
        ksum[k-1]=0
        for i in range(n):
            prefixsum+=nums[i]
            maxsum=max(maxsum, prefixsum-ksum[i%k])
            ksum[i%k]=min(ksum[i%k],prefixsum)
        return maxsum
        
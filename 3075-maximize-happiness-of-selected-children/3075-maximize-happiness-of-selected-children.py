class Solution:
    def maximumHappinessSum(self, happiness: List[int], k: int) -> int:
        cnt=0
        res=0
        happiness.sort()
        n = len(happiness)
        for i in range(n-1, n-k-1, -1):
            if happiness[i]+cnt>0:
                res+=happiness[i]+cnt
            cnt-=1
        return res
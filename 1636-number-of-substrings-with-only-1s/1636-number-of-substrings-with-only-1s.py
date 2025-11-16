class Solution:
    def numSub(self, s: str) -> int:
        current=0
        count=0
        mod=1e9+7
        for char in s:
            if char=='1':
                current+=1
                count=(current+count)%mod
            else:
                current=0
        
        return int(count)
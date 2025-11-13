class Solution:
    def maxOperations(self, s: str) -> int:
        ans=0
        one_count=0
        i=0
        n=len(s)
        while i< n:
            ch=s[i]
            if ch=='0':
                while i+1<n and s[i+1]=='0':
                    i+=1
                ans+=one_count
            else:
                one_count+=1
            
            i+=1
        return ans

        
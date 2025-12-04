class Solution:
    def countCollisions(self, directions: str) -> int:
        arr = list(directions)
        n = len(arr)
        i=0
        j=n-1
        ans =0
        while i<n and arr[i]=='L': i+=1
        while j>=0 and arr[j]=='R': j-=1
        for k in range(i, j+1):
            if arr[k] != 'S':
                ans +=1
        
        return ans
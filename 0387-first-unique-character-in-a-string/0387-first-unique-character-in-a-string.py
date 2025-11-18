class Solution:
    def firstUniqChar(self, s: str) -> int:
        field=[0]*26
        for ch in s:
            field[ord(ch)-ord('a')]+=1
        for i,ch in enumerate(s):
            if(field[ord(ch)-ord('a')]==1):
                return i
        return -1

        
        
        
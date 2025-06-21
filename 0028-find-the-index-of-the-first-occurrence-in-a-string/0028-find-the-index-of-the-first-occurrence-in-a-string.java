class Solution {
    public int strStr(String haystack, String needle) {
       int hayStackSize = haystack.length();
        int needleSize = needle.length();

        if (needleSize == 0) {
            return 0; 
        }

        if (hayStackSize < needleSize) {
            return -1;
        }

        for (int i = 0; i <= hayStackSize - needleSize; i++) {
            if (haystack.substring(i, i + needleSize).equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}
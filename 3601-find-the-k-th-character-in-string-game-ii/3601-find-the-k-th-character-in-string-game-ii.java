class Solution {
    public char kthCharacter(long k, int[] operations) {
        // Base case: if k is 1, return 'a'
        if (k == 1) {
            return 'a';
        }

        int n = operations.length; // Length of the operations array
        int opType = 0; 
        long len = 1; 
        long newK = k;

        
        for (int i = 0; i < n; i++) {
            len *= 2; 
            if (len >= k) { 
                opType = operations[i]; 
                newK = k - len / 2; 
                break;
            }
        }
        char res = kthCharacter(newK, operations);

        // If operation type is 0, return the result as is
        if (opType == 0) 
            return res;

        // If operation type is 1, transform the character
        if (res == 'z') 
            return 'a';

        return (char) (res + 1); // Increment character by 1
    }
}
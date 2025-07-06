// class Solution {
//    public int getSquare(int n){
//     int sum =0;
//     while(n!=0){
//         int digit = n % 10;
//         sum+=(digit*digit);
//         n/=10;
//     }
//     return sum;
//    }
//     public boolean isHappy(int n) {
        
//         Set<Integer>map = new HashSet<>();
//         while(n!=1){
//             if(map.contains(n)) return false;
//             map.add(n);
//             n= getSquare(n);
//         }
//         return true;
//     }
// }

class Solution {
    public boolean isHappy(int n) {
        if (n == 1) return true;

        int value = 0;
        int temp = n;

        while (temp != 0) {
            int digit = temp % 10;
            value += digit * digit;
            temp /= 10;
        }

        // base condition correction:
        if (value == 1) return true;
        if (value == n || value == 4) return false; // 4 is part of unhappy cycle

        return isHappy(value);
    }
}

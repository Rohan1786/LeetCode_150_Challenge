class Solution {
    public int getCount(int n) {
       int num = 0;
        while (n != 0) {
            num += 1 << (n % 10);
            n /= 10;
        }
        return num;
    }
    public boolean reorderedPowerOf2(int n) {
       int input = getCount(n);
        for (int p = 0; p <= 29; p++) {
            if (input == getCount(1 << p)) {
                return true;
            }
        }
        return false;
    }
}
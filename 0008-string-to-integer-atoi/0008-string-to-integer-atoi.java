class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.length() == 0) return 0;

        int sign = 1;
        long ans = 0;
        int i = 0;
        if (s.charAt(0) == '-') {
            sign = -1;
            i=1;
        } else if (s.charAt(0) == '+') {
            i=1;
        }

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        while (i < s.length()) {
            if (!Character.isDigit(s.charAt(i))) {
            break;
            }
            ans = ans * 10 + (s.charAt(i) - '0');

            if (sign == 1 && ans > max) return max;
            if (sign == -1 && -1 * ans < min) return min;

            i++;
        }

        return (int)(ans * sign);
    }
}

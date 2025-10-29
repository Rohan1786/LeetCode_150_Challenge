class Solution {
    public int reverse(int x) {
        String value = String.valueOf(x);
        boolean isNegative = value.charAt(0) == '-';
        Stack<Character> stack = new Stack<>();

        for (int i = isNegative ? 1 : 0; i < value.length(); i++) {
            stack.push(value.charAt(i));
        }

        while (!stack.isEmpty() && stack.peek() == '0') {
            stack.pop();
        }

        StringBuilder res = new StringBuilder();
        while (!stack.isEmpty()) {
            res.append(stack.pop());
        }

        if (res.length() == 0) return 0;

        long num = Long.parseLong(res.toString());
        if (isNegative) num = -num;

        if (num > Integer.MAX_VALUE || num < Integer.MIN_VALUE) return 0;
        return (int) num;
    }
}

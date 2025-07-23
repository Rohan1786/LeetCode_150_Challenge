class Solution {
    public int maximumGain(String s, int x, int y) {
        int ans = 0;
        if (x > y) {
            ans += removePattern(s, 'a', 'b', x);
            s = removeFromString(s, 'a', 'b');
            ans += removePattern(s, 'b', 'a', y);
        } else {
            ans += removePattern(s, 'b', 'a', y);
            s = removeFromString(s, 'b', 'a');
            ans += removePattern(s, 'a', 'b', x);
        }
        return ans;
    }

    private int removePattern(String s, char first, char second, int value) {
        Stack<Character> stack = new Stack<>();
        int gain = 0;

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == first && c == second) {
                stack.pop();
                gain += value;
            } else {
                stack.push(c);
            }
        }

        return gain;
    }

    private String removeFromString(String s, char first, char second) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == first && c == second) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : stack) sb.append(c);
        return sb.toString();
    }
}

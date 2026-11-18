class Solution {
    public boolean isValid(String s) {
        Deque<Character> st = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(' -> st.push(')');
                case '{' -> st.push('}');
                case '[' -> st.push(']');
                case ']', ')', '}' -> {
                    if (st.isEmpty() || st.pop() != c) return false;
                }
            }
        }
        return st.isEmpty();
    }
}

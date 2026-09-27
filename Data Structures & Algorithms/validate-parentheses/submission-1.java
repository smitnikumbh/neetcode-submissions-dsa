class Solution {
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {

            // Opening brackets
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            }

            // Closing brackets
            else {

                // Stack empty
                if (st.isEmpty()) {
                    return false;
                }

                // Match )
                if (c == ')') {
                    if (st.peek() != '(') {
                        return false;
                    }
                }

                // Match }
                else if (c == '}') {
                    if (st.peek() != '{') {
                        return false;
                    }
                }

                // Match ]
                else if (c == ']') {
                    if (st.peek() != '[') {
                        return false;
                    }
                }

                // Correct bracket matched
                st.pop();
            }
        }

        return st.isEmpty();
    }
}
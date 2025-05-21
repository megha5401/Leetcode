class Solution {
    //megha0
    public String minRemoveToMakeValid(String s) {
        int l = 0;
        int r = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') { // Increment count for left parentheses
                l++;
            }
            if (c == ')') { // Increment count for right parentheses
                r++;
            }
            if (r > l) { // If there are more right parentheses than left, skip the current right parenthesis
                r--; 
                continue;     
            } else {
                stack.push(c); // Adding valid parentheses to the stack
            }
        }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            char c = stack.pop();
            if (l > r && c == '(') {
                l--; // Decrease left count
            } else {
                result.append(c); // Add valid parentheses to the result
            }
        }
        // Reversing the result string and return
        return result.reverse().toString();
    }
}
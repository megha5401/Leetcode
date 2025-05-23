import java.util.Stack;

class Solution {
    //megha0
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int result = 0; // Current calculated result
        int number = 0; // Current number being processed
        int sign = 1;   // 1 means positive, -1 means negative
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                number = number * 10 + (ch - '0');
            } 
            else if (ch == '+') {
                result += sign * number;
                number = 0;
                sign = 1;
            } 
            else if (ch == '-') {
                result += sign * number;
                number = 0;
                sign = -1;
            } 
            else if (ch == '(') {
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            } 
            else if (ch == ')') {
                result += sign * number;
                number = 0;
                result *= stack.pop(); // pop the sign
                result += stack.pop(); // pop the result
            }
        }
        // If there is a number left after loop
        if (number != 0) {
            result += sign * number;
        }
        return result;
    }
}

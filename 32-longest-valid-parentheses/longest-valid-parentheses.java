class Solution {
    //megha0
    public int longestValidParentheses(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int maxlen = 0;
        int l = 0;
        int r = 0;
        // this loop will work for balanced paranthesis that work from left to right
        for(int i = 0;i<s.length();i++){
            if (s.charAt(i) == '(') {
                l++;
            }
            else {
                r++;
            }
            if (l == r) {
                maxlen = Math.max(maxlen , 2*r);
            }
            if (r > l) {
                l = r = 0;
            }
        }
        l = r = 0;
        // this loop will work for balanced paranthesis that work from right to left
        for(int i = s.length() - 1 ; i >= 0 ; i--){
            if (s.charAt(i) == '(') {
                l++;
            } 
            else {
                r++;
            }
            if (l == r) {
                maxlen = Math.max(maxlen , 2*l);
            }
            if (l > r) {
                l = r = 0;
            }
        }
        return maxlen;
    }
}
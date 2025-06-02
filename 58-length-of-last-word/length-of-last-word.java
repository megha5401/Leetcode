class Solution {
    public int lengthOfLastWord(String s) {
        //megha0
        int a = s.length() - 1;
        while (a >= 0 && s.charAt(a) == ' ') {
            a--;
        }
        int b = a;
        while (b >= 0 && s.charAt(b) != ' ') {
            b--;
        }
        return a - b;        
    }
}
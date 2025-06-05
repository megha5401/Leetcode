class Solution {
    //megha0
    public String firstPalindrome(String[] words) {
        for (String k : words) {
            if (isPalindrome(k)) {
                return k;
            }
        }
        return "";
    }
    public boolean isPalindrome(String i) {
        int l = 0; 
        int r = i.length() - 1;
        while (l < r) {
            if (i.charAt(l) != i.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
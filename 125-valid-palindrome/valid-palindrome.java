class Solution {
    //megha0
    public boolean isPalindrome(String s) {
        String x = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int l = 0; 
        int r = x.length() - 1; 
        while (l < r) { 
            if (x.charAt(l) != x.charAt(r)) {
                return false;
            }
            l++; 
            r--;
        }
        return true; 
    }
}
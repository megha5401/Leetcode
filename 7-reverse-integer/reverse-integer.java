class Solution {
    //megha0
    public int reverse(int x) {
        int n = Math.abs(x);  // Absolute Value of Original number 
        int r = 0;  // Reversed number
        while (n != 0) {
            int ld = n % 10;  // Last digit 
            if (r > (Integer.MAX_VALUE - ld) / 10) { // Overflow Check
                return 0;  
            }
            r = r * 10 + ld;  
            n = n / 10;  
        }
        return (x < 0) ? (-r) : r;  
    }
}
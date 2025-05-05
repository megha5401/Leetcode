class Solution {
    //megha0
    public boolean isHappy(int n) {
        while (n >= 1) {
            n = sumofsquare(n);
            if (n == 1 || n==7){ 
                return true;
            }
            else if (n < 10) {
                return false;
            }
        }
        return false;
    }
    public int sumofsquare(int n){
        int sum = 0;
        while (n != 0) {
            int a = n % 10;
            sum += a * a;
            n /= 10;            
        } 
        return sum;
    }
}
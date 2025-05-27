class Solution {
    //megha0
    public int subarrayLCM(int[] nums, int k) {
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            int curGCD = nums[i];
            if(curGCD == k) ans++;
            for(int j = i + 1; j < nums.length; j++){
                curGCD = lcm(nums[j], curGCD);
                if(curGCD == k) ans++;
                if (nums[j] > k) break;
            }
        }
        return ans;
    }
    
    public int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a%b);
    }
    
    public int lcm(int a, int b){
        return (a / gcd(a, b)) * b;
    }
}
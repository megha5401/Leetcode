class Solution {
    //megha0
    public int findDuplicate(int[] nums) {
        int a = nums[0];
        int b = nums[0];
        while (true) {
            a = nums[a];
            b = nums[nums[b]];

            if (a == b) {
                break;
            }
        }
        int c = nums[0];
        while (a != c) {
            a = nums[a];
            c = nums[c];
        }
        return a;        
    }
}
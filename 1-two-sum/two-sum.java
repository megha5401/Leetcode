class Solution {
    //megha0
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i <= nums.length; i++) {
            int a = nums[i];
            for (int j = i+1; j <= nums.length-1 ; j++) {
                int b = nums[j];
                if ((nums[i] + nums[j]) == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0};
    }
}
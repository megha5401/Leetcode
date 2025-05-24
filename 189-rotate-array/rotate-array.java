class Solution {
    //megha0
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;  // Normalize k
        // Helper method to reverse part of the array
        reverse(nums, 0, n - 1);       // Step 1: Reverse the whole array
        reverse(nums, 0, k - 1);       // Step 2: Reverse first k elements
        reverse(nums, k, n - 1);       // Step 3: Reverse the rest
    }
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            // Swap elements at indices start and end
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

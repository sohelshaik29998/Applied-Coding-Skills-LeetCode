class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int left = 0;
        int right = n - 1;
        
        for (int p = n - 1; p >= 0; p--) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                res[p] = nums[left] * nums[left];
                left++;
            } else {
                res[p] = nums[right] * nums[right];
                right--;
            }
        }
        
        return res;
    }
}

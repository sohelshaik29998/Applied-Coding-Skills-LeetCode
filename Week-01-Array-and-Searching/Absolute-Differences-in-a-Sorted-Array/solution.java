class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        
        int leftSum = 0;
        
        for (int i = 0; i < n; i++) {
            
            int rightSum = totalSum - leftSum - nums[i];
             
            int leftCount = i;
            int rightCount = n - i - 1;
            
            int leftTotal = leftCount * nums[i] - leftSum;
            int rightTotal = rightSum - rightCount * nums[i];
            
            result[i] = leftTotal + rightTotal;
        
            leftSum += nums[i];
        }
        
        return result;
    }
}

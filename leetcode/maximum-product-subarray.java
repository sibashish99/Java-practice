/*
Maximum Product Subarray
Given an integer array nums, find the contiguous subarray within an array (containing at least one number) which has the largest product.

Example 1:

Input: [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
Example 2:

Input: [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray. */

class Solution {
    public int maxProduct(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int curMin = nums[0];
        int curMax = nums[0];
        int result = nums[0];
        
        for(int i = 1; i < nums.length; i++) {            
            int localMin = curMin*nums[i]; 
            int localMax = curMax*nums[i];        
            curMin = Math.min(Math.min(localMin, localMax), nums[i]);
            curMax = Math.max(Math.max(localMin, localMax), nums[i]);
            result = Math.max(result, curMax);
        }
        
        return result; 
    }
}
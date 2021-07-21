/*
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
*/
class Solution {
    public int maxSubArray(int[] nums) {
         int csum=nums[0], sum=nums[0];
        for(int i=1;i<nums.length;i++){
          csum=Math.max(nums[i],csum+nums[i]);
          sum=Math.max(sum,csum);
        }
        return sum;
    }
}
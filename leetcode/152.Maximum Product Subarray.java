/**
 Given an integer array nums, find a contiguous non-empty subarray within the array that has the largest product, and return the product.

It is guaranteed that the answer will fit in a 32-bit integer.

A subarray is a contiguous subsequence of the array.

 

Example 1:

Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
 */
class Solution {
    public int maxProduct(int[] nums) {
        var len = nums.length;
        if (len == 0) return 0;
        var max = nums[0];
        var left = 0;
        var right = 0;
        
        for (var i=0; i<len; i++) {
            left = (left == 0 ? 1 : left) * nums[i];
            right = (right == 0 ? 1 : right) * nums[len-1-i];
            max = Math.max(max, Math.max(left, right));
        }
        
        return max;
    }
}
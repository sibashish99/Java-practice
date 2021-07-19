/**
 
977. Squares of a Sorted Array
Easy

2741

117

Add to List

Share
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

 

Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
Example 2:

Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 */

class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            res[i]=nums[i]*nums[i];
        }
        Arrays.sort(res);
        return res;
    }
}
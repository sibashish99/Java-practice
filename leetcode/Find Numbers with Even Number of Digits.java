/*
Given an array nums of integers, return how many of them contain an even number of digits.
 

Example 1:

Input: nums = [12,345,2,6,7896]
Output: 2
Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits.
 */

class Solution {
    public int findNumbers(int[] nums) {
        int digits = 0,counter =0;
       for(int i=0;i<nums.length;i++){
            digits = 0;
         /*
                We Can Use (Math.log10(nums[i]) + 1) to get the number of
                digits without using loop. This will make program even more
                faster.
             */
            while(nums[i]>0){  
                nums[i] = nums[i]/10; 
                digits = digits + 1; 
            }
            if(digits % 2 == 0){  
                counter = counter + 1;
            }
       }
        return counter;

        
    }
}

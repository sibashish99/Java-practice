/*

Given two integers a and b. Write a program to find the number of digits in the product of these two integers.

Example 1:

Input: a = 12, b = 4
Output: 2 
Explanation: 12*4 = 48
Hence its a 2 digit number.

*/

class Solution {
    static long countDigits(long a, long b){
         // code here
         long val=Math.abs(a*b);
         long  count=0;
         if(val==0){
             return 1;
         }
         while(val>0){
             count++;
             val/=10;
         }
         return count;
     }
 }
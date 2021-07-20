/**
 Given two integers a and b. Find the sum of two numbers without using arithmetic operators.

Example 1:

Input:
a = 5, b = 3
Output: 8
Explanation :
5 + 3 = 8
 */

class Solution
{
    int sum(int a , int b)
    {
        //code here
        if(b==0){
            return a;
        }
        else{
            return sum(a^b, (a&b)<<1 );
        }
    }
}
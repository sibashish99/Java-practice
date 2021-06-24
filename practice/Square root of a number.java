/**
Given an integer x, find the square root of x. If x is not a perfect square, then return floor(√x).

Example 1:

Input:
x = 5
Output: 2
Explanation: Since, 5 is not a perfect 
square, floor of square_root of 5 is 2.
 */

class Solution{
    long floorSqrt(long a){
       // Your code here
       if (a == 0)
        return 0;
       if (a == 1)
        return 1;

       long low = 0;
       long high = a;
       long mid;
      while (low <= high) {
        mid = (low + high) / 2;
        if (mid == (a / mid))
          return mid;
        else if (mid < (a / mid))
          low = mid + 1;
        else
          high = mid - 1;
      }
     return (long) Math.floor(high);
    }
}

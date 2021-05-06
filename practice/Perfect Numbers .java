/*

Given a number N, check if a number is perfect or not. A number is said to be perfect if sum of all its factors excluding the number itself is equal to the number.

 

Example 1:

Input:
N = 6
Output:
1 
Explanation:
Factors of 6 are 1, 2, 3 and 6.
Excluding 6 their sum is 6 which
is equal to N itself. So, it's a
Perfect Number.

*/

class Solution {
    static int isPerfectNumber(Long n) {
        // code here
    long  sum = 1;
  
    for (long  i=2; i*i<=n; i++){
        if (n%i==0){
            if(i*i!=n)
                sum = sum + i + n/i;
            else
                sum=sum+i;
        }
    }
    
     if (sum == n && n != 1)
          return 1;
     else
          return 0;
    }
};
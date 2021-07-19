/**
 Given an integer N which has odd number of digits, find whether the given number is a balanced or not.

An odd digit number is called a balanced number if the sum of all digits to the left of the middle digit and the sum of all digits to the right of the middle digit is equal.

Example 1:

Input:
N = 1234006
Output: 1 
Explanation: Total number of digits in
N = 7. Middle digit is 4. LHS = 1+2+3 = 6
and RHS = 0+0+6 = 6. LHS is equal to RHS. 

Example 2:

Input:
N = 12345
Output: 0
Explanation: LHS = 1+2 = 3 and RHS = 4+5
= 9. LHS and RHS are not equal.

Your Task:  
You dont need to read input or print anything. Complete the function balancedNumber() which takes string N as input parameter and returns a boolean value denoting if N is balanced or not.
Note: The driver code prints 1 if the returned value is true otherwise 0
 */

class Sol{
    Boolean balancedNumber(String N){
        // your code here 
        int sum1 = 0, sum2 = 0, n = N.length();
        for(int i = 0; i < n/2; i++){
         sum1 += N.charAt(i) - '0';
        }
         
        for(int i = n/2+1; i < n; i++){
         sum2 += N.charAt(i) - '0';
        }
        
        if(sum1 == sum2){
            return true;
        }
        return false;

        
    }
}
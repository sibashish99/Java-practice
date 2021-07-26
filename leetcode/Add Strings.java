/*
Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.

You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.

 

Example 1:

Input: num1 = "11", num2 = "123"
Output: "134"
*/

class Solution {
    public String addStrings(String num1, String num2) {
        StringBuffer sb=new StringBuffer();
        int rem=0;
        int num1Len= num1.length()-1;
        int num2Len= num2.length()-1;
        
        while(num1Len>=0 || num2Len>=0){
          int num= rem;
          if(num1Len>=0){
              num+=(int)num1.charAt(num1Len)-48;
              num1Len--;
          }
             if(num2Len>=0){
              num+=(int)num2.charAt(num2Len)-48;
              num2Len--;
          }
            rem=num/10;
            num%=10;
            sb.append(num);
        }
        if(rem!=0){
         sb.append(1);
        }
        return sb.reverse().toString();
    }
}
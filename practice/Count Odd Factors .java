/*

Given an integer N, count the numbers having an odd number of factors from 1 to N (inclusive).
 

Example 1:

Input:
N = 5
Output:
2
Explanation:
From 1 - 5 only 2 numbers,
1 and 4 are having odd number
of factors.

*/


class Solution{
    static long count(int n)        
    {
        // code here
       int count=0;
       for(int i=0;i<=n;i++){
           int temp=0;
           for(int j=1;j<=Math.sqrt(i);j++){
               if(i%j==0 && i/j!=j){
                   temp+=2;
               }
               else if(i%j==0 && i/j==j){
                   temp+=1;
               }
           }
           if(temp%2==1)
              count++;
       }
       return count;
    }
}
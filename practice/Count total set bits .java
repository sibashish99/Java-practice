/**
 
You are given a number N. Find the total count of set bits for all numbers from 1 to N(both inclusive).

Example 1:

Input: N = 4
Output: 5
Explanation:
For numbers from 1 to 4.
For 1: 0 0 1 = 1 set bits
For 2: 0 1 0 = 1 set bits
For 3: 0 1 1 = 2 set bits
For 4: 1 0 0 = 1 set bits
Therefore, the total set bits is 5.

 */

class Solution{
    
    //Function to return sum of count of set bits in the integers from 1 to n.
    public static int countSetBits(int n){
    
        // Your code here
        int count=0;
        while(n>0){
            int i=(int)(Math.log10(n)/Math.log10(2));
            count+=Math.pow(2,i-1)*i;
            count+=n-Math.pow(2,i)+1;
            n-=Math.pow(2,i);
        }
        return count;
        
    }
}
/*

Given a number N, find the first N Fibonacci numbers. The first two number of the series are 1 and 1.

Example 1:

Input:
N = 5
Output: 1 1 2 3 5
*/

class Solution
{
    //Function to return list containing first n fibonacci numbers.
    public static long[] printFibb(int n) 
    {
        long val[]= new long[n];
        val[0]=1;
        if(n==1){
            return val;
        }
        val[1]=1;
        for(int i=2;i<n;i++){
            val[i]=val[i-1]+val[i-2];
        }
        return val;
        
    }
}
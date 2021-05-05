/*

Given an array A of n positive numbers. The task is to find the first Equilibium Point in the array. 
Equilibrium Point in an array is a position such that the sum of elements before it is equal to the sum of elements after it.

Example 1:

Input:
n = 1
A[] = {1}
Output: 1
Explanation: Since its the only 
element hence its the only equilibrium 
point. 

*/

class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        if(n==1)
           return 1;
        for(int i=1;i<n;i++){
            arr[i]+=arr[i-1];
        }
        for(int i=1;i<n;i++){
            if(arr[i-1]==(arr[n-1]-arr[i]))
               return (i+1);
        }
        return -1;
    }
}

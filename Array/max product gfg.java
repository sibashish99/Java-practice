/*

Given an array Arr that contains N integers (may be positive, negative or zero). Find the product of the maximum product subarray.

Example 1:

Input:
N = 5
Arr[] = {6, -3, -10, 0, 2}
Output: 180
Explanation: Subarray with maximum product
is  6, -3, -10 which gives product as 180.
*/





class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        // code here
         long result = arr[0];
        
        for (int i = 0; i < n; i++)
        {
            long mul = arr[i];
            for (int j = i + 1; j < n; j++)
            {
                result = Math.max(result, mul);
                mul *= arr[j];
            }
            result = Math.max(result, mul);
        }
        return result;
    }
}
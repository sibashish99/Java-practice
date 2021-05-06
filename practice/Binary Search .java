/**
 

Given a sorted array of size N and an integer K, find the position at which K is present in the array using binary search.


Example 1:

Input:
N = 5
arr[] = {1 2 3 4 5} 
K = 4
Output: 3
Explanation: 4 appears at index 3.
 */

class Solution {
    int binarysearch(int arr[], int n, int k){
        // code here
        for(int i=0;i<n;i++){
            if(arr[i]==k){
                return i;
            }
        }
        return -1;
    }
}
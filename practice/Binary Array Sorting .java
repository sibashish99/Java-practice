/**
 Given a binary array A[] of size N. The task is to arrange the array in increasing order.

Note: The binary array contains only 0  and 1.

Example 1:

Input:
N = 5
A[] = {1,0,1,1,0}
Output: 0 0 1 1 1
Example 2:

Input:
N = 10
A[] = {1,0,1,1,1,1,1,0,0,0}
Output: 0 0 0 0 1 1 1 1 1 1
 */


class Solution { 
	static int[] SortBinaryArray(int arr[], int n) { 
	    // code here
	    int[] cnt = new int[2];
        for(int i = 0; i < n; i++) {
          cnt[arr[i]]++;
         } 
        int j = 0, i = 0;
        while(cnt[j] != 0) {
         arr[i++] = 0;
         cnt[j]--;
        }
        j++;
        while(cnt[j] != 0) {
          arr[i++] = 1;
          cnt[j]--;
         }
       return arr;
	} 
} 
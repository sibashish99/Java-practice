/**
 The problem is to count all the possible paths from top left to bottom right of a MxN matrix with the constraints that from each cell you can either move to right or down.

Example 1:

Input:
M = 3 and N = 3
Output: 6
Explanation:
Let the given input 3*3 matrix is filled 
as such:
A B C
D E F
G H I
The possible paths which exists to reach 
'I' from 'A' following above conditions 
are as follows:ABCFI, ABEHI, ADGHI, ADEFI, 
ADEHI, ABEFI
 */

class Solution{
    
    long numberOfPaths(int m, int n) {
        m--;
        n--;
       long ans = 1;
      for(long x = 1; x<=m;x++){
          ans=(ans*(n+x))/x;
       }
     return ans;
        // Code Here
    }
    
}
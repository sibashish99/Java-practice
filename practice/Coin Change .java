/**
 Given a value N, find the number of ways to make change for N cents, if we have infinite supply of each of S = { S1, S2, .. , SM } valued coins.


Example 1:

Input:
n = 4 , m = 3
S[] = {1,2,3}
Output: 4
Explanation: Four Possible ways are:
{1,1,1,1},{1,1,2},{2,2},{1,3}.
 */

class Solution{
    public long count(int arr[], int n, int sum) { 
        //code here.
       long dp[][]= new long[n+1][sum+1];
       for(int i=0;i<=sum;i++){
           dp[0][i]=0;
       }
       for(int i=0;i<=n;i++){
           dp[i][0]=1;
       }
       for(int i=1;i<=n;i++){
           for(int j=1;j<=sum;j++){
               dp[i][j]=dp[i-1][j];
               if(j>=arr[i-1]){
                   dp[i][j]+=dp[i][j-arr[i-1]];
               }
           }
       }
       return dp[n][sum];
       
        
    } 
}
class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        int i = 0;
        int j = n - 1;
        int  count = 0;
        while(i < n && j >= 0){
         if(i != j){
           if((arr[i] + arr[j]) == k){
             count++;
           }
           j--;
          }
         else{
           j = n - 1;
           i++;
         }
        }
       return count;
    }
}

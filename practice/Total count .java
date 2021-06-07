class Solution {
    int totalCount(int[] arr, int n, int k) {
        // code here
        int sum = 0;
        for (int i = 0; i < n; i++) {
          if (arr[i] % k == 0){
              sum = sum + (arr[i] / k);
          }
          else {
            sum = sum + (arr[i] / k);
            sum++;
           }
          }
         return sum;
    }
}
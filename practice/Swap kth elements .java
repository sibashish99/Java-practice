class Solution {
    void swapKth(int arr[], int n, int k) {
        // code here
        
     if(arr[k-1]!=arr[n-k]){
         int temp=arr[k-1];
         arr[k-1]=arr[n-k];
         arr[n-k]=temp;
     }
    }

}
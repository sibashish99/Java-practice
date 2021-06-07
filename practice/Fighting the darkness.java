class Solution{
    long maxDays(long arr[], int n){
        // code here 
        long largest=arr[0];
        for(int i=1;i<n;i++){
            if(largest<arr[i])
                largest=arr[i];
        }
        
        return largest;
    }
}
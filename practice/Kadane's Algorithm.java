class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int arr[], int n){
        
        // Your code here
        // Your code here
        int csum=0,max=0;
	    for(int i=0;i<n;i++){
	    	csum+=arr[i];
		    if(csum>max){
			  max=csum;
		   }
		   if(csum<0){
		    	csum=0;
		  }
		
	   }
       return max; 
        
    }
}
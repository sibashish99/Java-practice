class Solution { 
    long smallestpositive(long[] arr, int n){ 
        // Your code goes here 
       Arrays.sort(arr);
       long result =1;

      for (int i = 0; i < n && arr[i] <= result; i++)
        result = result + arr[i];

     return result;
    }
} 
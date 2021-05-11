class Solution {
  
    
   
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
       int res_index = -1; 
	    int j = m - 1;
	    
	    for(int i = 0; i < n; i++)
	    {
	        while(j >= 0)
	        {
	            if(arr[i][j] == 1)
	            {
	                j--;
	                
	                res_index = i;
	            }
	            else
	            {
	                break;
	            }
	        }
	    }
	    
	    return res_index;
    }
}

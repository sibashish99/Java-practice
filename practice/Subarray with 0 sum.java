class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
        //Your code here
        Set<Integer> hs = new HashSet<Integer>();
        int sum = 0;
 
        for (int i = 0; i <n; i++)
        {
            sum += arr[i];
 
            if (arr[i] == 0 || sum == 0 || hs.contains(sum))
                return true; 
                
            hs.add(sum);
        }
 
        return false;
    }
}
class Solution{
    //Function to return the position of the first repeating element.
    public static int firstRepeated(int []arr, int n) 
    {
        int min = -1;
        HashMap<Integer ,Integer> map = new HashMap<>();
        for (int i=n-1; i>=0; i--)
        {
            if (map.containsKey(arr[i]))
                min = i;
 
            else  
                map.put(arr[i],1);
        }
        if (min != -1)
           return min+1;
        else 
           return -1;
       
    }
}
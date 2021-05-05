//  Find the element that appears once in an array 
//The best solution is to use XOR. XOR of all array elements gives us the number with a single occurrence. 

class MaxSum
{
    static int findSingle(int ar[], int ar_size)
    {
       
        int res = ar[0];
        for (int i = 1; i < ar_size; i++)
            res = res ^ ar[i];
    
        return res;
    }
    public static void main (String[] args)
    {
        int ar[] = {2, 3, 5, 4, 5, 3, 4};
        int n = ar.length;
        System.out.println(findSingle(ar, n) + " ");
    }
}
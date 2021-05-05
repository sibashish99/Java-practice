/*
Given an array of size N and a sum, the task is to check whether some array elements can be added to sum to N . 
Note: At least one element should be included to form the sum.(i.e. sum cant be zero) 
Examples: 
 


Input: array = -1, 2, 4, 121, N = 5

Output: YES


*/


class GFG
{
        static void find(int [] arr, int length, int s)
        {

            for (int i = 1; i <= (Math.pow(2, length)); i++) {
                int sum = 0;
                for (int j = 0; j < length; j++)
                    if (((i >> j) & 1) % 2 == 1)
                        sum += arr[j];
        
                    if (sum == s) {
                      System.out.println("YES");
                      return;
                }
            }
            System.out.println("NO");
        }
       
        public static void main(String[] args)
        {
            int sum = 5;
            int []array = { -1, 2, 4, 121 };
            int length = array.length;
        
            find(array, length, sum);
        
        }

}
// You are given an integer input N and you have to find whether it is the sum or the difference of the integer 5. (5+5, 5+5+5, 5-5,5-5-5+5+5…..)


class Solution{
    static String isValid(Long N){
        // code here
         // code here 
        if(N%5==0)
          return "YES";
         else
           return "NO";
    }
}
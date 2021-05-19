import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int l = A.length()-1;
        String ans= "Yes";
        for(int i =0; i<l/2; i++){
            if(A.charAt(i)==A.charAt(l-i))
                continue;
            else{
                ans ="No";
                break;
            }
        }
        System.out.println(ans);
        
    }
}




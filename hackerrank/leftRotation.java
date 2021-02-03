import java.util.Scanner;
public class Solution { 
    
    public static void main(String[] args) { 
        int n,d;  
        Scanner sc=new Scanner(System.in);  
        n=sc.nextInt(); 
        d=sc.nextInt();
        int i,j; 

        int[] arr = new int[100000000];  
        for( i=0; i<n; i++){  
           arr[i]=sc.nextInt();  
        }
        int  temp;
         for ( j = 1; j < d; j++) {
             temp = arr[0]; 
             for (i = 0; i < n - 1; i++){
                 arr[i] = arr[i + 1]; 
             }
             arr[i] = temp;
         }
          for (i = 0; i < n; i++) 
            System.out.print(arr[i] + " "); 
       
    } 
} 

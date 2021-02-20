import java.util.Scanner;  //Find subarray with given sum | Set 1 (Nonnegative Numbers)
public class maxSubarraySum{ 
public static void findMaxSubArray(int arr[],int n){
   int csum=0,sum=0;
   for(int i=0; i<n; i++){  
     csum+=arr[i];
     if(csum>sum){
         sum=csum;
     }
     if(csum<0){
         csum=0;
     }
  }
   System.out.print("Max sum of subarray is: "+sum);
} 
public static void main(String[] args){
    int n;  
    Scanner sc=new Scanner(System.in);  
    System.out.print("Enter the number of elements you want to store: ");  
    n=sc.nextInt();  
  
    int[] array = new int[100];  
    System.out.println("Enter the elements of the array: ");  
    for(int i=0; i<n; i++){  
      array[i]=sc.nextInt();  
    }
    findMaxSubArray(array,n);  
 }
}
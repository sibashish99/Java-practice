import java.util.Scanner;  //Find subarray with given sum | Set 1 (Nonnegative Numbers)
public class finMissing{ 
public static void findMissingArray(int arr[],int n){
   int i,total;
   total = (n+1)*(n+2)/2;
   for(i=0;i<n;i++){
       total-=arr[i];
   }
   System.out.print("Missing no is: "+total);
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
    findMissingArray(array,n);  
 }
}
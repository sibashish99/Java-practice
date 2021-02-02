import java.util.Scanner;  
public class avge{  
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
  int sum=0;

  for (int i=0; i<n; i++){  
      sum+=arra[i];
   }  

   int avg=(sum/n);
   System.out.print("Avg is : "+avg);
 }  
}  
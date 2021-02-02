import java.util.Scanner;  
public class large{  
public static void main(String[] args){ 
  int n;  
  Scanner sc=new Scanner(System.in);  
  System.out.print("Enter the number of elements you want to store: ");  
  n=sc.nextInt();  

  int[] array = new  int[100];  
  System.out.println("Enter the elements of the array: ");  
  
  int i;

  for(i=0; i<n; i++){  
    array[i]=sc.nextInt();  
  }  
  int largest=array[0];
  for (i=0; i<n; i++) {
    if(largest < array[i])
        largest = array[i];
}

System.out.format("Largest element ="+ largest);

 }  
}  
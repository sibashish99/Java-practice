import java.util.Scanner;  //first non repaet
public class nonrepeatingelement{ 
public static int nonRep(int arr[],int n){
    for (int i = 0; i < n; i++) { 
        int j; 
        for (j = 0; j < n; j++) 
            if (i != j && arr[i] == arr[j]) 
                break; 
        if (j == n) 
            return arr[i]; 
    } 

    return -1; 
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
    System.out.print("First non repeat is: "+ nonRep(array,n));  
 }
}
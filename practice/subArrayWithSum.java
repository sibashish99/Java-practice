import java.util.Scanner;  //Find subarray with given sum | Set 1 (Nonnegative Numbers)
public class subArrayWithSum{ 
public static int sumTarget(int arr[],int n,int sum){
    
    int curr_sum, i, j; 
    for (i = 0; i < n; i++) { 
        curr_sum = arr[i]; 
        for (j = i + 1; j <= n; j++) { 
            if (curr_sum == sum) { 
                int p = j - 1; 
                System.out.println("("+ i + ", " + p+")"); 
                return 1; 
            } 
            if (curr_sum > sum || j == n) 
                break; 
            curr_sum = curr_sum + arr[j]; 
        } 
    } 

    System.out.println("No subarray found"); 
    return 0; 
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
    int target= sc.nextInt();
    sumTarget(array,n,target);  
 }
}
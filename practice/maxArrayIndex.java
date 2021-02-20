import java.util.Scanner;  //Given an array arr[], find the maximum j – i such that arr[j] > arr[i]
public class maxArrayIndex{ 
public static int maxDif(int arr[],int n){
    int maxDiff = -1;
        int i, j;
 
        for (i = 0; i < n; ++i) {
            for (j = n - 1; j > i; --j) {
                if (arr[j] > arr[i] && maxDiff < (j - i))
                    maxDiff = j - i;
            }
        }
 
        return maxDiff;
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
    System.out.print("the maximum j diff i "+ maxDif(array,n));  
 }
}
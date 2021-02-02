import java.util.Scanner;  
import java.lang.Math;

public class stand{  
public static void main(String[] args){ 
  int n;  
  Scanner sc=new Scanner(System.in);  
  System.out.print("Enter the number of elements you want to store: ");  
  n=sc.nextInt();  

  double[] array = new  double[100];  
  System.out.println("Enter the elements of the array: ");  
  
  int i;

  for(i=0; i<n; i++){  
    array[i]=sc.nextDouble();  
  }  
  double  SD = calculateSD(array,n);
  System.out.format("Standard Deviation = %.6f", SD);

 }  
 public static double calculateSD(double array[],int n)
    {
        double sum = 0.0, standardDeviation = 0.0;
        int length = array.length,i;

        for(i=0; i<n; i++) {
            sum +=array[i];
        }

        double mean = sum/length;

        for(i=0; i<n; i++) {
            standardDeviation += Math.pow(array[i] - mean, 2);
        }

        return Math.sqrt(standardDeviation/length);
    }
}  
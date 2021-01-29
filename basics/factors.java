import java.util.Scanner;
public class factors{

    public static void main(String[] args) {
  
      
        Scanner one=new Scanner(System.in);
       
        System.out.println("Enter  number:");
        int a=one.nextInt();;
  
      System.out.print("Factors of " + a+ " are: ");
  
      // loop runs from 1 to 60
      for (int i = 1; i <= a/2; ++i) {
  
        // if number is divided by i
        // i is the factor
        if(a % i == 0) {
          System.out.print(i + " ");
        }
      }
    }
  }
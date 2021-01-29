import java.util.Scanner;
import java.lang.Math;

public class armList{
    public static void main(String[] args) {
       Scanner one=new Scanner(System.in);
       
      System.out.println("Enter interval:");
      double low=one.nextDouble();
      double high=one.nextDouble();
     
      for(double number = low+1; number < high; ++number) {
        double digits = 0;
        double result = 0;
        double originalNumber = number;

        // number of digits calculation
        while (originalNumber!= 0) {
            originalNumber/= 10;
            ++digits;
        }

        originalNumber = number;
        double remainder ;

        // result contains sum of nth power of its digits
        while (originalNumber!= 0) {
             remainder = originalNumber%10;
             result+= Math.pow(remainder, digits);
             originalNumber/= 10;
        }

        if (result == number)
            System.out.print(number + " ");
    }
       

    }
}
import java.util.Scanner;
import java.lang.Math;

public class arm{
    public static void main(String[] args) {
       Scanner one=new Scanner(System.in);
       
      System.out.println("Enter a number:");
      double a=one.nextDouble();
      double temp=a;
       while(a!=0){
           a=a/10;
           count++;
       }
       a=temp;
       double remainder;
       double result = 0;
       while(a!=0){
           remainder=a % 10;
           result+= Math.pow(remainder,count);
           a/=10;
       }
      if(result==temp)
         System.out.println("is armstrong");
        else
        System.out.println("is not armstrong");
       

    }
}
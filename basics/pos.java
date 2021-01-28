import java.util.Scanner;

public class pos{
    public static void main(String[] args) {
       Scanner one=new Scanner(System.in);
       
       System.out.println("Enter any number:");
       double a=one.nextDouble();

       if(a>0)
         System.out.println(a+" is positive number.");
       if(a==0)
         System.out.println(a+" is zero.");
       else
         System.out.println(a+" is negative number.");
    }
}
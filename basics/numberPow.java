
import java.util.Scanner;

public class numberPow{
    public static void main(String[] args) {
       Scanner one=new Scanner(System.in);
       
       System.out.println("Enter a number:");
       int a=one.nextInt();
       System.out.println("Enter  exponent:");
       int b=one.nextInt();
       int res=1;

       while(b!=0){
          res=res*a;
          --b;
       }
       System.out.println("value is "+res);

       

    }
}
import java.util.Scanner;

public class oddeven{
    public static void main(String[] args) {
       Scanner number=new Scanner(System.in);

       System.out.println("Enter two number:");
       int a=number.nextInt();
       
       if(a%2==0)
          System.out.println(a+" is even no.");
        else
           System.out.println(a+" is odd number.");
       

    }
}
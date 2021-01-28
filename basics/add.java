import java.util.Scanner;

public class add{
    public static void main(String[] args) {
       Scanner number=new Scanner(System.in);

       System.out.println("Enter two numbers:");
       int a=number.nextInt();
       int b=number.nextInt();

       System.out.println("Sum is: "+ (a+b));

    }
}
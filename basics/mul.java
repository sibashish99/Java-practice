import java.util.Scanner;
public class mul{
    public static void main(String[] args) {
        Scanner number=new Scanner(System.in);

        System.out.println("Enter two numbers:");
        double a=number.nextFloat();
        double b=number.nextFloat();

        System.out.println("Multiplication  is: "+ (a*b));

    }
}
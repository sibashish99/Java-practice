import java.util.Scanner;

public class large{
    public static void main(String[] args) {
       Scanner number=new Scanner(System.in);

       System.out.println("Enter three number:");
       int a=number.nextInt();
       int b=number.nextInt();
       int c=number.nextInt();
       
       if(a>b && a>c)
          System.out.println(a+" is Greater.");
        if(b>a && b>c)
           System.out.println(b+" is Greater.");
        else
          System.out.println(c+" is Greater");
       

    }
}
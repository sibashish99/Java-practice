import java.util.Scanner;

public class factorial{
    public static void main(String[] args) {
       Scanner one=new Scanner(System.in);
       
       System.out.println("Enter  number:");
       int a=one.nextInt();
       int fact=1;

       for(int i=2;i<=a;i++){
           fact=fact*i;
       }

       System.out.println("fact is: "+fact);

    }
}
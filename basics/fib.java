import java.util.Scanner;

public class fib{
    public static void main(String[] args) {
       Scanner one=new Scanner(System.in);
       
       System.out.println("Enter  number:");
       int n=one.nextInt();
       int a=0;
       int b=1; 

       for(int i=1;i<=n;i++){
         System.out.println(a+" ");
         int sum=a+b;
         a=b;
         b=sum;
       }

       

    }
}
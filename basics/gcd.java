import java.util.Scanner;

// gcd and lcm
public class gcd{
    public static void main(String[] args) {
       Scanner one=new Scanner(System.in);
       
       System.out.println("Enter two numbers:");
       int a=one.nextInt();
       int b=one.nextInt();
       int gcd=1;

       for(int i=2;i<=a && i<=b;i++){
          if(a%i==0 && b%i==0){
              gcd=i;
          }
       }
       int lcm=(a*b)/gcd;
       System.out.println("GCD is :"+gcd);
       System.out.println("LCM is :"+lcm);

       

    }
}
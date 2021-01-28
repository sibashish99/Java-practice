import java.util.Scanner;
import java.lang.Math;

public class eqn{
    public static void main(String[] args) {
       Scanner number=new Scanner(System.in);

       System.out.println("Enter a b and c:");
       double a=number.nextDouble();
       double b=number.nextDouble();
       double c=number.nextDouble();

       
       double d=b*b - 4*a*c;
       double root1;
       double root2;

       if(d>0){
         root1=(-b + Math.sqrt(d))/(2*a);
         root2=(-b - Math.sqrt(d))/(2*a);
         
         System.out.println("Roots are "+root1+" and "+root2);
       }
       if(d==0){
           root1=root2=-b/(2*a);
           System.out.println("Roots are same and values are: "+ root1);
       }
       else{
           double real=-b/(2*a);
           double img=Math.sqrt(-d)/(2*a);

           System.out.println("Roots are imaginary\nRoot 1 is: "+real+" + "+img+"i\nRoot 2 is: "+real+" - "+img+"i");
           System.out.println();
       }
    }
}
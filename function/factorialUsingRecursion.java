
import java.util.Scanner;  
public class factorialUsingRecursion{  
public static void main(String[] args){ 
  int n;  
  Scanner sc=new Scanner(System.in);  
  System.out.print("Enter the number: ");  
  n=sc.nextInt();  
  System.out.print("Factorial of "+n+" is: "+fact(n));
 }  
 public static int fact(int a){
     if(a==0 || a==1)
        return 1;
     else 
       return (fact(a-1)*a);
 }
}  
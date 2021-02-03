
import java.util.Scanner;  
public class sumOfTwoPrime{  
public static void main(String[] args){ 
  int n;  
  Scanner sc=new Scanner(System.in);  
  System.out.print("Enter the number of elements you want to store: ");  
  n=sc.nextInt(); 
  boolean flag=false; 
  for(int i=2;i<=n/2;i++){
      if(isPrime(i)){
          if(isPrime(n-i)){
              System.out.println(n+" = "+i+" + "+(n-i));
              flag=true;
          }
          

      }
  }
  if (!flag)
    System.out.println(n + " cannot be expressed as the sum of two prime numbers.");
 }  
 static boolean isPrime(int num) {
    boolean isPrime = true;

    for (int i = 2; i <= num / 2; ++i) {
      if (num % i == 0) {
        isPrime = false;
        break;
      }
    }

    return isPrime;
  }
}  
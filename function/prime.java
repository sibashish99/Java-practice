import java.util.Scanner;  
public class prime{  
public static void main(String[] args){ 
  int n,m;  
  Scanner sc=new Scanner(System.in);  
  System.out.print("Enter the number of elements you want to store: ");  
  n=sc.nextInt(); 
  m=sc.nextInt();
  
  int i;
  for(i=n;i<=m;i++){
      if(isPrime(i)){
          System.out.print(i+" ");
      }
  }
 }  
 public static boolean isPrime(int num) {
    boolean flag = true;

    for(int i = 2; i <= num/2; i++) {

        if(num % i == 0) {
            flag = false;
            break;
        }
    }

    return flag;
}
} 
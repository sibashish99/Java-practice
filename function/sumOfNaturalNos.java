import java.util.Scanner;  
public class sumOfNaturalNos{  
public static void main(String[] args){ 
  int n;  
  Scanner sc=new Scanner(System.in);  
  System.out.print("Enter the number: ");  
  n=sc.nextInt();  
  System.out.print("Sum of "+n+" natural nos is: "+isSum(n));
 }  
 public static int isSum(int a){
     if(a==0)
        return a;
     else 
       return (isSum(a-1)+a);
 }
}  
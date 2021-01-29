import java.util.Scanner;

public class jigs{
    public static void main(String[] args) {
       Scanner one=new Scanner(System.in);
       
       System.out.println("Enter two numbers:");
       int a=one.nextInt();
       int count=0;

       while(a!=0){
           a=a/10;
           count++;
       }
       System.out.println("Nos of digits are :"+count);

       

    }
}
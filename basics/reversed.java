import java.util.Scanner;

public class reversed{
    public static void main(String[] args) {
       Scanner one=new Scanner(System.in);
       
       System.out.println("Enter two numbers:");
       int a=one.nextInt();
       int rev=0,rem;
       int temp=a;

       while(a!=0){
           rem=a%10;
           rev=rev*10 +rem;
           a=a/10;
           
       }
       System.out.println("reverse of "+temp+" is "+rev);

       

    }
}
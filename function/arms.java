import java.util.Scanner;  
public class arms{  
public static void main(String[] args){ 
    int n,m;  
    Scanner sc=new Scanner(System.in);  
    System.out.print("Enter the range: ");  
    n=sc.nextInt(); 
    m=sc.nextInt();
    
    int i;
    for(i=n;i<=m;i++){
        if(isArmstrong(i)){
            System.out.print(i+" ");
        }
    }
 }
 public static boolean isArmstrong(int num){
    int temp=num;
    int count=0;
    int rem,val=0;

    while(temp!=0){
        temp/=10;
        count++;
    }
    int ntemp=num;

    while(ntemp!=0){
        rem=ntemp%10;
        val+=Math.pow(rem,count);
        ntemp/=10;
    }
    if(val==num){
        return true;
    }
    else{
        return false;
    }

 }
}
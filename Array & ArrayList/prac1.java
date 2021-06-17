
import java.util.Scanner;
public class prac1{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int val = sc.nextInt();
        int pos=0;
        for(int i=0; i<n; i++){
            if(a[i] == val){
              pos=i;
            }
        }
        System.out.println(val+" found in "+(pos+1)+"rd position");


	}
}

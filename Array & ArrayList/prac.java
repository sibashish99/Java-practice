

import java.util.Scanner;

public class prac{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        float[] a = new float[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextFloat();
        }
        float sum=0;
        for(int i=0; i<n; i++){
            sum+=a[i];
        }
        System.out.println(sum);


	}
}

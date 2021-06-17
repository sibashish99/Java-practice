import java.util.Scanner;
public class prac3 {
	static void reverse(int a[], int n)
	{
		int i, k, t;
		for (i = 0; i < n / 2; i++) {
			t = a[i];
			a[i] = a[n - i - 1];
			a[n - i - 1] = t;
		}

		System.out.println("Reversed array is: \n");
		for (k = 0; k < n; k++) {
			System.out.print(a[k]+" ");
		}
	}

	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
		int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
		reverse(arr, arr.length);
	}
}

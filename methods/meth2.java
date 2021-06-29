import java.util.*; //method returning an array
class meth2 {
	static int[] getSumAndSub(int a, int b){
		int[] ans = new int[2];
		ans[0] = a + b;
		ans[1] = a - b;
		return ans;
	}

	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
		int[] ans = getSumAndSub(a, b);
		System.out.println("Sum = " + ans[0]);
		System.out.println("Sub = " + ans[1]);
	}
}

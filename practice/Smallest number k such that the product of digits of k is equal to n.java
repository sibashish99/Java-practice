import java.util.Stack;
public class GFG {

	static long smallestNumber(int n){
		if (n >= 0 && n <= 9) {
			return n;
		}

		Stack<Integer> digits = new Stack<>();

		for (int i = 9; i >= 2 && n > 1; i--){
			while (n % i == 0) {
				digits.push(i);
				n = n / i;
			}
		}

		if (n != 1){
			return -1;
		}
		long k = 0;
		while (!digits.empty()){
			k = k * 10 + digits.peek();
			digits.pop();
		}
		return k;
	}

	static public void main(String[] args){
		int n = 100;
		System.out.println(smallestNumber(n));
	}
}



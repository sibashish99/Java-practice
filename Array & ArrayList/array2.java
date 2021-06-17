//array methods

import java.util.Arrays;

public class array2{
	public static void main(String[] args){

		int intArr[] = { 10, 20, 15, 22, 35 };  
		Arrays.sort(intArr);  //sort
		int intKey = 22;
		System.out.println("found at index = "+ Arrays.binarySearch(intArr, intKey));  //array element search
        System.out.println("found at index = "  + Arrays.binarySearch(intArr, 1, 3, intKey));

	
		int intArr1[] = { 10, 15, 22 };
		System.out.println("Integer Arrays on comparison: "+ Arrays.compare(intArr, intArr1));  ///array compare return 1 or 0

	}
}

/**
 Write a function which takes an array and prints the majority element (if it exists), otherwise prints “No Majority Element”. A majority element in an array A[] of size n is an element that appears more than n/2 times (and hence there is at most one such element). 

Examples : 

Input : {3, 3, 4, 2, 4, 4, 2, 4, 4}
Output : 4
Explanation: The frequency of 4 is 5 which is greater
than the half of the size of the array size. 

 */


import java.io.*;
import java.util.Scanner;
class Main{
	static int findMajority(int arr[])
	{
	    int n=arr.length;
		int maxCount = 0;
		int index = -1; 
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (arr[i] == arr[j])
					count++;
			}
		
			if (count > maxCount) {
				maxCount = count;
				index = i;
			}
		}

		
		if (maxCount > n / 2)     
		   return arr[index];

		else
			return -1;
	}

	public static void main(String[] args)
	{

	Scanner sc= new Scanner (System.in);
	int n =sc.nextInt();
    int[] arr= new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
     }
	 int val=findMajority(arr);
	 if(val==-1)
	    System.out.println("-1");
	 else  
	    System.out.println("Op: "+val);
	}
	
}

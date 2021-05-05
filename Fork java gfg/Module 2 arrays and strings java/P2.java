/*

Write an efficient program to count number of 1s in the binary representation of an integer.
Examples : 


Input : n = 6

Output : 2

Binary representation of 6 is 110 and has 2 set bits

*/

import java.io.*;

class countSetBits {
    
    static int countSetBits(int n){
        int count = 0;
        while (n > 0){
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

    public static void main(String args[]){
        int i = 9;
        System.out.println(countSetBits(i));
    }
}
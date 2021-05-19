import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
         Locale indiaLocale = new Locale("en","IN");
           
         NumberFormat us=NumberFormat.getCurrencyInstance(Locale.US);
         NumberFormat india=NumberFormat.getCurrencyInstance(indiaLocale);
         NumberFormat china=NumberFormat.getCurrencyInstance(Locale.CHINA);
         NumberFormat france=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        
        
        System.out.println("US: "+ us.format(payment)+"\n"+"India: "+ india.format(payment)+"\n"+"China: "+ china.format(payment)+"\n"+"France: " + france.format(payment));
        
}
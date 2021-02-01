import java.util.Scanner;
public class prog{

    public static void main(String[] args) {
        String strObj = new String("Hello!");
        String str = "Hello!";

        if (strObj.equals(str)) {
           System.out.println("The strings are equal"); 
          }
        if (strObj != str) {
          System.out.println("The strings are not the same object");
         }

        String internedStr = strObj.intern();
        if (internedStr == str) {
          System.out.println("The interned string and the literal are the same object");
         }
      
        }
      
  }
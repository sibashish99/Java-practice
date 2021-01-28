import java.util.Scanner;

public class ascii{
    public static void main(String[] args) {
      Scanner number=new Scanner(System.in);

      System.out.println("Enter:");
      char ch=number.next().charAt(0);
      
      int ascii=ch;
      System.out.println("Ascii value is: "+ascii);
    }
}
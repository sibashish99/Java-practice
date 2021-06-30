
import java.io.*;  //main() overloading

public class meth6 {

	public static void main(String[] args) {
		System.out.println("Hi Geek (from main)");
		meth6.main("Geek");
	}

	public static void main(String arg1) {
		System.out.println("Hi, " + arg1);
		meth6.main("Dear Geek","My Geek");
	}
	public static void main(String arg1, String arg2) {
		System.out.println("Hi, " + arg1 + ", " + arg2);
	}
}

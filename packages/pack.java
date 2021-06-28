//java.time.Clock Class in Java
import java.time.Clock;
public class pack{
	public static void main(String[] args) {
		Clock clock = Clock.systemUTC();
		System.out.println("UTC time = " + clock.instant());
	}
}

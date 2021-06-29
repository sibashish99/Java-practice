
import java.util.*;  // method Returning list of Object Class
class meth3 {
	public static List<Object> getDetails(){
		String name = "sibashish";
		int age = 22;
		char gender = 'M';

		return Arrays.asList(name, age, gender);
	}

	public static void main(String[] args){
		List<Object> person = getDetails();
		System.out.println(person);
	}
}

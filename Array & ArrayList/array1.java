//array of object

class Student{
	public int roll_no;
	public String name;
	Student(int roll_no, String name){
		this.roll_no = roll_no;
		this.name = name;
	}
}
public class array1{
	public static void main (String[] args){
		Student[] arr;
		arr = new Student[5];
		arr[0] = new Student(1,"saf");
		arr[1] = new Student(2,"sdg");
		arr[2] = new Student(3,"dsg");
		arr[3] = new Student(4,"fdhaer");
		arr[4] = new Student(5,"adfhwerr");

		for (int i = 0; i < arr.length; i++)
			System.out.println("Element at " + i + " : " +arr[i].roll_no +" "+ arr[i].name);
	}
}

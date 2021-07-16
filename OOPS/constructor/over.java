/**
 
Constructor overloading in Java is a technique of having more than 
one constructor with different parameter lists. 
 */
class Student{
    int id;
    String name;
    int age;
    Student(int i, String n){
        this.id = i;
        this.+.name = n;
    }
    Student(int i, String n, int a){
        this.id = i;
        this.name = n;
        this.age = a;
    }
    void show(){
        System.out.println(id + " " + name + " " + age);
    }
}

class over{
  public static void main(String[] args){
        Student s1 = new Student(1, "Tom", 12);
        Student s2 = new Student(2, "Jerry");

        s1.show();
        s2.show();
  }
}
//Hierarchical Inheritance Example
class Person{
    void display(){
        System.out.println("Person class is called");   
    }
}
class Student extends Person{
    void displayStudent(){
        System.out.println("Student class is called");
    }
}
class Siba extends Student{
    void displaySiba(){
        System.out.println("Siba class is called");
    }
}
class three{
    public static void main(String args[]){
        Siba s=new Siba();
        s.displaySiba();
        s.display();
        //s.displayStudent(); will give error
    }
}
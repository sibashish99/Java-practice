/**
 Inheritance is one of the key features of OOP that 
 allows us to create a new class from an existing class.
 When a class inherits another class, it is known as a single inheritance
 */
class Animal{ 
    String name;
    public void eating(){
        System.out.println("I am eating");
    }
}
class Dog extends Animal{
    public void getNameDisplay(){
        System.out.println("My name is "+name);
    }
}

class one{
    public static void main(String[] args){
        //System.out.println("one");
        Dog dog = new Dog();
        dog.name = "Tom";
        dog.getNameDisplay();
        dog.eating();
    }
}
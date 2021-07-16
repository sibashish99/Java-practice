/**
 the super keyword is used to call the method of the
parent class from the method of the child class.
 */

class newAnimal {
    public void eat() {
      System.out.println("I can eat");
    }
  }
class Dog extends newAnimal {
    @Override
    public void eat() {
      super.eat();
      System.out.println("I eat dog food");
    }
  
    public void bark() {
      System.out.println("I can bark");
    }
  }
  
class five {
    public static void main(String[] args) {
      Dog labrador = new Dog();
  
      labrador.eat();
      labrador.bark();
    }
  }
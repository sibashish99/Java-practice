import java.util.*;

public class polymorphism {
    public static void main(String[] args) {
        
        //Method overloading
        
       
        AdditionOperator operator = new AdditionOperator();
        System.out.println(String.format("%d + %d --> %d", 1, 2, operator.sum(1, 2)));
        System.out.println(String.format("%d + %d + %d --> %d", 1, 2, 3, operator.sum(1, 2, 3)));
        System.out.println(String.format("%d + %d + %d + %d + %d --> %d", 1, 2, 3, 4, 5, operator.sum(1, 2, 3, 4, 5)));

  
        //Constructor overloading 
    
        Person personA = new Person("Pallavi", 20);
        Person personB = new Person("Sunand");
        System.out.println("personA --> " + personA);
        System.out.println("personB --> " + personB);

  
        //Runtime Polymorphism or Dynamic Method Dispatch
        
        Animal dog = new Dog(); //upcasting
        Animal wolf = new Wolf(); //upcasting
        System.out.println("dog.makeASound() --> " + dog.makeASound());
        System.out.println("wolf.makeASound() --> " + wolf.makeASound());


        System.out.println("dog.get().makeASound() --> " + dog.get().makeASound());
        System.out.println("wolf.get().makeASound() --> " + wolf.get().makeASound());
    }

    private static class AdditionOperator {

        public int sum(int a, int b) {
            return a + b;
        }

        public int sum(int a, int b, int c) {
            return sum(sum(a, b), c);
        }

        public int sum(int... x) {
            return Arrays.stream(x).sum();
        }

        public float sum(float a, float b) {
            return a + b;
        }

        public float sum(float a, float b, float c) {
            return sum(sum(a, b), c);
        }

        public float sum(float... x) {
            float s = 0.0f;
            for (float f : x) {
                s += f;
            }
            return s;
        }
    }

    private static class Person {
        private final String name;
        private final Integer age;

        public Person(String name) {
            this(name, 0);
        }

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    private static class Animal {
        public String makeASound() {
            return "what what";
        }

        public Animal get() {
            return this;
        }
    }

    private static class Dog extends Animal {
        @Override
        public String makeASound() {
            return "bark bark";
        }

        @Override
        public Dog get() {
            return this;
        }

        public void playWith() {
            System.out.println("playing with the dog");
        }
    }

    private static class Wolf extends Animal {

        @Override
        public String makeASound() {
            return "howl howl";
        }

        @Override
        public Wolf get() {
            return this;
        }

        public void playWith() {
            System.out.println("playing with the wolf and running for my life");
        }
    }
}
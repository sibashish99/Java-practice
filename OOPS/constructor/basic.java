class Base1{
    Base1(){
        System.out.println("Base1 is a default constructor");
    }
    Base1(int x){
        System.out.println("Base1 is a overloaded constructor with parameter x = " + x);
    }
}

class Derived1 extends Base1{
    Derived1(){
        System.out.println("Derived1 is derived constructor from Base1");
    }
    Derived1(int x,int y){
        super(x);
        System.out.println("Derived1 is overloaded constructor from Base1 with parameter x = " + x + " and y = " + y);
    }
}

// class ChildOfDerived extends  Derived1{
//     ChildOfDerived(){
//         System.out.println("I am a child of derived constructor");
//     }
//     ChildOfDerived(int x, int y, int z){
//         super(x, y);
//         System.out.println("I am an overloaded constructor of Derived with value of z as: " + z);
//     }
// }
class basic{
    public static void main(String[] args){
        Base1 b = new Base1();
        Derived1 d1 = new Derived1();
        Derived1 d2 = new Derived1(10,20);
        // ChildOfDerived c1 = new ChildOfDerived();
        // ChildOfDerived c2 = new ChildOfDerived(10,20);
    }
}
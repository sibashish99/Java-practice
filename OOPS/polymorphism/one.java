/*Polymorphism is an OOP concept which specifies that the functionality depends on the context.
Method overloading - also referred to as Compile-time Polymorphism
Method overriding - also referred to as Runtime Polymorphism or Dynamic Method Dispatch
*/
class polygon{
    public void draw(){
        System.out.println("Drawing Polygon");
    }
}
class Square extends polygon{
    public void draw(){
        System.out.println("Drawing Square");
    }
}
class Circle extends polygon{
    public void draw(){
        System.out.println("Drawing Circle");
    }

}
class one {
    public static void main(String[] args) {
        Square square = new Square();
        square.draw();
         
        Circle circle = new Circle();
        circle.draw();
    }
}




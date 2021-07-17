abstract class Shape{
    abstract void draw();
}

class Ractangle extends Shape{
    void draw(){
        System.out.println("Drawing Ractangle.....");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Drawing Circle.....");
    }
}

class abstraction{
    public static void main(String[] args){
         Shape s = new Ractangle();
         s.draw();
    }
}
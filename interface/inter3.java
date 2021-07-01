interface polygon{
    void getArea();

    default void getSides(){
        System.out.println("Hello!");
    }
}

class Rectangle implements polygon{
    public void getArea(){
        int length =10;
        int breadth=50;
        int area=length*breadth;
        System.out.println("Ractangle Area is "+area);
    }
    public void getSides(){
        System.out.println("Hello World!");
    }
}
class Square implements polygon {
    public void getArea() {
      int length = 5;
      int area = length * length;
      System.out.println("The area of the square is " + area);
    }
  }

class inter3{
  public static void main(String[] args){
    Rectangle r1 = new Rectangle();
    r1.getArea();
    r1.getSides();

    Square s1 = new Square();
    s1.getArea();
    s1.getSides();
  }
}
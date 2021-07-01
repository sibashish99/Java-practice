interface polygon{
    void getArea(int length , int breadth);
}

class Ractangle implements polygon{
    public void getArea(int length, int breadth){
        System.out.println("Area is "+(length*breadth));
    }
}
class inter{
    public static void main(String[] args){
       Ractangle r1=new Ractangle();
       r1.getArea(5,10);
    }
}
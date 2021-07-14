class para2{
    int id;
    String name;

    para2(int i, String n){
         id=i;
         name=n;
    }
    void display(){
        System.out.println(id+" "+name);
    }

    public static void main(String[] args){
        para2 p1=new para2(10,"Ravi");
        para2 p2=new para2(20,"Kumar");
        p1.display();
        p2.display();
    }

}
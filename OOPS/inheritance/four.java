class newSection{
    public void set(){
        System.out.println("newSection is created..");
    }
}
class Student extends newSection{
    @Override
    public void set(){
         System.out.println("New Section is overridded");
    }
    public void setName(){
        System.out.println("new Student is created..");
    }
}

class four{
    public static void main(String[] args){
       Student student = new Student();
       student.set();
       student.setName();
    }
}
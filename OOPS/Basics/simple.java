class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
       System.out.println("My id "+id);
       System.out.println("My name "+name);
    }
    public int getSalary(){
        return id;
    }
}

class simple{
    public static void main(String[] args){
        Employee siba= new Employee();

        siba.id=100;
        siba.name="Siba";
        siba.salary=10000;

        siba.printDetails();
        System.out.println("My salary "+siba.getSalary());
    }
}
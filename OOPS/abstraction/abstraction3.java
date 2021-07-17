public class abstract Employee{
    private String name;
    private String address;
    private String phone;

    public Employee(String name, String address, String phone){
        System.out.println("Employee constructor");
        this.name=name;
        this.address=address;
        this.phone=phone;
    }
    public double computePay(){
        System.out.println("computePay of the employee");
        return 0.0;
    }
    public void mailCheck(){
        System.out.println("mailCheck of the employee "+this.name+" "+this.address);
    }
    public String toString(){
        return name+" "+address+" "+phone;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){ 
        return address;
    }
    public void setAddress(String newaAddress){
        address=newaAddress;
    }
    public String getPhone(){
        return phone;
    }
}
public class Salary extends Employee {
    private double salary;   
    
    public Salary(String name, String address, int number, double salary) {
       super(name, address, number);
       setSalary(salary);
    }
    
    public void mailCheck() {
       System.out.println("Within mailCheck of Salary class ");
       System.out.println("Mailing check to " + getName() + " with salary " + salary);
    }
  
    public double getSalary() {
       return salary;
    }
    
    public void setSalary(double newSalary) {
       if(newSalary >= 0.0) {
          salary = newSalary;
       }
    }
    
    public double computePay() {
       System.out.println("Computing salary pay for " + getName());
       return salary/52;
    }
 }
class abstraction3{
    public static void main(String[] args){
        Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
        Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);
        System.out.println("Call mailCheck using Salary reference --");
        s.mailCheck();
        System.out.println("\n Call mailCheck using Employee reference--");
        e.mailCheck();
    }
}
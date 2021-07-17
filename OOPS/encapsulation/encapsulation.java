
class encupsulation{
    public static void main(String[] args){
        Encup e1 = new Encup();
        e1.setName("John");
        e1.setIdNum("123456789");
        e1.setAge(25);


        System.out.println("Name "+e1.getName()+" Age: "+e1.getAge());
    }
}
class Encup{
    private String name;
    private String idNum;
    private int age;

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public String getIdNum(){
        return idNum;
    }
    public void setIdNum(String newIdNum){
        idNum = newIdNum;
    }
    public void setName(String newName){
        name = newName;
    }
    public void setAge(int newAge){
        age = newAge;
    }
}
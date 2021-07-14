class Company {
    String name;
  
    // public constructor
    public Company() {
      name = "Programiz";
    }
  }
  
  class nonarg1 {
    public static void main(String[] args) {

      Company obj = new Company();
      System.out.println("Company name = " + obj.name);
    }
  }
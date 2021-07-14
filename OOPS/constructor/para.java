//A Java constructor can also accept one or more parameters. Such constructors are known as parameterized constructors (constructor with parameters).
//The parameterized constructor is used to provide different values to distinct objects. However, you can provide the same values also.

class para{
    String language;

    para(String lang){
        language = lang;
        System.out.println("Programming language is: "+language);
    }
    public static void main(String args[]){
        para obj1 = new para("java");
        para obj2 = new para("javascript");
        para obj3 = new para("python");
    }
}
class exceptionHandling{
    public static void main(String[] args){
        try{
            int a=100/0;
        }catch(ArithmeticException e){
            System.out.println("Division by zero "+e);
        }
        System.out.println("Program continues");
    }
}
class stringBuilder{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        String name= "Sibashish";
        sb.append("Hi! i am ").append(name).append(".");
        String s1= sb.toString();
        System.out.println(s1);

        int age=22;
        sb.append("i am ").append(name).append("and i am ").append(age).append(" years old").toString();
        String s2=sb.toString();
        System.out.println(s2);

        String[] hobbies ={"cricket","Gaming"};
        sb.append("My hobbies are ").append(String.join(",", hobbies)).append(".");
        String s3=sb.toString();
        System.out.println(s3);

        //length & capacity 
        System.out.println("Length "+sb.length());
        System.out.println("Capacity "+sb.capacity());
        sb.ensureCapacity(256);
        System.out.println("Capacity " + sb.capacity());

        //insert
        sb.insert(3,"*****");
        System.out.println("Insert "+sb.length());

        //delete
        sb.delete(3,5);
        System.out.println("Delete "+sb);

        //set Char
        sb.setCharAt(2,'%');
        System.out.println("Set char "+sb);


        //replace
        sb.replace(3,5,"###");
        System.out.println("Replace "+sb);

        //reverse
        System.out.println("Reverse "+sb.reverse());

    }
}
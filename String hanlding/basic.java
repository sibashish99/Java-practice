class basic{
    public static void main(String[] args){
        char[] newStr= {'h','e','l','l','o'};
        String str=new String(newStr);
        System.out.println(str);

        String str1="hello i am sibashish biswas";  //length
        int len= str1.length();
        System.out.println("Length is "+len); 

        String str2="hello i am sibashish ";  //concatenation
        String str3="biswas";
        System.out.println(str2+str3);

    }
}
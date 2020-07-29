public class string {
    public static void main(String arg[]){

        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());
        System.out.println("Upper case is:" +txt.toUpperCase());
        System.out.println("Lower case:"+txt.toLowerCase()); 

        String txt1 = "Please locate where 'locate' occurs!";
        System.out.println("Index of locate is "+ txt1.indexOf("locate")); 


        String firstName = "Sibashish";
        String lastName = "Biswas";
        System.out.println(firstName + " " + lastName);

        String x = "10";
        String y = "20";
        String z = x + y;
        System.out.println("New no "+z);
        
    }
}
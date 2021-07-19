public class StringConversions {
    public static void main(String[] args) {
        /**
           Byte Short Integer Long Float  Double
         */
        System.out.println("~~~~ string to number ~~~~");
        Integer i = Integer.valueOf("123");
        System.out.println("i --> " + ++i);
        Integer j = Integer.parseInt("99", 11);
        System.out.println("j --> " + j);

        Float k = Float.valueOf("3.14");
        System.out.println("k --> " + (1.2f + k));


        System.out.println("~~~~ number to string ~~~~");
        String strI1 = Integer.toString(i);
        System.out.println("strI1 --> " + strI1);
        String strI2 = String.valueOf(i);
        System.out.println("strI2 --> " + strI2);

        String strK = Float.toString(k);
        int indexOfDot = strK.indexOf('.');
        String strKDecimal = strK.substring(0, indexOfDot);//[0,indexOfDot)
        String strKPrecision = strK.substring(indexOfDot + 1);
        System.out.println(String.format("In %s the decimal is %s and precision is %s", strK, strKDecimal,
                strKPrecision));

    }
}
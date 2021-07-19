public class StringManipulations {
    public static void main(String[] args) {

        String strHello = "Hello";
        String strWorld = "World";
        String helloWorld = strHello + strWorld;
        System.out.println(String.format("%s + %s --> %s", strHello, strWorld, helloWorld));
        System.out.println("concat() --> " + strHello.concat(strWorld));
        System.out.println("strHello --> " + strHello);
        String strHelloWorld = strHello.concat(strWorld);
        System.out.println("strHelloWorld --> " + strHelloWorld);

       
        System.out.println("~~~~ generating characters and substrings ~~~~");
        String sentence = "India is a diverse country";
        int i = 11;
        char c = sentence.charAt(i);
        System.out.println("sentence --> " + sentence);
        System.out.println(String.format("charAt(%d) --> %c", i, c));
        System.out.println(String.format("substring(%d,%d) --> %s", 11, 18, sentence.substring(11, 18)));//[,)
        System.out.println(String.format("substring(%d) --> %s", 11, sentence.substring(11)));

    
        System.out.println("~~~~ other string manipulations ~~~~");
        String[] words = sentence.split("\\s");
        print("split(\"\\\\s\") --> ", words, ", ");

        String[] words2 = sentence.split("\\s", 2);
        print("split(\"\\\\s\", 2) --> ", words2, " | ");

        CharSequence csPart = sentence.subSequence(10, 19);
        System.out.println("subsequence(10, 19) --> " + csPart + ", " + csPart.length());

        String part = csPart.toString();
        System.out.println(String.format("trim() --> %s, %d, %d", part.trim(), part.length(), part.trim().length()));
        System.out.println("toUpperCase() --> " + part.toUpperCase());
        System.out.println("toLowerCase() --> " + part.toLowerCase());

        System.out.println("~~~~ searching characters and substrings ~~~~");
        System.out.println(String.format("indexOf('%c') --> %s", 'i', sentence.indexOf('i')));
        System.out.println(String.format("lastIndexOf('%c') --> %s", 'i', sentence.lastIndexOf('i')));
        System.out.println(String.format("indexOf('%c', %d) --> %s", 'i', 11, sentence.indexOf('i', 11)));
        System.out.println(String.format("lastIndexOf('%c', %d) --> %s", 'i', 11, sentence.lastIndexOf('i', 11)));

        System.out.println("~~~~ replacing characters and substrings ~~~~");
        System.out.println(String.format("replace('%c', '%c') --> %s", ' ', '|', sentence.replace(' ', '|')));
        System.out.println(String.format("replaceAll(\"%s\", \"%s\") --> %s", " ", "|", sentence.replaceAll(" ", "|")));
        System.out.println(String.format("replaceFirst(\"%s\", \"%s\") --> %s", " ", "|", sentence.replaceFirst(" ", "|")));
    }

    private static void print(String message, String[] tokens, String separator) {
        System.out.print(message);
        for (int j = 0; j < tokens.length; j++) {
            System.out.print(tokens[j] + (j < tokens.length - 1 ? separator : ""));
        }
        System.out.println("");
    }
}
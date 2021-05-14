import java.util.*;
class gfg{
    public static void main(String[] args){
     String text = "0123hello9012hello8901hello7890";
     String match = "hello";

     int index = text.indexOf(match);
     int matchLength = match.length();
     while (index >= 0) {  
        System.out.println(index);
        index = text.indexOf(match, index + matchLength);
      }
    }
}


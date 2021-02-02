public class breakc {
    public static void main(String[] args) {    

        int i = 0;
        while (i < 10){
          if (i == 4) {
            i++;
           continue;
         }
         if (i == 2) {
            break;
          }
        System.out.println(i);
        i++;
       }
    }
}
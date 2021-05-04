class Geeks{
    
    static void checkString(String s)
    {
        int v=0;
        int c=0;
        
        //Your code here
        char[] ch=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(ch[i]==' '){
                 continue;
            }
            else if(ch[i]=='a'|| ch[i]=='e'|| ch[i]=='i'|| ch[i]=='o'|| ch[i]=='u'){
                 v++;
            }
            else{
                 c++;
            }
        }
        
        if(v>c)
          System.out.print("Yes");
        else if(c>v)
          System.out.print("No");
        else
          System.out.print("Same");
        System.out.println();
    }
}
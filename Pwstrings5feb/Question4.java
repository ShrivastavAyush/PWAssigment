package Pwstrings5feb;

public class Question4 {
    public static void main(String[] args) {
        String str = "Ayush Shrivastav @123";
        int vCount = 0 , cCount = 0, sCount = 0;
        str = str.replace(" ","");
        str = str.toLowerCase();
        char ch;
        for(int i=0; i<str.length(); i++){
            ch = str.charAt(i);
            if(ch == 'a' || ch =='e' || ch=='i'|| ch=='o' || ch == 'u'){
                vCount++;
            }
            else if (ch >= 'a'&& ch<='z'){
                cCount++;
            }
            else{
                sCount++;
            }
        }
        System.out.println("The original sentence   : "    + str);
        System.out.println("Total vovels is         : " + vCount);
        System.out.println("Total consonant is      : " +  cCount);
        System.out.println("Total special character : " + sCount);
    }
}

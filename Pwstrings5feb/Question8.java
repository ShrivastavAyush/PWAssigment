package Pwstrings5feb;

public class Question8 {
    public static void main(String[] args) {
        String s = "my name is ayush shrivastav";
        s = s.replace(" ","");
        s = s.toLowerCase();
        int [] arr = new int [127];
        for(int i = 0; i<s.length(); i++){
            arr[s.charAt(i)]= arr[s.charAt(i)]+1;
        }
        int max = 1;
        char c = ' ';
        for(int i=0; i<s.length(); i++) {
            if (max < arr[s.charAt(i)]) {
                max = arr[s.charAt(i)];
                c = s.charAt(i);
            }
        }
        System.out.println("Original string is :-  "  +s);
        System.out.println("The maximum repeated character is:-  "  +c);
    }
}
package Pwstrings;

public class Question7 {
    public static void main(String[] args) {
        String name = "Hello,have a good day";
        char ch;
        for (int i = 0; i < name.length(); i++) {
            ch = name.charAt(i);
            if (ch=='a'|| ch == 'e' || ch == i || ch == 'o'||ch == 'u') {
                System.out.print(name.charAt(i));
            } else {
                System.out.print(" ");
            }
        }
    }
}

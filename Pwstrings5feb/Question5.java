package Pwstrings5feb;

import java.util.Arrays;

public class Question5 {
    public static void main(String[] args) {
        String s1 = "Creative";
        String s2 = "Reactive";
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        char[] ar1 = s1.toCharArray();
        char[] ar2 = s2.toCharArray();
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        if(Arrays.equals(ar1,ar2)){
            System.out.println("It is Anagram");
        }
        else{
            System.out.println("It is not Anagram");
        }
    }
}

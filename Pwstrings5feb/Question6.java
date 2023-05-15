package Pwstrings5feb;

public class Question6 {
    public static void main(String[] args) {
        boolean res = false;
        String str = "The quick brown fox jumps over lazy dog";
        str = str.replace(" ", "");
        str = str.toLowerCase();
        char[] ch = str.toCharArray();
        int[] ar = new int[26];
        for (int i = 0; i<ch.length; i++){
            ar[ch[i]-97]++;
        }
        for (int i = 0; i<ar.length; i++) {
            if (ar[i]==0) {
                System.out.println("It is not a pangram");
                res = true;
            }
        }
            if(res == false){
                System.out.println("it is pangram");
            }
        }
    }

package Pwstrings5feb;

public class Question7 {
    public static void main(String[] args) {
        boolean isUniqueCharacter = false;
        String str = "Mohan";
        str = str.toLowerCase();
        char [] ch = str.toCharArray();
        int [] ar = new int [26];
        for(int i=0; i<ch.length; i++) {
            ar[ch[i] - 97]++;
        }
            for(int j=0; j<ar.length; j++){
                if(ar[j]>1){
                    System.out.println("String has no unique character");
                    isUniqueCharacter = true;
                }
            }
            if(isUniqueCharacter==false){
                System.out.println("String has all unique character");
            }
        }
    }


package Pwstrings5feb;

public class Question1 {
    public static void main(String[] args) {
        String str = "Hello";
        str = str.toUpperCase();
        char[] ch=str.toCharArray();
        int[] ar = new int [26];
        char [] duplicate = new char[26];
        for(int i=0; i<ch.length; i++){
            ar[ch[i]-65]++;
            if(ar[ch[i]-65]==1){
                char duplicateElement = ch[i];
                boolean isExist = false;
                int j = 0;
                for( ; j<duplicate.length; j++){
                    if((int)duplicate[j]==0){
                        break;
                    }
                    if(duplicate[j]==duplicateElement){
                        isExist = true;
                        break;
                    }
                }
                if(isExist==false){
                    duplicate[j]=duplicateElement;
                }
            }
        }
        for(int i=0; i<duplicate.length; i++){
            if((int)duplicate[i] == 0)
                break;
            System.out.print(duplicate[i]);
        }
    }
}

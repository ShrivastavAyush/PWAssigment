package strings.Pwstring6feb;

public class Question3 {
    public static void main(String[] args) {
        String s1 = "Think Twice";
        StringBuilder s2 = new StringBuilder(" ");
        String[] sarr = s1.split(" ");
        for(String elem:sarr){
            for(int i=elem.length()-1; i>=0; i--){
                s2.append(elem.charAt(i));
            }
            s2.append(" ");
        }
        System.out.println(s2);
    }
}


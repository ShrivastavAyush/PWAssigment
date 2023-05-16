package strings.Pwstring6feb;

public class Question1 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Ayush");
        str.append("Shrivastav");
        System.out.println(str);
    }
}
// Mutable means changeable , in mutable string if we want to add something , edit in a string object
//  then it will happen in a same existing object it will not create any other object in  memory as immutable
// string does and the reference variables remains same.
// For Mutable string we can use StringBuffer & StringBuilder.